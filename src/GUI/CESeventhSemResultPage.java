/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProviderCode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author avula
 */
public class CESeventhSemResultPage extends javax.swing.JFrame {

    /**
     * Creates new form CESeventhSemResultPage
     */
    public CESeventhSemResultPage() {
        initComponents();
    }
    public CESeventhSemResultPage(String rollNo) {
        initComponents();
        rollNo_TextField1.setText(rollNo);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fatherName_TextField = new javax.swing.JTextField();
        course_TextField = new javax.swing.JTextField();
        name_TextField = new javax.swing.JTextField();
        gender_TextField = new javax.swing.JTextField();
        branch_TextField = new javax.swing.JTextField();
        rollNo_TextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        total_TextField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        verdict_TextField = new javax.swing.JTextField();
        logOut_Button = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        ee2_TextField = new javax.swing.JTextField();
        wre2_TextField = new javax.swing.JTextField();
        ge2_TextField = new javax.swing.JTextField();
        rs_TextField = new javax.swing.JTextField();
        gi_TextField = new javax.swing.JTextField();
        gwd_TextField = new javax.swing.JTextField();
        gisLab_TextField = new javax.swing.JTextField();
        iddLab_TextField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 580));
        setMinimumSize(new java.awt.Dimension(650, 580));
        setPreferredSize(new java.awt.Dimension(650, 580));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Gender");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Branch");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("RollNo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Father'sName");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Course");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));
        getContentPane().add(fatherName_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 120, -1));
        getContentPane().add(course_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 120, -1));
        getContentPane().add(name_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 120, -1));
        getContentPane().add(gender_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 120, -1));
        getContentPane().add(branch_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 120, -1));
        getContentPane().add(rollNo_TextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Subjects");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Total Marks ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 90, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Passing Marks ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Marks Obtained ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        jLabel18.setText("40");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 30, 20));

        jLabel19.setText("40");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 30, 20));

        jLabel20.setText("40");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 30, 20));

        jLabel21.setText("40");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 30, 20));

        jLabel22.setText("40");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 30, 20));

        jLabel23.setText("40");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 30, 20));

        jLabel24.setText("40");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 30, 20));

        jLabel25.setText("100");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 20, 20));

        jLabel26.setText("100");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 20, 20));

        jLabel27.setText("100");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 20, 20));

        jLabel28.setText("100");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 20, 20));

        jLabel29.setText("100");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 20, 20));

        jLabel30.setText("100");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 20, 20));

        jLabel31.setText("100");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 20, 20));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Total");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, 30));
        getContentPane().add(total_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 100, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("Verdict");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, 30));
        getContentPane().add(verdict_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 100, 30));

        logOut_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-logout-50.png"))); // NOI18N
        logOut_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logOut_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 60, -1));

        jLabel12.setText("100");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 20, -1));

        jLabel13.setText("40");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Environmental - II");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Water Resource - II");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Geotechnical Engineering - II");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Remote Sensing & GIS App");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 20));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Ground Improvement");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 20));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Ground Water Development");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 20));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("GIS & CAD Lab");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 20));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("Irrigation Design & Drawing");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));
        getContentPane().add(ee2_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 130, -1));
        getContentPane().add(wre2_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 130, -1));
        getContentPane().add(ge2_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 130, -1));
        getContentPane().add(rs_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 130, -1));
        getContentPane().add(gi_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 130, -1));
        getContentPane().add(gwd_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 130, -1));
        getContentPane().add(gisLab_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 130, -1));
        getContentPane().add(iddLab_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 130, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        jLabel37.setText("jLabel37");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOut_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_ButtonActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Are you sure", "submit", JOptionPane.YES_NO_OPTION);
        
        if(response == 0){
            setVisible(false);
            Home frame = new Home();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_logOut_ButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String rollNo = rollNo_TextField1.getText();
        try{
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
            ResultSet rs = st.executeQuery("select * from student inner join ceseventhresult where student.rollNo='"+rollNo+"' and ceseventhresult.rollNo='"+rollNo+"' and student.year='"+4+"' and ceseventhresult.year='"+4+"' and student.semester='"+1+"' and ceseventhresult.semester='"+1+"'");
            
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "Entered RollNo. doesn't exist");
            }
            else{ 
                name_TextField.setText(rs.getString(1));
                gender_TextField.setText(rs.getString(3));
                fatherName_TextField.setText(rs.getString(4));
                course_TextField.setText(rs.getString(5));
                branch_TextField.setText(rs.getString(6));
                
                ee2_TextField.setText(rs.getString(12));
                wre2_TextField.setText(rs.getString(13));
                ge2_TextField.setText(rs.getString(14));
                rs_TextField.setText(rs.getString(15));
                gi_TextField.setText(rs.getString(16));
                gwd_TextField.setText(rs.getString(17));
                gisLab_TextField.setText(rs.getString(18));
                iddLab_TextField.setText(rs.getString(19));
                total_TextField.setText(rs.getString(20));
                
                rollNo_TextField1.setEditable(false);
                name_TextField.setEditable(false);
                gender_TextField.setEditable(false);
                fatherName_TextField.setEditable(false);
                course_TextField.setEditable(false);
                branch_TextField.setEditable(false);
                
                ee2_TextField.setEditable(false);
                wre2_TextField.setEditable(false);
                ge2_TextField.setEditable(false);
                rs_TextField.setEditable(false);
                gi_TextField.setEditable(false);
                gwd_TextField.setEditable(false);
                gisLab_TextField.setEditable(false);
                iddLab_TextField.setEditable(false);
                total_TextField.setEditable(false);
                
                int ee2   = rs.getInt(12);
                int wre2 =rs.getInt(13);
                int ge2   = rs.getInt(14);
                int rsgi = rs.getInt(15);
                int gi   = rs.getInt(16);
                int gwd =rs.getInt(17);
                int gisLab =rs.getInt(18);
                int iddLab =rs.getInt(19);
                
           
                
                
                if(ee2>=40 && wre2>=40 && ge2>=40 && rsgi >=40 && gi >=40 && gwd >=40 && gisLab >=40 && iddLab >=40){
                    verdict_TextField.setText("PASS");
                }
                else{
                    verdict_TextField.setText("FAIL");
                }
                verdict_TextField.setEditable(false);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(CESeventhSemResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CESeventhSemResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CESeventhSemResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CESeventhSemResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CESeventhSemResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField branch_TextField;
    private javax.swing.JTextField course_TextField;
    private javax.swing.JTextField ee2_TextField;
    private javax.swing.JTextField fatherName_TextField;
    private javax.swing.JTextField ge2_TextField;
    private javax.swing.JTextField gender_TextField;
    private javax.swing.JTextField gi_TextField;
    private javax.swing.JTextField gisLab_TextField;
    private javax.swing.JTextField gwd_TextField;
    private javax.swing.JTextField iddLab_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logOut_Button;
    private javax.swing.JTextField name_TextField;
    private javax.swing.JTextField rollNo_TextField1;
    private javax.swing.JTextField rs_TextField;
    private javax.swing.JTextField total_TextField;
    private javax.swing.JTextField verdict_TextField;
    private javax.swing.JTextField wre2_TextField;
    // End of variables declaration//GEN-END:variables
}
