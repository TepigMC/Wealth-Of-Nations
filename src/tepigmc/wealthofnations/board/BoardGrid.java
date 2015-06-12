package tepigmc.wealthofnations.board;

import tepigmc.wealthofnations.tiles.EmptyTile;
import tepigmc.wealthofnations.tiles.Tile;

public class BoardGrid {

  protected Tile[][] grid;
  protected int size;
  protected int rows;
  protected int cols;

  /**
   * @param size the amount of tiles in a hexagon side
   */
  public BoardGrid(int size) {
    setSize(size);
  }

  /**
   * @return the size
   */
  public int getSize() {
    return size;
  }

  /**
   * @return the rows
   */
  public int getRows() {
    return rows;
  }

  /**
   * @return the cols
   */
  public int getCols() {
    return cols;
  }

  /**
   * @param size the size to set
   */
  protected void setSize(int size) {
    this.size = size;
    rows = size * 2 - 1;
    cols = size * 4 - 2;
    grid = new Tile[rows][cols];
    for (int r = 0; r < rows; r++) {
      grid[r] = new Tile[cols];
      for (int c = 0; c < cols; c++)
        grid[r][c] = new EmptyTile();
    }
  }

}
