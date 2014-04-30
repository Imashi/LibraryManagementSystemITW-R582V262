package se.wsu.lmw.LMS.view.Register;

import se.wsu.lmw.Database.DB;
import se.wsu.lmw.Controls.Date.Date1;
import se.wsu.lmw.Controls.load_data.LoadLibrianData;
import se.wsu.lmw.Controls.VerifyUser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author imashi
 */
public class Register_New_Librian extends javax.swing.JPanel {

    private String librian;
    private String librarianId;
    private String gender;
    private String marr = "";
    private String pass;

    /**
     * Creates new form Register_New_Librian
     */
    public Register_New_Librian() {
        initComponents();
    }

    public Register_New_Librian(String librian, String lid) {
        initComponents();
        setLID(lid);
        setLibrian(librian);
        jLabel16.setText(getLibrian());
        jLabel15.setText(getLID());
        jLabel14.setText(Date1.myDate());
        jTextField1.setText(LoadLibrianData.LoadMaxLID());
        jTextField1.setEditable(false);
        jTextField2.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderbuttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setOpaque(false);

        jLabel1.setText("Librarian First Name :");

        jLabel2.setText("Librarian ID :");

        jLabel3.setText("Librarian Middle Name :");

        jLabel4.setText("Librarian Surname :");

        jLabel5.setText("Librarian Age :");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gender"));

        GenderbuttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");
        jRadioButton1.setNextFocusableComponent(jRadioButton2);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jRadioButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton1KeyPressed(evt);
            }
        });

        GenderbuttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.setNextFocusableComponent(jButton1);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jRadioButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jRadioButton2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setText("Home Address :");

        jLabel7.setText("Temperary Address :");

        jLabel8.setText("Mobile Phone Number :");

        jLabel9.setText("Home Telephone Number :");

        jTextField1.setNextFocusableComponent(jTextField2);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        jTextField2.setNextFocusableComponent(jTextField3);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.setNextFocusableComponent(jTextField6);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jTextField4.setNextFocusableComponent(jTextField7);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jTextField5.setNextFocusableComponent(jTextField4);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jTextField6.setNextFocusableComponent(jTextField5);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });

        jTextField7.setNextFocusableComponent(jTextField9);
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jTextField8.setNextFocusableComponent(jTextField10);
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jTextField9.setNextFocusableComponent(jTextField8);
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Register New Librarian");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jLabel10.setOpaque(true);

        jLabel11.setText("Registering Librarian : ");

        jLabel12.setText("Librarian ID :");

        jLabel13.setText("Date :");

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        jLabel16.setText("jLabel16");

        jLabel17.setText("User Name :");

        jTextField10.setNextFocusableComponent(jPasswordField1);
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
        });

        jLabel18.setText("Password :");

        jPasswordField1.setNextFocusableComponent(jRadioButton1);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.setNextFocusableComponent(jButton2);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton2KeyReleased(evt);
            }
        });

        jCheckBox1.setText("Set as Admin");
        jCheckBox1.setNextFocusableComponent(jTextField3);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jCheckBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel4)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel8)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel9)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel5)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel16))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel15))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public String getGender() {
        return gender;
    }

    public void setGender() {
        if (jRadioButton1.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }

    }

  
    public String getLibrian() {
        return librian;
    }

    public String getLID() {
        return librarianId;
    }

    public void setLID(String lid) {
        librarianId = lid;
    }

    public void setLibrian(String librian) {
        this.librian = librian;
    }
private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField2ActionPerformed

private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField5ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    pass = new String(jPasswordField1.getPassword());
    if (jTextField2.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Can't save data with \n Empty First Name", "info..", JOptionPane.ERROR_MESSAGE);
    } else if (jTextField6.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Can't save data with \n Empty Surname", "info..", JOptionPane.ERROR_MESSAGE);
    } else if (jTextField5.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Can't save data with \n Empty Address", "info..", JOptionPane.ERROR_MESSAGE);
    } else if (jTextField4.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Can't save data with \n Empty Temperary Address", "info..", JOptionPane.ERROR_MESSAGE);
    } else if (jTextField7.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Can't save data with \n Empty Mobile Number", "info..", JOptionPane.ERROR_MESSAGE);
    } else if (jTextField7.getText().length() != 10) {
        JOptionPane.showMessageDialog(this, "Mobile Number must have 10 Digits", "info..", JOptionPane.ERROR_MESSAGE);
    } else if (jTextField9.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Can't save data with \n Empty Home telephone Number", "info..", JOptionPane.ERROR_MESSAGE);
    } else if (jTextField9.getText().length() != 10) {
        JOptionPane.showMessageDialog(this, "Telephone Number must have 10 Digits", "info..", JOptionPane.ERROR_MESSAGE);
    } else if (jTextField10.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Can't save data with \n Empty User Name", "info..", JOptionPane.ERROR_MESSAGE);
    } else if (pass.equals("")) {
        JOptionPane.showMessageDialog(this, "Can't save data with \n Empty Password", "info..", JOptionPane.ERROR_MESSAGE);
    } else if (VerifyUser.verifyUser(jTextField10.getText(), pass) == true) {
        JOptionPane.showMessageDialog(this, "Please try with different Username and password", "info..", JOptionPane.ERROR_MESSAGE);
    } else if (VerifyUser.verifyUser(jTextField10.getText(), pass) == false) {

        try {
        } catch (Exception e) {
        }

         
        setGender();
        try {

            String userFirstName = jTextField2.getText();
            if (jCheckBox1.isSelected() == true) {
                userFirstName = jTextField2.getText() + "_Admin";
            }
            DB.myConnection().createStatement().executeUpdate("insert into librian values ('" + jTextField1.getText() + "','" + userFirstName + "','" + jTextField3.getText() + "','" + jTextField6.getText() + "','" + jTextField5.getText() + "','" + jTextField4.getText() + "','" + jTextField7.getText() + "','" + jTextField9.getText() + "','" + jTextField8.getText() + "','" + getGender() + "','" + marr + "','" + jTextField10.getText() + "','" + jLabel16.getText() + "','" + jLabel15.getText() + "','" + jLabel14.getText() + "')");

            DB.myConnection().createStatement().executeUpdate("insert into login values ('" + jTextField10.getText() + "','" + pass + "')");

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jPasswordField1.setText("");
            jTextField1.setText(LoadLibrianData.LoadMaxLID());
            jTextField2.grabFocus();
            pass = "";
        } catch (Exception e) {
            System.out.print("exception reg librian 475");
        }
    }

}//GEN-LAST:event_jButton1ActionPerformed

private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jPasswordField1ActionPerformed
    int i = 0;
private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
    if (evt.getKeyChar() == evt.VK_ENTER) {
        i++;
        if (i == 1) {
            jButton1.doClick();
        } else if (i == 2) {
            i = 0;
        }

    }
}//GEN-LAST:event_jButton1KeyReleased

private void jButton2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyReleased
    if (evt.getKeyChar() == evt.VK_ENTER) {
        i++;
        if (i == 1) {
            jButton2.doClick();
        } else if (i == 2) {
            i = 0;
        }
    }
}//GEN-LAST:event_jButton2KeyReleased

private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
}//GEN-LAST:event_jTextField7KeyReleased

private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
    if (!Character.isDigit(evt.getKeyChar()) || jTextField7.getText().length() >= 10) {
        evt.consume();
    }

}//GEN-LAST:event_jTextField7KeyTyped

private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
    if (!Character.isDigit(evt.getKeyChar()) || jTextField9.getText().length() >= 10) {
        evt.consume();
    }

}//GEN-LAST:event_jTextField9KeyTyped

private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
    if (!Character.isDigit(evt.getKeyChar())) {
        evt.consume();
    }
}//GEN-LAST:event_jTextField8KeyTyped

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
    jTextField8.setText("");
    jTextField9.setText("");
    jTextField10.setText("");
    jPasswordField1.setText("");
    jTextField2.grabFocus();
    pass = "";
}//GEN-LAST:event_jButton2ActionPerformed

private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    jRadioButton1.setSelected(true);
    jRadioButton2.setSelected(false);
}//GEN-LAST:event_jRadioButton1ActionPerformed

private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    jRadioButton1.setSelected(false);
    jRadioButton2.setSelected(true);
    
}//GEN-LAST:event_jRadioButton2ActionPerformed

private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
}//GEN-LAST:event_jTextField1KeyTyped

private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
}//GEN-LAST:event_jTextField2KeyTyped

private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
    System.out.println("key code = " + evt.getKeyCode() + " key char = " + evt.getKeyChar());
    if (evt.getKeyCode() == 39) {
        jCheckBox1.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jTextField3.grabFocus();
    }
}//GEN-LAST:event_jTextField2KeyPressed

private void jRadioButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton1KeyPressed
    if (evt.getKeyCode() == 40) {
        jRadioButton2.setSelected(true);
    } else if (evt.getKeyCode() == 37) {
        jTextField9.grabFocus();
    } else if (evt.getKeyCode() == 38) {
        jRadioButton1.setSelected(true);
    }
}//GEN-LAST:event_jRadioButton1KeyPressed

private void jRadioButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton2KeyPressed
    if (evt.getKeyCode() == 38) {
        jRadioButton1.setSelected(true);
    } else if (evt.getKeyCode() == 40) {
        jRadioButton2.setSelected(true);
    }
}//GEN-LAST:event_jRadioButton2KeyPressed

private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    if (jCheckBox1.isSelected() == true) {
        jCheckBox1.setSelected(true);
    } else if (jCheckBox1.isSelected() == false) {
        jCheckBox1.setSelected(false);
    }
}//GEN-LAST:event_jCheckBox1ActionPerformed

private void jCheckBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox1KeyPressed
    if (evt.getKeyCode() == 37) {
        jTextField2.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jTextField3.grabFocus();
    } else if (evt.getKeyCode() == 10) {
        if (jCheckBox1.isSelected() == true) {
            jCheckBox1.setSelected(true);
        } else if (jCheckBox1.isSelected()) {
            jCheckBox1.setSelected(false);
        }
    }
}//GEN-LAST:event_jCheckBox1KeyPressed

private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
    if (evt.getKeyCode() == 38) {
        jTextField7.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jTextField8.grabFocus();
    } else if (evt.getKeyCode() == 39) {
 
        jRadioButton1.grabFocus();
    }
}//GEN-LAST:event_jTextField9KeyPressed

private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
    if (evt.getKeyCode() == 38) {
        jTextField2.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jTextField6.grabFocus();
    }
}//GEN-LAST:event_jTextField3KeyPressed

private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
    if (evt.getKeyCode() == 38) {
        jTextField3.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jTextField5.grabFocus();
    }
}//GEN-LAST:event_jTextField6KeyPressed

private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
    if (evt.getKeyCode() == 38) {
        jTextField6.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jTextField4.grabFocus();
    }
}//GEN-LAST:event_jTextField5KeyPressed

private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
    if (evt.getKeyCode() == 38) {
        jTextField5.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jTextField7.grabFocus();
    }
}//GEN-LAST:event_jTextField4KeyPressed

private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
    if (evt.getKeyCode() == 38) {
        jTextField4.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jTextField9.grabFocus();
    }
}//GEN-LAST:event_jTextField7KeyPressed

private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
    if (evt.getKeyCode() == 38) {
        jTextField9.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jTextField10.grabFocus();
    }
}//GEN-LAST:event_jTextField8KeyPressed

private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
    if (evt.getKeyCode() == 38) {
        jTextField8.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jPasswordField1.grabFocus();
    }
}//GEN-LAST:event_jTextField10KeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GenderbuttonGroup1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
