package sneakbytes;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableRowSorter;

public class Inventory extends javax.swing.JInternalFrame {

    public Inventory() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
       loadTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        options = new javax.swing.JPanel();
        logo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        modify = new javax.swing.JPanel();
        searchTextBox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        stocks = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        options.setPreferredSize(new java.awt.Dimension(250, 450));
        options.setLayout(new java.awt.BorderLayout());

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setPreferredSize(new java.awt.Dimension(250, 200));
        logo.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("src/main/resources/SneakbytesCircle(1).png"));
        logo.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SNEAKBYTES");
        logo.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        options.add(logo, java.awt.BorderLayout.PAGE_START);

        modify.setBackground(new java.awt.Color(255, 255, 255));
        modify.setPreferredSize(new java.awt.Dimension(250, 250));

        searchTextBox.setPreferredSize(new java.awt.Dimension(64, 25));
        searchTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextBoxActionPerformed(evt);
            }
        });
        searchTextBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextBoxKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Search");

        refreshButton.setBackground(new java.awt.Color(242, 242, 242));
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modifyLayout = new javax.swing.GroupLayout(modify);
        modify.setLayout(modifyLayout);
        modifyLayout.setHorizontalGroup(
            modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyLayout.createSequentialGroup()
                .addGroup(modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modifyLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(searchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(modifyLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(modifyLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel4)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        modifyLayout.setVerticalGroup(
            modifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(searchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
        );

        options.add(modify, java.awt.BorderLayout.CENTER);

        getContentPane().add(options);

        stocks.setPreferredSize(new java.awt.Dimension(550, 450));
        stocks.setLayout(new java.awt.BorderLayout());

        jTable2.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] { "Item", "Size", "Color", "Quantity", "Price" }
        ));
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jTable2.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        stocks.add(jPanel1, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        stocks.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(stocks);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextBoxActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        DefaultTableModel tM = (DefaultTableModel)jTable2.getModel();
        String filePath = "src/main/java/sneakbytes/buy.txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bf = new BufferedWriter(fw);

            for(int i = 0; i < tM.getRowCount(); i++){
                for(int j = 0; j < tM.getColumnCount(); j++){
                    bf.write(tM.getValueAt(i, j).toString() + " ");
                }
                bf.write("\n");
            }
            JOptionPane.showMessageDialog(this, "Refresh successful!");
            bf.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchTextBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextBoxKeyReleased
        DefaultTableModel tM = (DefaultTableModel)jTable2.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(tM);
        jTable2.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchTextBox.getText()));
    }//GEN-LAST:event_searchTextBoxKeyReleased
   
     private void loadTableData(){
        try {
    String filePath = "src/main/java/sneakbytes/buy.txt";
    File file = new File(filePath);
    Scanner scan = new Scanner(file);
    DefaultTableModel tM = (DefaultTableModel) jTable2.getModel();

    while (scan.hasNext()) {
        String input = scan.nextLine();
        String separate[] = input.split(" ");
        String toInput[] = { separate[0], separate[1], separate[2], separate[3], separate[4] };

        boolean found = false;

        for (int row = 0; row < tM.getRowCount(); row++) {
            if (toInput[0].equals(tM.getValueAt(row, 0)) &&
                    toInput[1].equals(tM.getValueAt(row, 1)) &&
                    toInput[2].equals(tM.getValueAt(row, 2)) &&
                    toInput[4].equals(tM.getValueAt(row, 4))) {

                int currentQuantity = Integer.parseInt(tM.getValueAt(row, 3).toString());
                int stringValue = Integer.parseInt(separate[3]);
                int summation = currentQuantity + stringValue;

                tM.setValueAt(summation, row, 3);
                found = true;
                break; // Stop further searching as the item is found
            }
            
        }

        if (!found) {
            tM.addRow(toInput); // Add a new row if the item is not found
        }
        for (int row = 0; row < tM.getRowCount(); row++) {
        if(Integer.parseInt(tM.getValueAt(row, 3).toString()) <= 0){
                    tM.removeRow(row); 
            }
        }
    }
    
} catch (IOException e) {
    Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, e);
}
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel modify;
    private javax.swing.JPanel options;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField searchTextBox;
    private javax.swing.JPanel stocks;
    // End of variables declaration//GEN-END:variables
}
