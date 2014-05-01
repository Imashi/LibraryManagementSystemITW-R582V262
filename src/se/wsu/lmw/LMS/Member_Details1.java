package se.wsu.lmw.LMS;

import se.wsu.lmw.Database.DB;
import se.wsu.lmw.Controls.load_data.LoadLibrianData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import se.wsu.lmw.Controls.delete;
import se.wsu.lmw.Controls.load_data.LoadAuthor;

/**
 *
 * @author imashi
 */
public class Member_Details1 extends javax.swing.JPanel {

    String Librian;
    String LID;
    String date1;

    /**
     * Creates new form Register_New_Member
     */
    public Member_Details1() {

        initComponents();
        btnEdit.setEnabled(false);
        btnUpdate.setEnabled(false);
        tacle_load();
    }
    
    public void tacle_load()
    {
        DefaultTableModel dftt1 = (DefaultTableModel) jTable1.getModel();
        dftt1.setRowCount(0);
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
            JOptionPane.showMessageDialog(null, "Error @ MemberDetails class not found exception 51");
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null, "Error @ MemberDetails SQL exception 53");
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
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

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
        jLabel9.setText("Search Members Details");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jLabel9.setNextFocusableComponent(txtMemberID);
        jLabel9.setOpaque(true);

        txtMember_First_Name.setEditable(false);
        txtMember_First_Name.setNextFocusableComponent(txtMember_Middle_Name);

        txtMember_Middle_Name.setEditable(false);
        txtMember_Middle_Name.setNextFocusableComponent(txtMember_sur_Name1);

        txtMember_sur_Name1.setEditable(false);
        txtMember_sur_Name1.setNextFocusableComponent(txtSchool_Admission_Number);

        txtAddress.setEditable(false);
        txtAddress.setNextFocusableComponent(txtMember_Mobile_Number);

        txtMember_Mobile_Number.setEditable(false);
        txtMember_Mobile_Number.setNextFocusableComponent(txtHome_telephone_Number);
        txtMember_Mobile_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMember_Mobile_NumberKeyTyped(evt);
            }
        });

        txtMember_Father_Name.setEditable(false);
        txtMember_Father_Name.setNextFocusableComponent(txtMother_Name);

        txtMemberID.setNextFocusableComponent(txtSchool_Admission_Number);
        txtMemberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberIDActionPerformed(evt);
            }
        });

        txtHome_telephone_Number.setEditable(false);
        txtHome_telephone_Number.setNextFocusableComponent(txtMember_Father_Name);
        txtHome_telephone_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHome_telephone_NumberKeyTyped(evt);
            }
        });

        jLabel10.setText("School Admission Number :");

        txtSchool_Admission_Number.setEditable(false);
        txtSchool_Admission_Number.setNextFocusableComponent(txtAddress);

        jLabel11.setText("Mother Name :");

        txtMother_Name.setEditable(false);
        txtMother_Name.setNextFocusableComponent(btnUpdate);

        jLabel12.setText("Registered Librarian : ");

        jLabel14.setText("Registered Date : ");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 102, 51));
        jLabel13.setText("Insert Member ID and click Search button or press Enter to View member details");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

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

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(lblRegisterLibrianName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                                        .addComponent(txtMember_Father_Name, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMember_First_Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtMother_Name))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtHome_telephone_Number))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtSchool_Admission_Number))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtMemberID, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))))))
                                .addComponent(txtAddress)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtMember_First_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMember_Middle_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtSchool_Admission_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMember_sur_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMember_Mobile_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtHome_telephone_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMember_Father_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtMother_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(lblRegisterLibrianName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnEdit)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
// TODO add your handling code here:
    try {

        boolean check1 = txtMember_First_Name.getText().equals("") || txtMember_sur_Name1.getText().equals("") || txtMember_Mobile_Number.getText().equals("") || txtHome_telephone_Number.getText().equals("") || txtAddress.getText().equals("");
        System.out.println("X= " + check1);
        if (!check1) {
            if (txtHome_telephone_Number.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "Home Telephone number must have 10 digits");
            } else if (txtMember_Mobile_Number.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "Mobile Telephone number must have 10 digits");
            } else {
                DB.myConnection().createStatement().executeUpdate("update members set MemberSurname='" + txtMember_sur_Name1.getText() + "',MemberMiddleName='" + txtMember_Middle_Name.getText() + "',MemberFirstName='" + txtMember_First_Name.getText() + "',MemberAddress='" + txtAddress.getText() + "',MemberMobileNumber='" + txtMember_Mobile_Number.getText() + "',MemberHomeTelephone='" + txtHome_telephone_Number.getText() + "',MemberMotherName='" + txtMother_Name.getText() + "',MemberFatherName='" + txtMember_Father_Name.getText() + "',RegisteredDate='" + lblDate.getText() + "',SchoolAdmissionNumber='" + txtSchool_Admission_Number.getText() + "',LibrianID='" + LID + "' where MemberID='" + txtMemberID.getText() + "'");
                txtAddress.setText("");
                txtHome_telephone_Number.setText("");
                txtMemberID.setText("");
                txtMember_Father_Name.setText("");
                txtMember_First_Name.setText("");
                txtMember_Middle_Name.setText("");
                txtMember_Mobile_Number.setText("");
                txtMember_sur_Name1.setText("");
                txtMother_Name.setText("");
                txtSchool_Admission_Number.setText("");
                lblDate.setText("");
                lblRegisterLibrianName.setText("");
                btnEdit.setEnabled(false);
                btnEdit.setText("Edit");
                btnUpdate.setEnabled(false);
                jButton1.setEnabled(true);
                txtAddress.setEditable(false);
                txtHome_telephone_Number.setEditable(false);
                txtMember_Father_Name.setEditable(false);
                txtMember_First_Name.setEditable(false);
                txtMember_Middle_Name.setEditable(false);
                txtMember_Mobile_Number.setEditable(false);
                txtMember_sur_Name1.setEditable(false);
                txtMother_Name.setEditable(false);
                txtSchool_Admission_Number.setEditable(false);
                txtMemberID.setEditable(true);
                txtMemberID.grabFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Members must have First Name,Surname, mobile and home telephone numbers and Member Address");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error @ member Register  exception");
    }

}//GEN-LAST:event_btnUpdateActionPerformed

private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
    btnEdit.setEnabled(false);
    btnUpdate.setEnabled(false);
    jButton1.setEnabled(true);
    btnEdit.setText("Edit");
    txtAddress.setText("");
    txtHome_telephone_Number.setText("");
    txtMemberID.setText("");
    txtMemberID.setEditable(true);
    txtMember_Father_Name.setText("");
    txtMember_First_Name.setText("");
    txtMember_Middle_Name.setText("");
    txtMember_Mobile_Number.setText("");
    txtMember_sur_Name1.setText("");
    txtMother_Name.setText("");
    txtSchool_Admission_Number.setText("");
    lblDate.setText("");
    lblRegisterLibrianName.setText("");
    txtAddress.setEditable(false);
    txtHome_telephone_Number.setEditable(false);
    txtMember_Father_Name.setEditable(false);
    txtMember_First_Name.setEditable(false);
    txtMember_Middle_Name.setEditable(false);
    txtMember_Mobile_Number.setEditable(false);
    txtMember_sur_Name1.setEditable(false);
    txtMother_Name.setEditable(false);
    txtSchool_Admission_Number.setEditable(false);
    txtMemberID.grabFocus();
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

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (txtMemberID.getText() != "") {

        btnEdit.setEnabled(true);
        try {

            ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from members where MemberID='" + Integer.parseInt(txtMemberID.getText()) + "'");
            while (rs.next()) {
                txtAddress.setText(rs.getString("MemberAddress"));
                txtHome_telephone_Number.setText(rs.getString("MemberHomeTelephone"));
                txtMember_Father_Name.setText(rs.getString("MemberFatherName"));
                txtMember_First_Name.setText(rs.getString("MemberFirstName"));
                txtMember_Middle_Name.setText(rs.getString("MemberMiddleName"));
                txtMember_Mobile_Number.setText(rs.getString("MemberMobileNumber"));
                txtMember_sur_Name1.setText(rs.getString("MemberSurname"));
                txtMother_Name.setText(rs.getString("MemberMotherName"));
                txtSchool_Admission_Number.setText(rs.getString("SchoolAdmissionNumber"));
                lblRegisterLibrianName.setText(LoadLibrianData.LoadLibrianName(rs.getString("LibrianID")));
                lblDate.setText(rs.getDate("RegisteredDate").toString());
            }
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(this, "Sql Exception @ MemberDetails 433");
        } catch (NumberFormatException e2) {
            JOptionPane.showMessageDialog(this, "Please enter valid Member ID");
            txtMemberID.grabFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Exception @ MemberDetails 440 please contact \ndeveloper team ");
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please Enter valid Member ID");
        txtMemberID.grabFocus();
    }


}//GEN-LAST:event_jButton1ActionPerformed

private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    if (btnEdit.getText() == "Edit") {
        btnUpdate.setEnabled(true);

        btnEdit.setText("Cancel Edit");

        jButton1.setEnabled(false);
        txtAddress.setEditable(true);
        txtHome_telephone_Number.setEditable(true);

        txtMemberID.setEditable(false);

        txtMember_Mobile_Number.setEditable(true);

    } else {
        jButton1.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnEdit.setText("Edit");
        txtMemberID.setEditable(true);
        txtAddress.setEditable(false);
        txtHome_telephone_Number.setEditable(false);
        txtMemberID.setEditable(true);
        txtMember_Mobile_Number.setEditable(false);
    }


}//GEN-LAST:event_btnEditActionPerformed

private void txtMemberIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberIDActionPerformed
    if (txtMemberID.getText() != "") {

        btnEdit.setEnabled(true);
        try {

            ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from members where MemberID='" + Integer.parseInt(txtMemberID.getText()) + "'");
            while (rs.next()) {
                txtAddress.setText(rs.getString("MemberAddress"));
                txtHome_telephone_Number.setText(rs.getString("MemberHomeTelephone"));
                txtMember_Father_Name.setText(rs.getString("MemberFatherName"));
                txtMember_First_Name.setText(rs.getString("MemberFirstName"));
                txtMember_Middle_Name.setText(rs.getString("MemberMiddleName"));
                txtMember_Mobile_Number.setText(rs.getString("MemberMobileNumber"));
                txtMember_sur_Name1.setText(rs.getString("MemberSurname"));
                txtMother_Name.setText(rs.getString("MemberMotherName"));
                txtSchool_Admission_Number.setText(rs.getString("SchoolAdmissionNumber"));
                lblRegisterLibrianName.setText(LoadLibrianData.LoadLibrianName(rs.getString("LibrianID")));
                lblDate.setText(rs.getDate("RegisteredDate").toString());
            }
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(this, "Sql Exception @ MemberDetails 433 please inform this \n contact developer team 0775806721");
        } catch (NumberFormatException e2) {
            JOptionPane.showMessageDialog(this, "Please Enter valid member ID");
        } catch (Exception e) {

            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please Enter Member ID");
    }

}//GEN-LAST:event_txtMemberIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String a= jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        System.out.println(a);
        try {
            new delete().delete_book(a);
            
        } catch (SQLException ex) {
            Logger.getLogger(Member_Details1.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       tacle_load();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
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
