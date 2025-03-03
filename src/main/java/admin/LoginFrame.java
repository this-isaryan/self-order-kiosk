package admin;

public class LoginFrame extends javax.swing.JFrame {

  services.AuthService authService;

 
  public LoginFrame() {
    initComponents();
    app.Global.setAppIcon(this);
    authService = new services.AuthService();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlContainer = new javax.swing.JPanel();
    lblTitle = new javax.swing.JLabel();
    lblUsername = new javax.swing.JLabel();
    txtUsername = new javax.swing.JTextField();
    lblPassword = new javax.swing.JLabel();
    txtPassword = new javax.swing.JPasswordField();
    btnLogin = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Login");
    setName(""); // NOI18N
    setPreferredSize(new java.awt.Dimension(720, 600));
    getContentPane().setLayout(new java.awt.GridBagLayout());

    pnlContainer.setPreferredSize(new java.awt.Dimension(400, 200));
    java.awt.GridBagLayout pnlFormLayout = new java.awt.GridBagLayout();
    pnlFormLayout.columnWidths = new int[] {100, 250};
    pnlFormLayout.rowHeights = new int[] {60, 0, 60, 40};
    pnlContainer.setLayout(pnlFormLayout);

    lblTitle.setFont(lblTitle.getFont().deriveFont(lblTitle.getFont().getSize()+10f));
    lblTitle.setText("Welcome Back");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    pnlContainer.add(lblTitle, gridBagConstraints);

    lblUsername.setLabelFor(txtUsername);
    lblUsername.setText("Username");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    pnlContainer.add(lblUsername, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlContainer.add(txtUsername, gridBagConstraints);

    lblPassword.setLabelFor(txtPassword);
    lblPassword.setText("Password");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    pnlContainer.add(lblPassword, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlContainer.add(txtPassword, gridBagConstraints);

    btnLogin.setText("Log in");
    btnLogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLoginActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
    pnlContainer.add(btnLogin, gridBagConstraints);

    getContentPane().add(pnlContainer, new java.awt.GridBagConstraints());

    getAccessibleContext().setAccessibleName("");

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    if (getValidFields()) {
      models.User user = new models.User();
      user.setUsername(txtUsername.getText());
      user.setPassword(new String(txtPassword.getPassword()));

      if (authService.getAuth(user)) {
        new AdminFrame().setVisible(true);
        dispose();
      } else {
        javax.swing.JOptionPane.showMessageDialog(null, "Invalid username or password", "Authentication Failed", javax.swing.JOptionPane.ERROR_MESSAGE);
      }
    }
  }//GEN-LAST:event_btnLoginActionPerformed

  private boolean getValidFields() {
    if (txtUsername.getText().isEmpty()) {
      javax.swing.JOptionPane.showMessageDialog(null, "Username is required", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
      return false;
    } else if (new String(txtPassword.getPassword()).isEmpty()) {
      javax.swing.JOptionPane.showMessageDialog(null, "Password is required", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
      return false;
    } else {
      return true;
    }
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set default theme */
    app.Global.setDefaultTheme();

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new LoginFrame().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLogin;
  private javax.swing.JLabel lblPassword;
  private javax.swing.JLabel lblTitle;
  private javax.swing.JLabel lblUsername;
  private javax.swing.JPanel pnlContainer;
  private javax.swing.JPasswordField txtPassword;
  private javax.swing.JTextField txtUsername;
  // End of variables declaration//GEN-END:variables
}
