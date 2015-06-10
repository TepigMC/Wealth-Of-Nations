package tepigmc.wealthofnations;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
  private static final long serialVersionUID = -688258623776074646L;
  int x = 0, y = 0;

  void moveSprite() {
    x++;
    y++;
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    Sprite sprite = new Sprite("resources/tiles/industry_tiles/farm/back.png");
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.drawImage(sprite.getImage(), 0, 0, null);
  }
}