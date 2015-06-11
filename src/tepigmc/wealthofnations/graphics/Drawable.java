package tepigmc.wealthofnations.graphics;

import java.awt.Graphics;

import tepigmc.location.Coordinates;

public interface Drawable {

  /**
   * Draws this in the graphics
   * @param graphics the graphics to draw in
   * @param x the horizontal coordinate to draw at
   * @param y the vertical coordinate to draw at
   */
  public void draw(Graphics graphics, int x, int y);

  /**
   * Draws this in the graphics
   * @param graphics the graphics to draw in
   * @param coordinates the coordinates to draw at
   */
  public void draw(Graphics graphics, Coordinates coordinates);

}
