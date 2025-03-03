package kiosk;

public class OrderSummaryFrame extends javax.swing.JFrame implements StateObserver {

  OrderTable tbmOrder;
  models.Order order;

  public OrderSummaryFrame() {
    app.Global.setAppIcon(this);

  
    initModels();
    initComponents();
    initState();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    btgEatingLocation = new javax.swing.ButtonGroup();
    btgPayment = new javax.swing.ButtonGroup();
    pnlHeader = new javax.swing.JPanel();
    lblHeaderTitle = new javax.swing.JLabel();
    pnlContent = new javax.swing.JPanel();
    scpOrder = new javax.swing.JScrollPane();
    tblOrder = new javax.swing.JTable();
    pnlTotal = new javax.swing.JPanel();
    lblTotal = new javax.swing.JLabel();
    lblTotalValue = new javax.swing.JLabel();
    pnlEatingLocation = new javax.swing.JPanel();
    lblEatingLocation = new javax.swing.JLabel();
    pnlEatingLocationOptions = new javax.swing.JPanel();
    tgbEatIn = new javax.swing.JToggleButton();
    tgbTakeOut = new javax.swing.JToggleButton();
    pnlPayment = new javax.swing.JPanel();
    lblPayment = new javax.swing.JLabel();
    pnlPaymentOptions = new javax.swing.JPanel();
    tgbPayHere = new javax.swing.JToggleButton();
    tgbPayCounter = new javax.swing.JToggleButton();
    pnlFooter = new javax.swing.JPanel();
    btnBack = new javax.swing.JButton();
    sepActions = new javax.swing.JSeparator();
    btnCheckOut = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Order Summary");
    setMinimumSize(new java.awt.Dimension(720, 860));
    setName(""); // NOI18N

    pnlHeader.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
    pnlHeader.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

    lblHeaderTitle.setFont(lblHeaderTitle.getFont().deriveFont(lblHeaderTitle.getFont().getSize()+10f));
    lblHeaderTitle.setText("Order Summary");
    lblHeaderTitle.setToolTipText("");
    pnlHeader.add(lblHeaderTitle);

    getContentPane().add(pnlHeader, java.awt.BorderLayout.NORTH);

    pnlContent.setLayout(new javax.swing.BoxLayout(pnlContent, javax.swing.BoxLayout.Y_AXIS));

    scpOrder.setPreferredSize(new java.awt.Dimension(452, 200));

    tblOrder.setModel(tbmOrder);
    tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblOrderMouseClicked(evt);
      }
    });
    scpOrder.setViewportView(tblOrder);

    pnlContent.add(scpOrder);

    pnlTotal.setPreferredSize(new java.awt.Dimension(165, 10));
    pnlTotal.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 20, 20));

    lblTotal.setFont(lblTotal.getFont().deriveFont(lblTotal.getFont().getStyle() | java.awt.Font.BOLD));
    lblTotal.setText("Total:");
    pnlTotal.add(lblTotal);

    lblTotalValue.setFont(lblTotalValue.getFont().deriveFont(lblTotalValue.getFont().getStyle() | java.awt.Font.BOLD));
    lblTotalValue.setText("$ 0.00");
    pnlTotal.add(lblTotalValue);

    pnlContent.add(pnlTotal);

    pnlEatingLocation.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
    pnlEatingLocation.setPreferredSize(new java.awt.Dimension(315, 100));
    pnlEatingLocation.setLayout(new java.awt.GridLayout(1, 0));

    lblEatingLocation.setText("Where do you want to eat?");
    pnlEatingLocation.add(lblEatingLocation);

    pnlEatingLocationOptions.setMaximumSize(new java.awt.Dimension(236, 90));
    pnlEatingLocationOptions.setMinimumSize(new java.awt.Dimension(236, 90));
    pnlEatingLocationOptions.setPreferredSize(new java.awt.Dimension(236, 90));
    pnlEatingLocationOptions.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

    btgEatingLocation.add(tgbEatIn);
    tgbEatIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cutlery.png"))); // NOI18N
    tgbEatIn.setText("Eat in");
    tgbEatIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    tgbEatIn.setIconTextGap(15);
    tgbEatIn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    tgbEatIn.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        tgbEatInItemStateChanged(evt);
      }
    });
    pnlEatingLocationOptions.add(tgbEatIn);

    btgEatingLocation.add(tgbTakeOut);
    tgbTakeOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/green-tea.png"))); // NOI18N
    tgbTakeOut.setText("Take out");
    tgbTakeOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    tgbTakeOut.setIconTextGap(15);
    tgbTakeOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    tgbTakeOut.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        tgbTakeOutItemStateChanged(evt);
      }
    });
    pnlEatingLocationOptions.add(tgbTakeOut);

    pnlEatingLocation.add(pnlEatingLocationOptions);

    pnlContent.add(pnlEatingLocation);

    pnlPayment.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
    pnlPayment.setPreferredSize(new java.awt.Dimension(656, 100));
    pnlPayment.setLayout(new java.awt.GridLayout(1, 0));

    lblPayment.setText("How do you want to pay?");
    pnlPayment.add(lblPayment);

    pnlPaymentOptions.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

    btgPayment.add(tgbPayHere);
    tgbPayHere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/credit-card.png"))); // NOI18N
    tgbPayHere.setText("Pay here");
    tgbPayHere.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    tgbPayHere.setIconTextGap(10);
    tgbPayHere.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    tgbPayHere.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        tgbPayHereItemStateChanged(evt);
      }
    });
    pnlPaymentOptions.add(tgbPayHere);

    btgPayment.add(tgbPayCounter);
    tgbPayCounter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wallet.png"))); // NOI18N
    tgbPayCounter.setText("Pay at counter");
    tgbPayCounter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    tgbPayCounter.setIconTextGap(15);
    tgbPayCounter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    tgbPayCounter.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        tgbPayCounterItemStateChanged(evt);
      }
    });
    pnlPaymentOptions.add(tgbPayCounter);

    pnlPayment.add(pnlPaymentOptions);

    pnlContent.add(pnlPayment);

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
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.weightx = 1.0;
    pnlFooter.add(sepActions, gridBagConstraints);

    btnCheckOut.setText("Check out");
    btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCheckOutActionPerformed(evt);
      }
    });
    pnlFooter.add(btnCheckOut, new java.awt.GridBagConstraints());

    getContentPane().add(pnlFooter, java.awt.BorderLayout.SOUTH);

    getAccessibleContext().setAccessibleName("");

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void initModels() {
    tbmOrder = new OrderTable();
  }

  private void initState() {
    getAllOrderedItems();

    String eatingLocation = StateManager.getEatingLocation();
    if (eatingLocation != null) {
      switch (eatingLocation) {
        case models.Order.EAT_IN:
          tgbEatIn.setSelected(true);
          break;
        case models.Order.TAKE_OUT:
          tgbTakeOut.setSelected(true);
          break;
      }
    }

    String paymentMethod = StateManager.getPaymentMethod();
    if (paymentMethod != null) {
      switch (paymentMethod) {
        case models.Order.PAY_HERE:
          tgbPayHere.setSelected(true);
          break;
        case models.Order.PAY_COUNTER:
          tgbPayCounter.setSelected(true);
          break;
      }
    }
  }

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    new MenuFrame().setVisible(true);
    dispose();
  }//GEN-LAST:event_btnBackActionPerformed

  private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
    if (getValidOptions()) {
      services.OrderService orderService = new services.OrderService();
      java.util.ArrayList<models.OrderDetail> orderedItems = StateManager.getOrderedItems();

      models.Order order = new models.Order();
      order.setPaymentMethod(StateManager.getPaymentMethod());
      order.setEatingLocation(StateManager.getEatingLocation());

      int orderId = orderService.createOne(order);
      int rowCount = orderService.createOneDetails(orderId, orderedItems);

      if (rowCount > 0) {
        new EndFrame().setVisible(true);
        dispose();
      } else {
        javax.swing.JOptionPane.showMessageDialog(null, "Oops, we couldn't get your order.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
      }
    }
  }//GEN-LAST:event_btnCheckOutActionPerformed

  private void tgbEatInItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbEatInItemStateChanged
    if (evt.getStateChange() == 1) {
      StateManager.setEatingLocation(models.Order.EAT_IN);
    }
  }//GEN-LAST:event_tgbEatInItemStateChanged

  private void tgbTakeOutItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbTakeOutItemStateChanged
    if (evt.getStateChange() == 1) {
      StateManager.setEatingLocation(models.Order.TAKE_OUT);
    }
  }//GEN-LAST:event_tgbTakeOutItemStateChanged

  private void tgbPayHereItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbPayHereItemStateChanged
    if (evt.getStateChange() == 1) {
      StateManager.setPaymentMethod(models.Order.PAY_HERE);
    }
  }//GEN-LAST:event_tgbPayHereItemStateChanged

  private void tgbPayCounterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tgbPayCounterItemStateChanged
    if (evt.getStateChange() == 1) {
      StateManager.setPaymentMethod(models.Order.PAY_COUNTER);
    }
  }//GEN-LAST:event_tgbPayCounterItemStateChanged

  private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
    int rowIndex = tblOrder.getSelectedRow();
    CustomizeDialog customizeDialog = new CustomizeDialog(StateManager.getOrderedItem(rowIndex), rowIndex);
    customizeDialog.addObserver(this);
    customizeDialog.setVisible(true);
  }//GEN-LAST:event_tblOrderMouseClicked

  private void getAllOrderedItems() {
    java.util.ArrayList<models.OrderDetail> orderedItems = StateManager.getOrderedItems();
    if (orderedItems != null) {
      tbmOrder.addRows(orderedItems);
      tbmOrder.resizeColumns(tblOrder.getColumnModel());
      app.Global.setTotalPrice(orderedItems, lblTotalValue);
    }
  }

  private boolean getValidOptions() {
    if (StateManager.getEatingLocation() == null) {
      javax.swing.JOptionPane.showMessageDialog(null, "Please specify where you want to eat.", "Eating Location", javax.swing.JOptionPane.ERROR_MESSAGE);
    } else if (StateManager.getPaymentMethod() == null) {
      javax.swing.JOptionPane.showMessageDialog(null, "Please specify how you will pay.", "Payment Method", javax.swing.JOptionPane.ERROR_MESSAGE);
    } else {
      return true;
    }
    return false;
  }

  @Override
  public void onStateChange() {
    getAllOrderedItems();
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set default theme */
    app.Global.setDefaultTheme();

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new OrderSummaryFrame().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup btgEatingLocation;
  private javax.swing.ButtonGroup btgPayment;
  private javax.swing.JButton btnBack;
  private javax.swing.JButton btnCheckOut;
  private javax.swing.JLabel lblEatingLocation;
  private javax.swing.JLabel lblHeaderTitle;
  private javax.swing.JLabel lblPayment;
  private javax.swing.JLabel lblTotal;
  private javax.swing.JLabel lblTotalValue;
  private javax.swing.JPanel pnlContent;
  private javax.swing.JPanel pnlEatingLocation;
  private javax.swing.JPanel pnlEatingLocationOptions;
  private javax.swing.JPanel pnlFooter;
  private javax.swing.JPanel pnlHeader;
  private javax.swing.JPanel pnlPayment;
  private javax.swing.JPanel pnlPaymentOptions;
  private javax.swing.JPanel pnlTotal;
  private javax.swing.JScrollPane scpOrder;
  private javax.swing.JSeparator sepActions;
  private javax.swing.JTable tblOrder;
  private javax.swing.JToggleButton tgbEatIn;
  private javax.swing.JToggleButton tgbPayCounter;
  private javax.swing.JToggleButton tgbPayHere;
  private javax.swing.JToggleButton tgbTakeOut;
  // End of variables declaration//GEN-END:variables
}
