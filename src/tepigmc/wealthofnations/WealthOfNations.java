package tepigmc.wealthofnations;

import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import tepigmc.wealthofnations.board.BoardPanel;

public class WealthOfNations {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Wealth of Nations");
    BoardPanel game = new BoardPanel();
    frame.add(game);
    try {
      List<Image> icons = new ArrayList<Image>();
      icons.add(new ImageIcon(new File(getAssetFolder(), "gui/icon/icon_128.png").toURI()
          .toURL()).getImage());
      icons.add(new ImageIcon(new File(getAssetFolder(), "gui/icon/icon_64.png").toURI()
          .toURL()).getImage());
      icons.add(new ImageIcon(new File(getAssetFolder(), "gui/icon/icon_32.png").toURI()
          .toURL()).getImage());
      icons.add(new ImageIcon(new File(getAssetFolder(), "gui/icon/icon_16.png").toURI()
          .toURL()).getImage());
      frame.setIconImages(icons);
    }
    catch (MalformedURLException e) {
      e.printStackTrace();
    }
    frame.setSize(640, 480);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    game.repaint();

    /*
     * while (true) { game.moveSprite(); game.repaint(); try { Thread.sleep(10);
     * } catch (InterruptedException e) { e.printStackTrace(); } }
     */
  }

  /**
   * @return the path to the assets
   */
  public static File getAssetFolder() {
    File file = null;
    try {
      file = new File(WealthOfNations.class.getResource("assets").toURI());
    }
    catch (URISyntaxException e) {
      e.printStackTrace();
    }
    return file;
  }

}
