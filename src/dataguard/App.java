package dataguard;

import java.awt.CardLayout;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class App extends JFrame {

    JPanel cardPanel;
    CardLayout cardLayout;

    public App() {
        this.setSize(815, 620);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        try {
            Image icon = ImageIO.read(getClass().getResource("icon.png"));
            setIconImage(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        JFrame loading = new LoadingScreen(this);
        cardPanel.add(loading.getContentPane(), "loading");
        
        JFrame dashboard = new DashBoard();
        cardPanel.add(dashboard.getContentPane(),"dashboard");

        cardLayout.show(cardPanel, "loading");

        this.add(cardPanel);
        this.setVisible(true);
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}
