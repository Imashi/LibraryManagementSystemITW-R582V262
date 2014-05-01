package se.wsu.lmw.LMS;

import se.wsu.lmw.LMS.view.home.Hp1;
import se.wsu.lmw.LMS.view.home.Home;
import se.wsu.lmw.Database.DB;
import se.wsu.lmw.Controls.load_data.LoadAuthor;
import se.wsu.lmw.Controls.load_data.LoadCategory;
import se.wsu.lmw.Controls.load_data.LoadPublisher;
import se.wsu.lmw.Controls.load_data.LoadRackID;
import se.wsu.lmw.Controls.PanelLoad1;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author imashi
 */
public class Settings1 extends javax.swing.JPanel {

    String librian_name;
    String librarianId;
    String no;
    String newKappamId;
    Vector v1 = new Vector();
    Vector v2 = new Vector();

     
    public Settings1() {
        initComponents();
    }
    // method frohandling the settings 
    public Settings1(String librian, String lid) {
        initComponents();
        librian_name = librian;
        librarianId = lid;
        jLabel2.setForeground(Color.BLACK);
        jLabel4.setForeground(Color.BLACK);
        jLabel5.setForeground(Color.BLACK);

        jLabel20.setText(LoadCategory.getMaxCategoryID());
        jLabel17.setText(LoadRackID.getMaxRackID());
        jLabel14.setText(LoadAuthor.getMaxAithorID());
        try {

            jLabel25.setText(LoadPublisher.getMaxPublisherID());
        } catch (Exception e) {
            jLabel25.setText("1");
        }

        try {

            ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from main");
            while (rs.next()) {
                no = rs.getString("No");
            }

            Integer c = new Integer(1);
            Integer d = new Integer(10);
            Integer e = new Integer(1);
            int f = Integer.parseInt(no);
            Integer g = new Integer(f);
            SpinnerNumberModel spm = new SpinnerNumberModel(g, c, d, e);
            jSpinner1.setValue(spm.getValue());

        } catch (Exception e) {
        }
        try {

            ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from kappam");
            while (rs.next()) {
                newKappamId = rs.getString("kappamValue");
            }
            Integer c = new Integer(1);
            Integer d = new Integer(1000);
            Integer e = new Integer(1);
            int f = Integer.parseInt(newKappamId);
            Integer g = new Integer(f);
            SpinnerNumberModel spm2 = new SpinnerNumberModel(g, c, d, e);
            jSpinner2.setValue(spm2.getValue());

        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        comboPublisher = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jTaskPaneGroup1 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Book Borrowing Limit"));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("<html>Select Maximum number of books <br>one student can borrow </html>");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2), Integer.valueOf(1), null, Integer.valueOf(1)));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 350, 120));

        jLabel9.setBackground(new java.awt.Color(102, 102, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Settings and Information");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 30));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Add new Author"));
        jPanel10.setOpaque(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Author ID :");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel14.setText("jLabel14");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 260, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Author Name :");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel10.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 240, 20));

        jButton4.setText("Add new Author");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 140, -1));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 260, 20));

        add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 370, 120));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Add new Publisher"));
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Publisher ID :");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 22, -1, -1));

        jLabel25.setText("jLabel14");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 22, 230, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Publisher Name :");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });
        jPanel9.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 210, -1));

        jButton7.setText("Add new publisher");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton7KeyPressed(evt);
            }
        });
        jPanel9.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 140, -1));

        comboPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPublisherActionPerformed(evt);
            }
        });
        jPanel9.add(comboPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 230, 20));

        add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 370, 120));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Add new Category"));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Category ID :");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 22, -1, -1));

        jLabel20.setText("jLabel14");
        jLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 230, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Categoryr Name :");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 50, -1, -1));

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        jPanel7.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 210, -1));

        jButton3.setText("Add new category");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 140, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 230, 20));

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 370, 120));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Add new Rack"));
        jPanel6.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("New Rack ID :");

        jLabel17.setText("jLabel14");
        jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setText("New Rack");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 350, 120));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Toolbox-128x128.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Late Submit Cost"));
        jPanel2.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("<html>Define Late Book <br>Submit Cost(Due Amount) </html>");

        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2), Integer.valueOf(1), null, Integer.valueOf(1)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(224, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 350, 120));

        jTaskPaneGroup1.setTitle("Other Options");

        jLabel2.setText("Go to Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jTaskPaneGroup1.getContentPane().add(jLabel2);

        jLabel4.setText("User Privilages");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jTaskPaneGroup1.getContentPane().add(jLabel4);

        jLabel5.setText("About Us");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jTaskPaneGroup1.getContentPane().add(jLabel5);

        add(jTaskPaneGroup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 190, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Settings222.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            DB.myConnection().createStatement().executeUpdate("update main set No='" + jSpinner1.getValue().toString() + "'");
            JOptionPane.showMessageDialog(this, "Data Saveed succefully");

        } catch (Exception e) {
            System.out.println("Exception @ Settings 110");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField5ActionPerformed

private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
    if (evt.getKeyChar() == evt.VK_ENTER) {
        jButton4.doClick();
    }
}//GEN-LAST:event_jTextField5KeyPressed

private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
    try {

        ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from author where AuthorName like  '" + jTextField5.getText() + "%'");
        Vector v = new Vector();
        while (rs.next()) {
            v.add(rs.getString("AuthorName"));
        }
        jComboBox2.setModel(new DefaultComboBoxModel(v));
        jComboBox2.showPopup();

    } catch (Exception e) {
    }
}//GEN-LAST:event_jTextField5KeyReleased

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    if (jTextField5.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please enter Author name", "info", JOptionPane.INFORMATION_MESSAGE);
    } else {
        try {

            DB.myConnection().createStatement().executeUpdate("insert into author values('" + jLabel14.getText() + "','" + jTextField5.getText() + "','" + librarianId + "')");
            jLabel14.setText(LoadAuthor.getMaxAithorID());
            v2 = LoadAuthor.selectAllAuthor();

            jTextField5.setText("");

        } catch (Exception e) {
        }
    }
}//GEN-LAST:event_jButton4ActionPerformed

private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    jTextField5.setText(jComboBox2.getSelectedItem().toString());
}//GEN-LAST:event_jComboBox2ActionPerformed

private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
    if (evt.getKeyChar() == evt.VK_ENTER) {
        jButton7.doClick();
    }
}//GEN-LAST:event_jTextField8KeyPressed

private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
    try {

        ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from Publisher where PublisherName like  '" + jTextField8.getText() + "%'");
        Vector v = new Vector();
        while (rs.next()) {
            v.add(rs.getString("PublisherName"));
        }
        comboPublisher.setModel(new DefaultComboBoxModel(v));
        comboPublisher.showPopup();
 
    } catch (Exception e) {
    }
}//GEN-LAST:event_jTextField8KeyReleased

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    if (jTextField8.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please Enter publisher Name", "info", JOptionPane.INFORMATION_MESSAGE);
    } else {
        try {

            DB.myConnection().createStatement().executeUpdate("insert into publisher values('" + jLabel25.getText() + "','" + jTextField8.getText() + "','" + librarianId + "')");

            jLabel25.setText(LoadPublisher.getMaxPublisherID());
            jTextField8.setText("");
            JOptionPane.showMessageDialog(this, "New publisher added", "info", JOptionPane.INFORMATION_MESSAGE);
            ;
        } catch (Exception e) {
        }
    }
}//GEN-LAST:event_jButton7ActionPerformed

private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton7KeyPressed
    if (evt.getKeyChar() == evt.VK_ENTER) {
        jButton7.doClick();
    }
}//GEN-LAST:event_jButton7KeyPressed

private void comboPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPublisherActionPerformed
    jTextField8.setText(comboPublisher.getSelectedItem().toString());
}//GEN-LAST:event_comboPublisherActionPerformed

private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
    if (evt.getKeyChar() == evt.VK_ENTER) {
        jButton3.doClick();
    }
}//GEN-LAST:event_jTextField7KeyPressed

private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
// TODO add your handling code here:
    try {

        ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from Category where CategoryName like  '" + jTextField7.getText() + "%'");
        Vector v = new Vector();
        while (rs.next()) {
            v.add(rs.getString("CategoryName"));
        }
        jComboBox1.setModel(new DefaultComboBoxModel(v));
        jComboBox1.showPopup();

    } catch (Exception e) {
    }
}//GEN-LAST:event_jTextField7KeyReleased

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    if (jTextField7.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please Enter Category Name", "info", JOptionPane.INFORMATION_MESSAGE);
    } else {
        try {

            DB.myConnection().createStatement().executeUpdate("insert into category values('" + jLabel20.getText() + "','" + librarianId + "','" + jTextField7.getText() + "')");

            jLabel20.setText(LoadCategory.getMaxCategoryID());
            jTextField7.setText("");
            JOptionPane.showMessageDialog(this, "New Category added", "info", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
        }
    }
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
    if (evt.getKeyChar() == evt.VK_ENTER) {
        jButton3.doClick();
    }
}//GEN-LAST:event_jButton3KeyPressed

private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
// TODO add your handling code here:
    jTextField7.setText(jComboBox1.getSelectedItem().toString());
}//GEN-LAST:event_jComboBox1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    try {

        DB.myConnection().createStatement().executeUpdate("insert into rack values('" + jLabel17.getText() + "')");

        jLabel17.setText(LoadRackID.getMaxRackID());
        JOptionPane.showMessageDialog(this, "New Rack added", "info", JOptionPane.INFORMATION_MESSAGE);

    } catch (Exception e) {
    }
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
    if (evt.getKeyChar() == evt.VK_ENTER) {
        jButton2.doClick();
    }
}//GEN-LAST:event_jButton2KeyPressed

private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    Hp1 hp = new Hp1(librian_name, librarianId);
    PanelLoad1.LoadPanel(hp, Home.jPanel2);
}//GEN-LAST:event_jLabel2MouseClicked

private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    User_Privilages up = new User_Privilages(librian_name, librarianId);
    PanelLoad1.LoadPanel(up, Home.jPanel2);
}//GEN-LAST:event_jLabel4MouseClicked

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    try {

        DB.myConnection().createStatement().executeUpdate("update kappam set kappamValue='" + jSpinner2.getValue().toString() + "'");
        JOptionPane.showMessageDialog(this, "Data Saved succefully");

    } catch (Exception e) {
        System.out.println("Exception @ Settings 110");
    }
}//GEN-LAST:event_jButton5ActionPerformed

private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
    jLabel2.setForeground(Color.DARK_GRAY);
    System.gc();
}//GEN-LAST:event_jLabel2MouseEntered

private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
    jLabel4.setForeground(Color.DARK_GRAY);
    System.gc();
}//GEN-LAST:event_jLabel4MouseEntered

private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
    jLabel5.setForeground(Color.DARK_GRAY);
    System.gc();
}//GEN-LAST:event_jLabel5MouseEntered

private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
    jLabel5.setForeground(Color.BLACK);
    System.gc();
}//GEN-LAST:event_jLabel5MouseExited

private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
    jLabel4.setForeground(Color.BLACK);
    System.gc();
}//GEN-LAST:event_jLabel4MouseExited

private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
    jLabel2.setForeground(Color.BLACK);
    System.gc();
}//GEN-LAST:event_jLabel2MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        About_Me up = new About_Me(librian_name, librarianId);
        PanelLoad1.LoadPanel(up, Home.jPanel2);
    }//GEN-LAST:event_jLabel5MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboPublisher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
