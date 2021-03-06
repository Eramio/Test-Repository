package libsystem;

import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Form_Register extends javax.swing.JFrame {

    /**
     * Creates new form Form_Register
     */
    public Form_Register() {
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

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField_Confirm = new javax.swing.JPasswordField();
        jPasswordField = new javax.swing.JPasswordField();
        jTextField_Username = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_Firstname = new javax.swing.JTextField();
        jTextField_Lastname = new javax.swing.JTextField();
        jTextField_Contactnumber = new javax.swing.JTextField();
        jTextField_Address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jRadioButton_Others = new javax.swing.JRadioButton();
        jButton_Register = new javax.swing.JButton();
        jLabel_Login = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First name:");

        jLabel2.setText("Last name:");

        jLabel3.setText("Username:");

        jLabel4.setText("Address:");

        jLabel5.setText("Contact Number:");

        jLabel6.setText("Gender: ");

        jLabel7.setText("Email:");

        jLabel8.setText("Password:");

        jLabel9.setText("Confirm Password:");

        jPasswordField_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_ConfirmActionPerformed(evt);
            }
        });

        jTextField_Contactnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ContactnumberKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Create Account");

        buttonGroupGender.add(jRadioButton_Male);
        jRadioButton_Male.setText("Male");
        jRadioButton_Male.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton_MaleMouseClicked(evt);
            }
        });
        jRadioButton_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(jRadioButton_Female);
        jRadioButton_Female.setText("Female");
        jRadioButton_Female.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton_FemaleMouseClicked(evt);
            }
        });
        jRadioButton_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_FemaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(jRadioButton_Others);
        jRadioButton_Others.setText("Others");
        jRadioButton_Others.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton_OthersMouseClicked(evt);
            }
        });
        jRadioButton_Others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_OthersActionPerformed(evt);
            }
        });

        jButton_Register.setText("Register");
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_Lastname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jTextField_Username, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordField_Confirm, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_Firstname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_Contactnumber, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_Address, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton_Male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton_Female)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton_Others)))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Register)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jPasswordField_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton_Male)
                    .addComponent(jRadioButton_Female)
                    .addComponent(jRadioButton_Others))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Contactnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_Register)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_Login.setForeground(new java.awt.Color(0, 102, 255));
        jLabel_Login.setText("Login");
        jLabel_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LoginMouseClicked(evt);
            }
        });

        jLabel11.setText("Already have an account?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Login)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Login)
                    .addComponent(jLabel11))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LoginMouseClicked
        
        Form_Login form = new Form_Login();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.pack();
        this.dispose();
        
    }//GEN-LAST:event_jLabel_LoginMouseClicked

    private void jButton_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseClicked

        String uName = jTextField_Username.getText();
        String email = jTextField_Email.getText();
        String pass = String.valueOf(jPasswordField.getPassword());
        String passCon = String.valueOf(jPasswordField.getPassword());
        String fName = jTextField_Firstname.getText();
        String lName = jTextField_Lastname.getText();
        String gender;
        String contact = jTextField_Contactnumber.getText();
        String address = jTextField_Address.getText();

        if(jRadioButton_Male.isSelected())
        {
            gender = "Male";
        }
        else if(jRadioButton_Female.isSelected())
        {
            gender = "Female";
        }
        else
        {
            gender = "Others";
        }

        if(checkFields())
        {
            if(!checkUsername(uName))
            {
                PreparedStatement ps;
                ResultSet rs;
                String registerQuery = "INSERT INTO users(username, email, password, firstname, lastname, gender, contact, address) VALUES (?,?,?,?,?,?,?,?)";

                try {

                    ps = dbConnection.getConnection().prepareStatement(registerQuery);
                    ps.setString(1, uName);
                    ps.setString(2, email);
                    ps.setString(3, pass);
                    ps.setString(4, fName);
                    ps.setString(5, lName);
                    ps.setString(6, gender);
                    ps.setString(7, contact);
                    ps.setString(8, address);

                    if(ps.executeUpdate() != 0)
                    {
                        JOptionPane.showMessageDialog(null, "Account has been created","Congratulations",2);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Error","Failed",2);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Form_Register.class.getName()).log(Level.SEVERE, null, ex);
                }

                Form_Login form = new Form_Login();
                form.setVisible(true);
                form.setLocationRelativeTo(null);
                form.pack();
                this.dispose();
            }
        }

    }//GEN-LAST:event_jButton_RegisterMouseClicked

    private void jRadioButton_OthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_OthersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_OthersActionPerformed

    private void jRadioButton_OthersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton_OthersMouseClicked

    }//GEN-LAST:event_jRadioButton_OthersMouseClicked

    private void jRadioButton_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_FemaleActionPerformed

    private void jRadioButton_FemaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton_FemaleMouseClicked

    }//GEN-LAST:event_jRadioButton_FemaleMouseClicked

    private void jRadioButton_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_MaleActionPerformed

    private void jRadioButton_MaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton_MaleMouseClicked

    }//GEN-LAST:event_jRadioButton_MaleMouseClicked

    private void jTextField_ContactnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ContactnumberKeyTyped

        if(!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_ContactnumberKeyTyped

    private void jPasswordField_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_ConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_ConfirmActionPerformed

    public boolean checkFields()
    {
        String uName = jTextField_Username.getText();
        String email = jTextField_Email.getText();
        String pass = String.valueOf(jPasswordField.getPassword());
        String passCon = String.valueOf(jPasswordField.getPassword());
        String fName = jTextField_Firstname.getText();
        String lName = jTextField_Lastname.getText();
        String contact = jTextField_Contactnumber.getText();
        String address = jTextField_Address.getText();
        
//        if ( uName == "" || email == "" || pass == "" || passCon == "" || fName == "" || lName == "" || contact == "" || address == "")
//        {
        if ( uName.trim().equals("") || email.trim().equals("") || pass.trim().equals("") || passCon.trim().equals("") || fName.trim().equals("") || lName.trim().equals("") || contact.trim().equals("") || address.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Incomplete Form","Fill up required Field(s)",2);
            return false;
        }
        else if(!pass.equals(passCon))
        {
            JOptionPane.showMessageDialog(null, "Password Does Not Match","Confirm Password",2);
            return false;
        }
        else
        {
            return true;
        }       
    }
    
    public boolean checkUsername(String username)
    {
        boolean user_exist = false;
        PreparedStatement ps;
        ResultSet rs;
        try { 
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/libsystem";
//            String dbusername = "root";
//            String dbpassword = "computer0";
//            Connection con = DriverManager.getConnection(url, dbusername, dbpassword);
            String query = "SELECT * FROM users WHERE BINARY username =?";
             ps = dbConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next())
            {
                user_exist = true;
                JOptionPane.showMessageDialog(null, "Username is Already Taken","Invalid Username",2);
            }
            
            
        } catch (Exception e) {
            jLabel1.setText("Kek, something went wrong" + e);
        }        
        return user_exist;
    }
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
            java.util.logging.Logger.getLogger(Form_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordField_Confirm;
    private javax.swing.JRadioButton jRadioButton_Female;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JRadioButton jRadioButton_Others;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Contactnumber;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Firstname;
    private javax.swing.JTextField jTextField_Lastname;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
