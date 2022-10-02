/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Window;

import Model.Product;
import Model.ProductHistory;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.lang.String;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author shreyasdasariicloud.com
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    ProductHistory history;
    
    public CreateJPanel(ProductHistory history) {
        initComponents();
        this.history = history;
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
        LabelName = new javax.swing.JLabel();
        LabelEmpID = new javax.swing.JLabel();
        LabelAge = new javax.swing.JLabel();
        LabelGender = new javax.swing.JLabel();
        LabelStrdate = new javax.swing.JLabel();
        LabelLvl = new javax.swing.JLabel();
        LabelTeaminfo = new javax.swing.JLabel();
        LabelPostitle = new javax.swing.JLabel();
        LabelContactinfo = new javax.swing.JLabel();
        LabelCellno = new javax.swing.JLabel();
        LabelEmailID = new javax.swing.JLabel();
        LabelPhoto = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        TxtEmpID = new javax.swing.JTextField();
        TxtAge = new javax.swing.JTextField();
        TxtGender = new javax.swing.JTextField();
        TxtStrdate = new javax.swing.JTextField();
        TxtLvl = new javax.swing.JTextField();
        TxtTeaminfo = new javax.swing.JTextField();
        TxtPostitle = new javax.swing.JTextField();
        TxtCellno = new javax.swing.JTextField();
        TxtEmailID = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        TxtPhoto = new javax.swing.JTextField();

        LabelTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        LabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitle.setText("Enter the Employee Info");

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

        LabelEmailID.setText("Email ID:");

        LabelPhoto.setText("Photo:");

        TxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNameActionPerformed(evt);
            }
        });

        BtnAdd.setText("Add");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        TxtPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelPhoto)
                    .addComponent(LabelContactinfo)
                    .addComponent(LabelPostitle)
                    .addComponent(LabelTeaminfo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LabelEmpID)
                        .addComponent(LabelName, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LabelAge, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LabelGender, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LabelStrdate, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LabelLvl, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtStrdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTeaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPostitle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelCellno)
                                    .addComponent(LabelEmailID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtCellno, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(TxtEmailID)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(121, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSave)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(LabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName)
                    .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmpID)
                    .addComponent(TxtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelAge)
                    .addComponent(TxtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelStrdate)
                    .addComponent(TxtStrdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelLvl)
                    .addComponent(TxtLvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTeaminfo)
                    .addComponent(TxtTeaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPostitle)
                    .addComponent(TxtPostitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelContactinfo)
                    .addComponent(LabelCellno)
                    .addComponent(TxtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmailID)
                    .addComponent(TxtCellno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPhoto)
                    .addComponent(BtnAdd)
                    .addComponent(TxtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSave)
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNameActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        String selectedImagePath = "";
        // TODO add your handling code here:
        
       
        ImageIcon imageicon = new ImageIcon(selectedImagePath);
        LabelPhoto.setIcon(imageicon);
        String name = TxtName.getText();
        String empID = TxtEmpID.getText();
        String age = TxtAge.getText();
        String gender = TxtGender.getText();
        String strdate = TxtStrdate.getText();
        String lvl = TxtLvl.getText();
        String teaminfo = TxtTeaminfo.getText();
        String postitle = TxtPostitle.getText();
        String cellno = TxtCellno.getText();
        String emailID = TxtEmailID.getText();
        String photo = TxtPhoto.getText();
        
        
        Product p = history.addNewProduct();
        
        p.setName(name);
        p.setEmpID(empID);
        p.setAge(age);
        p.setGender(gender);
        p.setStrdate(strdate);
        p.setLvl(lvl);
        p.setPostitle(postitle);
        p.setTeaminfo(teaminfo);
        p.setCellno(cellno);
        p.setEmailID(emailID);
        p.setPhoto(photo);
        
        JOptionPane.showMessageDialog(this, "New Record Added");
        
        TxtName.setText("");
        TxtEmpID.setText("");
        TxtAge.setText("");
        TxtGender.setText("");
        TxtStrdate.setText("");
        TxtLvl.setText("");
        TxtTeaminfo.setText("");
        TxtPostitle.setText("");
        TxtCellno.setText("");
        TxtEmailID.setText("");
        TxtPhoto.setText("");
        
        
        
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            TxtPhoto.setText(selectedImagePath);
            JOptionPane.showMessageDialog(null, selectedImagePath);
        }
            
            
    }//GEN-LAST:event_BtnAddActionPerformed

    private void TxtPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnSave;
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
    private javax.swing.JLabel LabelStrdate;
    private javax.swing.JLabel LabelTeaminfo;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JTextField TxtAge;
    private javax.swing.JTextField TxtCellno;
    private javax.swing.JTextField TxtEmailID;
    private javax.swing.JTextField TxtEmpID;
    private javax.swing.JTextField TxtGender;
    private javax.swing.JTextField TxtLvl;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField TxtPhoto;
    private javax.swing.JTextField TxtPostitle;
    private javax.swing.JTextField TxtStrdate;
    private javax.swing.JTextField TxtTeaminfo;
    // End of variables declaration//GEN-END:variables
}