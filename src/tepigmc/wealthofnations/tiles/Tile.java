package tepigmc.wealthofnations.tiles;

import tepigmc.location.Coordinates;

public class Tile {

  protected String name;
  protected String nameId;
  protected Coordinates position;

  public Tile(String name, String nameId, Coordinates position) {
    setName(name);
    setNameId(nameId);
    setPosition(position);
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the nameId
   */
  public String getNameId() {
    return nameId;
  }

  /**
   * @return the position
   */
  public Coordinates getPosition() {
    return position;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @param nameId the nameId to set
   */
  public void setNameId(String nameId) {
    this.nameId = nameId;
  }

  /**
   * @param position the position to set
   */
  public void setPosition(Coordinates position) {
    this.position = position;
  }

}
