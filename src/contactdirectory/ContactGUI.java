package contactdirectory;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ContactGUI extends javax.swing.JFrame {
    AddContactDialog addCont; //initialize add dialog 
    EditContactDialog editCont; //initialize edit dialog
    DefaultListModel<Contact> listModel = new DefaultListModel(); //makes public list model
    SaveData save = new SaveData(); //class for saving
    ReadData read = new ReadData(); // class for reading
    //boolean edited = false;
    int lastUniqueID = -1; 
    
    public ContactGUI() throws Throwable {
        initComponents();
        makeSearchFunction(); //adds evt listener to search
        contactsList.setModel(listModel);
        openSavedContacts(); //automatically tries to load files from a contact
        reOrderList(); //forces list to be ordered
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        searchContactTextField = new javax.swing.JTextField();
        openAddContButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sortOptions = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactsList = new javax.swing.JList<Contact>();
        viewButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        onGUISaveButton = new javax.swing.JButton();
        onGUIDeleteButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        fileMenuSort = new javax.swing.JMenuItem();
        openSavedListButton = new javax.swing.JMenuItem();
        saveListButton = new javax.swing.JMenuItem();
        menuDeleteButton = new javax.swing.JMenuItem();
        fileMenuCloseButton = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        helpMenuBasicHelp = new javax.swing.JMenuItem();
        helpMenuSave = new javax.swing.JMenuItem();
        helpMenuOpen = new javax.swing.JMenuItem();

        label1.setText("label1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        searchContactTextField.setForeground(new java.awt.Color(153, 153, 153));
        searchContactTextField.setText("Search contacts...");
        searchContactTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchContactTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchContactTextFieldFocusLost(evt);
            }
        });

        openAddContButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        openAddContButton.setText("+");
        openAddContButton.setPreferredSize(new java.awt.Dimension(60, 25));
        openAddContButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAddContButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Add Contact");

        sortOptions.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A to Z", "Z to A" }));
        sortOptions.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sortOptionsItemStateChanged(evt);
            }
        });

        jLabel2.setText("Sort by:");

        contactsList.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        contactsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(contactsList);

        viewButton.setText("View Contact");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel4.setText("ver. 1.0");

        onGUISaveButton.setText("Save");
        onGUISaveButton.setToolTipText("");
        onGUISaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onGUISaveButtonActionPerformed(evt);
            }
        });

        onGUIDeleteButton.setText("Delete");
        onGUIDeleteButton.setToolTipText("");
        onGUIDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onGUIDeleteButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        fileMenuSort.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        fileMenuSort.setText("Sort");
        fileMenuSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuSortActionPerformed(evt);
            }
        });
        jMenu1.add(fileMenuSort);

        openSavedListButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        openSavedListButton.setText("Open File");
        openSavedListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openSavedListButtonActionPerformed(evt);
            }
        });
        jMenu1.add(openSavedListButton);

        saveListButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveListButton.setText("Save");
        saveListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveListButtonActionPerformed(evt);
            }
        });
        jMenu1.add(saveListButton);

        menuDeleteButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        menuDeleteButton.setText("Delete");
        menuDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteButtonActionPerformed(evt);
            }
        });
        jMenu1.add(menuDeleteButton);

        fileMenuCloseButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        fileMenuCloseButton.setText("Exit");
        fileMenuCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuCloseButtonActionPerformed(evt);
            }
        });
        jMenu1.add(fileMenuCloseButton);

        jMenuBar1.add(jMenu1);

        HelpMenu.setText("Help..");

        helpMenuBasicHelp.setText("How to use..");
        helpMenuBasicHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuBasicHelpActionPerformed(evt);
            }
        });
        HelpMenu.add(helpMenuBasicHelp);

        helpMenuSave.setText("Saving");
        helpMenuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuSaveActionPerformed(evt);
            }
        });
        HelpMenu.add(helpMenuSave);

        helpMenuOpen.setText("Opening/Loading");
        helpMenuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuOpenActionPerformed(evt);
            }
        });
        HelpMenu.add(helpMenuOpen);

        jMenuBar1.add(HelpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchContactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(onGUISaveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(onGUIDeleteButton)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(openAddContButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onGUISaveButton)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onGUIDeleteButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(searchContactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(openAddContButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(sortOptions))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewButton)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchContactTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchContactTextFieldFocusGained
        //if field has stock text, stock text is deleted and black is foreground color
        if(searchContactTextField.getText().equals("Search contacts...")){
            searchContactTextField.setText("");
            searchContactTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchContactTextFieldFocusGained

    private void searchContactTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchContactTextFieldFocusLost
        //if field is empty when focus is lost, then stock text is placed and gray foreground is set
        if(searchContactTextField.getText().equals("")){
            searchContactTextField.setText("Search contacts...");
            searchContactTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_searchContactTextFieldFocusLost

    private void fileMenuCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuCloseButtonActionPerformed
        //gives functionality to the Exit button in the top left File option
        this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_fileMenuCloseButtonActionPerformed

    
    
    
    private void openAddContButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAddContButtonActionPerformed
        //initialization of add dialog
        startAddContDialog();
    }//GEN-LAST:event_openAddContButtonActionPerformed
    private void startAddContDialog(){
        //new contact will have a unique ID
        lastUniqueID+=1;
        Contact temp = new Contact(lastUniqueID);
        
        initAddDialog(); //initializes the properties of the Add dialog
        
        //**** Code Pauses Here Until Dialog Closes****\\
        
        //WHEN the dialog closes, its data will still be accessable
        //below code sets temp contact's data to what was in addDialog
        temp.setContactName(addCont.getContactNameField());
        temp.setWorkPhone(addCont.getWorkPhoneField());
        temp.setHomePhone(addCont.getHomePhoneField());
        temp.setCellPhone(addCont.getCellPhoneField());
        temp.setWorkEmail(addCont.getWorkEmailField());
        temp.setPersonalEmail(addCont.getPersonalEmailField());
        temp.setAddress(addCont.getAddressField());
        temp.setCustomDescription(addCont.getCustomDescriptionField());
        
        //IF the add button was added, temp is added to the list, accessible via uniqueID
        //Else, it is discarded. List is reorderd.
        if(addCont.doAdd == true){
            listModel.addElement(temp);
            reOrderList();
        }
    }
    private void initAddDialog(){
        //initializes the properties of the Add dialog
        addCont = new AddContactDialog(this, true);
        addCont.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addCont.setTitle("Add a Contact");
        addCont.setLocationRelativeTo(null);
        addCont.setVisible(true);
    }
    
    
    
    
    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        //starts the edit dialog
        startEditContDialog();
    }//GEN-LAST:event_viewButtonActionPerformed
    private void startEditContDialog(){
        //checks if something is selected, warning if false
        //else, creates the dialog
        if( contactsList.isSelectionEmpty() ){
            JOptionPane.showMessageDialog(this, "Please choose a contact", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            editCont = new EditContactDialog(this,true);    //initializes the edit dialog
            Contact tempContact = contactsList.getSelectedValue();
            
            //the unique ID is used to find and edit the contact
            int uniqueID = tempContact.getID();
            initEditDialog(tempContact); //initializes properties of edit dialog
            
            //**** Code Pauses Here Until Dialog Closes****\\
            
            //if 'Save' button was pressed from dialog
            if(editCont.doAdd==true){
                editCont.newContact.setID(uniqueID);    //'newContact' is the Edit Dialog's internal contact
                //find index of item presorting, used for setElementAt()
                int index = findItemIndex(uniqueID);
                try{
                listModel.setElementAt(editCont.newContact, index);
                }catch(Exception ArrayIndexOutOfBoundsException){
                    JOptionPane.showMessageDialog(this, "An error has occurred.Contact doesn't exist.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                //reorders the list because of possible change
                reOrderList();
            }
        }
    }
    private int findItemIndex(int uniqueID){
        //finds the index of a contact with provided uniqueID
        for (int i = 0; i < listModel.getSize(); i++) {
            if(listModel.get(i).getID() == uniqueID)
                return i;
        }
        return -1;
    }
    private void initEditDialog(Contact tempContact){
        //initializes the edit dialog properties
        editCont.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        editCont.setTitle("Viewing " + contactsList.getSelectedValue().getContactName() +"'s contact");
        editCont.setContactNameField(tempContact.getContactName()); 
        editCont.setWorkPhoneField(tempContact.getWorkPhone());
        editCont.setHomePhoneField(tempContact.getHomePhone());
        editCont.setCellPhoneField(tempContact.getCellPhone());
        editCont.setWorkEmailField(tempContact.getWorkEmail());
        editCont.setPersonalEmailField(tempContact.getPersonalEmail());
        editCont.setAddressField(tempContact.getAddress());
        editCont.setCustomDescriptionField(tempContact.getCustomDescription());
        editCont.setVisible(true);
    }
    
    
    
    private void sortOptionsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sortOptionsItemStateChanged
        //fires reorder if sortOptions combo box changes, like from A to Z -> Z to A
        reOrderList();
    }//GEN-LAST:event_sortOptionsItemStateChanged

    private void fileMenuSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuSortActionPerformed
        //gives functionality to file menu's sort button
        reOrderList();
    }//GEN-LAST:event_fileMenuSortActionPerformed

    
    
    
    private void saveListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveListButtonActionPerformed
        try {
            save.saveListModel(listModel);                  //save object for organization
        } catch (IOException ex) {                          //see SaveData class for more
            System.out.println("Couldn't save file");
        } catch (Throwable ex) {
            Logger.getLogger(ContactGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveListButtonActionPerformed
    private void openSavedListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openSavedListButtonActionPerformed
        try {
            openSavedContacts();
        } catch (Throwable ex) {
            Logger.getLogger(ContactGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_openSavedListButtonActionPerformed

    
    
    
    private void helpMenuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuSaveActionPerformed
        JOptionPane.showMessageDialog(this, "Saving creates a file, called contacts, in the same folder the program is stored.", "How "
                + "Saving Works", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpMenuSaveActionPerformed
    private void helpMenuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuOpenActionPerformed
        JOptionPane.showMessageDialog(this, "Loading opens up the contacts file previously saved, as long as that file is in the same"
                + " folder as the program.", "How "
                + "Loading Works", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpMenuOpenActionPerformed
    private void helpMenuBasicHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuBasicHelpActionPerformed
        JOptionPane.showMessageDialog(this, "Add contacts with the big plus(+)! Choose a contact and click 'View Contact' to both see each contact"
                + " in greater detail. \n You can edit the contact here as well (hit save to save!). \n Try searching by name in the large textbox on top!", "How "
                + "To Use This Program", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpMenuBasicHelpActionPerformed

    
    
    
    private void onGUISaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onGUISaveButtonActionPerformed
        try {
            save.saveListModel(listModel);
        } catch (IOException ex) {
            System.out.println("Couldn't save file");
        } catch (Throwable ex) {
            Logger.getLogger(ContactGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_onGUISaveButtonActionPerformed
    
    
    
    
    private void openSavedContacts() throws Throwable{
        try {
                DefaultListModel<Contact> temp = read.getSavedList();   //loading is in an object for organization
                listModel = temp;                                       //see ReadData class for more
                contactsList.setModel(listModel);
                refreshLastID();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Couldn't load file. Ensure it is in the same folder as the application, and has not been modified.", "How "
                + "Loading Works", JOptionPane.INFORMATION_MESSAGE);
            }
    }
    public void refreshLastID(){
        //after contacts are loaded, the lastUniqueID field is updated to match
        //the largest ID from the contacts loaded.
        int lastID = -1;
        for (int i = 0; i < listModel.size(); i++) {
            if(listModel.get(i).getID() > lastID)
                lastID = listModel.get(i).getID();
        }
        lastUniqueID = lastID;
    }
    
    
    
    
    private void onGUIDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onGUIDeleteButtonActionPerformed
        deleteContact();
    }//GEN-LAST:event_onGUIDeleteButtonActionPerformed
    private void menuDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeleteButtonActionPerformed
        deleteContact();
    }//GEN-LAST:event_menuDeleteButtonActionPerformed
    private void deleteContact(){
        if( contactsList.isSelectionEmpty() ){  //checks if an item is selected
            JOptionPane.showMessageDialog(this, "Please choose a contact", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int toDeleteID = contactsList.getSelectedValue().getID(); //gets ID of contact to be deleted
            int index=-1;
            for (int i = 0; i < listModel.getSize(); i++) {           //finds index of that Contact via ID
                if(listModel.get(i).getID() == toDeleteID){
                    index=i;
                    break;
                }
            }
            listModel.remove(index);    //removes contact at index
            contactsList.setModel(listModel);   //refresh list
            reOrderList();                      //reorders list
        }
    }
    
    
    
 
    public void reOrderList(){
        //turns ListModel to an ArrayList, sorts that, then turns it back into a (sorted) ListModel
        contactsList.setModel(ArrayListToListModel(SortArrayList(ListModelToArrayList(listModel))));
    }
    public ArrayList<Contact> ListModelToArrayList(DefaultListModel<Contact> def){
        //takes a ListModel, def, and turns it into an ArrayList, temp
        ArrayList<Contact> temp = new ArrayList<>();
        for (int i = 0; i < def.size(); i++) {          
            temp.add(def.get(i));
        }
        return temp;
    }
    public DefaultListModel<Contact> ArrayListToListModel(ArrayList<Contact> def){
        //turns an ArrayList def, into ListModel, temp
        DefaultListModel<Contact> temp = new DefaultListModel<>();
        for (int i = 0; i < def.size(); i++) {
            temp.addElement(def.get(i));
        }
        return temp;
    }
    public ArrayList<Contact> SortArrayList(ArrayList<Contact> def){
        //Checks if Sort options drop down is in A to Z, sorts appropriately 
        if(((String)sortOptions.getSelectedItem()).equals("A to Z")){
            Collections.sort(def,Comparator.naturalOrder());
        }
        else{
            Collections.sort(def,Comparator.reverseOrder());
        }
        return def;
    }
 
    
    
    
    private void makeSearchFunction(){
        //adds an evt listener to the Document the text field relies on.
        //when anything happens to it, refreshContacts is called.
        searchContactTextField.getDocument().addDocumentListener(new DocumentListener(){
            public void changedUpdate(DocumentEvent e) {
              refreshContacts();
            }
            public void removeUpdate(DocumentEvent e) {
              refreshContacts();
            }
            public void insertUpdate(DocumentEvent e) {
              refreshContacts();
            }
            
            public void refreshContacts(){
                //if text field has default information or blank, the List 
                //displays the entire, unfilted ListModel.
                if(searchContactTextField.getText().trim().equals("") || searchContactTextField.getText().equals("Search contacts...")){
                    contactsList.setModel(listModel);
                }
                //if anything has been inserted, a ListModel is generated, filtered using
                //the String inside the search text field, and the List is set to display the filtered list
                else{
                    contactsList.setModel(filteredListModel(searchContactTextField.getText()));
                }
            }
        });
    }
    private DefaultListModel<Contact> filteredListModel(String filter){
        //creates a new ListModel where the Contacts within begin with
        //provided String filter
        DefaultListModel<Contact> newModel = new DefaultListModel<>();
        for (int i = 0; i < listModel.size(); i++) {
            if(listModel.get(i).getContactName().toUpperCase().startsWith(filter.toUpperCase())){
                newModel.addElement(listModel.get(i));
            }
        }
        
        return newModel;
    }
    
    

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ContactGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ContactGUI().setVisible(true);
                } catch (Throwable ex) {
                    Logger.getLogger(ContactGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JList<Contact> contactsList;
    private javax.swing.JMenuItem fileMenuCloseButton;
    private javax.swing.JMenuItem fileMenuSort;
    private javax.swing.JMenuItem helpMenuBasicHelp;
    private javax.swing.JMenuItem helpMenuOpen;
    private javax.swing.JMenuItem helpMenuSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JMenuItem menuDeleteButton;
    private javax.swing.JButton onGUIDeleteButton;
    private javax.swing.JButton onGUISaveButton;
    private javax.swing.JButton openAddContButton;
    private javax.swing.JMenuItem openSavedListButton;
    private javax.swing.JMenuItem saveListButton;
    private javax.swing.JTextField searchContactTextField;
    private javax.swing.JComboBox sortOptions;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
