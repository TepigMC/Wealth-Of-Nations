package tepigmc.wealthofnations;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

public class Sprite {
  public static String resourceFolder = "resources/";
  private List<BufferedImage> layers;

  /**
   * @param file the file to set
   */
  public Sprite(BufferedImage image) {
    addLayer(image);
  }
  
  /**
   * Creates a Sprite without throwing a IOException
   * @param file the file to set
   */
  public Sprite(File file) {
    try {
      addLayer(file);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Creates a Sprite without throwing a IOException
   * @param filePath the the path of the file to set
   */
  public Sprite(String filePath) {
    try {
      addLayer(filePath);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  /**
   * Creates a copy of a sprite
   * @param the sprite to copy
   */
  public Sprite(Sprite sprite) {
    List<BufferedImage> layers = sprite.getLayers();
    for (BufferedImage image : layers) {
      addLayer(image);
    }
  }

  /**
   * @return the layer
   */
  public List<BufferedImage> getLayers() {
    return layers;
  }

  /**
   * @param layers the layers to set
   */
  public void setLayers(List<BufferedImage> layers) {
    this.layers = layers;
  }

  /**
   * @param index the layer index
   * @return the layer
   */
  public BufferedImage getLayer(int index) {
    return layers.get(index);
  }

  /**
   * @param image the image to add
   */
  public void addLayer(BufferedImage image) {
    this.layers.add(image);
  }

  /**
   * @param file the file to add the image from
   * @throws IOException 
   */
  public void addLayer(File file) throws IOException {
    addLayer(ImageIO.read(file));
  }

  /**
   * @param file the file to add the image from
   * @throws IOException 
   */
  public void addLayer(String filePath) throws IOException {
    addLayer(new File(resourceFolder, filePath));
  }
}
