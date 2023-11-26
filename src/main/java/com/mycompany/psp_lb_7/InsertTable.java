package com.mycompany.psp_lb_7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable extends javax.swing.JFrame {
    private MyDBConnection mdbc;
    private Statement stmt;
    private EditDialog dlg;
    
    public InsertTable() {
        try{
            mdbc = new MyDBConnection();
            mdbc.init();
            Connection conn = mdbc.getMyConnection();
            stmt = conn.createStatement();
            dlg =  new EditDialog(this, true);
        } catch(Exception e){}
        initComponents();
    }

    public ResultSet getResultFromCars(){
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM cars;");
        } catch(SQLException e){}
        return rs;
    }

    public ResultSet getResultFromProducts(){
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM product;");
        } catch(SQLException e){}
        return rs;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CarIDLabel = new javax.swing.JLabel();
        CarNameLabel = new javax.swing.JLabel();
        CarTypeLabel = new javax.swing.JLabel();
        CarVendorLabel = new javax.swing.JLabel();
        ProductIDField = new javax.swing.JTextField();
        ProdNameField = new javax.swing.JTextField();
        ProdPriceField = new javax.swing.JTextField();
        SendButton = new javax.swing.JButton();
        CommentLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProdTable = new javax.swing.JTable();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ProdAmountField = new javax.swing.JTextField();
        ProdYearField = new javax.swing.JTextField();
        ProdYearLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        CarIDLabel.setText("ProductID");

        CarNameLabel.setText("Name");

        CarTypeLabel.setText("Price");

        CarVendorLabel.setText("Amount");

        SendButton.setText("Send");
        SendButton.setToolTipText("");
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });

        CommentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CommentLabel.setText("Click the button to send data");

        ResultSet rs = getResultFromProducts();
        ProdTable.setModel(new ProdTableModel(rs));
        mdbc.close(rs);
        ProdTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProdTable);

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ProdYearLabel.setText("Year");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CommentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(97, 97, 97)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(SendButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CarTypeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CarNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CarIDLabel)
                                .addComponent(CarVendorLabel)
                                .addComponent(ProdYearLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ProdNameField)
                                .addComponent(ProductIDField)
                                .addComponent(ProdPriceField)
                                .addComponent(ProdAmountField)
                                .addComponent(ProdYearField, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarIDLabel)
                    .addComponent(ProductIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarNameLabel)
                    .addComponent(ProdNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarTypeLabel)
                    .addComponent(ProdPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarVendorLabel)
                    .addComponent(ProdAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProdYearLabel)
                    .addComponent(ProdYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(SendButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CommentLabel)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setBounds(0, 0, 414, 607);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            mdbc.close(stmt.getResultSet());
            mdbc.destroy();
        } catch (SQLException ex){}
    }//GEN-LAST:event_formWindowClosing

    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButtonActionPerformed
        String ProdID = ProductIDField.getText();
        String ProdName = ProdNameField.getText();
        String ProdPrice = ProdPriceField.getText();
        String ProdAmount = ProdAmountField.getText();
        String ProdYear = ProdYearField.getText();
        String insertStr;
        try{
            insertStr = "INSERT INTO product VALUES ("
                + quotate(ProdID) + ","
                + quotate(ProdName) + ","
                + quotate(ProdPrice) + ","                
                + quotate(ProdAmount) + ","
                + quotate(ProdYear) + ")";
            int done = stmt.executeUpdate(insertStr);
            CommentLabel.setText("1 row inserted");
            getContentPane().removeAll();
            initComponents();
        } catch(SQLException e) {
            CommentLabel.setText("Error occured in inserting data");
       }
    }//GEN-LAST:event_SendButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        String ProdID = (String)ProdTable.getValueAt(ProdTable.getSelectedRow(), 0);
        String insertStr;
        try{
            insertStr = "DELETE FROM product WHERE ProductId=" + ProdID;
            int done = stmt.executeUpdate(insertStr);
            CommentLabel.setText("1 row deleted");
            getContentPane().removeAll();
            initComponents();
        } catch(SQLException e){
            CommentLabel.setText("Error occured in deleting data");
        }

    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        dlg.setProdID((String)ProdTable.getValueAt(ProdTable.getSelectedRow(), 0));
        dlg.setProdName((String)ProdTable.getValueAt(ProdTable.getSelectedRow(), 1));
        dlg.setProdPrice((String)ProdTable.getValueAt(ProdTable.getSelectedRow(), 2));
        dlg.setProdAmount((String)ProdTable.getValueAt(ProdTable.getSelectedRow(), 3));
        dlg.setProdYear((String)ProdTable.getValueAt(ProdTable.getSelectedRow(), 4));
        dlg.setVisible(true);
        try {
            String insertStr = "UPDATE product SET ProductId="
                + quotate(dlg.getProdID()) +  "WHERE ProductId =" + (String)ProdTable.getValueAt(ProdTable.getSelectedRow(), 0);
            int done = stmt.executeUpdate(insertStr);
            insertStr = "UPDATE product SET Name="
                + quotate(dlg.getProdName()) +  "WHERE ProductId =" + (String)ProdTable.getValueAt(ProdTable.getSelectedRow(), 0);
            done = stmt.executeUpdate(insertStr);
            insertStr = "UPDATE product SET Price="
                + quotate(dlg.getProdPrice()) +  "WHERE ProductId =" + (String)ProdTable.getValueAt(ProdTable.getSelectedRow(), 0);
            done = stmt.executeUpdate(insertStr);
            insertStr = "UPDATE product SET Amount="
                + quotate(dlg.getProdAmount()) +  "WHERE ProductId =" + (String)ProdTable.getValueAt(ProdTable.getSelectedRow(), 0);
            done = stmt.executeUpdate(insertStr);
            insertStr = "UPDATE product SET Year="
                + quotate(dlg.getProdYear()) +  "WHERE ProductId =" + (String)ProdTable.getValueAt(ProdTable.getSelectedRow(), 0);
            done = stmt.executeUpdate(insertStr);
            getContentPane().removeAll();
            initComponents();
        } catch(SQLException e) {
            System.out.println("Error occured in editing data");
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void ProdTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdTableMouseClicked
        // TODO add your handling code here:
        if(ProdTable.getSelectedRowCount() > 0) {
            EditButton.setEnabled(true);
            DeleteButton.setEnabled(true);
        } else {
            EditButton.setEnabled(false);
            DeleteButton.setEnabled(false);
        }
    }//GEN-LAST:event_ProdTableMouseClicked

    public String quotate(String content) {
        return " ' " + content + " ' ";
    }
    
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
            java.util.logging.Logger.getLogger(InsertTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InsertTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CarIDLabel;
    private javax.swing.JLabel CarNameLabel;
    private javax.swing.JLabel CarTypeLabel;
    private javax.swing.JLabel CarVendorLabel;
    private javax.swing.JLabel CommentLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField ProdAmountField;
    private javax.swing.JTextField ProdNameField;
    private javax.swing.JTextField ProdPriceField;
    private javax.swing.JTable ProdTable;
    private javax.swing.JTextField ProdYearField;
    private javax.swing.JLabel ProdYearLabel;
    private javax.swing.JTextField ProductIDField;
    private javax.swing.JButton SendButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
