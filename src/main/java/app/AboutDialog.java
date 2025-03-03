package app;

public class AboutDialog extends javax.swing.JDialog {

  public AboutDialog() {
    initComponents();
    setModal(true);
    setAppVersion();
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlContainer = new javax.swing.JPanel();
        lblAppLogoVersion = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblDevelopers = new javax.swing.JLabel();
        lblCopyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 420));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlContainer.setLayout(new java.awt.GridBagLayout());

        lblAppLogoVersion.setFont(lblAppLogoVersion.getFont().deriveFont(lblAppLogoVersion.getFont().getStyle() | java.awt.Font.BOLD, lblAppLogoVersion.getFont().getSize()+3));
        lblAppLogoVersion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/app-logo-31x.png"))); // NOI18N
        lblAppLogoVersion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAppLogoVersion.setIconTextGap(15);
        lblAppLogoVersion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlContainer.add(lblAppLogoVersion, new java.awt.GridBagConstraints());

        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("<html>\n<center>\nA self-checkout experience where customers can quickly place an order.\n</center>\n<html>");
        lblDescription.setPreferredSize(new java.awt.Dimension(320, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        pnlContainer.add(lblDescription, gridBagConstraints);

        lblDevelopers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDevelopers.setText("<html> <center> <b>Developers</b><br/> Meet, Aryan A, Frosina, Aryan S </center> </html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        pnlContainer.add(lblDevelopers, gridBagConstraints);

        lblCopyright.setFont(lblCopyright.getFont().deriveFont(lblCopyright.getFont().getSize()-3f));
        lblCopyright.setText("Copyright (c) 2024 Self-Order Kiosk");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 0);
        pnlContainer.add(lblCopyright, gridBagConstraints);

        getContentPane().add(pnlContainer, new java.awt.GridBagConstraints());

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    app.Global.setDefaultTheme();

    java.awt.EventQueue.invokeLater(() -> {
      new AboutDialog().setVisible(true);
    });
  }

  private void setAppVersion() {
    try {
      app.PropertiesReader reader = new app.PropertiesReader("properties-from-pom.properties");
      String version = reader.getProperty("version");
      lblAppLogoVersion.setText("v" + version);
    } catch (java.io.IOException ex) {
      java.util.logging.Logger.getLogger(AboutDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAppLogoVersion;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDevelopers;
    private javax.swing.JPanel pnlContainer;
    // End of variables declaration//GEN-END:variables
}
