import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simple2DGame extends JPanel implements ActionListener, KeyListener {
    private int playerX = 200;
    private int playerY = 450;
    private List<Point> obstacles = new ArrayList<>();
    private Timer timer;

    public Simple2DGame() {
        timer = new Timer(20, this);
        timer.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void generateObstacle() {
        int obstacleX = new Random().nextInt(getWidth() - 20);
        obstacles.add(new Point(obstacleX, 0));
    }

    public void moveObstacles() {
        for (Point obstacle : obstacles) {
            obstacle.setLocation(obstacle.getX(), obstacle.getY() + 5);
        }
    }

    public void checkCollisions() {
        Rectangle playerBounds = new Rectangle(playerX, playerY, 40, 40);
        for (Point obstacle : obstacles) {
            Rectangle obstacleBounds = new Rectangle((int) obstacle.getX(), (int) obstacle.getY(), 20, 20);
            if (playerBounds.intersects(obstacleBounds)) {
                timer.stop();
                System.out.println("Game Over!");
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.RED);
        g.fillRect(playerX, playerY, 40, 40);

        g.setColor(Color.GREEN);
        for (Point obstacle : obstacles) {
            g.fillRect((int) obstacle.getX(), (int) obstacle.getY(), 20, 20);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moveObstacles();
        generateObstacle();
        checkCollisions();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT && playerX > 0) {
            playerX -= 10;
        }
        if (keyCode == KeyEvent.VK_RIGHT && playerX < getWidth() - 40) {
            playerX += 10;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple 2D Game");
            Simple2DGame game = new Simple2DGame();
            frame.add(game);
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
