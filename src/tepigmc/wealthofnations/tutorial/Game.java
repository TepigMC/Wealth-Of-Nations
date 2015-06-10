package tepigmc.wealthofnations.tutorial;

import javax.swing.JFrame;

public class Game {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Wealth of Nations");
    GamePanel game = new GamePanel();
    frame.add(game);
    frame.setSize(640, 480);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    while (true) {
      game.moveBall();
      game.repaint();
      try {
        Thread.sleep(10);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
