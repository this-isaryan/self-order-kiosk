
package admin;

public class AdminFrame extends javax.swing.JFrame {

  public AdminFrame() {
    initComponents();
    app.Global.setAppIcon(this);
    tabbedPane.addTab("Orders", new OrdersPanel());
    tabbedPane.addTab("Items", new ItemsPanel());
    tabbedPane.addTab("Categories", new CategoriesPanel());
    tabbedPane.addTab("Users", new UsersPanel());
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    tabbedPane = new javax.swing.JTabbedPane();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Admin");
    setName(""); // NOI18N
    setPreferredSize(new java.awt.Dimension(720, 600));
    getContentPane().add(tabbedPane, java.awt.BorderLayout.CENTER);

    getAccessibleContext().setAccessibleName("");

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    app.Global.setDefaultTheme();

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new AdminFrame().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTabbedPane tabbedPane;
  // End of variables declaration//GEN-END:variables
}
