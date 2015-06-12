package tepigmc.wealthofnations.graphics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import tepigmc.wealthofnations.WealthOfNations;

public class ImageCollection {

  protected List<Drawable> images;

  /**
   * @param images the images
   */
  public ImageCollection(List<Drawable> images) {
    setImages(images);
  }

  /**
   * @param image the first image
   */
  public ImageCollection(Drawable image) {
    this(new ArrayList<Drawable>());
    addImage(image);
  }

  /**
   * Creates an image collection with layers from the collection
   * @param collection the image collection to copy
   */
  public ImageCollection(ImageCollection collection) {
    this(new ArrayList<Drawable>());
    addAllImages(collection);
  }

  /**
   * Creates an image collection with no images
   */
  public ImageCollection() {
    this(new ArrayList<Drawable>());
  }

  /**
   * @return the images
   */
  public List<Drawable> getImages() {
    return images;
  }

  /**
   * @param images the images to set
   */
  public void setImages(List<Drawable> images) {
    this.images = images;
  }

  /**
   * @param index the image index
   * @return the image
   */
  public Drawable getImage(int index) {
    return images.get(index);
  }

  /**
   * @param image the image to add
   */
  public void addImage(Drawable image) {
    images.add(image);
  }

  /**
   * Adds the images from another image collection
   * @param collection the image collection to add images from
   */
  public void addAllImages(ImageCollection collection) {
    addAllImages(collection.getImages());
  }

  /**
   * Adds the images from a list
   * @param images the list to add images from
   */
  public void addAllImages(List<Drawable> images) {
    for (Drawable image : images) {
      addImage(image);
    }
  }

  /**
   * Loads all the images in the folder with the given base name
   * @param folder
   * @param base
   * @param extension
   * @throws FileNotFoundException when the folder doesn't exist
   */
  public void loadImages(String folder, String base, String extension)
      throws FileNotFoundException {
    File resources = new File(WealthOfNations.getResourceFolder(), folder);
    if (!resources.exists() || !resources.isDirectory())
      throw new FileNotFoundException("folder doesn't exist. " + resources);
    File file;
    for (int i = 1; (file = new File(resources, base + '_' + i + '.' + extension))
        .exists(); i++) {
      addImage(new ImageGraphic(file));
    }
  }

}
