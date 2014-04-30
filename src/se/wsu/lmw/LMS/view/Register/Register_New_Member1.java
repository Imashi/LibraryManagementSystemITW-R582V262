package se.wsu.lmw.LMS.view.Register;

import se.wsu.lmw.Database.DB;
import se.wsu.lmw.Controls.Date.Date1;
import se.wsu.lmw.Controls.GenerateMemberID;
import se.wsu.lmw.Controls.VerifyUser;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imashi
 */
public class Register_New_Member1 extends javax.swing.JPanel {

    String librarian;
    String librarianId;
    String date1 = Date1.myDate();

    /**
     * Creates new form Register_New_Member
     */
    public Register_New_Member1() {
        initComponents();

    }

    public Register_New_Member1(String librian1, String lid) {

        initComponents();
        librarianId = lid;
        librarian = librian1;

        lblRegisterLibrianName.setText(librian1);
        lblDate.setText(date1);
        txtMemberID.setText(GenerateMemberID.getMemberID());
        txtMemberID.setEditable(false);
        txtMember_First_Name.grabFocus();
        DefaultTableModel dftt1 = (DefaultTableModel) jTable1.getModel();
        try {

            ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from members ");

            while (rs.next()) {
                Vector v2 = new Vector();
                v2.add(rs.getInt(1));
                v2.add(rs.getString("MemberFirstName"));
                v2.add(rs.getString("MemberMiddleName"));
                v2.add(rs.getString("MemberSurname"));
                dftt1.addRow(v2);
            }

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error @ MemberRegister class not found exception 65");
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null, "Error @ MemberRegister SQL exception 67");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMember_First_Name = new javax.swing.JTextField();
        txtMember_Middle_Name = new javax.swing.JTextField();
        txtMember_sur_Name1 = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtMember_Mobile_Number = new javax.swing.JTextField();
        txtMember_Father_Name = new javax.swing.JTextField();
        txtMemberID = new javax.swing.JTextField();
        txtHome_telephone_Number = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSchool_Admission_Number = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMother_Name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        lblRegisterLibrianName = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setNextFocusableComponent(txtMemberID);
        setOpaque(false);

        jLabel1.setText("Member ID :");

        jLabel2.setText("Member First  Name :");

        jLabel3.setText("Address :");

        jLabel4.setText("Member Middle Name :");

        jLabel5.setText("Member SurName :");

        jLabel6.setText("Mobile Number :");

        jLabel7.setText("Home Telephone Number :");

        jLabel8.setText("Father Name :");

        jLabel9.setBackground(new java.awt.Color(255, 255, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Register New Members ");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jLabel9.setNextFocusableComponent(txtMemberID);
        jLabel9.setOpaque(true);

        txtMember_First_Name.setNextFocusableComponent(txtMember_Middle_Name);
        txtMember_First_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMember_First_NameKeyPressed(evt);
            }
        });

        txtMember_Middle_Name.setNextFocusableComponent(txtMember_sur_Name1);
        txtMember_Middle_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMember_Middle_NameKeyPressed(evt);
            }
        });

        txtMember_sur_Name1.setNextFocusableComponent(txtSchool_Admission_Number);
        txtMember_sur_Name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMember_sur_Name1KeyPressed(evt);
            }
        });

        txtAddress.setNextFocusableComponent(txtMember_Mobile_Number);
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressKeyPressed(evt);
            }
        });

        txtMember_Mobile_Number.setNextFocusableComponent(txtHome_telephone_Number);
        txtMember_Mobile_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMember_Mobile_NumberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMember_Mobile_NumberKeyTyped(evt);
            }
        });

        txtMember_Father_Name.setNextFocusableComponent(txtMother_Name);
        txtMember_Father_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMember_Father_NameKeyPressed(evt);
            }
        });

        txtMemberID.setNextFocusableComponent(txtSchool_Admission_Number);

        txtHome_telephone_Number.setNextFocusableComponent(txtMember_Father_Name);
        txtHome_telephone_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHome_telephone_NumberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHome_telephone_NumberKeyTyped(evt);
            }
        });

        jLabel10.setText("School Admission Number :");

        txtSchool_Admission_Number.setNextFocusableComponent(txtAddress);
        txtSchool_Admission_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSchool_Admission_NumberKeyPressed(evt);
            }
        });

        jLabel11.setText("Mother Name :");

        txtMother_Name.setNextFocusableComponent(btnSave);
        txtMother_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMother_NameKeyPressed(evt);
            }
        });

        jLabel12.setText("Registered by : ");

        jLabel14.setText("Date : ");

        btnSave.setText("Save ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveKeyPressed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.setNextFocusableComponent(txtMember_First_Name);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        btnClear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnClearKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Guest Login Details"));

        jCheckBox1.setText("Make a guest login");
        jCheckBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox1KeyPressed(evt);
            }
        });

        jLabel13.setText("Username :");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel15.setText("Password :");

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox1))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "First Name", "Middle Name", "Surname"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtMember_sur_Name1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMember_Middle_Name, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMember_Mobile_Number)
                                            .addComponent(txtMember_First_Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                            .addComponent(txtMember_Father_Name, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtSchool_Admission_Number, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtMemberID, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMother_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtHome_telephone_Number, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))))
                                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRegisterLibrianName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtMember_First_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMember_Middle_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtSchool_Admission_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMember_sur_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtMember_Mobile_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHome_telephone_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(txtMother_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMember_Father_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(lblRegisterLibrianName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
// TODO add your handling code here:
    try {

        boolean check = txtMember_First_Name.getText().equals("") || txtMember_sur_Name1.getText().equals("") || txtMember_Mobile_Number.getText().equals("") || txtHome_telephone_Number.getText().equals("") || txtAddress.getText().equals("");
        System.out.println("X= " + check);
        if (!check) {
            if (txtHome_telephone_Number.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "Home Telephone number must have 10 digits");
            } else if (txtMember_Mobile_Number.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "Mobile Telephone number must have 10 digits");
            } else {

                String MemFirst = txtMember_First_Name.getText();
                if (jCheckBox1.isSelected()) {
                    String pass = "";
                    try {
                        pass = new String(jPasswordField1.getPassword());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Please Enter member password");
                    }
                    if (jTextField1.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Can't save data with \n Empty User Name", "info..", JOptionPane.ERROR_MESSAGE);
                    } else if (pass.equals("")) {
                        JOptionPane.showMessageDialog(this, "Can't save data with \n Empty Password", "info..", JOptionPane.ERROR_MESSAGE);
                    } else if (VerifyUser.verifyUser(jTextField1.getText(), pass) == true) {
                        JOptionPane.showMessageDialog(this, "Please try with different Username and password", "info..", JOptionPane.ERROR_MESSAGE);
                    } else if (VerifyUser.verifyUser(jTextField1.getText(), pass) == false) {
                        DB.myConnection().createStatement().executeUpdate("insert into login values ('" + jTextField1.getText() + "','" + pass + "')");
                        MemFirst = MemFirst + "_Guest";
                        DB.myConnection().createStatement().executeUpdate("INSERT INTO members values('" + txtMemberID.getText() + "','" + txtMember_sur_Name1.getText() + "','" + txtMember_Middle_Name.getText() + "','" + MemFirst + "','" + txtAddress.getText() + "','" + txtMember_Mobile_Number.getText() + "','" + txtHome_telephone_Number.getText() + "','" + txtMother_Name.getText() + "','" + txtMember_Father_Name.getText() + "','" + lblDate.getText() + "','" + txtSchool_Admission_Number.getText() + "','" + jTextField1.getText() + "','" + librarianId + "')");
                         
                        Vector memberRow = new Vector();
                        memberRow.add(txtMemberID.getText());
                        memberRow.add(txtMember_First_Name.getText());
                        memberRow.add(txtMember_Middle_Name.getText());
                        memberRow.add(txtMember_sur_Name1.getText());
                        DefaultTableModel dftt1 = (DefaultTableModel) jTable1.getModel();
                        dftt1.addRow(memberRow);
                         
                        txtAddress.setText("");
                        txtHome_telephone_Number.setText("");
                        txtMemberID.setText(GenerateMemberID.getMemberID());
                        txtMember_Father_Name.setText("");
                        txtMember_First_Name.setText("");
                        txtMember_Middle_Name.setText("");
                        txtMember_Mobile_Number.setText("");
                        txtMember_sur_Name1.setText("");
                        txtMother_Name.setText("");
                        txtSchool_Admission_Number.setText("");
                        jTextField1.setText("");
                        jPasswordField1.setText("");
                        txtMember_First_Name.grabFocus();
                    }
                } else {
                    String d = "not a guest";
                    DB.myConnection().createStatement().executeUpdate("INSERT INTO members values('" + txtMemberID.getText() + "','" + txtMember_sur_Name1.getText() + "','" + txtMember_Middle_Name.getText() + "','" + MemFirst + "','" + txtAddress.getText() + "','" + txtMember_Mobile_Number.getText() + "','" + txtHome_telephone_Number.getText() + "','" + txtMother_Name.getText() + "','" + txtMember_Father_Name.getText() + "','" + lblDate.getText() + "','" + txtSchool_Admission_Number.getText() + "','" + d + "','" + librarianId + "')");
                  
                    Vector memberRow = new Vector();
                    memberRow.add(txtMemberID.getText());
                    memberRow.add(txtMember_First_Name.getText());
                    memberRow.add(txtMember_Middle_Name.getText());
                    memberRow.add(txtMember_sur_Name1.getText());
                    DefaultTableModel dftt1 = (DefaultTableModel) jTable1.getModel();
                    dftt1.addRow(memberRow);
                  
                    txtAddress.setText("");
                    txtHome_telephone_Number.setText("");
                    txtMemberID.setText(GenerateMemberID.getMemberID());
                    txtMember_Father_Name.setText("");
                    txtMember_First_Name.setText("");
                    txtMember_Middle_Name.setText("");
                    txtMember_Mobile_Number.setText("");
                    txtMember_sur_Name1.setText("");
                    txtMother_Name.setText("");
                    txtSchool_Admission_Number.setText("");
                    jTextField1.setText("");
                    jPasswordField1.setText("");
                    txtMember_First_Name.grabFocus();
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Members must have First Name,Surname, mobile and home telephone numbers and Member Address");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error @ member Register  exception");
    }

}//GEN-LAST:event_btnSaveActionPerformed

private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
    txtAddress.setText("");
    txtHome_telephone_Number.setText("");
    txtMemberID.setText(GenerateMemberID.getMemberID());
    txtMember_Father_Name.setText("");
    txtMember_First_Name.setText("");
    txtMember_Middle_Name.setText("");
    txtMember_Mobile_Number.setText("");
    txtMember_sur_Name1.setText("");
    txtMother_Name.setText("");
    txtSchool_Admission_Number.setText("");
    txtMember_First_Name.grabFocus();
}//GEN-LAST:event_btnClearActionPerformed

private void txtMember_Mobile_NumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMember_Mobile_NumberKeyTyped
    if (!Character.isDigit(evt.getKeyChar()) || txtMember_Mobile_Number.getText().length() >= 10) {
        evt.consume();
    }
}//GEN-LAST:event_txtMember_Mobile_NumberKeyTyped

private void txtHome_telephone_NumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHome_telephone_NumberKeyTyped
    if (!Character.isDigit(evt.getKeyChar()) || txtHome_telephone_Number.getText().length() >= 10) {
        evt.consume();
    }
}//GEN-LAST:event_txtHome_telephone_NumberKeyTyped

private void txtMember_First_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMember_First_NameKeyPressed
    if (evt.getKeyCode() == 40) {
        txtMember_Middle_Name.grabFocus();
    }
}//GEN-LAST:event_txtMember_First_NameKeyPressed

private void txtMember_Middle_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMember_Middle_NameKeyPressed
    if (evt.getKeyCode() == 40) {
        txtMember_sur_Name1.grabFocus();
    } else if (evt.getKeyCode() == 39) {
        txtSchool_Admission_Number.grabFocus();
    }
}//GEN-LAST:event_txtMember_Middle_NameKeyPressed

private void txtMember_sur_Name1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMember_sur_Name1KeyPressed
    if (evt.getKeyCode() == 40) {
        txtAddress.grabFocus();
    } else if (evt.getKeyCode() == 38) {
        txtMember_Middle_Name.grabFocus();
    }
}//GEN-LAST:event_txtMember_sur_Name1KeyPressed

private void txtAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyPressed
    if (evt.getKeyCode() == 40) {
        txtMember_Mobile_Number.grabFocus();
    } else if (evt.getKeyCode() == 38) {
        txtMember_sur_Name1.grabFocus();
    }
}//GEN-LAST:event_txtAddressKeyPressed

private void txtMember_Mobile_NumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMember_Mobile_NumberKeyPressed
    if (evt.getKeyCode() == 40) {
        txtMember_Father_Name.grabFocus();
    } else if (evt.getKeyCode() == 39) {
        txtHome_telephone_Number.grabFocus();
    } else if (evt.getKeyCode() == 38) {
        txtAddress.grabFocus();
    }
}//GEN-LAST:event_txtMember_Mobile_NumberKeyPressed

private void txtMember_Father_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMember_Father_NameKeyPressed
    if (evt.getKeyCode() == 40) {
        jCheckBox1.grabFocus();
    } else if (evt.getKeyCode() == 39) {
        txtMother_Name.grabFocus();
    } else if (evt.getKeyCode() == 38) {
        txtMember_Mobile_Number.grabFocus();
    }
}//GEN-LAST:event_txtMember_Father_NameKeyPressed

private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
    if (evt.getKeyCode() == 40) {
        btnSave.grabFocus();
    } else if (evt.getKeyCode() == 39) {
        jPasswordField1.grabFocus();
    } else if (evt.getKeyCode() == 38) {
        jCheckBox1.grabFocus();
    }
}//GEN-LAST:event_jTextField1KeyPressed

private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
    if (evt.getKeyCode() == 38) {
        txtMother_Name.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        btnSave.grabFocus();
    } else if (evt.getKeyCode() == 37) {
        jTextField1.grabFocus();
    }
}//GEN-LAST:event_jPasswordField1KeyPressed

private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed

    if (evt.getKeyCode() == 39) {
        btnClear.grabFocus();
    } else if (evt.getKeyCode() == 38) {
        jPasswordField1.grabFocus();
    }

    if (evt.getKeyChar() == evt.VK_ENTER) {
        btnSave.doClick();
    }
}//GEN-LAST:event_btnSaveKeyPressed

private void btnClearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnClearKeyPressed
    if (evt.getKeyCode() == 37) {
        btnSave.grabFocus();
    } else if (evt.getKeyCode() == 38) {
        jPasswordField1.grabFocus();
    }
}//GEN-LAST:event_btnClearKeyPressed

private void txtSchool_Admission_NumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSchool_Admission_NumberKeyPressed
    if (evt.getKeyCode() == 40) {
        txtAddress.grabFocus();
    } else if (evt.getKeyCode() == 37) {
        txtMember_Middle_Name.grabFocus();
    }
}//GEN-LAST:event_txtSchool_Admission_NumberKeyPressed

private void txtHome_telephone_NumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHome_telephone_NumberKeyPressed
    if (evt.getKeyCode() == 38) {
        txtAddress.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        txtMother_Name.grabFocus();
    } else if (evt.getKeyCode() == 37) {
        txtMember_Mobile_Number.grabFocus();
    }
}//GEN-LAST:event_txtHome_telephone_NumberKeyPressed

private void txtMother_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMother_NameKeyPressed
    if (evt.getKeyCode() == 38) {
        txtHome_telephone_Number.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jCheckBox1.grabFocus();
    } else if (evt.getKeyCode() == 37) {
        txtMember_Father_Name.grabFocus();
    }
}//GEN-LAST:event_txtMother_NameKeyPressed

private void jCheckBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox1KeyPressed
    if (evt.getKeyCode() == 38) {
        txtMember_Father_Name.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jTextField1.grabFocus();
    }

}//GEN-LAST:event_jCheckBox1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblRegisterLibrianName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtHome_telephone_Number;
    private javax.swing.JTextField txtMemberID;
    private javax.swing.JTextField txtMember_Father_Name;
    private javax.swing.JTextField txtMember_First_Name;
    private javax.swing.JTextField txtMember_Middle_Name;
    private javax.swing.JTextField txtMember_Mobile_Number;
    private javax.swing.JTextField txtMember_sur_Name1;
    private javax.swing.JTextField txtMother_Name;
    private javax.swing.JTextField txtSchool_Admission_Number;
    // End of variables declaration//GEN-END:variables
}
