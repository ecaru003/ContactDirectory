package contactdirectory;

public class EditContactDialog extends javax.swing.JDialog {
    //do add is true only if Save is clicked, which then in the main
    //do add is checked to see whether the changes go through
    public boolean doAdd = false;
    Contact newContact = new Contact(-1);
    
    public EditContactDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    EditContactDialog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contactNameField = new javax.swing.JTextField();
        workPhoneField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        homePhoneField = new javax.swing.JTextField();
        cellPhoneField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        workEmailField = new javax.swing.JTextField();
        personalEmailField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        customDescriptionField = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        editContactButton = new javax.swing.JButton();
        cancelContactButton = new javax.swing.JButton();
        displayID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        workPhoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                workPhoneFieldKeyTyped(evt);
            }
        });

        homePhoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                homePhoneFieldKeyTyped(evt);
            }
        });

        cellPhoneField.setToolTipText("");
        cellPhoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cellPhoneFieldKeyTyped(evt);
            }
        });

        customDescriptionField.setColumns(20);
        customDescriptionField.setRows(5);
        jScrollPane1.setViewportView(customDescriptionField);

        editContactButton.setText("Save");
        editContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editContactButtonActionPerformed(evt);
            }
        });

        cancelContactButton.setText("Cancel");
        cancelContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelContactButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Address");

        jLabel2.setText("Work E-mail");

        jLabel3.setText("Personal E-mail");

        jLabel4.setText("Work Phone");

        jLabel5.setText("Home Phone");

        jLabel6.setText("Cell Phone");

        jLabel7.setText("Contact Name");

        jLabel8.setText("Custom Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(displayID)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editContactButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(cancelContactButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(113, 113, 113)
                                            .addComponent(jLabel3))
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(workEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(personalEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(workPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(homePhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(cellPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(addressField)
                                        .addComponent(jScrollPane1)))
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addComponent(contactNameField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homePhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelContactButton)
                            .addComponent(editContactButton))
                        .addContainerGap())
                    .addComponent(displayID, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelContactButtonActionPerformed
        doAdd = false;
        this.dispose();
    }//GEN-LAST:event_cancelContactButtonActionPerformed

    private void editContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editContactButtonActionPerformed
        //when save is pressed, newContact has all its fields changed 
        // to whatever is in the textboxes currently.
        newContact.setContactName(this.getContactNameField());
        newContact.setAddress(this.getAddressField());
        newContact.setCellPhone(this.getCellPhoneField());
        newContact.setHomePhone(this.getHomePhoneField());
        newContact.setWorkPhone(this.getWorkPhoneField());
        newContact.setWorkEmail(this.getWorkEmailField());
        newContact.setPersonalEmail(this.getPersonalEmailField());
        newContact.setCustomDescription(this.getCustomDescriptionField());
        
        doAdd = true;
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_editContactButtonActionPerformed

    
    
    
    private void workPhoneFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_workPhoneFieldKeyTyped
        //if key pressed is not a number, a space, or a -, it is ignored
        char keyEntered = evt.getKeyChar();
        if(!Character.isDigit(keyEntered) && !(keyEntered == ' ')){
            evt.consume();
        }
    }//GEN-LAST:event_workPhoneFieldKeyTyped
    private void homePhoneFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homePhoneFieldKeyTyped
        //if key pressed is not a number, a space, or a -, it is ignored
        char keyEntered = evt.getKeyChar();
        if(!Character.isDigit(keyEntered) && !(keyEntered == ' ')){
            evt.consume();
        }
    }//GEN-LAST:event_homePhoneFieldKeyTyped
    private void cellPhoneFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cellPhoneFieldKeyTyped
        //if key pressed is not a number, a space, or a -, it is ignored
        char keyEntered = evt.getKeyChar();
        if(!Character.isDigit(keyEntered) && !(keyEntered == ' ')){
            evt.consume();
        }
    }//GEN-LAST:event_cellPhoneFieldKeyTyped

    
    
    
    public String getAddressField() {
        return addressField.getText();
    }
    public String getCellPhoneField() {
        return cellPhoneField.getText();
    }
    public String getContactNameField() {
        return contactNameField.getText();
    }
    public String getCustomDescriptionField() {
        return customDescriptionField.getText();
    }
    public String getHomePhoneField() {
        return homePhoneField.getText();
    }
    public String getPersonalEmailField() {
        return personalEmailField.getText();
    }
    public String getWorkEmailField() {
        return workEmailField.getText();
    }
    public String getWorkPhoneField() {
        return workPhoneField.getText();
    }
    public void setAddressField(String addressField) {
        this.addressField.setText(addressField);
    }
    public void setCellPhoneField(String cellPhoneField) {
        this.cellPhoneField.setText(cellPhoneField);
    }
    public void setContactNameField(String contactNameField) {
        this.contactNameField.setText(contactNameField);
    }
    public void setCustomDescriptionField(String customDescriptionField) {
        this.customDescriptionField.setText(customDescriptionField);
    }
    public void setHomePhoneField(String homePhoneField) {
        this.homePhoneField.setText(homePhoneField);
    }
    public void setPersonalEmailField(String personalEmailField) {
        this.personalEmailField.setText(personalEmailField);
    }
    public void setWorkEmailField(String workEmailField) {
        this.workEmailField.setText(workEmailField);
    }
    public void setWorkPhoneField(String workPhoneField) {
        this.workPhoneField.setText(workPhoneField);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddContactDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddContactDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddContactDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddContactDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddContactDialog dialog = new AddContactDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JButton cancelContactButton;
    private javax.swing.JTextField cellPhoneField;
    private javax.swing.JTextField contactNameField;
    private javax.swing.JTextArea customDescriptionField;
    public javax.swing.JLabel displayID;
    private javax.swing.JButton editContactButton;
    private javax.swing.JTextField homePhoneField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField personalEmailField;
    private javax.swing.JTextField workEmailField;
    private javax.swing.JTextField workPhoneField;
    // End of variables declaration//GEN-END:variables
}
