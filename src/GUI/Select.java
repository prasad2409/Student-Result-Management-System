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
import net.proteanit.sql.DbUtils;

/**
 *
 * @author avula
 */
public class Select extends javax.swing.JFrame {

    /**
     * Creates new form Select
     */
    public Select() {
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

        jLabel3 = new javax.swing.JLabel();
        rollNo_TextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        year_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sem_TextField = new javax.swing.JTextField();
        search_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataOf_students = new javax.swing.JTable();
        update_Button = new javax.swing.JButton();
        exit_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 400));
        setMinimumSize(new java.awt.Dimension(550, 400));
        setPreferredSize(new java.awt.Dimension(550, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Roll No ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));
        getContentPane().add(rollNo_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Year");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));
        getContentPane().add(year_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 120, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Semester");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));
        getContentPane().add(sem_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 120, -1));

        search_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_Button.setText("Search");
        search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(search_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        dataOf_students.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "RollNo", "Gender", "Father Name", "Course", "Branch", "Year", "Semester"
            }
        ));
        jScrollPane1.setViewportView(dataOf_students);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 490, 90));

        update_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_Button.setText("Update");
        update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(update_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        exit_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit_Button.setText("Exit");
        exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exit_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 80, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/schoolPic2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_ButtonActionPerformed
        // TODO add your handling code here:
        String rollNo = rollNo_TextField.getText();
        int year = Integer.parseInt(year_TextField.getText());
        int sem = Integer.parseInt(sem_TextField.getText());
        try{
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs ;
            if(year==0 && sem ==0 ){
                rs= st.executeQuery("SELECT * FROM student WHERE rollNo='"+rollNo+"'");
            }
            else {
                rs = st.executeQuery("SELECT * FROM student WHERE rollNo='"+rollNo+"' AND year='"+year+"' AND semester='"+sem+"'");
            }
            dataOf_students.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.first()){
                JOptionPane.showMessageDialog(null, "Entered RollNo. doesn't exist");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_search_ButtonActionPerformed

    private void exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_ButtonActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Are you sure", "submit", JOptionPane.YES_NO_OPTION);
        
        if(response == 0)
            setVisible(false);
    }//GEN-LAST:event_exit_ButtonActionPerformed

    private void update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ButtonActionPerformed
        // TODO add your handling code here:
        int year = Integer.parseInt(year_TextField.getText());
        int sem = Integer.parseInt(sem_TextField.getText());
        
        if(year ==1 && sem ==1){
            UpdateFirstSem frame = new UpdateFirstSem();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        else if(year == 1 && sem == 2){
            UpdateSecondSem frame = new UpdateSecondSem();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        else if(year == 2 && sem == 1){
            UpdateCEThirdSem frame = new UpdateCEThirdSem();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        else if(year == 2 && sem == 2){
            UpdateCEFourthSem frame = new UpdateCEFourthSem();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        else if(year == 3 && sem == 1){
            UpdateCEFifthSem frame = new UpdateCEFifthSem();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        else if(year == 3 && sem == 2){
            UpdateCESixthseme frame = new UpdateCESixthseme();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        else if(year == 4 && sem == 1){
            UpdateCESeventhSem frame = new UpdateCESeventhSem();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        else if(year == 4 && sem == 2){
            UpdateCEEighthSem frame = new UpdateCEEighthSem();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        
    }//GEN-LAST:event_update_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Select().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataOf_students;
    private javax.swing.JButton exit_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rollNo_TextField;
    private javax.swing.JButton search_Button;
    private javax.swing.JTextField sem_TextField;
    private javax.swing.JButton update_Button;
    private javax.swing.JTextField year_TextField;
    // End of variables declaration//GEN-END:variables
}