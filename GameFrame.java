
import javax.swing.JFrame;

public class GameFrame extends JFrame{

    // Serialized class
    // private static final long serialVersionUID = 1L;

    GameFrame() {
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}