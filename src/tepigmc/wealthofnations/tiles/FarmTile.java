package tepigmc.wealthofnations.tiles;

import tepigmc.common.Coordinates;
import tepigmc.wealthofnations.graphics.ImageGraphic;
import tepigmc.wealthofnations.graphics.ImagePositioned;

public class FarmTile extends IndustryTile {

  public FarmTile(Coordinates position) {
    super("Farm", position);
    setBackground(new ImageGraphic("tiles/industry_tiles/farm/back.png"));
    addDotRotation(new ImagePositioned(new ImageGraphic("tiles/industry_tiles/farm/dots_1.png")));
  }

}
