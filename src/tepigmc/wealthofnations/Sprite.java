package tepigmc.wealthofnations;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
  private File file;
  private BufferedImage image;

  /**
   * @param file the file to set
   */
  public Sprite(File file) {
    try {
      setFile(file);
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
      setFile(filePath);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * @return the file
   */
  public File getFile() {
    return file;
  }

  /**
   * @return the image
   */
  public BufferedImage getImage() {
    return image;
  }

  /**
   * @param file the file to set
   * @throws IOException 
   */
  public void setFile(File file) throws IOException {
    this.file = file;
    setImage(ImageIO.read(file));
  }

  /**
   * @param file the file to set
   * @throws IOException 
   */
  public void setFile(String filePath) throws IOException {
    setFile(new File(filePath));
  }

  /**
   * @param image the image to set
   */
  public void setImage(BufferedImage image) {
    this.image = image;
  }
}
