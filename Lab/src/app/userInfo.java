
package app;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;





public class userInfo extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(userInfo.class.getName());
    
     //DATABASE CREDENTIALS
     public  String dbURL = "jdbc:mysql://localhost:3306/mydb";
     public  String dbUserName= "root";
     public  String password = "";

    public userInfo() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uId = new javax.swing.JTextField();
        uName = new javax.swing.JTextField();
        uEmail = new javax.swing.JTextField();
        uPhone = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        view = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel1.setText("User Id");

        jLabel2.setText("User Name");

        jLabel3.setText("Email");

        jLabel4.setText("Phone");

        uId.addActionListener(this::uIdActionPerformed);

        uName.addActionListener(this::uNameActionPerformed);

        uPhone.setToolTipText("");

        insert.setText("Insert");
        insert.addActionListener(this::insertActionPerformed);

        update.setText("Update");
        update.addActionListener(this::updateActionPerformed);

        delete.setText("Delete");
        delete.addActionListener(this::deleteActionPerformed);

        view.setText("View");
        view.addActionListener(this::viewActionPerformed);

        clear.setText("Clear ");
        clear.addActionListener(this::clearActionPerformed);

        Exit.setText("Exit");
        Exit.addActionListener(this::ExitActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exit)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uName)
                                    .addComponent(uEmail)
                                    .addComponent(uPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uId, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(insert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(delete)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(view)
                            .addComponent(clear))))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(uId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(uEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(uPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(update)
                    .addComponent(insert)
                    .addComponent(view))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(Exit))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uIdActionPerformed

    private void uNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        //check the id feild is not null
        if ("".equals(uId.getText())) {
    JOptionPane.showMessageDialog(null, "Please enter the User ID to delete.");
                    } else {

    int response = JOptionPane.showConfirmDialog(null, 
            "Are you sure you want to delete this record?", 
            "Confirm Deletion", 
            JOptionPane.YES_NO_OPTION);


    if (response == JOptionPane.YES_OPTION) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, dbUserName, password);
            
            
            // delete- sql command 
            String sql = "DELETE FROM userinfo WHERE userid = ?";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, uId.getText());
            
            
            // executeUpdate returns an integer representing how many rows were deleted
            int rowsAffected = pst.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Record deleted successfully!");
                
                //Clear the fields after deletion
                uId.setText("");
                uName.setText("");
                uEmail.setText("");
                uPhone.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Delete failed. User ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
    }//GEN-LAST:event_deleteActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
       //get user info 
       String userId = uId.getText();
       String userName= uName.getText();
       String email = uEmail.getText();
       String phone = uPhone.getText();
       //initial query for sql insert command 
       String query;
       //initial checkQuery for id exist
       String checkQuery;
      
       
       //Load Driver
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL,dbUserName,password);
            if(conn!= null){
                System.out.println("Connected successfully");
            }else{
                System.out.println("Error on connection");
            }
            
            //statement 
            Statement stmt = conn.createStatement();
            
            if("".equals(uId.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"User Id can't be Blank","Error",JOptionPane.ERROR_MESSAGE);
            }else if("".equals(uName.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"User Name can't be Blank","Error",JOptionPane.ERROR_MESSAGE);
            }else if("".equals(uEmail.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"User Email can't be Blank","Error",JOptionPane.ERROR_MESSAGE);
            }else if("".equals(uPhone.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"User Phone can't be Blank","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                
                //check if ID exists
                checkQuery = "SELECT * FROM userinfo WHERE userid = '" + uId.getText() + "'";
                ResultSet rs = stmt.executeQuery(checkQuery);
                
                if(rs.next()){
                JOptionPane.showMessageDialog(null, "This User ID already exists! Please choose another.", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    //insert user info into database
                    query ="INSERT INTO userinfo VALUES('"+userId+"','"+userName+"','"+email+"','"+phone+"')";
                stmt.executeUpdate(query);
                
                //clear all input field 
                uId.setText("");
                uName.setText("");
                uEmail.setText("");
                uPhone.setText("");
                
               showMessageDialog(null,"Successfully Added");
                }
                
                //close connection 
                conn.close();
            }
           
       }catch(Exception e){
         JOptionPane.showMessageDialog(null, e.getMessage());
       }
       
        
        
    }//GEN-LAST:event_insertActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
         try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbURL, dbUserName, password);
        Statement stmt = conn.createStatement();
        
        //select user from database table
        String query = "SELECT * FROM userinfo";
        ResultSet rs = stmt.executeQuery(query);
        
        //create  table modal for ui 
        DefaultTableModel model = new DefaultTableModel();
        
        //create column for the table of ui
        model.addColumn("User ID");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Phone");
        
        //loop through database
        boolean foundData = false;
        while (rs.next()) {
            foundData = true;
            model.addRow(new Object[]{
                rs.getString("userid"),
                rs.getString("name"),  
                rs.getString("email"),
                rs.getString("phone")
            });
        }
        
        if (!foundData) {
            JOptionPane.showMessageDialog(null, "No records found in the database.");
        } else {
            //create the table element
            JTable tempTable = new JTable(model);
            
            //prevent users from editing the table 
            tempTable.setDefaultEditor(Object.class, null);
            
            
            //enables scrolling if you have many users
            JScrollPane scrollPane = new JScrollPane(tempTable);
            
            //set the size of the popup window 
            scrollPane.setPreferredSize(new Dimension(600, 300));
            
            //show the popup table 
            JOptionPane.showMessageDialog(null, scrollPane, "All User Records", JOptionPane.PLAIN_MESSAGE);
        }

        conn.close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
           
    }//GEN-LAST:event_viewActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
                //clear all user input field on ui
                uId.setText("");
                uName.setText("");
                uEmail.setText("");
                uPhone.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        //check the id feild is not null
         if ("".equals(uId.getText())) {
                      JOptionPane.showMessageDialog(null, "Please enter the User ID you want to update.");
             }  else {
      
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbURL, dbUserName, password);
        
        // get the current data first
        String selectSql = "SELECT * FROM userinfo WHERE userid = ?";
        PreparedStatement selectPst = conn.prepareStatement(selectSql);
        selectPst.setString(1, uId.getText());
        ResultSet rs = selectPst.executeQuery();
        
        if (rs.next()) {
           
            //get old info 
            String oldName = rs.getString("name");
            String oldEmail = rs.getString("email");
            String oldPhone = rs.getString("phone"); 
           
            //update info if needed
            String finalName;
            if ("".equals(uName.getText())) {
                finalName = oldName; 
            } else {
                finalName = uName.getText(); 
            }
            
         
            String finalEmail;
            if ("".equals(uEmail.getText())) {
                finalEmail = oldEmail;
            } else {
                finalEmail = uEmail.getText();
            }
            
            
            String finalPhone;
            if ("".equals(uPhone.getText())) {
                finalPhone = oldPhone; 
            } else {
                finalPhone = uPhone.getText(); 
            }
            
            // perform the update with the "Final" values
            String updateSql = "UPDATE userinfo SET name=?, email=?, phone=? WHERE userid=?";
            PreparedStatement updatePst = conn.prepareStatement(updateSql);
            
            updatePst.setString(1, finalName);
            updatePst.setString(2, finalEmail);
            updatePst.setString(3, finalPhone);
            updatePst.setString(4, uId.getText());
            
            updatePst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Information Updated Successfully!");
            
           
            uId.setText("");
            uName.setText("");
            uEmail.setText("");
            uPhone.setText("");
            
        } else {
            // If rs.next() is false, the ID doesn't exist
            JOptionPane.showMessageDialog(null, "Update Failed. User ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        conn.close();
        
    } catch (HeadlessException | ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}
    }//GEN-LAST:event_updateActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new userInfo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField uEmail;
    private javax.swing.JTextField uId;
    private javax.swing.JTextField uName;
    private javax.swing.JTextField uPhone;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
