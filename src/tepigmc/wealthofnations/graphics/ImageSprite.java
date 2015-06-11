package tepigmc.wealthofnations.graphics;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import tepigmc.location.Coordinates;

public class ImageSprite implements Drawable {

  protected List<ImageLayer> layers;

  /**
   * @param image the first layer
   */
  public ImageSprite(List<ImageLayer> layers) {
    setLayers(layers);
  }

  /**
   * @param layer the first layer
   */
  public ImageSprite(ImageLayer layer) {
    setLayers(new ArrayList<ImageLayer>());
    addLayer(layer);
  }

  /**
   * @param frame the first layer
   */
  public ImageSprite(ImageFrame frame) {
    this(new ImageLayer(frame));
  }

  /**
   * Creates a copy of a sprite
   * @param the sprite to copy
   */
  public ImageSprite(ImageSprite sprite) {
    setLayers(new ArrayList<ImageLayer>());
    addAllLayers(sprite);
  }

  /**
   * Creates an ImageSprite with no layers
   */
  public ImageSprite() {
    this(new ArrayList<ImageLayer>());
  }

  /**
   * @return the layer
   */
  public List<ImageLayer> getLayers() {
    return layers;
  }

  /**
   * @param layers the layers to set
   */
  public void setLayers(List<ImageLayer> layers) {
    this.layers = layers;
  }

  /**
   * @param index the layer index
   * @return the layer
   */
  public ImageLayer getLayer(int index) {
    return layers.get(index);
  }

  /**
   * @param image the image to add
   */
  public void addLayer(ImageLayer layer) {
    layers.add(layer);
  }

  /**
   * Adds the layers from another sprite
   * @param sprite the sprite to add layers from
   */
  public void addAllLayers(ImageSprite sprite) {
    addAllLayers(sprite.getLayers());
  }

  /**
   * Adds the layers from a list
   * @param layers the list to add layers from
   */
  public void addAllLayers(List<ImageLayer> layers) {
    for (ImageLayer image : layers) {
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
    for (ImageLayer layer : layers) {
      layer.draw(graphics, x, y);
    }
  }

  /**
   * Draws this image in the graphics
   * @param graphics the graphics to draw in
   * @param coordinates the coordinates to draw at
   */
  public void draw(Graphics graphics, Coordinates coordinates) {
    for (ImageLayer layer : layers) {
      layer.draw(graphics, coordinates);
    }
  }

}
