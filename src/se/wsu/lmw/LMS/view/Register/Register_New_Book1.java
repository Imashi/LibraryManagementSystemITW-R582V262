package se.wsu.lmw.LMS.view.Register;

import se.wsu.lmw.Database.DB;
import se.wsu.lmw.Controls.Date.Date1;
import se.wsu.lmw.Controls.GenerateBookID;
import se.wsu.lmw.Controls.load_data.LoadAuthor;
import se.wsu.lmw.Controls.load_data.LoadCategory;
import se.wsu.lmw.Controls.load_data.LoadPublisher;
import se.wsu.lmw.Controls.load_data.LoadRackID;
import se.wsu.lmw.Controls.save_AuthorBook;
import java.io.File;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author imashi
 */
public class Register_New_Book1 extends javax.swing.JPanel {

    String librianName;
    String librarianId;
    Vector v1 = new Vector();
    Vector v2 = new Vector();

    public Register_New_Book1() {
        initComponents();
    }

    public Register_New_Book1(String librian, String lid) {
        initComponents();

        librianName = librian;
        librarianId = lid;

        btnRemove.setEnabled(false);
        jLabel12.setText(Date1.myDate());
        jLabel10.setText(librianName);
        jTextField1.setText(GenerateBookID.getBookID());
        jTextField6.setEditable(false);
        cmbCategory.setModel(new DefaultComboBoxModel(LoadCategory.selectAllCategory()));
        cmbRackID.setModel(new DefaultComboBoxModel(LoadRackID.selectAllRackID()));
        cmbPublisher.setModel(new DefaultComboBoxModel(LoadPublisher.selectAllPublisher()));
        v2 = LoadAuthor.selectAllAuthor();
        jList1.setListData(v2);
        jList1.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jFrame2 = new javax.swing.JFrame();
        jLabel23 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbPublisher = new javax.swing.JComboBox();
        cmbRackID = new javax.swing.JComboBox();
        cmbCategory = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\Documents and Settings\\test\\My Documents\\LibraryBookImages"));
        jFileChooser1.setDragEnabled(true);

        jLabel22.setText("jLabel22");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        jFrame2.setAlwaysOnTop(true);
        jFrame2.setResizable(false);
        jFrame2.setUndecorated(true);

        jLabel23.setText("jLabel23");

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );

        jLabel5.setText("Book Category :");

        setOpaque(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Register New Books ");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jLabel9.setOpaque(true);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Image"));

        jLabel18.setText("Book Image :");

        jTextField6.setText("Select Book Image");

        jButton5.setText("Browse");
        jButton5.setNextFocusableComponent(btnSave);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });

        jButton6.setText("Remove");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Book Details"));
        jPanel1.setOpaque(false);

        jLabel1.setText("Book ID :");

        jLabel2.setText("Book Name :");

        jLabel3.setText("Total Quentity :");

        jLabel4.setText("Available Quentity :");

        jTextField1.setEditable(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setNextFocusableComponent(jTextField3);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.setNextFocusableComponent(jTextField4);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setNextFocusableComponent(cmbCategory);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Book Authors"));
        jPanel2.setOpaque(false);

        jList1.setNextFocusableComponent(jButton1);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText(">>");
        jButton1.setNextFocusableComponent(jButton5);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        btnRemove.setText("<<");
        btnRemove.setNextFocusableComponent(jButton1);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        btnRemove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRemoveKeyPressed(evt);
            }
        });

        jScrollPane3.setViewportView(jList3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Book Details"));
        jPanel3.setOpaque(false);

        jLabel6.setText("Rack ID :");

        jLabel7.setText("Publisher : ");

        cmbPublisher.setNextFocusableComponent(jList1);
        cmbPublisher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbPublisherKeyPressed(evt);
            }
        });

        cmbRackID.setNextFocusableComponent(cmbPublisher);
        cmbRackID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRackIDActionPerformed(evt);
            }
        });
        cmbRackID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbRackIDKeyPressed(evt);
            }
        });

        cmbCategory.setNextFocusableComponent(cmbRackID);
        cmbCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoryItemStateChanged(evt);
            }
        });
        cmbCategory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbCategoryKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbRackID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPublisher, 0, 207, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbRackID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setOpaque(false);

        btnSave.setText("Save");
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

        jLabel11.setText("Register Date :");

        jLabel12.setText("jLabel12");

        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(btnClear))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, 0, 684, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
}//GEN-LAST:event_jTextField1KeyTyped

private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
}//GEN-LAST:event_jTextField1KeyReleased

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        int a = jList1.getSelectedIndex();
        int b = jList1.getLastVisibleIndex();
        int c = jList1.getFirstVisibleIndex();

        btnRemove.setEnabled(true);
        v1.add(jList1.getSelectedValue());
        v2.remove(jList1.getSelectedValue());

        jList3.setListData(v1);
        jList1.setListData(v2);

        if (v2.isEmpty()) {
            jButton1.setEnabled(false);
        } else if (a == c) {
            jList1.setSelectedIndex(c);
        } else if (a > c && a < b) {
            jList1.setSelectedIndex(a);
        } else if (a == b) {
            jList1.setSelectedIndex(b - 1);
        }
        jList3.setSelectedIndex(0);
    } catch (NullPointerException e) {
        System.out.println("Null pointer exception");
    }

}//GEN-LAST:event_jButton1ActionPerformed

private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
// TODO add your handling code here:
    try {
        int d = jList3.getSelectedIndex();
        int e = jList3.getLastVisibleIndex();
        int f = jList3.getFirstVisibleIndex();

        int i = jList3.getSelectedIndex();

        v2.add(jList3.getSelectedValue().toString());
        v1.remove(jList3.getSelectedValue().toString());

        jList3.setListData(v1);
        jList1.setListData(v2);
        jList1.setSelectedIndex(0);
        if (v1.isEmpty()) {
            btnRemove.setEnabled(false);
        } else if (d == f) {
            jList3.setSelectedIndex(f);
        } else if (d > f && d < e) {
            jList3.setSelectedIndex(d);
        } else if (d == e) {
            jList3.setSelectedIndex(e - 1);
        }
        if (!v2.isEmpty()) {
            jButton1.setEnabled(true);
        }
    } catch (NullPointerException e) {
    }
}//GEN-LAST:event_btnRemoveActionPerformed

private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
// TODO add your handling code here:

}//GEN-LAST:event_jList1MouseClicked

private void cmbCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoryItemStateChanged
// TODO add your handling code here:

}//GEN-LAST:event_cmbCategoryItemStateChanged

private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
// TODO add your handling code here:
    if (v1.size() == 0) {

        JOptionPane.showMessageDialog(null, "You must enter Author Name to \n save book details");
    } else if ((jTextField2.getText().equals(""))) {
        JOptionPane.showMessageDialog(null, "You must Enter\n Book Name");
    } else if (jTextField2.getText().length() > 21) {
        JOptionPane.showMessageDialog(null, "Maximum Book Name Length is 25 characters");
    } else if (!(jTextField3.getText().equals(jTextField4.getText()))) {
        JOptionPane.showMessageDialog(null, "Total Quentity must be Equal to \n Available Quentity");
    } else {
        try {

            DB.myConnection().createStatement().executeUpdate("insert into book values ('" + jTextField1.getText() + "','" + jTextField2.getText() + "','" + jTextField3.getText() + "','" + jTextField4.getText() + "','" + librarianId + "','" + cmbRackID.getSelectedItem().toString() + "','" + LoadCategory.getCategoryID(cmbCategory.getSelectedItem().toString()) + "','" + jTextField6.getText() + "','" + LoadPublisher.selectPublisherID(cmbPublisher.getSelectedItem().toString()) + "')");
            save_AuthorBook.save_AuthorBook(v1, jTextField1.getText());
        } catch (Exception e) {
        }

        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        btnRemove.setEnabled(false);
        jLabel12.setText(Date1.myDate());
        jLabel10.setText(librianName);
        jTextField1.setText(GenerateBookID.getBookID());
        jButton1.setEnabled(true);
        cmbCategory.setModel(new DefaultComboBoxModel(LoadCategory.selectAllCategory()));
        cmbRackID.setModel(new DefaultComboBoxModel(LoadRackID.selectAllRackID()));
        cmbPublisher.setModel(new DefaultComboBoxModel(LoadPublisher.selectAllPublisher()));
        v2 = LoadAuthor.selectAllAuthor();
        jList1.setListData(v2);
        v1.removeAllElements();
        jList3.setListData(v1);
        jList1.setSelectedIndex(0);

        jTextField6.setText("Select Book Image");
        jTextField2.grabFocus();
    }
}//GEN-LAST:event_btnSaveActionPerformed

private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
// TODO add your handling code here:
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    btnRemove.setEnabled(false);
    jLabel12.setText(Date1.myDate());
    jLabel10.setText(librianName);
    jTextField1.setText(GenerateBookID.getBookID());
    jButton1.setEnabled(true);
    cmbCategory.setModel(new DefaultComboBoxModel(LoadCategory.selectAllCategory()));
    cmbRackID.setModel(new DefaultComboBoxModel(LoadRackID.selectAllRackID()));
    cmbPublisher.setModel(new DefaultComboBoxModel(LoadPublisher.selectAllPublisher()));
    v2 = LoadAuthor.selectAllAuthor();
    jList1.setListData(v2);
    v1.removeAllElements();
    jList3.setListData(v1);
    jList1.setSelectedIndex(0);

}//GEN-LAST:event_btnClearActionPerformed

private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
// TODO add your handling code here:
    if (!Character.isDigit(evt.getKeyChar())) {
        evt.consume();
    }

}//GEN-LAST:event_jTextField3KeyTyped

private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
// TODO add your handling code here:
    if (!Character.isDigit(evt.getKeyChar())) {
        evt.consume();
    }
}//GEN-LAST:event_jTextField4KeyTyped

private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
}//GEN-LAST:event_jTextField3KeyPressed
    String newpath;
private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
    try {

        jFileChooser1.showOpenDialog(this);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("png & JPG & GIF Images", "jpg", "gif", "png");
        jFileChooser1.setFileFilter(filter);
        File g = jFileChooser1.getSelectedFile();
        String path = g.getAbsolutePath();
        newpath = path.replace("\\", "/");

        jTextField6.setText(newpath);

    } catch (Exception e) {
    }
}//GEN-LAST:event_jButton5ActionPerformed

    public String returnPath() {
        return newpath;
    }


private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

}//GEN-LAST:event_formMouseClicked

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    jTextField6.setText("Select Book Image");
}//GEN-LAST:event_jButton6ActionPerformed

private void btnRemoveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRemoveKeyPressed
    if (evt.getKeyChar() == evt.VK_ENTER) {
        btnRemove.doClick();
    } else if (evt.getKeyCode() == 38) {
        jButton1.grabFocus();
    } else if (evt.getKeyCode() == 37) {
        jList1.grabFocus();
    } else if (evt.getKeyCode() == 39) {
        jList3.grabFocus();
    }
}//GEN-LAST:event_btnRemoveKeyPressed

private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
    if (evt.getKeyChar() == evt.VK_ENTER) {
        jButton1.doClick();
    } else if (evt.getKeyCode() == 40) {
        btnRemove.grabFocus();
    } else if (evt.getKeyCode() == 37) {
        jList1.grabFocus();
    } else if (evt.getKeyCode() == 39) {
        jList3.grabFocus();
    }
}//GEN-LAST:event_jButton1KeyPressed

private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
    if (evt.getKeyChar() == evt.VK_ENTER) {
        jButton5.doClick();
    } else if (evt.getKeyCode() == 39) {
        jButton6.grabFocus();
    }
}//GEN-LAST:event_jButton5KeyPressed

private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyPressed
    if (evt.getKeyChar() == evt.VK_ENTER) {
        jButton6.doClick();
    } else if (evt.getKeyCode() == 37) {
        jButton5.grabFocus();
    }
}//GEN-LAST:event_jButton6KeyPressed

private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
    if (evt.getKeyChar() == evt.VK_ENTER) {
        btnSave.doClick();
    } else if (evt.getKeyCode() == 39) {
        btnClear.grabFocus();
    }
}//GEN-LAST:event_btnSaveKeyPressed

private void btnClearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnClearKeyPressed
    if (evt.getKeyChar() == evt.VK_ENTER) {
        btnClear.doClick();
    } else if (evt.getKeyCode() == 37) {
        btnSave.grabFocus();
    }
}//GEN-LAST:event_btnClearKeyPressed

private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
// TODO add your handling code here:
}//GEN-LAST:event_jButton1FocusGained

private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased

}//GEN-LAST:event_jTextField2KeyReleased

private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
    if (evt.getKeyCode() == 40) {
        jTextField3.grabFocus();
    } else if (evt.getKeyCode() == 39) {
        cmbRackID.grabFocus();
    }
}//GEN-LAST:event_jTextField2KeyPressed

private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped

    if (jTextField2.getText().length() > 21 && evt.getKeyChar() != evt.VK_ENTER) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Maximum Book Name Length is 21 characters");
    }
}//GEN-LAST:event_jTextField2KeyTyped

private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
    if (evt.getKeyCode() == 40) {
        jTextField2.grabFocus();
    } else if (evt.getKeyCode() == 39) {
        cmbCategory.grabFocus();
    }
}//GEN-LAST:event_jTextField1KeyPressed

private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
    if (evt.getKeyCode() == 38) {
        jTextField3.grabFocus();
    } else if (evt.getKeyCode() == 40) {
        jList1.grabFocus();
    } else if (evt.getKeyCode() == 39) {
        cmbPublisher.grabFocus();
    }
}//GEN-LAST:event_jTextField4KeyPressed

private void cmbCategoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCategoryKeyPressed
    if (evt.getKeyCode() == 40) {
        cmbRackID.grabFocus();
    }
}//GEN-LAST:event_cmbCategoryKeyPressed

private void cmbRackIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbRackIDKeyPressed
    if (evt.getKeyCode() == 40) {
        cmbPublisher.grabFocus();
    } else if (evt.getKeyCode() == 37) {
        jTextField2.grabFocus();
    }
}//GEN-LAST:event_cmbRackIDKeyPressed

private void cmbPublisherKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbPublisherKeyPressed
    if (evt.getKeyCode() == 40) {
        jTextField4.grabFocus();
    } else if (evt.getKeyCode() == 37) {
        jTextField3.grabFocus();
    }
}//GEN-LAST:event_cmbPublisherKeyPressed

    private void cmbRackIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRackIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRackIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbCategory;
    private javax.swing.JComboBox cmbPublisher;
    private javax.swing.JComboBox cmbRackID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
