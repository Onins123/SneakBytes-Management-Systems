
package sneakbytes;
import java.awt.Color;

public class Main extends javax.swing.JFrame {
    
    Color DefaultColor, ClickedColor;
    public Main() {
        initComponents();
        DefaultColor=new Color(102,102,102);
        ClickedColor=new Color(153,153,153);
        
        //Set Color to Default
        jProducts.setBackground(DefaultColor);
        jBuySell.setBackground(DefaultColor);
        jWallet.setBackground(DefaultColor);
        jAccounts.setBackground(DefaultColor);
        jLogOut.setBackground(DefaultColor);
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jProducts = new javax.swing.JPanel();
        jP = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLO1 = new javax.swing.JLabel();
        jBuySell = new javax.swing.JPanel();
        jBS = new javax.swing.JLabel();
        jWallet = new javax.swing.JPanel();
        jW = new javax.swing.JLabel();
        jAccounts = new javax.swing.JPanel();
        jA = new javax.swing.JLabel();
        jLogOut = new javax.swing.JPanel();
        jLO = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        jProducts.setBackground(new java.awt.Color(102, 102, 102));
        jProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProductsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jProductsMousePressed(evt);
            }
        });

        jP.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jP.setForeground(new java.awt.Color(255, 255, 255));
        jP.setIcon(new javax.swing.ImageIcon("src/main/resources/1.png"));
        jP.setText(" Products");

        javax.swing.GroupLayout jProductsLayout = new javax.swing.GroupLayout(jProducts);
        jProducts.setLayout(jProductsLayout);
        jProductsLayout.setHorizontalGroup(
            jProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProductsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jProductsLayout.setVerticalGroup(
            jProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        jLO1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLO1.setForeground(new java.awt.Color(255, 255, 255));
        jLO1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLO1.setIcon(new javax.swing.ImageIcon("src/main/resources/logo.png"));
        jLO1.setText("SNEAKBYTES");

        jBuySell.setBackground(new java.awt.Color(102, 102, 102));
        jBuySell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBuySellMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBuySellMousePressed(evt);
            }
        });

        jBS.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jBS.setForeground(new java.awt.Color(255, 255, 255));
        jBS.setIcon(new javax.swing.ImageIcon("src/main/resources/2.png"));
        jBS.setText(" Buy/Sell");

        javax.swing.GroupLayout jBuySellLayout = new javax.swing.GroupLayout(jBuySell);
        jBuySell.setLayout(jBuySellLayout);
        jBuySellLayout.setHorizontalGroup(
            jBuySellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBuySellLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jBS, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jBuySellLayout.setVerticalGroup(
            jBuySellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jWallet.setBackground(new java.awt.Color(102, 102, 102));
        jWallet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jWalletMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jWalletMousePressed(evt);
            }
        });

        jW.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jW.setForeground(new java.awt.Color(255, 255, 255));
        jW.setIcon(new javax.swing.ImageIcon("src/main/resources/3.png"));
        jW.setText(" Logs");

        javax.swing.GroupLayout jWalletLayout = new javax.swing.GroupLayout(jWallet);
        jWallet.setLayout(jWalletLayout);
        jWalletLayout.setHorizontalGroup(
            jWalletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jWalletLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jW, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jWalletLayout.setVerticalGroup(
            jWalletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jW, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jAccounts.setBackground(new java.awt.Color(102, 102, 102));
        jAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAccountsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jAccountsMousePressed(evt);
            }
        });

        jA.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jA.setForeground(new java.awt.Color(255, 255, 255));
        jA.setIcon(new javax.swing.ImageIcon("src/main/resources/4.png"));
        jA.setText(" Accounts");

        javax.swing.GroupLayout jAccountsLayout = new javax.swing.GroupLayout(jAccounts);
        jAccounts.setLayout(jAccountsLayout);
        jAccountsLayout.setHorizontalGroup(
            jAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAccountsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jA, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jAccountsLayout.setVerticalGroup(
            jAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLogOut.setBackground(new java.awt.Color(102, 102, 102));
        jLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLogOutMousePressed(evt);
            }
        });

        jLO.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLO.setForeground(new java.awt.Color(255, 255, 255));
        jLO.setIcon(new javax.swing.ImageIcon("src/main/resources/5.png"));
        jLO.setText(" Log Out");
        jLO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLOMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jLogOutLayout = new javax.swing.GroupLayout(jLogOut);
        jLogOut.setLayout(jLogOutLayout);
        jLogOutLayout.setHorizontalGroup(
            jLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLogOutLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLO, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLogOutLayout.setVerticalGroup(
            jLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBuySell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jWallet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLO1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addComponent(jProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBuySell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jWallet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.setOpaque(false);
        jDesktopPane2.setPreferredSize(new java.awt.Dimension(800, 450));
        jDesktopPane2.setRequestFocusEnabled(false);

        jLabel3.setIcon(new javax.swing.ImageIcon("src/main/resources/SBGIF.gif"));

        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductsMousePressed
        jProducts.setBackground(ClickedColor);
        jBuySell.setBackground(DefaultColor);
        jWallet.setBackground(DefaultColor);
        jAccounts.setBackground(DefaultColor);
        jLogOut.setBackground(DefaultColor);
        
    }//GEN-LAST:event_jProductsMousePressed

    private void jBuySellMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuySellMousePressed
        jProducts.setBackground(DefaultColor);
        jBuySell.setBackground(ClickedColor);
        jWallet.setBackground(DefaultColor);
        jAccounts.setBackground(DefaultColor);
        jLogOut.setBackground(DefaultColor);
               
    }//GEN-LAST:event_jBuySellMousePressed

    private void jWalletMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jWalletMousePressed
        jProducts.setBackground(DefaultColor);
        jBuySell.setBackground(DefaultColor);
        jWallet.setBackground(ClickedColor);
        jAccounts.setBackground(DefaultColor);
        jLogOut.setBackground(DefaultColor);
         
    }//GEN-LAST:event_jWalletMousePressed

    private void jAccountsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAccountsMousePressed
        jProducts.setBackground(DefaultColor);
        jBuySell.setBackground(DefaultColor);
        jWallet.setBackground(DefaultColor);
        jAccounts.setBackground(ClickedColor);
        jLogOut.setBackground(DefaultColor);
        
            
    }//GEN-LAST:event_jAccountsMousePressed

    private void jLogOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogOutMousePressed
        jProducts.setBackground(DefaultColor);
        jBuySell.setBackground(DefaultColor);
        jWallet.setBackground(DefaultColor);
        jAccounts.setBackground(DefaultColor);
        jLogOut.setBackground(ClickedColor);
    }//GEN-LAST:event_jLogOutMousePressed

     
    
    
    private void jProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductsMouseClicked
        Inventory products = new Inventory ();
        jDesktopPane2.removeAll();
        
        jDesktopPane2.setIcon(new javax.swing.ImageIcon("src/main/resources/SBGIF.gif"));
        jDesktopPane2.add(products).setVisible(true); 
    }//GEN-LAST:event_jProductsMouseClicked

    private void jWalletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jWalletMouseClicked
        Logs logs = new Logs ();
        jDesktopPane2.removeAll();
        jDesktopPane2.add(logs).setVisible(true);  
        
    }//GEN-LAST:event_jWalletMouseClicked

    private void jBuySellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuySellMouseClicked
        BuyAndSell buySell = new BuyAndSell ();
        jDesktopPane2.removeAll();
        jDesktopPane2.add(buySell).setVisible(true); 
    }//GEN-LAST:event_jBuySellMouseClicked

    private void jAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAccountsMouseClicked
        Users users = new Users ();
        jDesktopPane2.removeAll();
        jDesktopPane2.add(users).setVisible(true); 
    }//GEN-LAST:event_jAccountsMouseClicked

    private void jLOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLOMouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jLOMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jA;
    private javax.swing.JPanel jAccounts;
    private javax.swing.JLabel jBS;
    private javax.swing.JPanel jBuySell;
    public javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLO;
    private javax.swing.JLabel jLO1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jLogOut;
    private javax.swing.JLabel jP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jProducts;
    private javax.swing.JLabel jW;
    private javax.swing.JPanel jWallet;
    // End of variables declaration//GEN-END:variables
}
