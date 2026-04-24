
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public final class customesJFrame extends javax.swing.JFrame {

    public customesJFrame() {
        initComponents();
        Connect();
        

        DefaultTableModel model = new DefaultTableModel(
                new String[]{"customer_id", "fullname", "email", "phone", "address"}, 0
        );
        customertable.setModel(model);
        
        loadTable();
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
            System.getLogger(customesJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(customesJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

    private void loadTable() {

        try {
            pst = con.prepareStatement("SELECT * FROM customers");  // <-- your table name
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) customertable.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("customer_id"),
                    rs.getString("fullname"),
                    rs.getString("email"),
                    rs.getString("phone"),
                    rs.getString("address")
                };
                model.addRow(row);
            }
        } catch (SQLException ex) {
            System.getLogger(customesJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcustomerid = new javax.swing.JTextField();
        txtfullname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customertable = new javax.swing.JTable();
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
        jLabel1.setText("CUSTOMES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Full Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone No");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");

        txtfullname.addActionListener(this::txtfullnameActionPerformed);

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

        customertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Full name", "Email", "Phone No", "Address"
            }
        ));
        customertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customertable);

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
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(txtcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
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
            int customerid = Integer.parseInt(txtcustomerid.getText());
            String fullname = txtfullname.getText();
            String email = txtemail.getText();
            String phone = txtphone.getText();
            String address = txtaddress.getText();

            pst = con.prepareStatement(
                    "INSERT INTO customers(customer_id, fullname, email, phone, address) VALUES(?,?,?,?,?)"
            );

            pst.setInt(1, customerid);
            pst.setString(2, fullname);
            pst.setString(3, email);
            pst.setString(4, phone);
            pst.setString(5, address);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Record Inserted Successfully!");

            loadTable();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int customerid = Integer.parseInt(txtcustomerid.getText());
            pst = con.prepareStatement("DELETE FROM customers WHERE customer_id=?");
            pst.setInt(1, customerid);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Record Deleted Successfully!");
            loadTable();

        } catch (SQLException ex) {
            System.getLogger(customesJFrame.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfullnameActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            int customerid = Integer.parseInt(txtcustomerid.getText());
            String fullname = txtfullname.getText();
            String email = txtemail.getText();
            String phone = txtphone.getText();
            String address = txtaddress.getText();

            pst = con.prepareStatement("UPDATE customers SET fullname=?, email=?, phone=?, address=? WHERE customer_id=?");

            pst.setString(1, fullname);
            pst.setString(2, email);
            pst.setString(3, phone);
            pst.setString(4, address);
            pst.setInt(5, customerid);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Record Updated Successfully!");

            loadTable();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtcustomerid.setText("");
        txtfullname.setText("");
        txtemail.setText("");
        txtphone.setText("");
        txtaddress.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void customertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customertableMouseClicked
        DefaultTableModel model = (DefaultTableModel) customertable.getModel();
        int selectedIndex = customertable.getSelectedRow();

        txtcustomerid.setText(model.getValueAt(selectedIndex, 0).toString());
        txtfullname.setText(model.getValueAt(selectedIndex, 1).toString());
        txtemail.setText(model.getValueAt(selectedIndex, 2).toString());
        txtphone.setText(model.getValueAt(selectedIndex, 3).toString());
        txtaddress.setText(model.getValueAt(selectedIndex, 4).toString());

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_customertableMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        customesJFrame frame = new customesJFrame();
        frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customertable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcustomerid;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
