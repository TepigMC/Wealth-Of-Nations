package tepigmc.wealthofnations;

import javax.swing.JFrame;

public class WealthOfNations {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Wealth of Nations");
    GameBoardPanel game = new GameBoardPanel();
    frame.add(game);
    frame.setSize(640, 480);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    game.repaint();
    
    /*while (true) {
      game.moveSprite();
      game.repaint();
      try {
        Thread.sleep(10);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }*/
  }

}
