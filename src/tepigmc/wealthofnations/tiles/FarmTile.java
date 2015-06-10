package tepigmc.wealthofnations.tiles;

import tepigmc.location.Coordinates;
import tepigmc.wealthofnations.Sprite;

public class FarmTile extends IndustryTile {
  public FarmTile(Coordinates position) {
    super("Farm", position);
    setBackground(new Sprite("tiles/industry_tiles/farm/back.png"));
    addDotRotation(new Sprite("tiles/industry_tiles/farm/dots_1.png"));
  }
}
