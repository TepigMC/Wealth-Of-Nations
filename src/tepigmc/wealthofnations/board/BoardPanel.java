package tepigmc.wealthofnations.board;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import tepigmc.wealthofnations.tiles.FarmTile;
import tepigmc.wealthofnations.tiles.IndustryTile;

public class BoardPanel extends JPanel {

  private static final long serialVersionUID = -688258623776074646L;
  int x = 0, y = 0;
  IndustryTile farmTile = new FarmTile();

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
    for (int i = 0; i < 9; i++)
      for (int j = 0; j < 5; j++)
        farmTile.draw(graphics, 84 * i, 144 * j);
    for (int i = 0; i < 8; i++)
      for (int j = 0; j < 4; j++)
        farmTile.draw(graphics, 42 + 84 * i, 72 + 144 * j);
  }

}
