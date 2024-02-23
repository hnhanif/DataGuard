package dataguard;

public class MorePanel extends javax.swing.JPanel {

    public MorePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        visitBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(90, 219, 181));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        visitBtn.setBackground(new java.awt.Color(14, 42, 71));
        visitBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        visitBtn.setForeground(new java.awt.Color(255, 255, 255));
        visitBtn.setText("Visit For More");
        visitBtn.setBorder(null);
        visitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(visitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 420, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void visitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitBtnActionPerformed
        String url = "https://octave-online.net/";

        // Try to open the default web browser with the specified URL
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
            // Handle any potential IOException
        }
    }//GEN-LAST:event_visitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton visitBtn;
    // End of variables declaration//GEN-END:variables
}
