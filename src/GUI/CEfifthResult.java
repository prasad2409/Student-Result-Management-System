/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProviderCode;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author avula
 */
public class CEfifthResult extends javax.swing.JFrame {

    /**
     * Creates new form CEfifthResult
     */
    public CEfifthResult() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rollNo_TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ms_TextField = new javax.swing.JTextField();
        eg_TextField = new javax.swing.JTextField();
        sa2_TextField = new javax.swing.JTextField();
        dd_TextField = new javax.swing.JTextField();
        ctLab_TextField = new javax.swing.JTextField();
        teLab_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        te_TextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        geoLab_TextField1 = new javax.swing.JTextField();
        submit_Button = new javax.swing.JButton();
        exit_Button = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 500));
        setMinimumSize(new java.awt.Dimension(550, 500));
        setPreferredSize(new java.awt.Dimension(550, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("RollNo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Year");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Semester");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));
        getContentPane().add(rollNo_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Management Science");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Engineering Geology");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Structural Analysis -II");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Design & Drawing");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Concrete Technology Lab");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Geology Lab");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 20));
        getContentPane().add(ms_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 112, 150, -1));
        getContentPane().add(eg_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 152, 150, -1));
        getContentPane().add(sa2_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 192, 150, -1));
        getContentPane().add(dd_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 232, 150, -1));
        getContentPane().add(ctLab_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 312, 150, -1));
        getContentPane().add(teLab_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Transportation Engineering - II");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 20));
        getContentPane().add(te_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 272, 150, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("3");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("1");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("-");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 10, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("-");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Transportation Engineering Lab");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));
        getContentPane().add(geoLab_TextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 352, 150, -1));

        submit_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit_Button.setText("Submit");
        submit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submit_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        exit_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit_Button.setText("Exit");
        exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exit_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_ButtonActionPerformed
        // TODO add your handling code here:
        String rollNo = rollNo_TextField.getText();

        int ms = Integer.parseInt(ms_TextField.getText());
        int eg = Integer.parseInt(eg_TextField.getText());
        int sa2 = Integer.parseInt(sa2_TextField.getText());
        int dd = Integer.parseInt(dd_TextField.getText());
        int te = Integer.parseInt(te_TextField.getText());
        int ctLab = Integer.parseInt(ctLab_TextField.getText());
        int geoLab = Integer.parseInt(geoLab_TextField1.getText());
        int teLab = Integer.parseInt(teLab_TextField.getText());
        int total = ms+eg+sa2+dd+te+ctLab+geoLab+teLab;

        try{
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into cefifthresult values("+ rollNo + ", " + 3 +", "+ 1 +", "+ ms +", "+ eg+", "+ sa2 + ", " + dd+", "+ te+", "+ ctLab+", "+ geoLab+", "+teLab+", "+total+")" );
            JOptionPane.showMessageDialog(null, "Added Successfully");
            setVisible(false);
            CEfifthResult frame = new CEfifthResult();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_submit_ButtonActionPerformed

    private void exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_ButtonActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Are you sure", "submit", JOptionPane.YES_NO_OPTION);
        
        if(response == 0)
            setVisible(false);
    }//GEN-LAST:event_exit_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CEfifthResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CEfifthResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CEfifthResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CEfifthResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CEfifthResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctLab_TextField;
    private javax.swing.JTextField dd_TextField;
    private javax.swing.JTextField eg_TextField;
    private javax.swing.JButton exit_Button;
    private javax.swing.JTextField geoLab_TextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField ms_TextField;
    private javax.swing.JTextField rollNo_TextField;
    private javax.swing.JTextField sa2_TextField;
    private javax.swing.JButton submit_Button;
    private javax.swing.JTextField teLab_TextField;
    private javax.swing.JTextField te_TextField;
    // End of variables declaration//GEN-END:variables
}
