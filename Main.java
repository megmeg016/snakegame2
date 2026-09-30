import javax.swing.*;

public class Main {//teste
Run | Debug
public static void main(String[] args) {
   SwingUtilities.invokelater(() -> {
   JFrame frame new JFrame(title: "Snake Game");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   GamePanel gamePanel new GamePanel();
   frame.add(gamePanel);
   frame.setResizable (resizable: false);
   frame.pack();
   frame.setLocationRelativeTo(c: null);
   frame.setVisible(b: true);
   });
