 
package se.wsu.lmw.LMS;

import se.wsu.lmw.Controls.PanelLoad1;
import se.wsu.lmw.LMS.view.home.Home;
import se.wsu.lmw.LMS.view.home.Hp1;

/**
 *
 * @author imashi
 */
public class About_Me extends javax.swing.JPanel {
String librian_name;
    String LID;
    String No;
    /** Creates new form Settings */
    public About_Me(){
     initComponents();
    }
    public About_Me(String librian, String lid) {
         librian_name = librian;
        LID = lid;
        initComponents();
        jLabel6.setText(librian_name);
         

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 503, 100, 30));

        jLabel6.setText("jLabel6");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 170, 20));

        jLabel9.setBackground(new java.awt.Color(153, 153, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("About Us");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Imashi Wijewickrama");
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 730, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Settings222.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Hp1 hp = new Hp1(librian_name, LID);
    PanelLoad1.LoadPanel(hp, Home.jPanel2);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
