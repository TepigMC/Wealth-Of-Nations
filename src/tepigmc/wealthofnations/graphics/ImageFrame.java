package tepigmc.wealthofnations.graphics;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import tepigmc.common.Coordinates;
import tepigmc.wealthofnations.WealthOfNations;

public class ImageFrame implements Drawable {

  protected BufferedImage image;

  /**
   * @param image
   */
  public ImageFrame(BufferedImage image) {
    setImage(image);
  }

  /**
   * Creates an ImageFrame from a File without throwing a IOException
   * @param file
   */
  public ImageFrame(File file) {
    try {
      setImage(file);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Creates an ImageFrame from a path without throwing a IOException
   * @param filePath
   */
  public ImageFrame(String filePath) {
    try {
      setImage(filePath);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Creates a copy of another ImageFrame
   * @param image the ImageFrame to copy
   */
  public ImageFrame(ImageFrame frame) {
    this(frame.getImage());
  }

  /**
   * @return the image
   */
  public BufferedImage getImage() {
    return image;
  }

  /**
   * @param image the image to set
   */
  public void setImage(BufferedImage image) {
    this.image = image;
  }

  /**
   * @param file the file containing the image to set
   * @throws IOException
   */
  public void setImage(File file) throws IOException {
    setImage(ImageIO.read(file));
  }

  /**
   * @param filePath the path to the image to set
   * @throws IOException
   */
  public void setImage(String filePath) throws IOException {
    setImage(new File(WealthOfNations.getResourceFolder(), filePath));
  }

  /**
   * Draws this image in the graphics
   * @param graphics the graphics to draw in
   * @param x the horizontal coordinate to draw at
   * @param y the vertical coordinate to draw at
   */
  public void draw(Graphics graphics, int x, int y) {
    graphics.drawImage(image, x, y, null);
  }

  /**
   * Draws this image in the graphics
   * @param graphics the graphics to draw in
   * @param coordinates the coordinates to draw at
   */
  public void draw(Graphics graphics, Coordinates coordinates) {
    graphics.drawImage(image, coordinates.x(), coordinates.y(), null);
  }

}
