package kiosk;

public class EndFrame extends javax.swing.JFrame {


  public EndFrame() {
    initComponents();
    app.Global.setAppIcon(this);
  }


  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlHeader = new javax.swing.JPanel();
    lblHeaderTitle = new javax.swing.JLabel();
    pnlContent = new javax.swing.JPanel();
    pnlContainer = new javax.swing.JPanel();
    lblIcon = new javax.swing.JLabel();
    lblMessage = new javax.swing.JLabel();
    pnlFooter = new javax.swing.JPanel();
    btnFinish = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("End");
    setMinimumSize(new java.awt.Dimension(720, 860));
    setName(""); // NOI18N

    pnlHeader.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
    pnlHeader.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

    lblHeaderTitle.setFont(lblHeaderTitle.getFont().deriveFont(lblHeaderTitle.getFont().getSize()+10f));
    lblHeaderTitle.setText("Done");
    lblHeaderTitle.setToolTipText("");
    pnlHeader.add(lblHeaderTitle);

    getContentPane().add(pnlHeader, java.awt.BorderLayout.NORTH);

    pnlContent.setLayout(new java.awt.GridBagLayout());

    pnlContainer.setPreferredSize(new java.awt.Dimension(380, 300));
    pnlContainer.setLayout(new java.awt.GridLayout(2, 0));

    lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/time.png"))); // NOI18N
    lblIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    lblIcon.setIconTextGap(10);
    pnlContainer.add(lblIcon);

    lblMessage.setFont(lblMessage.getFont().deriveFont(lblMessage.getFont().getSize()+4f));
    lblMessage.setText("<html><center>Your food is being prepared.<br/><br/>Once it is ready, you can pick it up at the collection point.</center></html>");
    lblMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    pnlContainer.add(lblMessage);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    pnlContent.add(pnlContainer, gridBagConstraints);

    getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

    pnlFooter.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
    pnlFooter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

    btnFinish.setText("Finish");
    btnFinish.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFinishActionPerformed(evt);
      }
    });
    pnlFooter.add(btnFinish);

    getContentPane().add(pnlFooter, java.awt.BorderLayout.SOUTH);

    getAccessibleContext().setAccessibleName("");

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
    new StartFrame().setVisible(true);
    dispose();
  }//GEN-LAST:event_btnFinishActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set default theme */
    app.Global.setDefaultTheme();

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new EndFrame().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnFinish;
  private javax.swing.JLabel lblHeaderTitle;
  private javax.swing.JLabel lblIcon;
  private javax.swing.JLabel lblMessage;
  private javax.swing.JPanel pnlContainer;
  private javax.swing.JPanel pnlContent;
  private javax.swing.JPanel pnlFooter;
  private javax.swing.JPanel pnlHeader;
  // End of variables declaration//GEN-END:variables
}
