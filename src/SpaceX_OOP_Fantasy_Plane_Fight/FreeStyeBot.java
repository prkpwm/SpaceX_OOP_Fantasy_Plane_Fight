package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FreeStyeBot extends Sprite {

    private final int MISSILE_SPEED = 1;

    private List<MissileEnemyFree> missEnemyFree;

    public FreeStyeBot(int x, int y) {
        super(x, y);
        xPos = x + 150;
        yPos = y + 400;
        initSpaceShip();

    }

    private void initSpaceShip() {
        missEnemyFree = new ArrayList<>();

    }

    public List<MissileEnemyFree> getMissilesmissEnemyFree() {
        return missEnemyFree;
    }

    public void move() {
        x += dx;
        y += dy;
        timeValue();
        Random rand = new Random();
        int n = rand.nextInt(100);

        if (n == 1) {
            //Fi();
        }

    }

    public void Fi() {
        missEnemyFree.add(new MissileEnemyFree(x + width, y + height / 2));
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
            Bullet = true;
        }
        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
            Bullet = false;
        }
        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

}
