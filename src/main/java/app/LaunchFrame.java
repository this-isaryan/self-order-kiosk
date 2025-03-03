package app;

public class LaunchFrame extends javax.swing.JFrame {

  private String appName;

  public LaunchFrame() {
    initComponents();
    app.Global.setAppIcon(this);
    getAppName();
    lblAppName.setText(appName);
    setSystemTray();
  }

 
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    btgTheme = new javax.swing.ButtonGroup();
    pnlContainer = new javax.swing.JPanel();
    lblAppLogo = new javax.swing.JLabel();
    lblAppName = new javax.swing.JLabel();
    pnlActions = new javax.swing.JPanel();
    btnLaunchKiosk = new javax.swing.JButton();
    btnLaunchAdmin = new javax.swing.JButton();
    menuBar = new javax.swing.JMenuBar();
    mnuFile = new javax.swing.JMenu();
    mniExit = new javax.swing.JMenuItem();
    mnuTheme = new javax.swing.JMenu();
    cmuLight = new javax.swing.JCheckBoxMenuItem();
    cmuDark = new javax.swing.JCheckBoxMenuItem();
    mnuHelp = new javax.swing.JMenu();
    mniAbout = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Launcher");
    setName(""); // NOI18N
    setPreferredSize(new java.awt.Dimension(720, 600));
    getContentPane().setLayout(new java.awt.GridBagLayout());

    pnlContainer.setMaximumSize(new java.awt.Dimension(640, 480));
    pnlContainer.setMinimumSize(new java.awt.Dimension(640, 480));
    pnlContainer.setPreferredSize(new java.awt.Dimension(640, 480));
    pnlContainer.setLayout(new java.awt.GridBagLayout());

    lblAppLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/app-logo-31x.png"))); // NOI18N
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    pnlContainer.add(lblAppLogo, gridBagConstraints);

    lblAppName.setFont(lblAppName.getFont().deriveFont(lblAppName.getFont().getSize()+13f));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 50, 0);
    pnlContainer.add(lblAppName, gridBagConstraints);

    pnlActions.setMaximumSize(null);
    pnlActions.setPreferredSize(new java.awt.Dimension(420, 180));
    pnlActions.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

    btnLaunchKiosk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/water-heater.png"))); // NOI18N
    btnLaunchKiosk.setText("Launch Kiosk");
    btnLaunchKiosk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnLaunchKiosk.setIconTextGap(20);
    btnLaunchKiosk.setPreferredSize(new java.awt.Dimension(300, 400));
    btnLaunchKiosk.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnLaunchKiosk.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLaunchKioskActionPerformed(evt);
      }
    });
    pnlActions.add(btnLaunchKiosk);

    btnLaunchAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/online-test.png"))); // NOI18N
    btnLaunchAdmin.setText("Launch Admin");
    btnLaunchAdmin.setToolTipText("");
    btnLaunchAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnLaunchAdmin.setIconTextGap(20);
    btnLaunchAdmin.setPreferredSize(new java.awt.Dimension(300, 400));
    btnLaunchAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnLaunchAdmin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLaunchAdminActionPerformed(evt);
      }
    });
    pnlActions.add(btnLaunchAdmin);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
    pnlContainer.add(pnlActions, gridBagConstraints);

    getContentPane().add(pnlContainer, new java.awt.GridBagConstraints());

    mnuFile.setText("File");

    mniExit.setText("Exit");
    mniExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        mniExitActionPerformed(evt);
      }
    });
    mnuFile.add(mniExit);

    menuBar.add(mnuFile);

    mnuTheme.setText("Theme");

    btgTheme.add(cmuLight);
    cmuLight.setSelected(true);
    cmuLight.setText("Light");
    cmuLight.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cmuLightItemStateChanged(evt);
      }
    });
    mnuTheme.add(cmuLight);

    btgTheme.add(cmuDark);
    cmuDark.setText("Dark");
    cmuDark.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cmuDarkItemStateChanged(evt);
      }
    });
    mnuTheme.add(cmuDark);

    menuBar.add(mnuTheme);

    mnuHelp.setText("Help");

    mniAbout.setText("About");
    mniAbout.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        mniAboutActionPerformed(evt);
      }
    });
    mnuHelp.add(mniAbout);

    menuBar.add(mnuHelp);

    setJMenuBar(menuBar);

    getAccessibleContext().setAccessibleName("");

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnLaunchAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaunchAdminActionPerformed
    new admin.LoginFrame().setVisible(true);

    // Minimize the LaunchFrame frame
    // setState(javax.swing.JFrame.ICONIFIED);
  }//GEN-LAST:event_btnLaunchAdminActionPerformed

  private void btnLaunchKioskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaunchKioskActionPerformed
    new kiosk.StartFrame().setVisible(true);

    // Minimize the LaunchFrame frame
    // setState(javax.swing.JFrame.ICONIFIED);
  }//GEN-LAST:event_btnLaunchKioskActionPerformed

  private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
    System.exit(0);
  }//GEN-LAST:event_mniExitActionPerformed

  private void mniAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAboutActionPerformed
    new AboutDialog().setVisible(true);
  }//GEN-LAST:event_mniAboutActionPerformed

  private void cmuLightItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmuLightItemStateChanged
    setTheme(evt, "light");
  }//GEN-LAST:event_cmuLightItemStateChanged

  private void cmuDarkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmuDarkItemStateChanged
    setTheme(evt, "dark");
  }//GEN-LAST:event_cmuDarkItemStateChanged

  private void getAppName() {
    try {
      app.PropertiesReader reader = new app.PropertiesReader("properties-from-pom.properties");
      String name = reader.getProperty("name");
      appName = name;
    } catch (java.io.IOException ex) {
      appName = "";
      System.out.println(ex);
    }
  }

  private void setTheme(java.awt.event.ItemEvent evt, String name) {
    if (evt.getStateChange() == 1) {
      if ("light".equals(name)) {
        app.Global.setDefaultTheme();
      } else {
        com.formdev.flatlaf.FlatDarculaLaf.install();
      }
      for (java.awt.Window window : javax.swing.JFrame.getWindows()) {
        javax.swing.SwingUtilities.updateComponentTreeUI(window);
      }
    }
  }

  private void setSystemTray() {
    java.awt.PopupMenu popupMenu = new java.awt.PopupMenu();
    java.awt.TrayIcon trayIcon = new java.awt.TrayIcon(new javax.swing.ImageIcon(getClass().getResource("/app/app-logo-31x.png")).getImage());
    java.awt.SystemTray systemTray = java.awt.SystemTray.getSystemTray();

    java.awt.MenuItem menuItemAbout = new java.awt.MenuItem("About");
    java.awt.MenuItem menuItemExit = new java.awt.MenuItem("Exit");
    popupMenu.add(menuItemAbout);
    popupMenu.add(menuItemExit);

    trayIcon.setImageAutoSize(true);
    trayIcon.setToolTip(appName);
    trayIcon.setPopupMenu(popupMenu);

    try {
      systemTray.add(trayIcon);
    } catch (java.awt.AWTException ex) {
      System.out.println(ex);
      return;
    }

    trayIcon.addActionListener((java.awt.event.ActionEvent evt) -> {
      setState(javax.swing.JFrame.NORMAL);
    });

    menuItemAbout.addActionListener((java.awt.event.ActionEvent evt) -> {
      new AboutDialog().setVisible(true);
    });

    menuItemExit.addActionListener((java.awt.event.ActionEvent evt) -> {
      systemTray.remove(trayIcon);
      System.exit(0);
    });
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set default theme */
    app.Global.setDefaultTheme();

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new LaunchFrame().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup btgTheme;
  private javax.swing.JButton btnLaunchAdmin;
  private javax.swing.JButton btnLaunchKiosk;
  private javax.swing.JCheckBoxMenuItem cmuDark;
  private javax.swing.JCheckBoxMenuItem cmuLight;
  private javax.swing.JLabel lblAppLogo;
  private javax.swing.JLabel lblAppName;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenuItem mniAbout;
  private javax.swing.JMenuItem mniExit;
  private javax.swing.JMenu mnuFile;
  private javax.swing.JMenu mnuHelp;
  private javax.swing.JMenu mnuTheme;
  private javax.swing.JPanel pnlActions;
  private javax.swing.JPanel pnlContainer;
  // End of variables declaration//GEN-END:variables
}
