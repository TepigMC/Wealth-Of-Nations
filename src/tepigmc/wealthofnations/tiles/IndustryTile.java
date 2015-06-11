package tepigmc.wealthofnations.tiles;

import java.awt.Graphics;

import tepigmc.common.Coordinates;
import tepigmc.wealthofnations.graphics.Drawable;
import tepigmc.wealthofnations.graphics.ImageGraphic;
import tepigmc.wealthofnations.graphics.ImageLayered;
import tepigmc.wealthofnations.graphics.ImagePositioned;

public class IndustryTile extends Tile implements Drawable {

  protected ImageGraphic background;
  protected ImageLayered dotRotations;
  protected int rotation;

  public IndustryTile(String name, Coordinates position) {
    super(name, name.toLowerCase().replace(' ', '_'), position);
    setDotRotations(new ImageLayered());
  }

  /**
   * @return the background
   */
  public ImageGraphic getBackground() {
    return background;
  }

  /**
   * @return the dots
   */
  public ImageLayered getDotRotations() {
    return dotRotations;
  }

  /**
   * @return the rotation
   */
  public int getRotation() {
    return rotation;
  }

  /**
   * @param background the background to set
   */
  public void setBackground(ImageGraphic background) {
    this.background = background;
  }

  /**
   * @param dotRotations the dot rotations to set
   */
  public void setDotRotations(ImageLayered dotRotations) {
    this.dotRotations = dotRotations;
  }

  /**
   * @param rotation the rotation to set
   */
  public void setRotation(int rotation) {
    this.rotation = rotation;
  }

  /**
   * @param index the index of the dot rotation
   * @return the dot rotation layer at index
   */
  public ImagePositioned getDotRotation(int index) {
    return dotRotations.getLayer(index);
  }

  /**
   * @param index the index of the dot rotation
   * @return the dot rotation at index
   */
  public ImagePositioned getCurrentDotRotation() {
    return getDotRotation(rotation);
  }

  /**
   * Adds a dot rotation
   * @param dotRotation
   */
  public void addDotRotation(ImagePositioned dotRotation) {
    dotRotations.addLayer(dotRotation);
  }

  /**
   * Creates a sprite to draw this tile
   * @return the generated sprite
   */
  public ImageLayered toSprite() {
    ImageLayered sprite = new ImageLayered(background);
    sprite.addLayer(getCurrentDotRotation());
    return sprite;
  }

  /**
   * Draws this tile in the graphics
   * @param graphics the graphics to draw in
   * @param x the horizontal coordinate to draw at
   * @param y the vertical coordinate to draw at
   */
  public void draw(Graphics graphics, int x, int y) {
    toSprite().draw(graphics, x, y);
  }

  /**
   * Draws this tile in the graphics
   * @param graphics the graphics to draw in
   * @param coordinates the coordinates to draw at
   */
  public void draw(Graphics graphics, Coordinates coordinates) {
    toSprite().draw(graphics, coordinates);
  }

}
