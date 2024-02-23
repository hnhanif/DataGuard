
package dataguard;

import javax.swing.JOptionPane;


public class HammingPanel extends javax.swing.JPanel {

    public HammingPanel() {
        initComponents();
        myInit();
    }

    
    private void myInit(){
        logicCheck(false);
    };
    
    private void logicCheck(boolean bol){
        serverLabel.setVisible(bol);
        serverSiteTxt.setVisible(bol);
        
        receiverLabel.setVisible(bol);
        receiverTxt.setVisible(bol);
        clearBtn.setVisible(bol);
        checkBtn.setVisible(bol);
        resultTxt.setVisible(bol);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        receiverLabel = new javax.swing.JLabel();
        resultTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        insertTxt = new javax.swing.JTextField();
        checkBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        executeBtn = new javax.swing.JButton();
        serverLabel = new javax.swing.JLabel();
        serverSiteTxt = new javax.swing.JTextField();
        receiverTxt = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(90, 219, 181));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receiverLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        receiverLabel.setForeground(new java.awt.Color(14, 42, 71));
        receiverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receiverLabel.setText("Receiver Site:");
        jPanel1.add(receiverLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, 50));

        resultTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resultTxt.setForeground(new java.awt.Color(14, 42, 71));
        resultTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 42, 71), 2, true));
        resultTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultTxtActionPerformed(evt);
            }
        });
        jPanel1.add(resultTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 610, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(14, 42, 71));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Insert Bits:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, 50));

        insertTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        insertTxt.setForeground(new java.awt.Color(14, 42, 71));
        insertTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        insertTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 42, 71), 2, true));
        jPanel1.add(insertTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 400, 50));

        checkBtn.setBackground(new java.awt.Color(14, 42, 71));
        checkBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkBtn.setText("Check Match");
        checkBtn.setBorder(null);
        checkBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });
        jPanel1.add(checkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 400, 50));

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
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 150, 40));

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
        jPanel1.add(executeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 400, 50));

        serverLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        serverLabel.setForeground(new java.awt.Color(14, 42, 71));
        serverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serverLabel.setText("Server Site:");
        jPanel1.add(serverLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 50));

        serverSiteTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        serverSiteTxt.setForeground(new java.awt.Color(14, 42, 71));
        serverSiteTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        serverSiteTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 42, 71), 2, true));
        serverSiteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverSiteTxtActionPerformed(evt);
            }
        });
        jPanel1.add(serverSiteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 400, 50));

        receiverTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        receiverTxt.setForeground(new java.awt.Color(14, 42, 71));
        receiverTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        receiverTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 42, 71), 2, true));
        receiverTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiverTxtActionPerformed(evt);
            }
        });
        jPanel1.add(receiverTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 400, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void executeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeBtnActionPerformed
        
        String insertedStringBits = insertTxt.getText();
        if(insertedStringBits.length()>0){
            logicCheck(true);
        }else{
            JOptionPane.showMessageDialog(null, "insert bits first");
        }
        int[] insertBits = new int[insertedStringBits.length()];
        for(int i=0;i<insertedStringBits.length(); i++){
            insertBits[i] = Character.getNumericValue(insertedStringBits.charAt(i));
        }
        
        String serverSiteCode = HammingCode.generateServerSideCode(insertBits);
        serverSiteTxt.setText(serverSiteCode);
        
    }//GEN-LAST:event_executeBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed

        logicCheck(false);
        insertTxt.setText("");
        serverSiteTxt.setText("");
        receiverTxt.setText("");
        resultTxt.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed
        String receiverString = receiverTxt.getText();
        int[] insertBits = new int[receiverString.length()];
        for(int i=0;i<receiverString.length(); i++){
            insertBits[i] = Character.getNumericValue(receiverString.charAt(i));
        }
        String receiverSiteCode = HammingCode.generateReceiverSideCode(insertBits);
        String serverSiteCode = serverSiteTxt.getText();
        
         String matchResult = HammingCode.checkMatch(serverSiteCode, receiverSiteCode);
         resultTxt.setText(matchResult);
        
    }//GEN-LAST:event_checkBtnActionPerformed

    private void resultTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultTxtActionPerformed

    private void serverSiteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverSiteTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverSiteTxtActionPerformed

    private void receiverTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiverTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiverTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton executeBtn;
    private javax.swing.JTextField insertTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel receiverLabel;
    private javax.swing.JTextField receiverTxt;
    private javax.swing.JTextField resultTxt;
    private javax.swing.JLabel serverLabel;
    private javax.swing.JTextField serverSiteTxt;
    // End of variables declaration//GEN-END:variables
}
