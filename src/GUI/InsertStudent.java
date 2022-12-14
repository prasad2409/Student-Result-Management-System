/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProviderCode;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author avula
 */
public class InsertStudent extends javax.swing.JFrame {

    /**
     * Creates new form InsertStudent
     */
    public InsertStudent() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        name_TextField = new javax.swing.JTextField();
        rollNo_TextField = new javax.swing.JTextField();
        gender_ComboBox = new javax.swing.JComboBox<>();
        fatherName_TextField = new javax.swing.JTextField();
        course_ComboBox = new javax.swing.JComboBox<>();
        semComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        branchComboBox1 = new javax.swing.JComboBox<>();
        yearComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 500));
        setMinimumSize(new java.awt.Dimension(550, 500));
        setPreferredSize(new java.awt.Dimension(550, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Roll No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Father's Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Course");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Branch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.setMaximumSize(new java.awt.Dimension(80, 30));
        submitButton.setMinimumSize(new java.awt.Dimension(80, 30));
        submitButton.setPreferredSize(new java.awt.Dimension(80, 30));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 100, -1));

        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.setMaximumSize(new java.awt.Dimension(80, 30));
        exitButton.setMinimumSize(new java.awt.Dimension(80, 30));
        exitButton.setPreferredSize(new java.awt.Dimension(80, 30));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 100, -1));

        name_TextField.setMaximumSize(new java.awt.Dimension(100, 30));
        name_TextField.setMinimumSize(new java.awt.Dimension(100, 30));
        name_TextField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(name_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 160, -1));

        rollNo_TextField.setMaximumSize(new java.awt.Dimension(100, 30));
        rollNo_TextField.setMinimumSize(new java.awt.Dimension(100, 30));
        rollNo_TextField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(rollNo_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 160, -1));

        gender_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        gender_ComboBox.setMaximumSize(new java.awt.Dimension(100, 30));
        gender_ComboBox.setMinimumSize(new java.awt.Dimension(100, 30));
        gender_ComboBox.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(gender_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 160, -1));

        fatherName_TextField.setMaximumSize(new java.awt.Dimension(100, 30));
        fatherName_TextField.setMinimumSize(new java.awt.Dimension(100, 30));
        fatherName_TextField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(fatherName_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 160, -1));

        course_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech" }));
        course_ComboBox.setMaximumSize(new java.awt.Dimension(100, 30));
        course_ComboBox.setMinimumSize(new java.awt.Dimension(100, 30));
        course_ComboBox.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(course_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 160, -1));

        semComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", " " }));
        semComboBox.setMaximumSize(new java.awt.Dimension(100, 30));
        semComboBox.setMinimumSize(new java.awt.Dimension(100, 30));
        semComboBox.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(semComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 160, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Year");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Semester");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        branchComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Civil", "Mechanical", "EEE", "ECE", "CSE" }));
        branchComboBox1.setMaximumSize(new java.awt.Dimension(100, 30));
        branchComboBox1.setMinimumSize(new java.awt.Dimension(100, 30));
        branchComboBox1.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(branchComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 160, -1));

        yearComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        yearComboBox1.setMaximumSize(new java.awt.Dimension(100, 30));
        yearComboBox1.setMinimumSize(new java.awt.Dimension(100, 30));
        yearComboBox1.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(yearComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 160, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit", "submit", JOptionPane.YES_NO_OPTION);
        
        if(response ==0 ){
            setVisible(false);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String name = name_TextField.getText();
        String rollNo = rollNo_TextField.getText();
        String gender = (String)gender_ComboBox.getSelectedItem();
        String fatherName = fatherName_TextField.getText();
        String course = (String) course_ComboBox.getSelectedItem();
        String branch = (String)branchComboBox1.getSelectedItem();
        String year = (String)yearComboBox1.getSelectedItem();
        String sem = (String)semComboBox.getSelectedItem();
        
        try {
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values('"+ name + "', '" + rollNo +"', '"+ gender +"', '"+ fatherName +"', '"+ course +"', '"+ branch +"', '"+year+"', '"+sem+"')");
            JOptionPane.showMessageDialog(null, "Insertion Successful");
            setVisible(false);
            InsertStudent frame = new InsertStudent();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InsertStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> branchComboBox1;
    private javax.swing.JComboBox<String> course_ComboBox;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField fatherName_TextField;
    private javax.swing.JComboBox<String> gender_ComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name_TextField;
    private javax.swing.JTextField rollNo_TextField;
    private javax.swing.JComboBox<String> semComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> yearComboBox1;
    // End of variables declaration//GEN-END:variables
}
