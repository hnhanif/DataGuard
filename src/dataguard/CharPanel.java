package dataguard;

import javax.swing.JOptionPane;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class CharPanel extends javax.swing.JPanel {

    public CharPanel() {
        initComponents();
        myInit();
    }

    private void myInit() {
        choice.setRenderer(new CenteredTextRenderer());
        logicFeature(false);
    }

    private void logicFeature(boolean bol) {
        clearBtn.setVisible(bol);
        generatedLabel.setVisible(bol);
        generatedTxt.setVisible(bol);
        copyBtn.setVisible(bol);
        if (bol == false) {
            insertTxt.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        choice = new javax.swing.JComboBox<>();
        generatedLabel = new javax.swing.JLabel();
        generatedTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        insertTxt = new javax.swing.JTextField();
        copyBtn = new javax.swing.JButton();
        executeBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(90, 219, 181));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        choice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        choice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Stuffing", "DeStuffing" }));
        choice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 42, 71), 2, true));
        choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceActionPerformed(evt);
            }
        });
        jPanel1.add(choice, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 600, 50));

        generatedLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        generatedLabel.setForeground(new java.awt.Color(14, 42, 71));
        generatedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generatedLabel.setText("Generated Chars:");
        jPanel1.add(generatedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, 50));

        generatedTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        generatedTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        generatedTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 42, 71), 2, true));
        jPanel1.add(generatedTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 400, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(14, 42, 71));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Insert Chars:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 50));

        insertTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        insertTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        insertTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 42, 71), 2, true));
        jPanel1.add(insertTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 400, 50));

        copyBtn.setBackground(new java.awt.Color(14, 42, 71));
        copyBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        copyBtn.setForeground(new java.awt.Color(255, 255, 255));
        copyBtn.setText("Copy To Clipboard");
        copyBtn.setBorder(null);
        copyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        copyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyBtnActionPerformed(evt);
            }
        });
        jPanel1.add(copyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 590, 50));

        executeBtn.setBackground(new java.awt.Color(14, 42, 71));
        executeBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        executeBtn.setForeground(new java.awt.Color(255, 255, 255));
        executeBtn.setText("Execute");
        executeBtn.setBorder(null);
        executeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        executeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(executeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 400, 50));

        clearBtn.setBackground(new java.awt.Color(204, 204, 204));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(14, 42, 71));
        clearBtn.setText("Clear");
        clearBtn.setBorder(null);
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void executeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeBtnActionPerformed
        String chars = insertTxt.getText();
        if (chars.length() > 0) {
            logicFeature(true);
        } else {
            JOptionPane.showMessageDialog(null, "insert some chars");
        }
        switch (choice.getSelectedIndex()) {
            case 1 -> {
                String generatedChars = CharStuffDeStuff.stuffData(chars);
                generatedTxt.setText(generatedChars);
            }
            case 2 -> {
                String generatedChars = CharStuffDeStuff.deStuffData(chars);
                generatedTxt.setText(generatedChars);
            }
            default ->
                JOptionPane.showMessageDialog(null, "Invalid Choice!");
        }

    }//GEN-LAST:event_executeBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        logicFeature(false);
        choice.setSelectedIndex(0);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void copyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyBtnActionPerformed
        // TODO add your handling code here:
        String myString = generatedTxt.getText();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_copyBtnActionPerformed

    private void choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceActionPerformed
        // TODO add your handling code here:
        logicFeature(false);
    }//GEN-LAST:event_choiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> choice;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton copyBtn;
    private javax.swing.JButton executeBtn;
    private javax.swing.JLabel generatedLabel;
    private javax.swing.JTextField generatedTxt;
    private javax.swing.JTextField insertTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
