package dataguard;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DashBoard extends JFrame {

    private Container container;
    private JPanel titlePanel, sideBarPanel, contentPanel;
    private JLabel titleLabel;
    private CardLayout cardLayout;

    private JButton bitBtn, charBtn, ipvBtn, hamBtn, moreBtn, exitBtn;

    public DashBoard() {

        initComponents();
    }

    private void initComponents() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);

        container = this.getContentPane();
        container.setLayout(null);

        titlePanel = new JPanel();
        titlePanel.setBounds(100, 0, 700, 100);
        titlePanel.setLayout(null);
        titlePanel.setBackground(new Color(90, 219, 181));

        titleLabel = new JLabel("DataGuard Innovator");
        Font font = new Font("Segoe Script", Font.BOLD, 30);
        titleLabel.setFont(font);
        titleLabel.setBounds(100, 0, 500, 100);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setForeground(new Color(28, 83, 142));

        titlePanel.add(titleLabel);

        sideBarPanel = new JPanel();
        sideBarPanel.setBounds(0, 0, 100, 600);
        sideBarPanel.setBackground(new Color(28, 83, 142));
        sideBarPanel.setLayout(null);

        var btnFont = new Font("Arial", Font.BOLD, 18);
        var cursor = new Cursor(Cursor.HAND_CURSOR) ;
        

        bitBtn = new JButton("BitLock");
        bitBtn.setBounds(0, 150, 100, 50);
        bitBtn.setBorder(null);
        bitBtn.setFont(btnFont);
        bitBtn.setForeground(Color.WHITE);
        bitBtn.setBackground(new Color(28, 83, 142));
        bitBtn.setFocusable(false);
        bitBtn.setCursor(cursor);
        sideBarPanel.add(bitBtn);

        charBtn = new JButton("CharLock");
        charBtn.setBounds(0, 200, 100, 50);
        charBtn.setBorder(null);
        charBtn.setFont(btnFont);
        charBtn.setForeground(Color.WHITE);
        charBtn.setBackground(new Color(28, 83, 142));
        charBtn.setFocusable(false);
        charBtn.setCursor(cursor);
        sideBarPanel.add(charBtn);

        ipvBtn = new JButton("IPC");
        ipvBtn.setBounds(0, 250, 100, 50);
        ipvBtn.setBorder(null);
        ipvBtn.setFont(btnFont);
        ipvBtn.setForeground(Color.WHITE);
        ipvBtn.setBackground(new Color(28, 83, 142));
        ipvBtn.setFocusable(false);
        ipvBtn.setCursor(cursor);
        sideBarPanel.add(ipvBtn);

        hamBtn = new JButton("Ham");
        hamBtn.setBounds(0, 300, 100, 50);
        hamBtn.setBorder(null);
        hamBtn.setFont(btnFont);
        hamBtn.setBackground(new Color(28, 83, 142));
        hamBtn.setForeground(Color.WHITE);
        hamBtn.setFocusable(false);
        hamBtn.setCursor(cursor);
        sideBarPanel.add(hamBtn);

        moreBtn = new JButton("More");
        moreBtn.setBounds(0, 350, 100, 50);
        moreBtn.setBorder(null);
        moreBtn.setBackground(new Color(28, 83, 142));
        moreBtn.setForeground(Color.WHITE);
        moreBtn.setFocusable(false);
        moreBtn.setFont(btnFont);
        moreBtn.setCursor(cursor);
        sideBarPanel.add(moreBtn);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(0, 400, 100, 50);
        exitBtn.setBorder(null);
        exitBtn.setForeground(Color.WHITE);
        exitBtn.setBackground(new Color(28, 83, 142));
        exitBtn.setFocusable(false);
        exitBtn.setFont(btnFont);
        exitBtn.setCursor(cursor);
        sideBarPanel.add(exitBtn);

        container.add(sideBarPanel);

        contentPanel = new JPanel();
        contentPanel.setBounds(100, 100, 700, 500);
        cardLayout = new CardLayout();
        contentPanel.setLayout(cardLayout);

        JPanel wcPanel = new WelcomePanel();
        contentPanel.add(wcPanel, "wc");

        JPanel bitPanel = new BitPanel();
        contentPanel.add(bitPanel, "bit");

        JPanel charPanel = new CharPanel();
        contentPanel.add(charPanel, "char");

        JPanel ipvPanel = new Ipv4Panel();
        contentPanel.add(ipvPanel, "ipv4");

        JPanel hammingPanel = new HammingPanel();
        contentPanel.add(hammingPanel, "ham");

        JPanel morePanel = new MorePanel();
        contentPanel.add(morePanel, "more");

        cardLayout.show(contentPanel, "wc");

        container.add(contentPanel);
        container.add(titlePanel);

        bitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                defaultBtnColor();
                bitBtn.setBackground(new Color(90, 219, 181));
                bitBtn.setForeground(new Color(255, 255, 255));
                titleLabel.setText("BitLock");
                cardLayout.show(contentPanel, "bit");
            }
        });
        charBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                defaultBtnColor();
                charBtn.setBackground(new Color(90, 219, 181));
                charBtn.setForeground(new Color(255, 255, 255));
                titleLabel.setText("CharLock");
                cardLayout.show(contentPanel, "char");
            }
        });

        ipvBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                defaultBtnColor();
                ipvBtn.setBackground(new Color(90, 219, 181));
                ipvBtn.setForeground(new Color(255, 255, 255));
                titleLabel.setText("IPC");
                cardLayout.show(contentPanel, "ipv4");
            }
        });

        hamBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                defaultBtnColor();
                hamBtn.setForeground(new Color(255, 255, 255));
                hamBtn.setBackground(new Color(90, 219, 181));
                titleLabel.setText("HammingCode");
                cardLayout.show(contentPanel, "ham");
            }
        });

        moreBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                defaultBtnColor();
                moreBtn.setForeground(new Color(255, 255, 255));
                moreBtn.setBackground(new Color(90, 219, 181));
                titleLabel.setText("Learn More....");
                cardLayout.show(contentPanel, "more");
            }
        });
        
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                defaultBtnColor();
                exitBtn.setForeground(new Color(255, 255, 255));
                exitBtn.setBackground(new Color(90, 219, 181));
                System.exit(0);
            }
        });

    }

    private void defaultBtnColor() {
        bitBtn.setBackground(new Color(28, 83, 142));
        bitBtn.setForeground(Color.WHITE);

        charBtn.setBackground(new Color(28, 83, 142));
        charBtn.setForeground(Color.WHITE);

        ipvBtn.setBackground(new Color(28, 83, 142));
        ipvBtn.setForeground(Color.WHITE);

        hamBtn.setBackground(new Color(28, 83, 142));
        hamBtn.setForeground(Color.WHITE);

        moreBtn.setBackground(new Color(28, 83, 142));
        moreBtn.setForeground(Color.WHITE);

        exitBtn.setBackground(new Color(28, 83, 142));
        exitBtn.setForeground(Color.WHITE);
    }

    public static void main(String[] args) {
        var frame = new DashBoard();
        frame.setVisible(true);
    }
}
