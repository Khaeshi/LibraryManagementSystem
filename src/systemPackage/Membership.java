package systemPackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Color;
import java.awt.event.KeyEvent;
import library_management_system.ui.LoginPage;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class Membership extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
        Connection con;
        PreparedStatement pstmt;
        ResultSet rs;
        
    public Membership() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Only to Fetch database Auto-Increment MemberID
        
        txtStud_ID.setEditable(false);
        txtStud_ID.setFocusable(false);
        txtStud_ID.setBackground(Color.gray);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAddMember = new javax.swing.JButton();
        btnRemoveMember = new javax.swing.JButton();
        btnEditAd = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnFetch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtStud_ID = new javax.swing.JTextField();
        cbDepartment = new javax.swing.JComboBox<>();
        txtFname = new javax.swing.JTextField();

        popupMenu1.setLabel("popupMenu1");

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

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT INFO");

        btnAddMember.setText("ADD");
        btnAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemberActionPerformed(evt);
            }
        });

        btnRemoveMember.setText("REMOVE");
        btnRemoveMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveMemberActionPerformed(evt);
            }
        });

        btnEditAd.setText("EDIT ADMIN");
        btnEditAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAdActionPerformed(evt);
            }
        });

        btnLogOut.setText("LOG OUT");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnFetch.setText("Fetch");
        btnFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Firstname");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Constitution Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lastname");

        txtLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLnameKeyPressed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STUDENT ID", "FIRSTNAME", "LASTNAME", "EMAIL", "ADRESS", "TYPE", "BORROWING ID"
            }
        ));
        jScrollPane2.setViewportView(jTable);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Student Year");

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st year", "2nd year", "3rd year", "4th year", "Masteral Level" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("College");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Student ID");

        txtStud_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStud_IDKeyPressed(evt);
            }
        });

        cbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSIT", "COMSCI", "BSBA", "BSA", "BAPOL", "CRIM", "PSYCH" }));

        txtFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFnameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditAd, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(txtStud_ID)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRemoveMember)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddMember))
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(txtLname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(cbYear, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFname, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFetch, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStud_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRemoveMember)
                                    .addComponent(btnAddMember))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFetch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditAd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(
            this, // Parent component (this refers to the current frame)
            "Are you sure you want to log out?",
            "Confirm Logout",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (option == JOptionPane.YES_OPTION) {
            // Perform logout actions here
            // Example: Close the application
            //System.exit(0); if you want to close the programm
            // Or:  Redirect to a login screen (more complex, requires additional code)
            LoginPage LoginPageForm = new LoginPage();
            LoginPageForm.setVisible(true);

            this.setVisible(false);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed
        // TODO add your handling code here:
        // Database connection details
    String url = "jdbc:mysql://localhost/mylibrarysystem";
    String user = "root";
    String pwd = "0213";
    
    
    String fname = txtFname.getText().trim(); 
    String lname = txtLname.getText().trim(); 
    String email = txtEmail.getText().trim();
    String address = txtAddress.getText().trim();
    String year = (String) cbYear.getSelectedItem(); // Get selected item from combo box
    String department = (String) cbDepartment.getSelectedItem();
 

    // Check if the input is blank
    if (fname.isEmpty() || lname.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the Member's name.");
        return; // Exit the method if input is blank
    } else if (email.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please enter Member's Contact.");
    return; 
    } else if (address.isEmpty()){
        JOptionPane.showMessageDialog(this, "Please enter Member's Email.");
    } else if (year == null) {
        JOptionPane.showMessageDialog(this, "Please select your year level.");
        return;
    } else if (department == null) {
        JOptionPane.showMessageDialog(this, "Please Enter your department.");
        return;
    }

    // SQL query using parameterized statements
    String query = "INSERT INTO students (fname, lname, email, address, year, department) VALUES (?, ?, ?, ?, ?, ?);"; 

    con = null;
    pstmt = null;
    
    // Check if the member is already registered
    String checkQuery = "SELECT 1 FROM students WHERE fname = ? AND lname = ? AND email = ?";
    try (Connection checkCon = DriverManager.getConnection(url, user, pwd);
         PreparedStatement checkPstmt = checkCon.prepareStatement(checkQuery)) {
        checkPstmt.setString(1, fname);
        checkPstmt.setString(2, lname);
        checkPstmt.setString(3, email);
        try (ResultSet checkRs = checkPstmt.executeQuery()) {
            if (checkRs.next()) {
                JOptionPane.showMessageDialog(this, "Member already exists.");
                return; // Exit if member exists
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error checking for existing member: " + e.getMessage());
        return; // Exit if there's an error checking
    }

    try {
        // Establish the connection
        con = DriverManager.getConnection(url, user, pwd);

        // Prepare the statement
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, fname); 
        pstmt.setString(2, lname);
        pstmt.setString(3, email);
        pstmt.setString(4, address);
        pstmt.setString(5, year);
        pstmt.setString(6, department);
        // Execute the update
        int rows = pstmt.executeUpdate();
        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "Student added successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add Student.");
        }
        
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    } finally {
        // Close resources in the finally block
        try {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    }//GEN-LAST:event_btnAddMemberActionPerformed

    private void btnFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchActionPerformed
        // TODO add your handling code here:
        //to Fetch the Data from the database, heres the configuration

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        String url = "jdbc:mysql://localhost/mylibrarysystem";
        String user = "root";
        String pwd = "0213";
        String query = "SELECT stud_ID, fname, lname, email, address, year, department FROM students";

        try {
            // Establish the connection
            con = DriverManager.getConnection(url, user, pwd);

            // Prepare the statement
            pstmt = con.prepareStatement(query);

            // Execute the query
            rs = pstmt.executeQuery();

            // Clear the existing rows in the table model
            model.setRowCount(0);

            // Process the result set
             while (rs.next()) {
            int studentId = rs.getInt("stud_ID");
            String fname = rs.getString("fname");
            String lname = rs.getString("lname");
            String email = rs.getString("email");
            String address = rs.getString("address");
            String year = rs.getString("year");
            String department = rs.getString("department");
            model.addRow(new Object[]{studentId, fname, lname, email, address, year, department});
        }

            // Close the resources
            rs.close();
            pstmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnFetchActionPerformed

    private void btnRemoveMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveMemberActionPerformed
                                                  
    // Database connection details
    String url = "jdbc:mysql://localhost/mylibrarysystem";
    String user = "root";
    String pwd = "0213";
    String input = txtFname.getText().trim(); // Trim whitespace from input

    // Check if the input is blank
    if (input.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the Member First name or Last name to remove.");
        return; // Exit the method if input is blank
    }

    // SQL query using parameterized statements
    String query = "DELETE FROM students WHERE fname = ? OR lname = ?;";

    con = null;
    pstmt = null;

    try {
        // Establish the connection
        con = DriverManager.getConnection(url, user, pwd);

        // Prepare the statement
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, input);
        pstmt.setString(2, input); 

        // Execute the update
        int rows = pstmt.executeUpdate();
        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "Member removed from Library");
        } else {
            JOptionPane.showMessageDialog(this, "No such member available");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    } finally {
        // Close resources in the finally block
        try {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    }//GEN-LAST:event_btnRemoveMemberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Dashboard DBForm = new Dashboard();
        DBForm.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnEditAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAdActionPerformed
        // TODO add your handling code here:
        Edit_Admin EA = new Edit_Admin();
        EA.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnEditAdActionPerformed

    private void txtStud_IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStud_IDKeyPressed
        // TODO add your handling code here:
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txtFname.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtStud_IDKeyPressed

    private void txtLnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLnameKeyPressed
        // TODO add your handling code here:
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txtEmail.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtLnameKeyPressed

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
       //
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtFnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFnameKeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txtLname.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtFnameKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txtAddress.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyPressed
        // TODO add your handling code here:
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        cbYear.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtAddressKeyPressed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnEditAd;
    private javax.swing.JButton btnFetch;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRemoveMember;
    private javax.swing.JComboBox<String> cbDepartment;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtStud_ID;
    // End of variables declaration//GEN-END:variables

    void setUser(String fname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
