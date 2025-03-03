package kiosk;

public class CustomizeDialog extends javax.swing.JDialog implements StateObservable {

  int orderedItemIndex = -1;
  models.OrderDetail currentItem;
  java.util.ArrayList<StateObserver> observers;

  public CustomizeDialog(models.Item currentItem) {
    setModal(true);

    this.currentItem = new models.OrderDetail();
    this.currentItem.setId(currentItem.getId());
    this.currentItem.setName(currentItem.getName());
    this.currentItem.setImage(currentItem.getImage());
    this.currentItem.setPrice(currentItem.getPrice());
    this.currentItem.setOrderPrice(currentItem.getPrice());
    this.currentItem.setQuantity(1);
    this.currentItem.setSize(models.OrderDetail.MEDIUM);


    initComponents();
    initCustomComponents();
    initState();

    // Update UI with item
    lblQuantityValue.setText("1");
    lblPriceValue.setText(app.Global.toCurrency(currentItem.getPrice()));
    lblTotalValue.setText(app.Global.toCurrency(currentItem.getPrice()));
  }

  public CustomizeDialog(models.OrderDetail orderDetail, int index) {
    setModal(true);

    this.currentItem = orderDetail;
    orderedItemIndex = index;


    initComponents();
    initCustomComponents();
    initState();

    // Update UI with order detail
    lblPriceValue.setText(app.Global.toCurrency(currentItem.getOrderPrice()));
    lblQuantityValue.setText(Integer.toString(currentItem.getQuantity()));
    lblTotalValue.setText(app.Global.toCurrency(currentItem.getSubTotal()));
    btnAdd.setText("Update");
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    btgSize = new javax.swing.ButtonGroup();
    pnlHeader = new javax.swing.JPanel();
    lblHeaderTitle = new javax.swing.JLabel();
    pnlContent = new javax.swing.JPanel();
    pnlImage = new javax.swing.JPanel();
    lblImage = new javax.swing.JLabel();
    pnlPrice = new javax.swing.JPanel();
    lblPrice = new javax.swing.JLabel();
    lblPriceValue = new javax.swing.JLabel();
    pnlSize = new javax.swing.JPanel();
    lblSize = new javax.swing.JLabel();
    pnlSizeOptions = new javax.swing.JPanel();
    tgbSizeSmall = new javax.swing.JToggleButton();
    tgbSizeMedium = new javax.swing.JToggleButton();
    tgbSizeLarge = new javax.swing.JToggleButton();
    pnlQuantity = new javax.swing.JPanel();
    lblQuantity = new javax.swing.JLabel();
    pnlQuantityOptions = new javax.swing.JPanel();
    btnQuantityRemove = new javax.swing.JButton();
    btnQuantityAdd = new javax.swing.JButton();
    lblQuantityValue = new javax.swing.JLabel();
    pnlTotal = new javax.swing.JPanel();
    lblTotal = new javax.swing.JLabel();
    lblTotalValue = new javax.swing.JLabel();
    pnlFooter = new javax.swing.JPanel();
    btnCancel = new javax.swing.JButton();
    btnAdd = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Customize");
    setMinimumSize(new java.awt.Dimension(720, 860));
    setName(""); // NOI18N
    setPreferredSize(new java.awt.Dimension(720, 860));

    pnlHeader.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
    pnlHeader.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

    lblHeaderTitle.setFont(lblHeaderTitle.getFont().deriveFont(lblHeaderTitle.getFont().getSize()+10f));
    lblHeaderTitle.setText("Krusty Burger");
    pnlHeader.add(lblHeaderTitle);

    getContentPane().add(pnlHeader, java.awt.BorderLayout.NORTH);

    pnlContent.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
    pnlContent.setLayout(new java.awt.GridBagLayout());

    pnlImage.setLayout(new java.awt.GridBagLayout());

    lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/soup-bowl.png"))); // NOI18N
    lblImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    pnlImage.add(lblImage, new java.awt.GridBagConstraints());

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    pnlContent.add(pnlImage, gridBagConstraints);

    pnlPrice.setLayout(new java.awt.GridBagLayout());

    lblPrice.setText("Price");
    pnlPrice.add(lblPrice, new java.awt.GridBagConstraints());

    lblPriceValue.setFont(lblPriceValue.getFont().deriveFont(lblPriceValue.getFont().getStyle() | java.awt.Font.BOLD));
    lblPriceValue.setText("$ 0.00");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.weightx = 1.0;
    pnlPrice.add(lblPriceValue, gridBagConstraints);
    lblPriceValue.getAccessibleContext().setAccessibleName("");

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlContent.add(pnlPrice, gridBagConstraints);

    pnlSize.setPreferredSize(new java.awt.Dimension(720, 80));
    pnlSize.setLayout(new java.awt.GridBagLayout());

    lblSize.setText("Size");
    pnlSize.add(lblSize, new java.awt.GridBagConstraints());

    pnlSizeOptions.setMinimumSize(new java.awt.Dimension(220, 28));
    pnlSizeOptions.setPreferredSize(new java.awt.Dimension(400, 120));
    pnlSizeOptions.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

    btgSize.add(tgbSizeSmall);
    tgbSizeSmall.setText("Small");
    tgbSizeSmall.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        tgbStateChanged(evt);
      }
    });
    pnlSizeOptions.add(tgbSizeSmall);

    btgSize.add(tgbSizeMedium);
    tgbSizeMedium.setText("Medium");
    tgbSizeMedium.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        tgbStateChanged(evt);
      }
    });
    pnlSizeOptions.add(tgbSizeMedium);

    btgSize.add(tgbSizeLarge);
    tgbSizeLarge.setText("Large");
    tgbSizeLarge.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        tgbStateChanged(evt);
      }
    });
    pnlSizeOptions.add(tgbSizeLarge);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
    gridBagConstraints.ipadx = 160;
    gridBagConstraints.ipady = 20;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.weightx = 1.0;
    pnlSize.add(pnlSizeOptions, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
    pnlContent.add(pnlSize, gridBagConstraints);

    pnlQuantity.setPreferredSize(new java.awt.Dimension(720, 50));
    pnlQuantity.setLayout(new java.awt.GridBagLayout());

    lblQuantity.setText("Quantity");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    pnlQuantity.add(lblQuantity, gridBagConstraints);

    pnlQuantityOptions.setLayout(new java.awt.GridBagLayout());

    btnQuantityRemove.setText("-");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    pnlQuantityOptions.add(btnQuantityRemove, gridBagConstraints);

    btnQuantityAdd.setText("+");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    pnlQuantityOptions.add(btnQuantityAdd, gridBagConstraints);

    lblQuantityValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblQuantityValue.setText("0");
    lblQuantityValue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.ipadx = 20;
    pnlQuantityOptions.add(lblQuantityValue, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.weightx = 1.0;
    pnlQuantity.add(pnlQuantityOptions, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
    pnlContent.add(pnlQuantity, gridBagConstraints);

    pnlTotal.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 20, 0));

    lblTotal.setFont(lblTotal.getFont().deriveFont(lblTotal.getFont().getStyle() | java.awt.Font.BOLD));
    lblTotal.setText("Subtotal:");
    pnlTotal.add(lblTotal);

    lblTotalValue.setFont(lblTotalValue.getFont().deriveFont(lblTotalValue.getFont().getStyle() | java.awt.Font.BOLD));
    lblTotalValue.setText("$ 0.00");
    pnlTotal.add(lblTotalValue);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, -20);
    pnlContent.add(pnlTotal, gridBagConstraints);

    getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

    pnlFooter.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
    pnlFooter.setLayout(new java.awt.GridBagLayout());

    btnCancel.setText("Cancel");
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelActionPerformed(evt);
      }
    });
    pnlFooter.add(btnCancel, new java.awt.GridBagConstraints());

    btnAdd.setText("Add to order");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.weightx = 1.0;
    pnlFooter.add(btnAdd, gridBagConstraints);

    getContentPane().add(pnlFooter, java.awt.BorderLayout.SOUTH);

    getAccessibleContext().setAccessibleName("");

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void initCustomComponents() {
    // Adds action listeners to the quantity buttons
    btnQuantityAdd.addActionListener((java.awt.event.ActionEvent evt) -> qtyActionPeformed(1));
    btnQuantityRemove.addActionListener((java.awt.event.ActionEvent evt) -> qtyActionPeformed(-1));
  }

  private void initState() {
    observers = new java.util.ArrayList<>();

    lblHeaderTitle.setText(currentItem.getName());
    lblImage.setIcon(app.Global.getImagePreview(currentItem.getImage(), 300, 300, this));

    switch (currentItem.getSize()) {
      case models.OrderDetail.SMALL:
        tgbSizeSmall.setSelected(true);
        break;
      case models.OrderDetail.LARGE:
        tgbSizeLarge.setSelected(true);
        break;
      default:
        tgbSizeMedium.setSelected(true);
    }
  }

  private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    dispose();
  }//GEN-LAST:event_btnCancelActionPerformed

  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

    if (orderedItemIndex == -1) {
      if (currentItem.getQuantity() > 0) {
        StateManager.setOrderedItem(currentItem);
        calculateSubTotal();
      }
    } else {
      if (currentItem.getQuantity() > 0) {

        StateManager.setOrderedItem(currentItem, orderedItemIndex);
      } else {

        StateManager.removeOrderedItem(orderedItemIndex);
      }
    }
    notifyObservers();
    dispose();
  }//GEN-LAST:event_btnAddActionPerformed

  private void tgbStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbStateChanged
    if (evt.getStateChange() == 1) {
      if (evt.getItem() == tgbSizeSmall) {
        currentItem.setSize(models.OrderDetail.SMALL);
      } else if (evt.getItem() == tgbSizeLarge) {
        currentItem.setSize(models.OrderDetail.LARGE);
      } else {
        currentItem.setSize(models.OrderDetail.MEDIUM);
      }
      calculateSubTotal();
    }
  }//GEN-LAST:event_tgbStateChanged

  private void qtyActionPeformed(int i) {
    if (!(i == -1 && currentItem.getQuantity() == 0)) {
      currentItem.setQuantity(currentItem.getQuantity() + i);
      lblQuantityValue.setText(Integer.toString(currentItem.getQuantity()));
      calculateSubTotal();
    }
  }

  private Double getSizeFee(String size) {
    switch (size) {
      case models.OrderDetail.SMALL:
        return -2.00;
      case models.OrderDetail.LARGE:
        return 2.00;
      default:
        return 0.00;
    }
  }

  private void calculateSubTotal() {
    double priceAfterSize = getSizeFee(currentItem.getSize());
    if (priceAfterSize < 1) {
      priceAfterSize = 0.00;
    }
    currentItem.setOrderPrice(currentItem.getPrice() + priceAfterSize);
    currentItem.setSubTotal(currentItem.getOrderPrice() * currentItem.getQuantity());
    lblPriceValue.setText(app.Global.toCurrency(currentItem.getOrderPrice()));
    lblTotalValue.setText(app.Global.toCurrency(currentItem.getSubTotal()));
  }

  private void notifyObservers() {
    for (StateObserver observer : observers) {
      observer.onStateChange();
    }
  }

  @Override
  public void addObserver(StateObserver observer) {
    observers.add(observer);
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    app.Global.setDefaultTheme();

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new CustomizeDialog(null).setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup btgSize;
  private javax.swing.JButton btnAdd;
  private javax.swing.JButton btnCancel;
  private javax.swing.JButton btnQuantityAdd;
  private javax.swing.JButton btnQuantityRemove;
  private javax.swing.JLabel lblHeaderTitle;
  private javax.swing.JLabel lblImage;
  private javax.swing.JLabel lblPrice;
  private javax.swing.JLabel lblPriceValue;
  private javax.swing.JLabel lblQuantity;
  private javax.swing.JLabel lblQuantityValue;
  private javax.swing.JLabel lblSize;
  private javax.swing.JLabel lblTotal;
  private javax.swing.JLabel lblTotalValue;
  private javax.swing.JPanel pnlContent;
  private javax.swing.JPanel pnlFooter;
  private javax.swing.JPanel pnlHeader;
  private javax.swing.JPanel pnlImage;
  private javax.swing.JPanel pnlPrice;
  private javax.swing.JPanel pnlQuantity;
  private javax.swing.JPanel pnlQuantityOptions;
  private javax.swing.JPanel pnlSize;
  private javax.swing.JPanel pnlSizeOptions;
  private javax.swing.JPanel pnlTotal;
  private javax.swing.JToggleButton tgbSizeLarge;
  private javax.swing.JToggleButton tgbSizeMedium;
  private javax.swing.JToggleButton tgbSizeSmall;
  // End of variables declaration//GEN-END:variables
}
