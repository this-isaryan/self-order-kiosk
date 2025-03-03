package admin;

public class OrdersPanel extends javax.swing.JPanel {

  services.OrderService orderService;

  int currentOrderId;
  javax.swing.table.DefaultTableModel tbmOrders;
  kiosk.OrderTable tbmOrderDetails;

  public OrdersPanel() {
    orderService = new services.OrderService();
    tbmOrders = new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"ID", "Eating Location", "Payment", "Status", "Date"}
    ) {
      @Override
      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
      }
    };
    tbmOrderDetails = new kiosk.OrderTable();

    initComponents();

    getAllOrders();
  }

  private void tblOrderAddRow(models.Order order) {
    tbmOrders.addRow(new Object[]{
      order.getId(), app.Global.toTitleCase(order.getEatingLocation()), app.Global.toTitleCase(order.getPaymentMethod()), getStatusValue(order.getStatus()), order.getDate()
    });
  }

  private void tblOrderAddRows(java.util.ArrayList<models.Order> orders) {
    tbmOrders.setRowCount(0);
    orders.forEach(order -> tblOrderAddRow(order));
    tblOrderResizeColumns();
  }

  private void tblOrderResizeColumns() {
    javax.swing.table.TableColumnModel model = (javax.swing.table.TableColumnModel) tblOrders.getColumnModel();
    model.getColumn(0).setPreferredWidth(50);
    model.getColumn(0).setMaxWidth(50);
  }

  private void getAllOrders() {
    java.util.ArrayList<models.Order> orders = orderService.getAll();
    if (orders.size() > 0) {
      tblOrderAddRows(orders);
    }
  }

  private String getStatusValue(int status) {
    return (status == 1) ? "Ready" : "Pending";
  }

  private void getOrderDetails(int id) {
    java.util.ArrayList<models.OrderDetail> orderDetails = orderService.getOneDetails(id);
    if (orderDetails.size() > 0) {
      tbmOrderDetails.addRows(orderDetails);
      tbmOrderDetails.resizeColumns(tblOrderDetails.getColumnModel());
      app.Global.setTotalPrice(orderDetails, lblTotalValue);
    }
  }

  private void handleDelete() {
    int rowCount = orderService.deleteOne(currentOrderId);
    if (rowCount > 0) {
      handleRefresh();
    }
  }

  private void handleRefresh() {
    currentOrderId = 0;
    getAllOrders();
    tbmOrderDetails.setRowCount(0);
    lblTotalValue.setText("$ 0.00");
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    scpOrders = new javax.swing.JScrollPane();
    tblOrders = new javax.swing.JTable();
    pnlDetails = new javax.swing.JPanel();
    scpOrderDetails = new javax.swing.JScrollPane();
    tblOrderDetails = new javax.swing.JTable();
    pnlActions = new javax.swing.JPanel();
    btnRefresh = new javax.swing.JButton();
    btnDelete = new javax.swing.JButton();
    lblTotal = new javax.swing.JLabel();
    lblTotalValue = new javax.swing.JLabel();

    setPreferredSize(new java.awt.Dimension(720, 600));
    setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

    tblOrders.setModel(tbmOrders);
    tblOrders.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblOrdersMouseClicked(evt);
      }
    });
    scpOrders.setViewportView(tblOrders);

    add(scpOrders);

    pnlDetails.setLayout(new java.awt.BorderLayout());

    tblOrderDetails.setModel(tbmOrderDetails);
    scpOrderDetails.setViewportView(tblOrderDetails);

    pnlDetails.add(scpOrderDetails, java.awt.BorderLayout.CENTER);

    pnlActions.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
    pnlActions.setLayout(new java.awt.GridBagLayout());

    btnRefresh.setText("Refresh");
    btnRefresh.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRefreshActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    pnlActions.add(btnRefresh, gridBagConstraints);
    btnRefresh.getAccessibleContext().setAccessibleName("");

    btnDelete.setText("Delete");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDeleteActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
    pnlActions.add(btnDelete, gridBagConstraints);

    lblTotal.setFont(lblTotal.getFont().deriveFont(lblTotal.getFont().getStyle() | java.awt.Font.BOLD));
    lblTotal.setText("Total:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
    pnlActions.add(lblTotal, gridBagConstraints);
    lblTotal.getAccessibleContext().setAccessibleName("");

    lblTotalValue.setFont(lblTotalValue.getFont().deriveFont(lblTotalValue.getFont().getStyle() | java.awt.Font.BOLD));
    lblTotalValue.setText("$ 0.00");
    pnlActions.add(lblTotalValue, new java.awt.GridBagConstraints());
    lblTotalValue.getAccessibleContext().setAccessibleName("");

    pnlDetails.add(pnlActions, java.awt.BorderLayout.SOUTH);

    add(pnlDetails);
  }// </editor-fold>//GEN-END:initComponents

  private void tblOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdersMouseClicked
    javax.swing.table.TableModel tableModel = (javax.swing.table.TableModel) tblOrders.getModel();
    int rowIndex = tblOrders.getSelectedRow();
    currentOrderId = Integer.parseInt(tableModel.getValueAt(rowIndex, 0).toString());
    getOrderDetails(currentOrderId);
  }//GEN-LAST:event_tblOrdersMouseClicked

  private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
    handleRefresh();
  }//GEN-LAST:event_btnRefreshActionPerformed

  private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    if (currentOrderId > 0) {
      int answer = javax.swing.JOptionPane.showConfirmDialog(null, "Are you sure to delete this order?", "Delete order", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
      if (answer == 0) {
        handleDelete();
      }
    } else {
      javax.swing.JOptionPane.showMessageDialog(null, "Please select an order", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
    }
  }//GEN-LAST:event_btnDeleteActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnDelete;
  private javax.swing.JButton btnRefresh;
  private javax.swing.JLabel lblTotal;
  private javax.swing.JLabel lblTotalValue;
  private javax.swing.JPanel pnlActions;
  private javax.swing.JPanel pnlDetails;
  private javax.swing.JScrollPane scpOrderDetails;
  private javax.swing.JScrollPane scpOrders;
  private javax.swing.JTable tblOrderDetails;
  private javax.swing.JTable tblOrders;
  // End of variables declaration//GEN-END:variables
}
