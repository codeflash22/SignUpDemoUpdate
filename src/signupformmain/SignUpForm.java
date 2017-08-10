package signupformmain;

/**
 *
 * @author Faisal
 */
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.*;

public class SignUpForm extends javax.swing.JFrame {

    public SignUpForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new ButtonGroup();
        loginIDLabel = new JLabel();
        loginPWLabel = new JLabel();
        loginPWField = new JPasswordField();
        loginIDField = new JTextField();
        loginButton = new JButton();
        firstNameField = new JTextField("First Name");
        lastNameField = new JTextField("Last Name");
        emailField = new JTextField("Email Address");
        passwordField = new JPasswordField("Enter Password");
        bdayLabel = new JLabel();
        DoBComboBox = new com.toedter.calendar.JDateChooser();
        femaleRadio = new JRadioButton();
        maleRadio = new JRadioButton();
        signUpButton = new JButton();
        headerLabel = new JLabel();
        collectDataButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        databaseTable = new javax.swing.JTable();

        gender.add(femaleRadio);
        gender.add(maleRadio);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginIDLabel.setText("Email or Phone");

        loginPWLabel.setText("Password");

        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        firstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusGained(evt);
            }
        });

        lastNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusGained(evt);
            }
        });

        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
        });

        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });

        bdayLabel.setText("Birthday");

        JTextFieldDateEditor editor = (JTextFieldDateEditor) DoBComboBox.getDateEditor();
        editor.setEditable(false);

        femaleRadio.setActionCommand("Female");
        gender.add(femaleRadio);
        femaleRadio.setText("Female");

        maleRadio.setActionCommand("Male");
        gender.add(maleRadio);
        maleRadio.setText("Male");

        signUpButton.setText("Create an account");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        headerLabel.setText("Create An Account");

        collectDataButton.setText("Collect Data");
        collectDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectDataButtonActionPerformed(evt);
            }
        });

        databaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(databaseTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signUpButton)
                    .addComponent(bdayLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(emailField)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(headerLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DoBComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(femaleRadio)
                            .addGap(18, 18, 18)
                            .addComponent(maleRadio))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginIDLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginPWField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginButton))
                            .addComponent(loginPWLabel))
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(collectDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginIDLabel)
                    .addComponent(loginPWLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginPWField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bdayLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DoBComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(collectDataButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femaleRadio)
                    .addComponent(maleRadio))
                .addGap(18, 18, 18)
                .addComponent(signUpButton)
                .addGap(0, 180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String info = "User ID: " + loginIDField.getText() + 
                " , Password: " + new String(loginPWField.getPassword());
        JOptionPane.showMessageDialog(this, info);
    }//GEN-LAST:event_loginButtonActionPerformed
    
    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        Pattern letterPattern = Pattern.compile("^[a-zA-Z]+$");
        Pattern emailPattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        String info = firstNameField.getText()+" "+lastNameField.getText()+", "+emailField.getText()+", "+
                    gender.getSelection().getActionCommand()+", "+dFormat.format(DoBComboBox.getDate());
        try{         

            FinalFrame secondFrameObj = new FinalFrame(firstNameField.getText(),lastNameField.getText(),emailField.getText(),
                    gender.getSelection().getActionCommand(),dFormat.format(DoBComboBox.getDate()));

            if(firstNameField.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Please Enter First Name", "Error", JOptionPane.ERROR_MESSAGE);
            else if(!(letterPattern.matcher(firstNameField.getText()).matches()))
                JOptionPane.showMessageDialog(null, "Please enter a valid character in First Name", "Error", JOptionPane.ERROR_MESSAGE);
            else if(lastNameField.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Please Enter Last Name", "Error", JOptionPane.ERROR_MESSAGE);
            else if(!(letterPattern.matcher(lastNameField.getText()).matches()))
                JOptionPane.showMessageDialog(null, "Please enter a valid character in Last Name", "Error", JOptionPane.ERROR_MESSAGE);
            else if(emailField.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Please Enter Email", "Error", JOptionPane.ERROR_MESSAGE);
            else if(!emailPattern.matcher(emailField.getText()).matches())
                JOptionPane.showMessageDialog(null, "Please Enter Valid Email Address", "Error", JOptionPane.ERROR_MESSAGE);
            else if(new String(passwordField.getPassword()).equals(""))
                JOptionPane.showMessageDialog(null, "Please Enter Password", "Error", JOptionPane.ERROR_MESSAGE);
            else
                secondFrameObj.setVisible(true);              
            }catch(NullPointerException npe){
                JOptionPane.showMessageDialog(null, "Pxlease Select Date of Birth & Gender", "Error", JOptionPane.ERROR_MESSAGE);
            }
        
        try {
            FileWriter writer = new FileWriter("database.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(info);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void firstNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusGained
        firstNameField.setText("");
    }//GEN-LAST:event_firstNameFieldFocusGained

    private void lastNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusGained
        lastNameField.setText("");
    }//GEN-LAST:event_lastNameFieldFocusGained

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        emailField.setText("");
    }//GEN-LAST:event_emailFieldFocusGained

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordField.setText("");
    }//GEN-LAST:event_passwordFieldFocusGained

    private void collectDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectDataButtonActionPerformed
            try {
            FileReader reader = new FileReader("database.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
            String info[];
            int counter = 1;
 
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("-------------Person: "+counter++);
                info = line.split(",");
                System.out.println("Name: "+info[0]);
                System.out.println("Email: "+info[1]);
                System.out.println("Gender: "+info[2]);
                System.out.println("Date of Birth: "+info[3]);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_collectDataButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DoBComboBox;
    private javax.swing.JLabel bdayLabel;
    private javax.swing.JButton collectDataButton;
    private javax.swing.JTable databaseTable;
    private javax.swing.JTextField emailField;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstNameField;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginIDField;
    private javax.swing.JLabel loginIDLabel;
    private javax.swing.JPasswordField loginPWField;
    private javax.swing.JLabel loginPWLabel;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signUpButton;
    // End of variables declaration//GEN-END:variables
    
}


