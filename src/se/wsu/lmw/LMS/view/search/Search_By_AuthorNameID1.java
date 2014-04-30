package se.wsu.lmw.LMS.view.search;

import se.wsu.lmw.Database.DB;
import java.io.File;
import java.sql.ResultSet;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imashi
 */
public class Search_By_AuthorNameID1 extends javax.swing.JPanel {

    int rowSelected;
    String coosenBookID;
    private java.awt.Image im;

    
    public Search_By_AuthorNameID1() {
        initComponents();
        lblBookName.setText(" ");
        jLabel3.setText(" ");
        jLabel6.setText(" ");
        jLabel8.setText(" ");
        jLabel10.setText(" ");
        jLabel12.setText(" ");
        jLabel14.setText(" ");
        jLabel16.setText(" ");
        jTable1.setRowHeight(20);
        jTable2.setRowHeight(20);
    }

    public java.awt.Image getIm() {
        return im;
    }

    public void setIm(java.awt.Image im) {
        this.im = im;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTextField1 = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jComboBox1 = new javax.swing.JComboBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblBookName = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6aaa = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8aaa = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();

        setOpaque(false);

        jLabel1.setText("Author Name /  ID :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jLayeredPane1.add(jTextField1);
        jTextField1.setBounds(0, 10, 170, 20);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
        });
        jLayeredPane2.add(jComboBox1);
        jComboBox1.setBounds(0, 0, 170, 20);

        jLayeredPane1.add(jLayeredPane2);
        jLayeredPane2.setBounds(0, 10, 170, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Search by Author Name");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jRadioButton1);
        jRadioButton1.setBounds(180, 10, 160, 20);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Search by Author ID");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jRadioButton2);
        jRadioButton2.setBounds(350, 10, 130, 20);

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(490, 0, 90, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        jLabel18.setBackground(new java.awt.Color(255, 255, 204));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Search a Book with Author Name or Autor ID");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jLabel18.setOpaque(true);

        jLabel2.setText("Book ID : ");

        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Book Name :");

        lblBookName.setText("jLabel2");
        lblBookName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText("jLabel14");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setText("Book Rack ID :");

        jLabel5.setText("Book Author :");

        jScrollPane1.setViewportView(jList1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Member ID", "Member Name", "Issued Date", "Due Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jLabel14.setText("jLabel14");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Book Registered Librian Name :");

        jLabel10.setText("jLabel10");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Book Category :");

        jLabel12.setText("jLabel12");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6aaa.setText("Total number of books registered :");

        jLabel6.setText("jLabel6");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8aaa.setText("Currently available quentity :");

        jLabel8.setText("jLabel8");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setText("Book Publisher :");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel6aaa)
                                            .addComponent(jLabel8aaa)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4))
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblBookName, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(lblBookName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6aaa)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8aaa)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (jTable1.getRowCount() > 0) {
            rowSelected = jTable1.getSelectedRow();
            coosenBookID = (String) jTable1.getValueAt(rowSelected, 0);
            System.out.println("row = " + rowSelected);
            ;
            try {

                ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from book where BookID = '" + coosenBookID + "'  ");
                while (rs.next()) {

                    lblBookName.setText(rs.getString("BookName"));
                    jLabel3.setText(rs.getString("BookID"));
                    jLabel6.setText(rs.getString("TotalQuentity"));
                    jLabel8.setText(rs.getString("AvailableQuentity"));
                    String librianID = rs.getString("LibrianID");
                    String categoryID = rs.getString("CategoryID");
                    String rackID = rs.getString("RackID");
                    jLabel16.setText(rackID);
                    String publisherID = rs.getString("PublisherID");

                    ResultSet rs2 = DB.myConnection().createStatement().executeQuery("select * from librian where LibrianID = '" + librianID + "' ");
                    while (rs2.next()) {
                        jLabel10.setText(rs2.getString("LibrianName"));
                    }

                    ResultSet rs3 = DB.myConnection().createStatement().executeQuery("select * from category where CategoryID = '" + categoryID + "' ");
                    while (rs3.next()) {
                        jLabel12.setText(rs3.getString("CategoryName"));
                    }

                    ResultSet rs4 = DB.myConnection().createStatement().executeQuery("select * from publisher where PublisherID = '" + publisherID + "' ");
                    while (rs4.next()) {
                        jLabel14.setText(rs4.getString("PublisherName"));
                    }

                    Vector v2 = new Vector();

                    ResultSet rs5 = DB.myConnection().createStatement().executeQuery("select * from author_book where BookID='" + coosenBookID + "' ");
                    while (rs5.next()) {
                        String auID = rs5.getString("AuthorID");

                        ResultSet rs6 = DB.myConnection().createStatement().executeQuery("select * from author where AuthorID = '" + auID + "' ");
                        while (rs6.next()) {
                            v2.add(rs6.getString("AuthorName"));
                        }

                    }
                    jList1.setListData(v2);

                    DefaultTableModel dft2 = (DefaultTableModel) jTable2.getModel();
                    dft2.setRowCount(0);

                    ResultSet rs7 = DB.myConnection().createStatement().executeQuery("select * from borrowedbooks where BookID = '" + coosenBookID + "' ");
                    while (rs7.next()) {
                        Vector v3 = new Vector();
                        String MID = rs7.getString("MemberID");

                        v3.add(jTable1.getValueAt(rowSelected, 1));
                        v3.add(MID);
                        ResultSet rs8 = DB.myConnection().createStatement().executeQuery("select * from members where MemberID = '" + MID + "' ");
                        while (rs8.next()) {
                            String first = rs8.getString("MemberFirstName");
                            String second = rs8.getString("MemberMiddleName");
                            String sur = rs8.getString("MemberSurname");
                            String full = first + second + sur;
                            v3.add(full);
                        }
                        v3.add(rs7.getString("BurrowedDate"));
                        v3.add(rs7.getString("ReturningDate"));
                        dft2.addRow(v3);
                    }

                    String imageLocation = "./src/error.gif";
                    String imagepath = rs.getString("Image");
                    if (imagepath.equals("Select Book Image")) {
                        jLabel23.setIcon(new ImageIcon(imageLocation));
                        jLabel23.setText("   No Image");

                    } else {
                        jLabel23.setText("");
                        File fis = new File(imagepath);
                        setIm(ImageIO.read(fis));
                        jLabel23.setIcon(new ImageIcon(getIm().getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(), java.awt.Image.SCALE_SMOOTH)));

                    }
                }

            } catch (Exception e) {

            }
        }
        System.gc();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(true);
        DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        dft.setRowCount(0);
        DefaultTableModel dft2 = (DefaultTableModel) jTable2.getModel();
        dft2.setRowCount(0);
        jTextField1.setText("");
        lblBookName.setText(" ");
        jLabel3.setText(" ");
        jLabel6.setText(" ");
        jLabel8.setText(" ");
        jLabel10.setText(" ");
        jLabel12.setText(" ");
        jLabel14.setText(" ");
        jLabel16.setText(" ");
        jLabel23.setIcon(null);
        Vector v = new Vector();
        jList1.setListData(v);
        jTextField1.grabFocus();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton2.setSelected(false);
        jRadioButton1.setSelected(true);
        DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        dft.setRowCount(0);
        DefaultTableModel dft2 = (DefaultTableModel) jTable2.getModel();
        dft2.setRowCount(0);
        jTextField1.setText("");
        lblBookName.setText(" ");
        jLabel3.setText(" ");
        jLabel6.setText(" ");
        jLabel8.setText(" ");
        jLabel10.setText(" ");
        jLabel12.setText(" ");
        jLabel14.setText(" ");
        jLabel16.setText(" ");
        jLabel23.setIcon(null);
        Vector v = new Vector();
        jList1.setListData(v);
        jTextField1.grabFocus();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:

        if (jRadioButton1.isSelected()) {
            try {

                ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from author where AuthorName like '" + jTextField1.getText() + "%' order by AuthorName ASC");
                Vector v = new Vector();
                while (rs.next()) {
                    v.add(rs.getString("AuthorName"));
                }
                jComboBox1.setModel(new DefaultComboBoxModel(v));
            } catch (Exception e) {
            }
        } else if (jRadioButton2.isSelected()) {

            try {

                ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from author where AuthorID like '" + jTextField1.getText() + "%' order by AuthorID ASC");
                Vector v = new Vector();
                while (rs.next()) {
                    v.add(rs.getString("AuthorID"));
                }
                jComboBox1.setModel(new DefaultComboBoxModel(v));
            } catch (Exception e) {
            }
        }
        jComboBox1.showPopup();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        boolean check1 = false;
        boolean check2 = false;
        DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        dft.setRowCount(0);
        try {
            String a = jComboBox1.getSelectedItem().toString();
            jTextField1.setText(a);
        } catch (NullPointerException e) {

        }

        String b = "0";
        String c = "0";

        if (jRadioButton1.isSelected()) {
            try {

                ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from author where AuthorName='" + jTextField1.getText() + "'");
                while (rs.next()) {
                    check1 = true;
                    b = (rs.getString("AuthorID"));

                }
                if (check1) {

                    ResultSet rs1 = DB.myConnection().createStatement().executeQuery("select * from author_book where AuthorID='" + b + "' ");
                    while (rs1.next()) {

                        c = rs1.getString("BookID");

                        ResultSet rs2 = DB.myConnection().createStatement().executeQuery("select * from book where BookID='" + c + "' order by BookID ASC");
                        while (rs2.next()) {
                            Vector v = new Vector();

                            v.add(rs2.getString("BookID"));
                            v.add(rs2.getString("BookName"));
                            dft.addRow(v);
                        }

                    }

                }

            } catch (Exception e) {
            }

        } else if (jRadioButton2.isSelected()) {
            try {

                ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from author where AuthorID='" + jTextField1.getText() + "'");
                while (rs.next()) {
                    b = (rs.getString("AuthorID"));
                    check2 = true;

                }

                if (check2) {
                    ResultSet rs1 = DB.myConnection().createStatement().executeQuery("select * from author_book where AuthorID='" + b + "' ");
                    while (rs1.next()) {

                        c = rs1.getString("BookID");
                        System.out.println("c = " + c);

                        ResultSet rs2 = DB.myConnection().createStatement().executeQuery("select * from book where BookID='" + c + "' order by BookID ASC");
                        while (rs2.next()) {
                            Vector v = new Vector();
                            System.out.println("400");
                            v.add(rs2.getString("BookID"));
                            v.add(rs2.getString("BookName"));
                            dft.addRow(v);
                        }
                    }
                }

            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusGained
        jTextField1.setText(jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1FocusGained

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
          DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        dft.setRowCount(0);
        String a = jComboBox1.getSelectedItem().toString();
        jTextField1.setText(a);
        String b = "0";
        String c = "0";

        if (jRadioButton1.isSelected()) {
            try {

                ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from author where AuthorName='" + jTextField1.getText() + "'");
                while (rs.next()) {
                    b = (rs.getString("AuthorID"));

                }

                ResultSet rs1 = DB.myConnection().createStatement().executeQuery("select * from author_book where AuthorID='" + b + "' ");
                while (rs1.next()) {

                    c = rs1.getString("BookID");

                    ResultSet rs2 = DB.myConnection().createStatement().executeQuery("select * from book where BookID='" + c + "' order by BookID ASC");
                    while (rs2.next()) {
                        Vector v = new Vector();

                        v.add(rs2.getString("BookID"));
                        v.add(rs2.getString("BookName"));
                        dft.addRow(v);
                    }

                }

            } catch (Exception e) {
            }

        } else if (jRadioButton2.isSelected()) {
            try {

                ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from author where AuthorID='" + jTextField1.getText() + "'");
                while (rs.next()) {
                    b = (rs.getString("AuthorID"));

                }

                ResultSet rs1 = DB.myConnection().createStatement().executeQuery("select * from author_book where AuthorID='" + b + "' ");
                while (rs1.next()) {

                    c = rs1.getString("BookID");
                    System.out.println("c = " + c);

                    ResultSet rs2 = DB.myConnection().createStatement().executeQuery("select * from book where BookID='" + c + "' order by BookID ASC");
                    while (rs2.next()) {
                        Vector v = new Vector();
                        System.out.println("400");
                        v.add(rs2.getString("BookID"));
                        v.add(rs2.getString("BookName"));
                        dft.addRow(v);
                    }
                }
            } catch (Exception e) {
            }
        }
        }catch(Exception e){}
                
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6aaa;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel8aaa;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblBookName;
    // End of variables declaration//GEN-END:variables
}
