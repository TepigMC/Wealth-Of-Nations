package tepigmc.wealthofnations.tiles;

import tepigmc.location.Coordinates;
import tepigmc.wealthofnations.graphics.ImageFrame;
import tepigmc.wealthofnations.graphics.ImageLayer;

public class FarmTile extends IndustryTile {

  public FarmTile(Coordinates position) {
    super("Farm", position);
    setBackground(new ImageFrame("tiles/industry_tiles/farm/back.png"));
    addDotRotation(new ImageLayer(new ImageFrame("tiles/industry_tiles/farm/dots_1.png")));
  }

}
