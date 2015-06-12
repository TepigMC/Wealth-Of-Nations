package tepigmc.wealthofnations.tiles;

public class Tile {

  protected String name;
  protected String nameId;

  public Tile(String name, String nameId) {
    setName(name);
    setNameId(nameId);
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

}
