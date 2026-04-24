
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public final class ordersJFrame221 extends javax.swing.JFrame {

    public ordersJFrame221() {
        initComponents();
        Connect();
        

        DefaultTableModel model = new DefaultTableModel(
                new String[]{"orderID ", "orderDATE", "customerName", "quantity", "totalAmount","paymentmethod"}, 0
        );
        ordertable.setModel(model);
        
        loadTable2();
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
            System.getLogger(ordersJFrame221.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(ordersJFrame221.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

    private void loadTable2() {
    try {
        // 1. Double-check your table name in phpMyAdmin is actually "orders"
        pst = con.prepareStatement("SELECT * FROM orders"); 
        rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel) ordertable.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            // These names MUST match the "Name" column in your screenshot exactly
            Object[] row = {
                rs.getInt("orderID"),         // Matches row 1 in screenshot
                rs.getString("orderDATE"),     // Matches row 2 in screenshot
                rs.getString("customerName"),  // Matches row 3 in screenshot
                rs.getInt("quantity"),        // Matches row 4 in screenshot
                rs.getDouble("totalAmount"),   // Matches row 5 in screenshot
                rs.getString("paymentmethod")  // Matches row 6 in screenshot
            };
            model.addRow(row);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Table Load Error: " + ex.getMessage());
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
        txtorderid = new javax.swing.JTextField();
        txtcastomername = new javax.swing.JTextField();
        txtquantity = new javax.swing.JTextField();
        txttotalamount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordertable = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtpaymentmethord = new javax.swing.JTextField();
        joderdate = new com.toedter.calendar.JDateChooser();

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
        jLabel1.setText("ORDER");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Order Date");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Castomer Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Amount");

        txtquantity.addActionListener(this::txtquantityActionPerformed);

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

        ordertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "order_ID", "order_date", "category_name", "quantity", "total_amount", "payment_methord"
            }
        ));
        ordertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ordertable);

        jButton5.setBackground(new java.awt.Color(0, 153, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("CLOSE");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Payment Methord");

        txtpaymentmethord.setText("\n");
        txtpaymentmethord.addActionListener(this::txtpaymentmethordActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttotalamount)
                    .addComponent(txtquantity)
                    .addComponent(txtcastomername)
                    .addComponent(txtorderid)
                    .addComponent(txtpaymentmethord, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(joderdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtorderid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(joderdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcastomername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttotalamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtpaymentmethord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
        // 1. Date Validation
        if (joderdate.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please select a date!");
            return;
        }

        // 2. Number Validation (Stops the "asdasd" crash)
        int quanity;
        double totalamount;
        try {
            quanity = Integer.parseInt(txtquantity.getText().trim());
            totalamount = Double.parseDouble(txttotalamount.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Quantity and Total Amount must be numbers!");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String orderdate = sdf.format(joderdate.getDate());
        String customerName = txtcastomername.getText();
        String paymontmethmethod = txtpaymentmethord.getText();

        // Fixed table name to 'orders' and columns to match database
        pst = con.prepareStatement(
    "INSERT INTO orders(orderDATE, customerName, quantity, totalAmount, paymentmethod) VALUES(?,?,?,?,?)"
);

        pst.setString(1, orderdate);
        pst.setString(2, customerName);
        pst.setInt(3, quanity);
        pst.setDouble(4, totalamount);
        pst.setString(5, paymontmethmethod);

        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Record Inserted Successfully!");
        loadTable2();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
        if (txtorderid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a record to delete!");
            return;
        }
        int orderid = Integer.parseInt(txtorderid.getText());
        pst = con.prepareStatement("DELETE FROM orders WHERE orderID=?"); // Fixed table name
        pst.setInt(1, orderid);
        pst.executeUpdate();
        
        JOptionPane.showMessageDialog(this, "Record Deleted!");
        loadTable2();
        jButton3ActionPerformed(null); // Clear fields

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
        // Validation for numbers to prevent crashes
        int orderid;
        int quanity;
        double totalamount;
        
        try {
            orderid = Integer.parseInt(txtorderid.getText());
            quanity = Integer.parseInt(txtquantity.getText().trim());
            totalamount = Double.parseDouble(txttotalamount.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID, Quantity, and Amount must be valid numbers!");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String orderdate = sdf.format(joderdate.getDate());
        String customerName = txtcastomername.getText(); // Keep your variable but map it correctly below
        String paymontmethmethod = txtpaymentmethord.getText();

        // --- FIX IS HERE ---
        // Changed 'categoryname' to 'customerName' to match your database screenshot
        pst = con.prepareStatement("UPDATE orders SET orderDATE=?, customerName=?, quantity=?, totalAmount=?, paymentmethod=? WHERE orderID =?");

        pst.setString(1, orderdate);
        pst.setString(2, customerName); // Maps to customerName column
        pst.setInt(3, quanity);
        pst.setDouble(4, totalamount);
        pst.setString(5, paymontmethmethod);
        pst.setInt(6, orderid);
        
        pst.executeUpdate();

        JOptionPane.showMessageDialog(this, "Record Updated Successfully!");
        loadTable2();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Update Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtorderid.setText("");
        joderdate.setDate(null);
        txtcastomername.setText("");
        txtquantity.setText("");
        txttotalamount.setText("");
        txtpaymentmethord.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ordertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordertableMouseClicked
          DefaultTableModel model = (DefaultTableModel) ordertable.getModel();
        int selectedIndex = ordertable.getSelectedRow();

        txtorderid.setText(model.getValueAt(selectedIndex, 0).toString());
        try {
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd")
                    .parse(model.getValueAt(selectedIndex, 1).toString());
            joderdate.setDate(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        txtcastomername.setText(model.getValueAt(selectedIndex, 2).toString());
        txtquantity.setText(model.getValueAt(selectedIndex, 3).toString());
        txttotalamount.setText(model.getValueAt(selectedIndex, 4).toString());
        txtpaymentmethord.setText(model.getValueAt(selectedIndex, 5).toString());
    

                       
    }//GEN-LAST:event_ordertableMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtpaymentmethordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaymentmethordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaymentmethordActionPerformed

    private void txtquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantityActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ordersJFrame221 frame = new ordersJFrame221();
        frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser joderdate;
    private javax.swing.JTable ordertable;
    private javax.swing.JTextField txtcastomername;
    private javax.swing.JTextField txtorderid;
    private javax.swing.JTextField txtpaymentmethord;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JTextField txttotalamount;
    // End of variables declaration//GEN-END:variables
}
