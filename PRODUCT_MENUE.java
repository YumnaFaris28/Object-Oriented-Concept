package com.mycompany.greenmanagement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class PRODUCT_MENUE extends javax.swing.JFrame {

    private DefaultTableModel productTabale;
    private boolean isManager;
    private String userRole;
    private ProductManager productManager;
    private ArrayList<Product> products;

    public PRODUCT_MENUE(String role, boolean isManager) {
        
        this.isManager = isManager;
        this.userRole = role;
        initComponents();
        setupRoleBasedAccess();
        initializeTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProduct_ID = new javax.swing.JTextField();
        txtProduct_Name = new javax.swing.JTextField();
        cmbCategory = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        cmdADD = new javax.swing.JButton();
        cmdLOGOUT = new javax.swing.JButton();
        cmdREFRESH = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel1.setText("Product_Menue");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Product_ID :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Product_Name :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Search category:");

        txtProduct_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProduct_IDActionPerformed(evt);
            }
        });

        txtProduct_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProduct_NameActionPerformed(evt);
            }
        });

        cmbCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "electronics", "grocery" }));
        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "price"
            }
        ));
        jScrollPane1.setViewportView(ProductTable);

        cmdADD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdADD.setText("ADD");
        cmdADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdADDActionPerformed(evt);
            }
        });

        cmdLOGOUT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdLOGOUT.setText("LOGOUT");
        cmdLOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLOGOUTActionPerformed(evt);
            }
        });

        cmdREFRESH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdREFRESH.setText("REFRESH");
        cmdREFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdREFRESHActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Price :");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProduct_ID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProduct_Name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cmdADD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdREFRESH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdLOGOUT))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtProduct_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtProduct_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdLOGOUT)
                            .addComponent(cmdREFRESH)
                            .addComponent(cmdADD))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setupRoleBasedAccess() {
        System.out.println("DEBUG: Role = " + userRole + ", isManager = " + isManager);

        boolean hasManagerAccess = isManager || "manager".equalsIgnoreCase(userRole);

        if (!hasManagerAccess) {
            // Non-manager view
            JOptionPane.showMessageDialog(this,
                    "View Mode: You can only view products. Manager access required for modifications.",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE);

            cmdADD.setEnabled(false);
            cmdADD.setText("ADD (Manager Only)");
            setTitle("Product Menu - View Only Mode");

            txtProduct_ID.setEnabled(false);
            txtProduct_Name.setEnabled(false);
            cmbCategory.setEnabled(false);
            txtPrice.setEnabled(false);
        } else {
            // Manager view
            cmdADD.setEnabled(true);
            cmdADD.setText("ADD");
            setTitle("Product Menu - Manager Mode");

            txtProduct_ID.setEnabled(true);
            txtProduct_Name.setEnabled(true);
            cmbCategory.setEnabled(true);
            txtPrice.setEnabled(true);
        }

        // Initialize product manager (for both managers and viewers)
        productManager = new ProductManager();
        products = productManager.getAllProducts();
    }

    private void initializeTable() {
        DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
        model.setRowCount(0); // Clear existing data

        // Load products into table
        for (Product product : products) {
            model.addRow(new Object[]{
                product.getProductID(),
                product.getProductName(),
                product.getCategory(),
                String.format("$%.2f", product.getPrice())
            });
        }
    }

    // Inner Product class
    class Product {

        private String productID;
        private String productName;
        private String category;
        private double price;

        public Product(String productID, String productName, String category, double price) {
            this.productID = productID;
            this.productName = productName;
            this.category = category;
            this.price = price;
        }

        public String getProductID() {
            return productID;
        }

        public String getProductName() {
            return productName;
        }

        public String getCategory() {
            return category;
        }

        public double getPrice() {
            return price;
        }
    }

    // Inner ProductManager class
    class ProductManager {

        private ArrayList<Product> products;

        public ProductManager() {
            products = new ArrayList<>();
            // Add sample products
            loadSampleProducts();
        }

        private void loadSampleProducts() {
            products.add(new Product("P001", "Laptop", "electronics", 999.99));
            products.add(new Product("P002", "Smartphone", "electronics", 699.99));
            products.add(new Product("P003", "Milk", "grocery", 2.99));
            products.add(new Product("P004", "Bread", "grocery", 1.99));
        }

        public ArrayList<Product> getAllProducts() {
            return products;
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public boolean productIdExists(String productId) {
            for (Product p : products) {
                if (p.getProductID().equalsIgnoreCase(productId)) {
                    return true;
                }
            }
            return false;
        }
    }


    private void cmdLOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLOGOUTActionPerformed
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to logout?",
                "Confirm Logout",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirm == JOptionPane.YES_OPTION) {

            this.dispose();

            try {

                JOptionPane.showMessageDialog(
                        this,
                        "Logged out successfully!",
                        "Logout",
                        JOptionPane.INFORMATION_MESSAGE
                );

                this.dispose();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(
                        this,
                        "Error during logout: " + ex.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

    }//GEN-LAST:event_cmdLOGOUTActionPerformed


    private void cmdADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdADDActionPerformed
        // Check if user has manager access
        if (!isManager && !"manager".equalsIgnoreCase(userRole)) {
            JOptionPane.showMessageDialog(this,
                    "Access Denied! Only Product Managers can add products.",
                    "Authorization Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String productId = txtProduct_ID.getText().trim();
        String productName = txtProduct_Name.getText().trim();
        String category = cmbCategory.getSelectedItem().toString();
        String priceText = txtPrice.getText().trim();

        // Validation
        if (productId.isEmpty() || productName.isEmpty() || priceText.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please fill in all required fields!",
                    "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check for duplicate product ID
        if (productManager.productIdExists(productId)) {
            JOptionPane.showMessageDialog(this,
                    "Product ID already exists! Please use a different ID.",
                    "Duplicate Error",
                    JOptionPane.ERROR_MESSAGE);
            txtProduct_ID.requestFocus();
            txtProduct_ID.selectAll();
            return;
        }

        try {
            // Parse price
            double price = Double.parseDouble(priceText);

            if (price <= 0) {
                JOptionPane.showMessageDialog(this,
                        "Price must be a positive number!",
                        "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
                txtPrice.requestFocus();
                txtPrice.selectAll();
                return;
            }

            // Create new product
            Product newProduct = new Product(productId, productName, category, price);

            // Add to product manager
            productManager.addProduct(newProduct);

            // Add to table
            DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
            model.addRow(new Object[]{
                newProduct.getProductID(),
                newProduct.getProductName(),
                newProduct.getCategory(),
                String.format("$%.2f", newProduct.getPrice())
            });

            JOptionPane.showMessageDialog(this,
                    "Product added successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);

            clearForm();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Invalid price format! Please enter a valid number.",
                    "Format Error",
                    JOptionPane.ERROR_MESSAGE);
            txtPrice.requestFocus();
            txtPrice.selectAll();
        }
    }

    private void clearForm() {
        txtProduct_ID.setText("");
        txtProduct_Name.setText("");
        cmbCategory.setSelectedIndex(0);
        txtPrice.setText("");
        txtProduct_ID.requestFocus();

    }//GEN-LAST:event_cmdADDActionPerformed

    private void txtProduct_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProduct_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProduct_IDActionPerformed

    private void txtProduct_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProduct_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProduct_NameActionPerformed

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoryActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void cmdREFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdREFRESHActionPerformed
        try {
            clearForm();

            JOptionPane.showMessageDialog(
                    this,
                    "Form refreshed successfully!",
                    "Refresh",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error refreshing form: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_cmdREFRESHActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Test with manager access
                new PRODUCT_MENUE("manager", true).setVisible(true);

                // Or test with non-manager access
                // new PRODUCT_MENUE("user", false).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProductTable;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JButton cmdADD;
    private javax.swing.JButton cmdLOGOUT;
    private javax.swing.JButton cmdREFRESH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProduct_ID;
    private javax.swing.JTextField txtProduct_Name;
    // End of variables declaration//GEN-END:variables

}
