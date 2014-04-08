package se.wsu.lmw.Controls;

import javax.swing.GroupLayout;
import javax.swing.JPanel;

/**
 *
 * @author imashi
 */
public class PanelLoad1 {

    //method to load the jpanel 
    public static void LoadPanel(JPanel bg, JPanel pName) {
        pName.removeAll();
        GroupLayout layout = new GroupLayout(pName);
        pName.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(bg, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE));

    }
}
