package tepigmc.wealthofnations.tiles;

import java.util.ArrayList;
import java.util.List;

import tepigmc.location.Coordinates;
import tepigmc.wealthofnations.Sprite;

public class IndustryTile extends Tile {
  protected List<Sprite> dotRotations;

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
   * @param dotRotations the dotRotations to set
   */
  public void setDotRotations(List<Sprite> dotRotations) {
    this.dotRotations = dotRotations;
  }

  public void addDotRotation(Sprite dots) {
    dotRotations.add(dots);
  }
}
