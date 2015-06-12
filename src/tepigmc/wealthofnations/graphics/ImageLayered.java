package tepigmc.wealthofnations.graphics;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import tepigmc.common.Coordinates;

public class ImageLayered extends ImageCollection implements Drawable {

  /**
   * @param layers the layers
   */
  public ImageLayered(List<Drawable> layers) {
    setImages(layers);
  }

  /**
   * @param layer the first layer
   */
  public ImageLayered(Drawable layer) {
    this(new ArrayList<Drawable>());
    addImage(layer);
  }

  /**
   * Creates a layered image with layers from the collection
   * @param collection the image collection to copy
   */
  public ImageLayered(ImageCollection collection) {
    this(new ArrayList<Drawable>());
    addAllImages(collection);
  }

  /**
   * Creates a layered image with no images
   */
  public ImageLayered() {
    this(new ArrayList<Drawable>());
  }

  /**
   * Draws this image in the graphics
   * @param graphics the graphics to draw in
   * @param x the horizontal coordinate to draw at
   * @param y the vertical coordinate to draw at
   */
  public void draw(Graphics graphics, int x, int y) {
    for (Drawable layer : images) {
      layer.draw(graphics, x, y);
    }
  }

  /**
   * Draws this image in the graphics
   * @param graphics the graphics to draw in
   * @param coordinates the coordinates to draw at
   */
  public void draw(Graphics graphics, Coordinates coordinates) {
    for (Drawable layer : images) {
      layer.draw(graphics, coordinates);
    }
  }

}
