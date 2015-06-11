package tepigmc.wealthofnations.graphics;

import java.awt.Graphics;

import tepigmc.common.Coordinates;

public class ImageLayer extends ImageFrame {

  protected Coordinates coordinates;

  /**
   * @param image
   * @param coordinates
   */
  public ImageLayer(ImageFrame image, Coordinates coordinates) {
    super(image);
    setCoordinates(coordinates);
  }

  /**
   * @param image
   */
  public ImageLayer(ImageFrame image) {
    this(image, new Coordinates(0, 0));
  }

  /**
   * @return the coordinates
   */
  public Coordinates getCoordinates() {
    return coordinates;
  }

  /**
   * @param coordinates the coordinates to set
   */
  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  /**
   * Draws this layer in the graphics
   * @param graphics the graphics to draw in
   * @param x the horizontal coordinate to draw at
   * @param y the vertical coordinate to draw at
   */
  @Override
  public void draw(Graphics graphics, int x, int y) {
    super.draw(graphics, coordinates.add(x, y));
  }

  /**
   * Draws this layer in the graphics
   * @param graphics the graphics to draw in
   * @param coordinates the coordinates to draw at
   */
  @Override
  public void draw(Graphics graphics, Coordinates coordinates) {
    super.draw(graphics, this.coordinates.add(coordinates));
  }

}
