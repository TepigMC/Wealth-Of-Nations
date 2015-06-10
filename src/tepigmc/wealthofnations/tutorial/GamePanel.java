package tepigmc.wealthofnations.tutorial;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
  private static final long serialVersionUID = 3172608727170117600L;
  int x = 0, y = 0;

  void moveBall() {
    x++;
    y++;
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.fillOval(x, y, 30, 30);
  }
}