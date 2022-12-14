/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author avula
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        studentButton = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 450));
        setMinimumSize(new java.awt.Dimension(700, 450));
        setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        studentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-schoolboy-at-a-desk-30.png"))); // NOI18N
        studentButton.setText("Student");
        studentButton.setMaximumSize(new java.awt.Dimension(150, 30));
        studentButton.setMinimumSize(new java.awt.Dimension(150, 30));
        studentButton.setPreferredSize(new java.awt.Dimension(150, 30));
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(studentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        adminButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-admin-settings-male-30.png"))); // NOI18N
        adminButton.setText("Admin");
        adminButton.setMaximumSize(new java.awt.Dimension(150, 30));
        adminButton.setMinimumSize(new java.awt.Dimension(150, 30));
        adminButton.setPreferredSize(new java.awt.Dimension(150, 30));
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });
        getContentPane().add(adminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(700, 450));
        jLabel3.setMinimumSize(new java.awt.Dimension(700, 450));
        jLabel3.setPreferredSize(new java.awt.Dimension(750, 450));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-890, -540, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/vvit_drone_4k-min.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-490, -360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentButtonActionPerformed
        // TODO add your handling code here:
        /*setVisible(false);
        StudentLogin frame = new StudentLogin();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);*/
        setVisible(false);
        Student frame = new Student();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
   
    }//GEN-LAST:event_studentButtonActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AdminLogin frame = new AdminLogin();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_adminButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton studentButton;
    // End of variables declaration//GEN-END:variables
}
