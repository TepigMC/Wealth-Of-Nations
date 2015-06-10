package tepigmc.wealthofnations.tiles;

import java.util.ArrayList;
import java.util.List;

import tepigmc.location.Coordinates;
import tepigmc.wealthofnations.Sprite;

public class IndustryTile extends Tile {
  protected Sprite background;
  protected List<Sprite> dotRotations;
  protected int rotation;

  public IndustryTile(String name, Coordinates position) {
    super(name, "industry_tile_" + name.toLowerCase().replace(' ', '_'), position);
    dotRotations = new ArrayList<Sprite>();
  }

  /**
   * @return the dotRotations
   */
  public List<Sprite> getDotRotations() {
    return dotRotations;
  }

  /**
   * @return the background
   */
  public Sprite getBackground() {
    return background;
  }

  /**
   * @return the rotation
   */
  public int getRotation() {
    return rotation;
  }

  /**
   * @param dotRotations the dotRotations to set
   */
  public void setDotRotations(List<Sprite> dotRotations) {
    this.dotRotations = dotRotations;
  }

  /**
   * @param background the background to set
   */
  public void setBackground(Sprite background) {
    this.background = background;
  }

  /**
   * @param rotation the rotation to set
   */
  public void setRotation(int rotation) {
    this.rotation = rotation;
  }

  /**
   * @param index the index of the dotRotation
   * @return the dotRotation at index
   */
  public Sprite getDotRotation(int index) {
    return dotRotations.get(index);
  }

  /**
   * @param index the index of the dotRotation
   * @return the dotRotation at index
   */
  public Sprite getCurrentDots() {
    return getDotRotation(rotation);
  }

  public void addDotRotation(Sprite dots) {
    dotRotations.add(dots);
  }

  public Sprite toSprite() {
    Sprite sprite = new Sprite(background);
    sprite.addLayer(getCurrentDots().getLayer(0));
    return sprite;
  }
}
