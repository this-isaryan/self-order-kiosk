
package admin;

import models.Category;

public class CategoriesPanel extends javax.swing.JPanel {

  services.CategoryService categoryService;

  int currentRowIndex;
  int currentCategoryId;
  javax.swing.table.DefaultTableModel tbmCategories;

  public CategoriesPanel() {
    categoryService = new services.CategoryService();
    tbmCategories = new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"ID", "Name"}
    ) {
      @Override
      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
      }
    };

    initComponents();


    getAllCategories();
  }

  private void addRow(Category category) {
    tbmCategories.addRow(new Object[]{
      category.getId(), category.getName()
    });
  }

  private void addRows(java.util.ArrayList<Category> categories) {
    tbmCategories.setRowCount(0);
    categories.forEach(category -> addRow(category));
    resizeColumns();
  }

  private void updateRow(Category category) {
    javax.swing.table.TableModel model = (javax.swing.table.TableModel) tblCategories.getModel();
    model.setValueAt(category.getId(), currentRowIndex, 0);
    model.setValueAt(category.getName(), currentRowIndex, 1);
  }

  private void removeRow() {
    tbmCategories.removeRow(currentRowIndex);
  }

  private void onRowClicked(java.awt.event.MouseEvent evt) {
    javax.swing.table.TableModel model = (javax.swing.table.TableModel) tblCategories.getModel();
    int rowIndex = tblCategories.getSelectedRow();
    int categoryId = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());

    currentRowIndex = rowIndex;
    currentCategoryId = categoryId;

    getOneCategory(categoryId);
  }

  private void resizeColumns() {
    javax.swing.table.TableColumnModel model = (javax.swing.table.TableColumnModel) tblCategories.getColumnModel();
    model.getColumn(0).setPreferredWidth(50);
    model.getColumn(0).setMaxWidth(50);
  }

  private void handleRefresh() {
    getAllCategories();
  }

  private void handleSave() {
    String name = txtCategoryName.getText();

    if (name.isEmpty()) {
      javax.swing.JOptionPane.showMessageDialog(null, "Name is required", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
    } else {
      Category category = new Category();
      category.setId(currentCategoryId);
      category.setName(name);

      if (currentRowIndex >= 0) {
        updateOneCategory(category);
      } else {
        createOneCategory(category);
        clearFields();
      }
    }
  }

  private void handleNew() {
    clearFields();
  }

  private void handleDelete() {
    if (currentRowIndex >= 0) {
      deleteOneCategory(currentCategoryId);
      clearFields();
    } else {
      javax.swing.JOptionPane.showMessageDialog(null, "No category selected to delete", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
    }
  }

  private void populateFields(Category category) {
    txtCategoryName.setText(category.getName());
  }

  private void clearFields() {
    currentRowIndex = -1;
    currentCategoryId = -1;

    tblCategories.clearSelection();

    txtCategoryName.setText("");
  }

  private void getAllCategories() {
    java.util.ArrayList<Category> categories = categoryService.getAll();
    if (categories.size() > 0) {
      addRows(categories);
    }
  }

  private void getOneCategory(int id) {
    Category category = categoryService.getOneById(id);
    if (category != null) {
      populateFields(category);
    }
  }

  private void createOneCategory(Category category) {
    int rowCount = categoryService.createOne(category);
    if (rowCount > 0) {
      getAllCategories();
    } else {
      javax.swing.JOptionPane.showMessageDialog(null, "Failed to create a new category", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
  }

  private void updateOneCategory(Category category) {
    int rowCount = categoryService.updateOne(category);
    if (rowCount > 0) {
      updateRow(category);
    } else {
      javax.swing.JOptionPane.showMessageDialog(null, "Failed to update a category", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
  }

  private void deleteOneCategory(int id) {
    int rowCount = categoryService.deleteOne(id);
    if (rowCount > 0) {
      removeRow();
    } else {
      javax.swing.JOptionPane.showMessageDialog(null, "Failed to delete a category", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
  }


  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    scpCategories = new javax.swing.JScrollPane();
    tblCategories = new javax.swing.JTable();
    pnlCategoryFields = new javax.swing.JPanel();
    lblCategoryName = new javax.swing.JLabel();
    txtCategoryName = new javax.swing.JTextField();
    pnlCategoryActions = new javax.swing.JPanel();
    btnCategoryRefresh = new javax.swing.JButton();
    btnCategorySave = new javax.swing.JButton();
    btnCategoryNew = new javax.swing.JButton();
    btnCategoryDelete = new javax.swing.JButton();

    setPreferredSize(new java.awt.Dimension(720, 600));
    setLayout(new java.awt.GridBagLayout());

    tblCategories.setModel(tbmCategories);
    tblCategories.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblCategoriesMouseClicked(evt);
      }
    });
    scpCategories.setViewportView(tblCategories);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    add(scpCategories, gridBagConstraints);

    java.awt.GridBagLayout pnlCategoryFieldsLayout = new java.awt.GridBagLayout();
    pnlCategoryFieldsLayout.columnWidths = new int[] {100, 300};
    pnlCategoryFieldsLayout.rowHeights = new int[] {60};
    pnlCategoryFields.setLayout(pnlCategoryFieldsLayout);

    lblCategoryName.setLabelFor(txtCategoryName);
    lblCategoryName.setText("Category");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    pnlCategoryFields.add(lblCategoryName, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlCategoryFields.add(txtCategoryName, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    add(pnlCategoryFields, gridBagConstraints);

    pnlCategoryActions.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 20));

    btnCategoryRefresh.setText("Refresh");
    btnCategoryRefresh.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCategoryRefreshActionPerformed(evt);
      }
    });
    pnlCategoryActions.add(btnCategoryRefresh);

    btnCategorySave.setText("Save");
    btnCategorySave.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCategorySaveActionPerformed(evt);
      }
    });
    pnlCategoryActions.add(btnCategorySave);

    btnCategoryNew.setText("New");
    btnCategoryNew.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCategoryNewActionPerformed(evt);
      }
    });
    pnlCategoryActions.add(btnCategoryNew);

    btnCategoryDelete.setText("Delete");
    btnCategoryDelete.setToolTipText("");
    btnCategoryDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCategoryDeleteActionPerformed(evt);
      }
    });
    pnlCategoryActions.add(btnCategoryDelete);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
    add(pnlCategoryActions, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents

  private void btnCategoryRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryRefreshActionPerformed
    handleRefresh();
  }//GEN-LAST:event_btnCategoryRefreshActionPerformed

  private void btnCategorySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategorySaveActionPerformed
    handleSave();
  }//GEN-LAST:event_btnCategorySaveActionPerformed

  private void btnCategoryNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryNewActionPerformed
    handleNew();
  }//GEN-LAST:event_btnCategoryNewActionPerformed

  private void btnCategoryDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryDeleteActionPerformed
    handleDelete();
  }//GEN-LAST:event_btnCategoryDeleteActionPerformed

  private void tblCategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriesMouseClicked
    onRowClicked(evt);
  }//GEN-LAST:event_tblCategoriesMouseClicked

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCategoryDelete;
  private javax.swing.JButton btnCategoryNew;
  private javax.swing.JButton btnCategoryRefresh;
  private javax.swing.JButton btnCategorySave;
  private javax.swing.JLabel lblCategoryName;
  private javax.swing.JPanel pnlCategoryActions;
  private javax.swing.JPanel pnlCategoryFields;
  private javax.swing.JScrollPane scpCategories;
  private javax.swing.JTable tblCategories;
  private javax.swing.JTextField txtCategoryName;
  // End of variables declaration//GEN-END:variables
}
