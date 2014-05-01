 
package se.wsu.lmw.LMS;

import se.wsu.lmw.Database.DB;
import se.wsu.lmw.Controls.Date.Date1;
import se.wsu.lmw.Controls.load_data.Load_Kappam;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imashi
 */
public class BookReturn1 extends javax.swing.JPanel {

    int row = (-1);
    String LibrianName;
    String LID;

    /**
     * Creates new form BookReturn
     */
    public BookReturn1(String name, String ID) {
        initComponents();
        LibrianName = name;
        LID = ID;
        jLabel2.setText(LID);
        jLabel4.setText(LibrianName);
        jLabel6.setText(Date1.myDate());

        loadBorrowedBooksTable();
        CountCost();
        jTable1.setRowHeight(25);
    }

    public BookReturn1() {
        DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowHeight(25);
        System.out.println("rows = " + dft.getRowCount());
        if (dft.getRowCount() == 0) {
            jButton1.setEnabled(false);
        } else {
            jButton1.setEnabled(true);
        }

        initComponents();

    }
    private int cost = 0;

    private int CountCost() {
        cost = 0;
        if (jTable1.getRowCount() > (-1)) {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                if (Date1.getDatePeriod(jLabel6.getText(), jTable1.getValueAt(i, 6).toString()) > 0) {

                    jTable1.setValueAt(Integer.toString(Integer.parseInt(Integer.toString(Date1.getDatePeriod(jLabel6.getText(), jTable1.getValueAt(i, 6).toString()))) * (Integer.parseInt(Load_Kappam.Load_Kappam()))), i, 8);
                } else {
                    jTable1.setValueAt("0", i, 8);

                }
            }
        }
        return cost;
    }

    //load borrowed books 
    private void loadBorrowedBooksTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jTable1.setRowHeight(25);
        try {

            ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from borrowedbooks order by BorrowedID ASC");
            while (rs.next()) {
                Vector vecter_items = new Vector();
                vecter_items.add(rs.getString("BorrowedID"));

                String memID = rs.getString("MemberID");
                int mm = Integer.parseInt(memID);
                vecter_items.add(memID);

                ResultSet rs1 = DB.myConnection().createStatement().executeQuery("select * from members where MemberID='" + mm + "'");

                while (rs1.next()) {

                    String Fname = (rs1.getString("MemberFirstName"));
                    String Mname = (rs1.getString("MemberMiddleName"));
                    String Sname = rs1.getString("MemberSurname");
                    String full = Fname + " " + Mname + " " + Sname;
                    vecter_items.add(full);

                }

                String bookID = rs.getString("BookID");

                int bID = Integer.parseInt(bookID);
                vecter_items.add(bookID);
                ResultSet rs2 = DB.myConnection().createStatement().executeQuery("select * from book where BookID='" + bID + "'");
                while (rs2.next()) {
                    vecter_items.add(rs2.getString("BookName"));
                }

                vecter_items.add(rs.getString("BurrowedDate"));
                vecter_items.add(rs.getString("ReturningDate"));
                vecter_items.add(rs.getString("LibrianID"));
                model.addRow(vecter_items);
            }
        } catch (Exception e) {
        }
    }

    //Adding borrowed books in to table
    private void loadBorrowedBooksTable(int bookID) {
        DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        dft.setRowCount(0);
        jTable1.setRowHeight(25);
        try {

            ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from borrowedbooks where BookID like '" + bookID + "%' order by BorrowedID ASC");
            while (rs.next()) {
                Vector vecter_books = new Vector();
                vecter_books.add(rs.getString("BorrowedID"));

                String memID = rs.getString("MemberID");
                int mm = Integer.parseInt(memID);
                vecter_books.add(memID);
                ResultSet rs1 = DB.myConnection().createStatement().executeQuery("select * from members where MemberID='" + mm + "'");

                while (rs1.next()) {

                    String Fname = (rs1.getString("MemberFirstName"));
                    String Mname = (rs1.getString("MemberMiddleName"));
                    String Sname = rs1.getString("MemberSurname");
                    String full = Fname + " " + Mname + " " + Sname;
                    vecter_books.add(full);

                }

                String Book_id = rs.getString("BookID");

                int bID = Integer.parseInt(Book_id);
                vecter_books.add(Book_id);
                ResultSet rs2 = DB.myConnection().createStatement().executeQuery("select * from book where BookID='" + bID + "'");
                while (rs2.next()) {
                    vecter_books.add(rs2.getString("BookName"));
                }

                vecter_books.add(rs.getString("BurrowedDate"));
                vecter_books.add(rs.getString("ReturningDate"));
                vecter_books.add(rs.getString("LibrianID"));
                dft.addRow(vecter_books);
            }
        } catch (Exception e) {
        }
    }

    //Adding borrowed books in to table.This is a overloaded method
    private void loadBorrowedBooksTable(int memberID, int x) {
        DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        dft.setRowCount(0);
        jTable1.setRowHeight(25);
        try {
            ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from borrowedbooks where MemberID like '" + memberID + "%' order by MemberID ASC");
            while (rs.next()) {
                Vector vecter_book = new Vector();
                vecter_book.add(rs.getString("BorrowedID"));

                String memID = rs.getString("MemberID");
                int mm = Integer.parseInt(memID);
                vecter_book.add(memID);

                ResultSet rs1 = DB.myConnection().createStatement().executeQuery("select * from members where MemberID='" + mm + "'");

                while (rs1.next()) {

                    String Fname = (rs1.getString("MemberFirstName"));
                    String Mname = (rs1.getString("MemberMiddleName"));
                    String Sname = rs1.getString("MemberSurname");
                    String full = Fname + " " + Mname + " " + Sname;
                    vecter_book.add(full);

                }

                String BB = rs.getString("BookID");

                int bID = Integer.parseInt(BB);
                vecter_book.add(BB);
                ResultSet rs2 = DB.myConnection().createStatement().executeQuery("select * from book where BookID='" + bID + "'");
                while (rs2.next()) {
                    vecter_book.add(rs2.getString("BookName"));
                }

                vecter_book.add(rs.getString("BurrowedDate"));
                vecter_book.add(rs.getString("ReturningDate"));
                vecter_book.add(rs.getString("LibrianID"));

                dft.addRow(vecter_book);
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        setOpaque(false);

        jLabel18.setBackground(new java.awt.Color(255, 255, 204));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Return a Book");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jLabel18.setOpaque(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issue ID", "Member ID", "Member Name", "Book ID", "Book Name", "Issued Date", "Due Date", "Issued Librarian", "Due Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Return Selected Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Librarian ID :");

        jLabel2.setText("jLabel2");

        jLabel3.setText("Librarian Name :");

        jLabel4.setText("jLabel4");

        jLabel5.setText("Date :");

        jLabel6.setText("jLabel6");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Book ID");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Member ID");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Filter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Select All");
        jRadioButton3.setOpaque(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        row = jTable1.getSelectedRow();
        System.out.println("row = " + row);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (row == (-1)) {
            JOptionPane.showMessageDialog(null, "please select a Book \n which you want to return");
        }
        if (row >= 0) {
            String val = jTable1.getValueAt(row, 0).toString();
            int bid = Integer.parseInt(jTable1.getValueAt(row, 3).toString());
            System.out.println(val);
            try {

                DB.myConnection().createStatement().executeUpdate("insert into libraryhistory values ('" + jTable1.getValueAt(row, 1).toString() + "','" + jTable1.getValueAt(row, 3).toString() + "','" + jTable1.getValueAt(row, 7).toString() + "','" + jTable1.getValueAt(row, 5).toString() + "','" + jTable1.getValueAt(row, 6).toString() + "','" + jLabel6.getText() + "','" + jLabel2.getText() + "','" + jTable1.getValueAt(row, 8).toString() + "','" + Integer.parseInt(jTable1.getValueAt(row, 0).toString()) + "')");
                DB.myConnection().createStatement().executeUpdate("delete from borrowedbooks where BorrowedID='" + Integer.parseInt(val) + "'");
                loadBorrowedBooksTable();
                CountCost();

                DB.myConnection().createStatement().executeUpdate("update book set AvailableQuentity=AvailableQuentity+1 where BookID='" + bid + "'");
            } catch (Exception e) {
            }
            row = (-1);
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    public void selectRadio() {
        DefaultTableModel dft1 = (DefaultTableModel) jTable1.getModel();
        if ((jTextField1.getText().equals(""))) {
            jTextField1.grabFocus();
        } else if (jRadioButton3.isSelected()) {
            loadBorrowedBooksTable();
            CountCost();
        } else if (jRadioButton1.isSelected() == true) {
            dft1.setRowCount(0);
            loadBorrowedBooksTable(Integer.parseInt(jTextField1.getText()));
            CountCost();
        } else if (jRadioButton2.isSelected() == true) {
            dft1.setRowCount(0);
            loadBorrowedBooksTable(Integer.parseInt(jTextField1.getText()), 1);
            CountCost();
        }
    }
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    selectRadio();
}//GEN-LAST:event_jButton2ActionPerformed

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    selectRadio();
}//GEN-LAST:event_jTextField1ActionPerformed

private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    selectRadio();
}//GEN-LAST:event_jRadioButton2ActionPerformed

private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    selectRadio();
}//GEN-LAST:event_jRadioButton1ActionPerformed

private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
    selectRadio();
}//GEN-LAST:event_jRadioButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
