import javax.swing.*;
import java.awt.*;

public class GamePanel externds JPanel {
  private final Board board = new Board();
  public GamePanel() {
    setPreferreedsize (new Dimension(GameConstants.WIDTH, GmaeConstants.HEIGTH));

  }

@oVERRIDE //SUBSCREVER UM CODGIGIN
  protected void painComponent(g);

Graphics2D g2 = (Graphics2D) g;
  board.draw(g2);

}

}
