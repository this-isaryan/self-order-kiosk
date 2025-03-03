package kiosk;

public class MenuFrame extends javax.swing.JFrame implements StateObserver {

  services.ItemService itemService;
  OrderTable tbmOrder;
  java.util.ArrayList<models.Item> itemsMealCombos;
  java.util.ArrayList<models.Item> itemsSides;
  java.util.ArrayList<models.Item> itemsDesserts;
  java.util.ArrayList<models.Item> itemsBeverages;


  public MenuFrame() {
    app.Global.setAppIcon(this);

    initModels();
    initComponents();
    initCustomComponents();
    initState();
  }


  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlContent = new javax.swing.JPanel();
    tabbedPane = new javax.swing.JTabbedPane();
    pnlMealCombos = new javax.swing.JPanel();
    pnlSides = new javax.swing.JPanel();
    pnlDesserts = new javax.swing.JPanel();
    pnlBeverages = new javax.swing.JPanel();
    pnlOrder = new javax.swing.JPanel();
    lblOrder = new javax.swing.JLabel();
    scpOrder = new javax.swing.JScrollPane();
    tblOrder = new javax.swing.JTable();
    pnlTotal = new javax.swing.JPanel();
    lblTotal = new javax.swing.JLabel();
    lblTotalValue = new javax.swing.JLabel();
    pnlFooter = new javax.swing.JPanel();
    btnBack = new javax.swing.JButton();
    btnContinue = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Menu");
    setMinimumSize(new java.awt.Dimension(720, 860));
    setName(""); // NOI18N
    setPreferredSize(new java.awt.Dimension(720, 860));

    pnlContent.setLayout(new java.awt.GridBagLayout());

    tabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
    tabbedPane.setMinimumSize(new java.awt.Dimension(574, 400));
    tabbedPane.setPreferredSize(new java.awt.Dimension(700, 400));
    tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        tabbedPaneStateChanged(evt);
      }
    });

    pnlMealCombos.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
    pnlMealCombos.setMaximumSize(new java.awt.Dimension(0, 0));
    pnlMealCombos.setPreferredSize(new java.awt.Dimension(560, 500));
    pnlMealCombos.setLayout(new java.awt.GridLayout(2, 3, 20, 20));
    tabbedPane.addTab("Meal Combos", pnlMealCombos);

    pnlSides.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
    pnlSides.setLayout(new java.awt.GridLayout(2, 3, 20, 20));
    tabbedPane.addTab("Sides", pnlSides);

    pnlDesserts.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
    pnlDesserts.setLayout(new java.awt.GridLayout(2, 3, 20, 20));
    tabbedPane.addTab("Desserts", pnlDesserts);

    pnlBeverages.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
    pnlBeverages.setLayout(new java.awt.GridLayout(2, 3, 20, 20));
    tabbedPane.addTab("Beverages", pnlBeverages);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
    pnlContent.add(tabbedPane, gridBagConstraints);

    pnlOrder.setPreferredSize(new java.awt.Dimension(472, 600));
    java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
    jPanel1Layout.columnWidths = new int[] {140, 0};
    pnlOrder.setLayout(jPanel1Layout);

    lblOrder.setFont(lblOrder.getFont().deriveFont(lblOrder.getFont().getStyle() | java.awt.Font.BOLD));
    lblOrder.setText("My Order");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
    pnlOrder.add(lblOrder, gridBagConstraints);

    scpOrder.setPreferredSize(new java.awt.Dimension(452, 500));

    tblOrder.setModel(tbmOrder);
    tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblOrderMouseClicked(evt);
      }
    });
    scpOrder.setViewportView(tblOrder);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
    pnlOrder.add(scpOrder, gridBagConstraints);

    pnlTotal.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 20, 0));

    lblTotal.setFont(lblTotal.getFont().deriveFont(lblTotal.getFont().getStyle() | java.awt.Font.BOLD));
    lblTotal.setText("Total:");
    pnlTotal.add(lblTotal);

    lblTotalValue.setFont(lblTotalValue.getFont().deriveFont(lblTotalValue.getFont().getStyle() | java.awt.Font.BOLD));
    lblTotalValue.setText("$ 0.00");
    pnlTotal.add(lblTotalValue);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
    gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
    pnlOrder.add(pnlTotal, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weighty = 1.0;
    pnlContent.add(pnlOrder, gridBagConstraints);

    getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

    pnlFooter.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
    pnlFooter.setLayout(new java.awt.GridBagLayout());

    btnBack.setText("Back");
    btnBack.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBackActionPerformed(evt);
      }
    });
    pnlFooter.add(btnBack, new java.awt.GridBagConstraints());

    btnContinue.setText("Continue");
    btnContinue.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnContinueActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.weightx = 1.0;
    pnlFooter.add(btnContinue, gridBagConstraints);

    getContentPane().add(pnlFooter, java.awt.BorderLayout.SOUTH);

    getAccessibleContext().setAccessibleName("");

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void initModels() {
    itemService = new services.ItemService();
    itemsMealCombos = itemService.getAllByCategory(1);

    tbmOrder = new OrderTable();
  }

  private void initState() {
    getAllOrderedItems();
  }

  private void initCustomComponents() {
    itemsMealCombos.forEach((item) -> {
      BtnItem btnItem = new BtnItem(item);
      btnItem.addActionListener((java.awt.event.ActionEvent evt) -> itemActionPeformed(item));
      pnlMealCombos.add(btnItem);
    });
  }

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    new StartFrame().setVisible(true);
    dispose();
  }//GEN-LAST:event_btnBackActionPerformed

  private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
    java.util.ArrayList<models.OrderDetail> orderedItems = StateManager.getOrderedItems();
    if (orderedItems != null && orderedItems.size() > 0) {
      new OrderSummaryFrame().setVisible(true);
      dispose();
    } else {
      javax.swing.JOptionPane.showMessageDialog(null, "Please order something so\n", "No Items Ordered", javax.swing.JOptionPane.WARNING_MESSAGE);
    }
  }//GEN-LAST:event_btnContinueActionPerformed

  private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
    int rowIndex = tblOrder.getSelectedRow();
    CustomizeDialog customizeDialog = new CustomizeDialog(StateManager.getOrderedItem(rowIndex), rowIndex);
    customizeDialog.addObserver(this);
    customizeDialog.setVisible(true);
  }//GEN-LAST:event_tblOrderMouseClicked

  private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneStateChanged
    int tabIndex = tabbedPane.getSelectedIndex();

    if (tabIndex == 1 && itemsSides == null) {
      itemsSides = itemService.getAllByCategory(2);
      itemsSides.forEach((item) -> {
        BtnItem btnItem = new BtnItem(item);
        btnItem.addActionListener((java.awt.event.ActionEvent e) -> itemActionPeformed(item));
        pnlSides.add(btnItem);
      });
    }

    if (tabIndex == 2 && itemsDesserts == null) {
      itemsDesserts = itemService.getAllByCategory(3);
      itemsDesserts.forEach((item) -> {
        BtnItem btnItem = new BtnItem(item);
        btnItem.addActionListener((java.awt.event.ActionEvent e) -> itemActionPeformed(item));
        pnlDesserts.add(btnItem);
      });
    }

    if (tabIndex == 3 && itemsBeverages == null) {
      itemsBeverages = itemService.getAllByCategory(4);
      itemsBeverages.forEach((item) -> {
        BtnItem btnItem = new BtnItem(item);
        btnItem.addActionListener((java.awt.event.ActionEvent e) -> itemActionPeformed(item));
        pnlBeverages.add(btnItem);
      });
    }
  }//GEN-LAST:event_tabbedPaneStateChanged

  private void itemActionPeformed(models.Item item) {
    CustomizeDialog customizeDialog = new CustomizeDialog(item);
    customizeDialog.addObserver(this);
    customizeDialog.setVisible(true);
  }

  private void getAllOrderedItems() {
    java.util.ArrayList<models.OrderDetail> orderedItems = StateManager.getOrderedItems();
    if (orderedItems != null) {
      tbmOrder.addRows(orderedItems);
      tbmOrder.resizeColumns(tblOrder.getColumnModel());
      app.Global.setTotalPrice(orderedItems, lblTotalValue);
    }
  }

  @Override
  public void onStateChange() {
    getAllOrderedItems();
  }

  /**
   * @param args the command line arguments
   */
  /* Create and display the form */
  public static void main(String args[]) {
    /* Set default theme */
    app.Global.setDefaultTheme();

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new MenuFrame().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBack;
  private javax.swing.JButton btnContinue;
  private javax.swing.JLabel lblOrder;
  private javax.swing.JLabel lblTotal;
  private javax.swing.JLabel lblTotalValue;
  private javax.swing.JPanel pnlBeverages;
  private javax.swing.JPanel pnlContent;
  private javax.swing.JPanel pnlDesserts;
  private javax.swing.JPanel pnlFooter;
  private javax.swing.JPanel pnlMealCombos;
  private javax.swing.JPanel pnlOrder;
  private javax.swing.JPanel pnlSides;
  private javax.swing.JPanel pnlTotal;
  private javax.swing.JScrollPane scpOrder;
  private javax.swing.JTabbedPane tabbedPane;
  private javax.swing.JTable tblOrder;
  // End of variables declaration//GEN-END:variables
}

class BtnItem extends javax.swing.JButton {

  BtnItem(models.Item item) {
    setIcon(app.Global.getImagePreview(item.getImage(), 100, 100, this));
    setText("<html><center>" + item.getName() + "<p style=\"font-weight:bold;margin-top:10px\">" + app.Global.toCurrency(item.getPrice()) + "</p></center></html>");
    setAlignmentY(0.0F);
    setHideActionText(true);
    setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    setIconTextGap(20);
    setPreferredSize(new java.awt.Dimension(160, 160));
    setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
  }

}
