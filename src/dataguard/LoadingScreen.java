package dataguard;


import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LoadingScreen extends JFrame {
    private JLabel appNameLabel;
    private JLabel loadingLabel;
    private JProgressBar progressBar;
    private App app;

    public LoadingScreen(App app) {
        this.app =app;
        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }


//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Loading Screen");


        appNameLabel = new JLabel("DataGuard Innovator", SwingConstants.CENTER);
        appNameLabel.setFont(new Font("Arial", Font.BOLD, 28));
        appNameLabel.setForeground(new Color(255, 255, 255));


        loadingLabel = new JLabel("Loading...", SwingConstants.CENTER);
        loadingLabel.setForeground(Color.white);

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true); // Show percentage text


        Container container = new CustomContainer();
        setLayout(new BorderLayout());
        add(container, BorderLayout.CENTER);


        SwingWorker<Void, Integer> worker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(50);
                    publish(i);
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {

                progressBar.setValue(chunks.get(chunks.size() - 1));
            }

            @Override
            protected void done() {
                SwingUtilities.invokeLater(() -> {
                    dispose();
                    // Main application begin from below
                    app.getCardLayout().show(app.cardPanel, "dashboard");
                });
            }
        };

        worker.execute();
    }

    private class CustomContainer extends JPanel {
        private Image backgroundImage;

        public CustomContainer() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.NORTH;

            // Application name label at the top with 60px spacing
            gbc.insets = new Insets(60, 0, 0, 0);
            add(appNameLabel, gbc);

            // Loading label with 10px spacing above the progress bar
            gbc.gridy = 1;
            gbc.insets = new Insets(10, 0, 0, 0);
            add(loadingLabel, gbc);

            // Progress bar
            gbc.gridy = 2;
            gbc.insets = new Insets(10, 0, 0, 0);
            add(progressBar, gbc);

            // Load the background image using ImageIcon and getResource()
            URL imageUrl = getClass().getResource("bg.png");
            ImageIcon icon = new ImageIcon(imageUrl);
            backgroundImage = icon.getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Draw the background image
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    
}
