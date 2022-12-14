/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Model.PatientHistory;
import Model.Personhistory;
import javax.swing.JSplitPane;

/**
 *
 * @author shreyasdasariicloud.com
 */
public class CommunitySearch extends javax.swing.JPanel {

    /**
     * Creates new form CommunitySearch
     */
    JSplitPane SplitPane;
    Personhistory personHistory;
    PatientHistory patientHistory;
    public CommunitySearch(JSplitPane SplitPane, Personhistory personHistory) {
        initComponents();
        this.SplitPane = SplitPane;
        this.personHistory = personHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCommunitySearch = new javax.swing.JTable();
        lblCommunity = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        checkBoxToddler = new javax.swing.JCheckBox();
        checkBoxChild = new javax.swing.JCheckBox();
        checkBoxYouth = new javax.swing.JCheckBox();
        checkBoxAdult = new javax.swing.JCheckBox();
        checkBoxSeniorCitizens = new javax.swing.JCheckBox();
        checkBoxCustom = new javax.swing.JCheckBox();
        txtMin = new javax.swing.JTextField();
        lblMin = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();
        lblMax = new javax.swing.JLabel();
        checkBoxAll = new javax.swing.JCheckBox();
        txtTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        tblCommunitySearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient ID", "IsPulseAbnormal", "IsBPAbnormal", "IsTempAbnormal", "Community", "IsAbnormal"
            }
        ));
        jScrollPane1.setViewportView(tblCommunitySearch);

        lblCommunity.setText("Community:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        checkBoxToddler.setText("Toddler (0-3)");
        checkBoxToddler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxToddlerActionPerformed(evt);
            }
        });

        checkBoxChild.setText("Child (4-15)");
        checkBoxChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxChildActionPerformed(evt);
            }
        });

        checkBoxYouth.setText("Youth (16-30)");
        checkBoxYouth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxYouthActionPerformed(evt);
            }
        });

        checkBoxAdult.setText("Adult (31-60)");
        checkBoxAdult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAdultActionPerformed(evt);
            }
        });

        checkBoxSeniorCitizens.setText("Senior Citizens (60+)");
        checkBoxSeniorCitizens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxSeniorCitizensActionPerformed(evt);
            }
        });

        checkBoxCustom.setText("Custom Input");
        checkBoxCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCustomActionPerformed(evt);
            }
        });

        lblMin.setText("Min");

        lblMax.setText("Max");

        checkBoxAll.setText("All");
        checkBoxAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAllActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(lblCommunity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxAll)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkBoxAdult)
                            .addComponent(checkBoxYouth)
                            .addComponent(checkBoxChild)
                            .addComponent(checkBoxToddler)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkBoxCustom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(checkBoxSeniorCitizens))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMax)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMax)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(checkBoxToddler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxChild)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxYouth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxAdult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxSeniorCitizens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxCustom)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMin)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxAll)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
//        if(checkBoxAll.isSelected())
//        //populateTable(txtCommunity.getText(),0,100);
//        else if(checkBoxCustom.isSelected())
//        {
//            int Min = Integer.parseInt(txtMin.getText());
//            int Max = Integer.parseInt(txtMax.getText());
//            populateTable(txtCommunity.getText(),Min,Max);
//        }
//        else if(checkBoxSeniorCitizens.isSelected())
//        populateTable(txtCommunity.getText(),61,100);
//        else if(checkBoxAdult.isSelected())
//        populateTable(txtCommunity.getText(),31,60);
//        else if(checkBoxYouth.isSelected())
//        populateTable(txtCommunity.getText(),16,30);
//        else if(checkBoxChild.isSelected())
//        populateTable(txtCommunity.getText(),4,15);
//        else if(checkBoxToddler.isSelected())
//        populateTable(txtCommunity.getText(),0,3);
//        else{
//            System.out.println("Exception");
//        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void checkBoxToddlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxToddlerActionPerformed
        // TODO add your handling code here:
        if(checkBoxToddler.isSelected())
        {
            checkBoxChild.setSelected(false);
            checkBoxYouth.setSelected(false);
            checkBoxAdult.setSelected(false);
            checkBoxSeniorCitizens.setSelected(false);
            checkBoxCustom.setSelected(false);
            checkBoxAll.setSelected(false);

            //populateTable(txtCommunity.getText(),0,3);
        }

    }//GEN-LAST:event_checkBoxToddlerActionPerformed

    private void checkBoxChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxChildActionPerformed
        // TODO add your handling code here:
        if(checkBoxChild.isSelected())
        {
            checkBoxToddler.setSelected(false);
            checkBoxYouth.setSelected(false);
            checkBoxAdult.setSelected(false);
            checkBoxSeniorCitizens.setSelected(false);
            checkBoxCustom.setSelected(false);
            checkBoxAll.setSelected(false);

            //populateTable(txtCommunity.getText(),4,15);
        }
    }//GEN-LAST:event_checkBoxChildActionPerformed

    private void checkBoxYouthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxYouthActionPerformed
        // TODO add your handling code here:
        if(checkBoxYouth.isSelected())
        {
            checkBoxToddler.setSelected(false);
            checkBoxChild.setSelected(false);
            checkBoxAdult.setSelected(false);
            checkBoxSeniorCitizens.setSelected(false);
            checkBoxCustom.setSelected(false);
            checkBoxAll.setSelected(false);

            //populateTable(txtCommunity.getText(),16,30);
        }
    }//GEN-LAST:event_checkBoxYouthActionPerformed

    private void checkBoxAdultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAdultActionPerformed
        // TODO add your handling code here:
        if(checkBoxAdult.isSelected())
        {
            checkBoxToddler.setSelected(false);
            checkBoxYouth.setSelected(false);
            checkBoxChild.setSelected(false);
            checkBoxSeniorCitizens.setSelected(false);
            checkBoxCustom.setSelected(false);
            checkBoxAll.setSelected(false);

            //populateTable(txtCommunity.getText(),31,60);
        }
    }//GEN-LAST:event_checkBoxAdultActionPerformed

    private void checkBoxSeniorCitizensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxSeniorCitizensActionPerformed
        // TODO add your handling code here:
        if(checkBoxSeniorCitizens.isSelected())
        {
            checkBoxToddler.setSelected(false);
            checkBoxYouth.setSelected(false);
            checkBoxAdult.setSelected(false);
            checkBoxChild.setSelected(false);
            checkBoxCustom.setSelected(false);
            checkBoxAll.setSelected(false);
            //populateTable(txtCommunity.getText(),61,100);
        }
    }//GEN-LAST:event_checkBoxSeniorCitizensActionPerformed

    private void checkBoxCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxCustomActionPerformed
        // TODO add your handling code here:
        if(checkBoxCustom.isSelected())
        {
            checkBoxToddler.setSelected(false);
            checkBoxYouth.setSelected(false);
            checkBoxAdult.setSelected(false);
            checkBoxSeniorCitizens.setSelected(false);
            checkBoxChild.setSelected(false);
            checkBoxAll.setSelected(false);

            //populateTable(txtCommunity.getText(),Integer.parseInt(txtMin.getText()),Integer.parseInt(txtMax.getText()));
        }
    }//GEN-LAST:event_checkBoxCustomActionPerformed

    private void checkBoxAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAllActionPerformed
        // TODO add your handling code here:
        if(checkBoxAll.isSelected())
        {
            checkBoxToddler.setSelected(false);
            checkBoxYouth.setSelected(false);
            checkBoxAdult.setSelected(false);
            checkBoxSeniorCitizens.setSelected(false);
            checkBoxCustom.setSelected(false);
            checkBoxChild.setSelected(false);

            //populateTable(txtCommunity.getText(),0,100);
        }
    }//GEN-LAST:event_checkBoxAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox checkBoxAdult;
    private javax.swing.JCheckBox checkBoxAll;
    private javax.swing.JCheckBox checkBoxChild;
    private javax.swing.JCheckBox checkBoxCustom;
    private javax.swing.JCheckBox checkBoxSeniorCitizens;
    private javax.swing.JCheckBox checkBoxToddler;
    private javax.swing.JCheckBox checkBoxYouth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JTable tblCommunitySearch;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
