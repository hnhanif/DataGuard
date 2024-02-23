package dataguard;

import javax.swing.JOptionPane;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class BitPanel extends javax.swing.JPanel {

    public BitPanel() {
        initComponents();
        myInit();
        clearBtn.setVisible(false);
        generatedLabel.setVisible(false);

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

        choice = new javax.swing.JComboBox<>();
        generatedLabel = new javax.swing.JLabel();
        generatedTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        insertTxt = new javax.swing.JTextField();
        copyBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        executeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(90, 219, 181));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        choice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        choice.setForeground(new java.awt.Color(14, 42, 71));
        choice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Stuffing", "DeStuffing" }));
        choice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 42, 71), 2, true));
        choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceActionPerformed(evt);
            }
        });
        add(choice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 590, 50));

        generatedLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        generatedLabel.setForeground(new java.awt.Color(14, 42, 71));
        generatedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generatedLabel.setText("Generated Bits:");
        add(generatedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, 50));

        generatedTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        generatedTxt.setForeground(new java.awt.Color(14, 42, 71));
        generatedTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        generatedTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 42, 71), 2, true));
        add(generatedTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 400, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(14, 42, 71));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Insert Bits:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 50));

        insertTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        insertTxt.setForeground(new java.awt.Color(14, 42, 71));
        insertTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        insertTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 42, 71), 2, true));
        add(insertTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 400, 50));

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
        add(copyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 590, 50));

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
        add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 50));

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
        add(executeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 400, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed

        logicFeature(false);
        choice.setSelectedIndex(0);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void executeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeBtnActionPerformed
        // TODO add your handling code here:
        String bits = insertTxt.getText();
        if (bits.length() > 0) {
            logicFeature(true);
        } else {
            JOptionPane.showMessageDialog(null, "Plz insert bits");
        }
        switch (choice.getSelectedIndex()) {
            case 1 -> {

                String generatedBits = bitStuffing(bits);
                generatedTxt.setText(generatedBits);
            }
            case 2 -> {
                String generatedBits = bitDeStuffing(bits);
                generatedTxt.setText(generatedBits);
            }
            default -> {
                logicFeature(false);
                JOptionPane.showMessageDialog(null, "Invalid Choice To execute");
            }
        }
    }//GEN-LAST:event_executeBtnActionPerformed

    private void copyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyBtnActionPerformed
        String myString = generatedTxt.getText();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_copyBtnActionPerformed

    private void choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceActionPerformed
        // TODO add your handling code here:
        logicFeature(false);
    }//GEN-LAST:event_choiceActionPerformed

    private String bitStuffing(String bits) {
        StringBuilder stuffedBits = new StringBuilder();
        int consecutiveOnes = 0;

        for (char bit : bits.toCharArray()) {
            stuffedBits.append(bit);

            if (bit == '1') {
                consecutiveOnes++;
            } else {
                consecutiveOnes = 0;
            }

            if (consecutiveOnes == 5) {
                stuffedBits.append("0");
                consecutiveOnes = 0;
            }

        }

        return stuffedBits.toString();
    }

    private String bitDeStuffing(String bits) {
        StringBuilder deStuffedBits = new StringBuilder();
        int consecutiveOnes = 0;

        for (char bit : bits.toCharArray()) {
            deStuffedBits.append(bit);

            if (bit == '1') {
                consecutiveOnes++;
            } else if (consecutiveOnes == 5 && bit == '0') {
                deStuffedBits.deleteCharAt(deStuffedBits.length() - 1);
                consecutiveOnes = 0;
            } else {
                consecutiveOnes = 0;
            }

        }

        return deStuffedBits.toString();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> choice;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton copyBtn;
    private javax.swing.JButton executeBtn;
    private javax.swing.JLabel generatedLabel;
    private javax.swing.JTextField generatedTxt;
    private javax.swing.JTextField insertTxt;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
