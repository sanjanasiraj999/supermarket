
import java.sql.*;
import javax.swing.*;


public class dashbordJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(dashbordJFrame.class.getName());

    
    public dashbordJFrame() {
        initComponents();
        display1();
        display2();
        display3();
    }

       private void display1(){
       
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        
        try {
            // Establish connection
            con = DriverManager.getConnection("jdbc:mysql://localhost/marketdb","root","");
            statement = con.createStatement();

            // Execute query
            String query = "SELECT COUNT(*) AS total FROM customers";
            resultSet = statement.executeQuery(query);

            // Process result
            if (resultSet.next()) {
                int count = resultSet.getInt("total");
                count1.setText("Total customers: " + count);
            }
        } catch (Exception e) {
            e.printStackTrace();
            count1.setText("Error fetching count");
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
       }
       
       private void display2(){
       
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        
        try {
            // Establish connection
            con = DriverManager.getConnection("jdbc:mysql://localhost/marketdb","root","");
            statement = con.createStatement();

            // Execute query
            String query = "SELECT COUNT(*) AS total FROM products";
            resultSet = statement.executeQuery(query);

            // Process result
            if (resultSet.next()) {
                int count = resultSet.getInt("total");
                count2.setText("Total products: " + count);
            }
        } catch (Exception e) {
            e.printStackTrace();
            count2.setText("Error fetching count");
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
       
       private void display3(){
       
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        
        try {
            // Establish connection
            con = DriverManager.getConnection("jdbc:mysql://localhost/marketdb","root","");
            statement = con.createStatement();

            // Execute query
            String query = "SELECT COUNT(*) AS total FROM orders";
            resultSet = statement.executeQuery(query);

            // Process result
            if (resultSet.next()) {
                int count = resultSet.getInt("total");
                count3.setText("Total orders: " + count);
            }
        } catch (Exception e) {
            e.printStackTrace();
            count3.setText("Error fetching count");
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        count2 = new javax.swing.JLabel();
        count1 = new javax.swing.JLabel();
        count3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Admin Dash  Board");

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        count2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        count2.setForeground(new java.awt.Color(51, 153, 0));
        count2.setText("jLabel5");

        count1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        count1.setForeground(new java.awt.Color(51, 153, 0));
        count1.setText("jLabel5");

        count3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        count3.setForeground(new java.awt.Color(51, 153, 0));
        count3.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(count2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(count3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(count1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(count2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(count3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
        java.awt.EventQueue.invokeLater(() -> new dashbordJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel count1;
    private javax.swing.JLabel count2;
    private javax.swing.JLabel count3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void dsipose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
