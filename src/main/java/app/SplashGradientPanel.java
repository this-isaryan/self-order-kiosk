package app;

public class SplashGradientPanel extends javax.swing.JPanel {

  public SplashGradientPanel() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    lblLogo = new javax.swing.JLabel();

    setLayout(new java.awt.GridBagLayout());

    lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/KIOSK_video.gif"))); // NOI18N
    lblLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    add(lblLogo, new java.awt.GridBagConstraints());
  }// </editor-fold>//GEN-END:initComponents

  @Override
  protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    java.awt.Graphics2D g2d = (java.awt.Graphics2D) g;
    g2d.setRenderingHint(java.awt.RenderingHints.KEY_RENDERING, java.awt.RenderingHints.VALUE_RENDER_QUALITY);
    int w = getWidth();
    int h = getHeight();
    java.awt.Color color1 = java.awt.Color.decode(java.util.ResourceBundle.getBundle("app/global").getString("colorPrimaryAlt"));
    java.awt.Color color2 = java.awt.Color.decode(java.util.ResourceBundle.getBundle("app/global").getString("colorPrimary"));
    java.awt.GradientPaint gp = new java.awt.GradientPaint(0, 0, color1, 0, h, color2);
    g2d.setPaint(gp);
    g2d.fillRect(0, 0, w, h);
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel lblLogo;
  // End of variables declaration//GEN-END:variables
}
