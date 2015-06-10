package tepigmc.wealthofnations.tiles;

import tepigmc.location.Coordinates;
import tepigmc.wealthofnations.Sprite;

public class FarmTile extends IndustryTile {

  public FarmTile(Coordinates position) {
    super("Farm", position);
    addDotRotation(new Sprite("tiles/industry_tiles/farm/dots_1.png"));
  }

}
