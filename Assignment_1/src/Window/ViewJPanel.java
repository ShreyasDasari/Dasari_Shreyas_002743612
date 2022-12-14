/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Window;

import Model.Product;
import Model.ProductHistory;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import java.lang.String;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author shreyasdasariicloud.com
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    ProductHistory history;
    DefaultTableModel model;
    
    public ViewJPanel(ProductHistory history) {
        initComponents();
        this.history = history;
        
        fillTable();
             
    }
    
    public void search(String str){
        model = (DefaultTableModel) TableRecords.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        TableRecords.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableRecords = new javax.swing.JTable();
        BtnView = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        LabelEmailID = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        TxtEmpID = new javax.swing.JTextField();
        TxtAge = new javax.swing.JTextField();
        TxtGender = new javax.swing.JTextField();
        TxtStrdate = new javax.swing.JTextField();
        TxtLvl = new javax.swing.JTextField();
        LabelName = new javax.swing.JLabel();
        TxtTeaminfo = new javax.swing.JTextField();
        LabelEmpID = new javax.swing.JLabel();
        TxtPostitle = new javax.swing.JTextField();
        LabelAge = new javax.swing.JLabel();
        LabelGender = new javax.swing.JLabel();
        TxtCellno = new javax.swing.JTextField();
        LabelStrdate = new javax.swing.JLabel();
        TxtEmailID = new javax.swing.JTextField();
        LabelLvl = new javax.swing.JLabel();
        LabelTeaminfo = new javax.swing.JLabel();
        LabelPostitle = new javax.swing.JLabel();
        LabelContactinfo = new javax.swing.JLabel();
        LabelCellno = new javax.swing.JLabel();
        LabelPhoto = new javax.swing.JLabel();
        BtnUpdate = new javax.swing.JButton();
        LabelSearch = new javax.swing.JLabel();
        TxtSearch = new javax.swing.JTextField();

        LabelTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 21)); // NOI18N
        LabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitle.setText("View Employee Records");

        TableRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Cell No", "Email ID", "Photo"
            }
        ));
        jScrollPane1.setViewportView(TableRecords);

        BtnView.setText("View");
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });

        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        LabelEmailID.setText("Email ID:");

        TxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNameActionPerformed(evt);
            }
        });

        LabelName.setText("Name:");

        LabelEmpID.setText("Employee ID:");

        LabelAge.setText("Age:");

        LabelGender.setText("Gender:");

        LabelStrdate.setText("Start Date:");

        LabelLvl.setText("Level:");

        LabelTeaminfo.setText("Team Info:");

        LabelPostitle.setText("Position Title:");

        LabelContactinfo.setText("Contact Info:");

        LabelCellno.setText("Cell Phone number:");

        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        LabelSearch.setText("Search:");

        TxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSearchActionPerformed(evt);
            }
        });
        TxtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(LabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelEmpID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelAge, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelGender, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(211, 211, 211))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPostitle)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelContactinfo)
                                    .addComponent(LabelStrdate)
                                    .addComponent(LabelLvl)
                                    .addComponent(LabelTeaminfo))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelCellno)
                                            .addComponent(LabelEmailID))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtCellno)
                                            .addComponent(TxtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtStrdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtTeaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtPostitle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnView)
                        .addGap(18, 18, 18)
                        .addComponent(BtnDelete)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnUpdate)
                        .addGap(326, 326, 326))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(LabelTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSearch)
                    .addComponent(TxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnView)
                    .addComponent(BtnDelete))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelName)
                            .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelEmpID)
                            .addComponent(TxtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtStrdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelStrdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtLvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelLvl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtTeaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTeaminfo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtPostitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelPostitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelContactinfo)
                            .addComponent(LabelCellno)
                            .addComponent(TxtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelEmailID)
                            .addComponent(TxtCellno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BtnUpdate)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(LabelPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(198, 198, 198))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNameActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = TableRecords.getSelectedRow();
        
        if (selectedRowIndex<0){
            
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) TableRecords.getModel();
        Product selectedRecords = (Product) model.getValueAt(selectedRowIndex, 0);
        
        history.deleteProduct(selectedRecords);
        
        JOptionPane.showMessageDialog(this, "Record Deleted!");
        
        fillTable();
    }//GEN-LAST:event_BtnDeleteActionPerformed
    
    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = TableRecords.getSelectedRow();
        
        if (selectedRowIndex<0){
            
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) TableRecords.getModel();
        Product selectedRecords = (Product) model.getValueAt(selectedRowIndex, 0);
        
        TxtName.setText(selectedRecords.getName());
        TxtEmpID.setText(selectedRecords.getEmpID());
        TxtAge.setText(selectedRecords.getAge());
        TxtGender.setText(selectedRecords.getGender());
        TxtStrdate.setText(selectedRecords.getStrdate());
        TxtLvl.setText(selectedRecords.getLvl());
        TxtTeaminfo.setText(selectedRecords.getTeaminfo());
        TxtPostitle.setText(selectedRecords.getPostitle());
        TxtCellno.setText(selectedRecords.getCellno());
        TxtEmailID.setText(selectedRecords.getEmailID());
        // Displaying the photo 
        String img=model.getValueAt(TableRecords.getSelectedRow(), 10).toString();
            
            //display on jlabel
           ImageIcon ii= new ImageIcon(img);
           //resize image
           Image image=ii.getImage().getScaledInstance(LabelPhoto.getWidth(), LabelPhoto.getHeight(), Image.SCALE_SMOOTH);
           LabelPhoto.setIcon(new ImageIcon(image));
        
        
        
        
        
        
    }//GEN-LAST:event_BtnViewActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TableRecords.getModel();
        int i = TableRecords.getSelectedRow();
        if (i>=0){
            model.setValueAt(TxtName.getText(), i, 0);
            model.setValueAt(TxtEmpID.getText(), i, 1);
            model.setValueAt(TxtAge.getText(), i, 2);
            model.setValueAt(TxtGender.getText(), i, 3);
            model.setValueAt(TxtStrdate.getText(), i, 4);
            model.setValueAt(TxtLvl.getText(), i, 5);
            model.setValueAt(TxtTeaminfo.getText(), i, 6);
            model.setValueAt(TxtPostitle.getText(), i, 7);
            model.setValueAt(TxtCellno.getText(), i, 9);
            model.setValueAt(TxtEmailID.getText(), i, 8);
        }
        else{
            JOptionPane.showMessageDialog(this, "Update Error!");
        }
        
        
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void TxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSearchActionPerformed

    private void TxtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSearchKeyReleased
        // TODO add your handling code here:
        String find = TxtSearch.getText();
        search(find);
    }//GEN-LAST:event_TxtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton BtnView;
    private javax.swing.JLabel LabelAge;
    private javax.swing.JLabel LabelCellno;
    private javax.swing.JLabel LabelContactinfo;
    private javax.swing.JLabel LabelEmailID;
    private javax.swing.JLabel LabelEmpID;
    private javax.swing.JLabel LabelGender;
    private javax.swing.JLabel LabelLvl;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelPhoto;
    private javax.swing.JLabel LabelPostitle;
    private javax.swing.JLabel LabelSearch;
    private javax.swing.JLabel LabelStrdate;
    private javax.swing.JLabel LabelTeaminfo;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JTable TableRecords;
    private javax.swing.JTextField TxtAge;
    private javax.swing.JTextField TxtCellno;
    private javax.swing.JTextField TxtEmailID;
    private javax.swing.JTextField TxtEmpID;
    private javax.swing.JTextField TxtGender;
    private javax.swing.JTextField TxtLvl;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField TxtPostitle;
    private javax.swing.JTextField TxtSearch;
    private javax.swing.JTextField TxtStrdate;
    private javax.swing.JTextField TxtTeaminfo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        
    DefaultTableModel model = (DefaultTableModel) TableRecords.getModel();
    model.setRowCount(0);
    
    for (Product p : history.getHistory()){
        Object[] row = new Object[11];
        row[0] = p;
        row[1] = p.getEmpID();
        row[2] = p.getAge();
        row[3] = p.getGender();
        row[4] = p.getStrdate();
        row[5] = p.getLvl();
        row[6] = p.getTeaminfo();
        row[7] = p.getPostitle();
        row[9] = p.getCellno();
        row[8] = p.getEmailID();
        row[10] = p.getPhoto();
        
        model.addRow(row);
        }
    
    //TableRecords.getColumn("Photo").setCellRenderer(new myTableCellRenderer());
    }
    
    //class myTableCellRenderer implements TableCellRenderer{
             
        //@Override
        //public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
            
            //return (Component) value;
            
        
        //}
    //}

    private Object getResource() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}