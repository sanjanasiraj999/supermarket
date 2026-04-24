
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public final class catagoryJFrame1 extends javax.swing.JFrame {

    public catagoryJFrame1() {
        initComponents();
        Connect();

        DefaultTableModel model = new DefaultTableModel(
                new String[]{"categoryid ", "categoryname"}, 0
        );
        categorytable.setModel(model);

        loadTable3();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/marketdb", "root", "");
            System.out.println("Connected to Database");
        } catch (ClassNotFoundException ex) {
            System.getLogger(catagoryJFrame1.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(catagoryJFrame1.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

    private void loadTable3() {
        try {
            pst = con.prepareStatement("SELECT * FROM categories"); // Changed to categories
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) categorytable.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("categoryid"),
                    rs.getString("categoryname")
                };
                model.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcategoryid = new javax.swing.JTextField();
        txtcategoryname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        categorytable = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("CATEGORY");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CategoryID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category Name");

        txtcategoryname.addActionListener(this::txtcategorynameActionPerformed);

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setBackground(new java.awt.Color(51, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("INSERT");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setBackground(new java.awt.Color(51, 153, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        categorytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "categoryid", "categoryname"
            }
        ));
        categorytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categorytableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categorytable);

        jButton5.setBackground(new java.awt.Color(0, 153, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("CLOSE");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcategoryname, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcategoryid, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcategoryid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcategoryname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            String categoryname = txtcategoryname.getText().trim();

            // 1. Validation
            if (categoryname.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a Category Name!");
                return;
            }

            // 2. Prepare Statement (Only targeting the name column)
            // Ensure your database table 'categories' has 'categoryid' set to AUTO_INCREMENT
            pst = con.prepareStatement("INSERT INTO categories(categoryname) VALUES(?)");
            pst.setString(1, categoryname);

            // 3. Execution
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Category Added Successfully!");

            // 4. Reset UI
            txtcategoryname.setText("");
            txtcategoryid.setText(""); // Clear ID field so you don't accidentally delete later
            loadTable3(); // Refresh the JTable to show the new entry

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String idText = txtcategoryid.getText().trim();

            if (idText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Select a category first!");
                return;
            }

            int catid = Integer.parseInt(idText);

            // Ensure table is 'categories' and column is 'categoryid' (no spaces)
            pst = con.prepareStatement("DELETE FROM categories WHERE categoryid = ?");
            pst.setInt(1, catid);

            int result = pst.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Deleted Successfully!");
                txtcategoryid.setText("");
                txtcategoryname.setText("");
                loadTable3(); // This refreshes the table so the row vanishes
            }

        } catch (SQLException ex) {
            // This will tell us if it's a table name issue or a column name issue
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid ID.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcategorynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcategorynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcategorynameActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            int categoryid;
            try {
                categoryid = Integer.parseInt(txtcategoryid.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "ID must be a valid number!");
                return;
            }

            String categoryname = txtcategoryname.getText();

            // FIX: Use a WHERE clause so you only update the specific record
            pst = con.prepareStatement("UPDATE categories SET categoryname = ? WHERE categoryid = ?");

            // 1 is the first '?', 2 is the second '?'
            pst.setString(1, categoryname);
            pst.setInt(2, categoryid);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Record Updated Successfully!");
                loadTable3();
            } else {
                JOptionPane.showMessageDialog(this, "No record found with that ID.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Update Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtcategoryid.setText("");
        txtcategoryname.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void categorytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorytableMouseClicked
        DefaultTableModel model = (DefaultTableModel) categorytable.getModel();
        int selectedIndex = categorytable.getSelectedRow();

        txtcategoryid.setText(model.getValueAt(selectedIndex, 0).toString());
        txtcategoryname.setText(model.getValueAt(selectedIndex, 1).toString());

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_categorytableMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        catagoryJFrame1 frame = new catagoryJFrame1();
        frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable categorytable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcategoryid;
    private javax.swing.JTextField txtcategoryname;
    // End of variables declaration//GEN-END:variables
}
