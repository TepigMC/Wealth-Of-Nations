package tepigmc.wealthofnations;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import tepigmc.wealthofnations.tiles.FarmTile;
import tepigmc.wealthofnations.tiles.IndustryTile;

public class GameBoardPanel extends JPanel {

  private static final long serialVersionUID = -688258623776074646L;
  int x = 0, y = 0;
  IndustryTile farmTile = new FarmTile(null);

  void moveSprite() {
    x++;
    y++;
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    Graphics2D graphics2d = (Graphics2D) graphics;
    graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
    farmTile.draw(graphics, 0, 0);
  }

}
