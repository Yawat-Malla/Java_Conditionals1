import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ShootingGameGUI extends JPanel implements ActionListener, KeyListener {
    private int playerX = 200;
    private int playerY = 480;
    private int targetX = 200;
    private int targetY = 50;
    private int bulletX;
    private int bulletY;
    private boolean isBulletFired = false;
    private Timer timer;

    public ShootingGameGUI() {
        timer = new Timer(10, this);
        timer.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.RED);
        g.fillRect(playerX, playerY, 40, 20);

        g.setColor(Color.BLUE);
        g.fillRect(targetX, targetY, 20, 20);

        if (isBulletFired) {
            g.setColor(Color.YELLOW);
            g.fillRect(bulletX, bulletY, 5, 10);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isBulletFired) {
            bulletY -= 5;
            if (bulletY < 0) {
                isBulletFired = false;
            }
        }

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
        if (keyCode == KeyEvent.VK_SPACE && !isBulletFired) {
            isBulletFired = true;
            bulletX = playerX + 18;
            bulletY = playerY - 10;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Shooting Game");
            ShootingGameGUI game = new ShootingGameGUI();
            frame.add(game);
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
