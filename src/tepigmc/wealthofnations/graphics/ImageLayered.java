package tepigmc.wealthofnations.graphics;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import tepigmc.common.Coordinates;

public class ImageLayered implements Drawable {

  protected List<ImagePositioned> layers;

  /**
   * @param image the first layer
   */
  public ImageLayered(List<ImagePositioned> layers) {
    setLayers(layers);
  }

  /**
   * @param layer the first layer
   */
  public ImageLayered(ImagePositioned layer) {
    setLayers(new ArrayList<ImagePositioned>());
    addLayer(layer);
  }

  /**
   * @param frame the first layer
   */
  public ImageLayered(ImageGraphic frame) {
    this(new ImagePositioned(frame));
  }

  /**
   * Creates a copy of a layeredImage
   * @param the layered image to copy
   */
  public ImageLayered(ImageLayered layeredImage) {
    setLayers(new ArrayList<ImagePositioned>());
    addAllLayers(layeredImage);
  }

  /**
   * Creates an layered image with no layers
   */
  public ImageLayered() {
    this(new ArrayList<ImagePositioned>());
  }

  /**
   * @return the layer
   */
  public List<ImagePositioned> getLayers() {
    return layers;
  }

  /**
   * @param layers the layers to set
   */
  public void setLayers(List<ImagePositioned> layers) {
    this.layers = layers;
  }

  /**
   * @param index the layer index
   * @return the layer
   */
  public ImagePositioned getLayer(int index) {
    return layers.get(index);
  }

  /**
   * @param image the image to add
   */
  public void addLayer(ImagePositioned layer) {
    layers.add(layer);
  }

  /**
   * Adds the layers from another layered image
   * @param layeredImage the layered image to add layers from
   */
  public void addAllLayers(ImageLayered layeredImage) {
    addAllLayers(layeredImage.getLayers());
  }

  /**
   * Adds the layers from a list
   * @param layers the list to add layers from
   */
  public void addAllLayers(List<ImagePositioned> layers) {
    for (ImagePositioned image : layers) {
      addLayer(image);
    }
  }

  /**
   * Draws this image in the graphics
   * @param graphics the graphics to draw in
   * @param x the horizontal coordinate to draw at
   * @param y the vertical coordinate to draw at
   */
  public void draw(Graphics graphics, int x, int y) {
    for (ImagePositioned layer : layers) {
      layer.draw(graphics, x, y);
    }
  }

  /**
   * Draws this image in the graphics
   * @param graphics the graphics to draw in
   * @param coordinates the coordinates to draw at
   */
  public void draw(Graphics graphics, Coordinates coordinates) {
    for (ImagePositioned layer : layers) {
      layer.draw(graphics, coordinates);
    }
  }

}
