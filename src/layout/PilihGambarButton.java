/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layout;

import java.awt.CardLayout;

/**
 *
 * @author ThinkPad
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Keluar = new javax.swing.JButton();
        PostgreSQL = new javax.swing.JButton();
        JavaEE = new javax.swing.JButton();
        GlassFish = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        javaee = new javax.swing.JLabel();
        postgresql = new javax.swing.JLabel();
        glassfish = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(200, 200));

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        PostgreSQL.setText("PostgreSQL");
        PostgreSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostgreSQLActionPerformed(evt);
            }
        });

        JavaEE.setText("Java EE");
        JavaEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavaEEActionPerformed(evt);
            }
        });

        GlassFish.setText("GlassFish");
        GlassFish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GlassFishActionPerformed(evt);
            }
        });

        imagePanel.setMaximumSize(new java.awt.Dimension(200, 200));
        imagePanel.setLayout(new java.awt.CardLayout());

        javaee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/javaee.jpeg"))); // NOI18N
        javaee.setName("1"); // NOI18N
        imagePanel.add(javaee, "1\n");

        postgresql.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postgresql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/postgreesql.jpeg"))); // NOI18N
        postgresql.setName("2"); // NOI18N
        postgresql.setPreferredSize(new java.awt.Dimension(200, 1093));
        imagePanel.add(postgresql, "2\n");

        glassfish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        glassfish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/glassfish.jpeg"))); // NOI18N
        glassfish.setMaximumSize(new java.awt.Dimension(316, 400));
        glassfish.setMinimumSize(new java.awt.Dimension(316, 400));
        glassfish.setName("0"); // NOI18N
        glassfish.setPreferredSize(new java.awt.Dimension(316, 400));
        imagePanel.add(glassfish, "0\n");
        glassfish.getAccessibleContext().setAccessibleName("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(GlassFish)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JavaEE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PostgreSQL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Keluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GlassFish)
                    .addComponent(JavaEE)
                    .addComponent(PostgreSQL)
                    .addComponent(Keluar))
                .addGap(19, 19, 19)
                .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JavaEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JavaEEActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_JavaEEActionPerformed

    private void PostgreSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostgreSQLActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_PostgreSQLActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_KeluarActionPerformed

    private void GlassFishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GlassFishActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_GlassFishActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GlassFish;
    private javax.swing.JButton JavaEE;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton PostgreSQL;
    private javax.swing.JLabel glassfish;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel javaee;
    private javax.swing.JLabel postgresql;
    // End of variables declaration//GEN-END:variables
}
