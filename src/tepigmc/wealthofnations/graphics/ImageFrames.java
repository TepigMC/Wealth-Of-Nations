package tepigmc.wealthofnations.graphics;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import tepigmc.common.Coordinates;

public class ImageFrames extends ImageCollection implements Drawable {

  protected int currentFrameIndex;

  /**
   * @param frames the frames
   */
  public ImageFrames(List<Drawable> frames, int currentFrameIndex) {
    setImages(frames);
    setCurrentFrameIndex(currentFrameIndex);
  }

  /**
   * @param frame the first frame
   */
  public ImageFrames(Drawable frame) {
    this(new ArrayList<Drawable>(), 0);
    addImage(frame);
  }

  /**
   * Creates a layered image with frames from the image frame
   * @param collection the image frames to copy
   */
  public ImageFrames(ImageFrames frames) {
    this(new ArrayList<Drawable>(), frames.getCurrentFrameIndex());
    addAllImages(frames);
  }

  /**
   * Creates a layered image with frames from the collection
   * @param collection the image collection to copy
   */
  public ImageFrames(ImageCollection collection, int currentFrameIndex) {
    this(new ArrayList<Drawable>(), currentFrameIndex);
    addAllImages(collection);
  }

  /**
   * Creates a layered image with no images
   */
  public ImageFrames() {
    this(new ArrayList<Drawable>(), 0);
  }

  /**
   * @return the index of the current frame
   */
  public int getCurrentFrameIndex() {
    return currentFrameIndex;
  }

  /**
   * @param index the index of the current frame to set
   */
  public void setCurrentFrameIndex(int currentFrameIndex) {
    this.currentFrameIndex = currentFrameIndex;
  }

  /**
   * @return the frame at the current index
   */
  public Drawable getCurrentFrame() {
    return getImage(currentFrameIndex);
  }

  /**
   * Draws this image in the graphics
   * @param graphics the graphics to draw in
   * @param x the horizontal coordinate to draw at
   * @param y the vertical coordinate to draw at
   */
  public void draw(Graphics graphics, int x, int y) {
    getCurrentFrame().draw(graphics, x, y);
  }

  /**
   * Draws this image in the graphics
   * @param graphics the graphics to draw in
   * @param coordinates the coordinates to draw at
   */
  public void draw(Graphics graphics, Coordinates coordinates) {
    getCurrentFrame().draw(graphics, coordinates);
  }

}
