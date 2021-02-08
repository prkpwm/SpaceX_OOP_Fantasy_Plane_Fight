package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class SpaceShip1 extends Sprite {

    private List<Missile> missiles;

    public SpaceShip1(int x, int y) {
        super(x, y);
        initSpaceShip();

    }

    private void initSpaceShip() {

        missiles = new ArrayList<>();
        loadImage("/image/Hero/Hero1.gif");
        getImageDimensions();

        x = 165;
        y = 500;

    }

    public void move() {

        if (Can_Move == true) {
            x += dx;
            y += dy;

            if (run == 1) {
                loadImage("/image/Hero/Hero1.gif");
                getImageDimensions();
            } else if (run == 2) {
                loadImage("/image/Hero/Hero2.png");
                getImageDimensions();
            } else if (run == 3) {
                loadImage("/image/Hero/Hero3.png");
                getImageDimensions();
            } else if (run == 4) {
                loadImage("/image/Hero/Hero4.png");
                getImageDimensions();
            }

            //System.out.println(MY_BLOOD);
            if (MY_BLOOD < 0) {
                Can_Move = false;
                dead = true;

            }

        } else {
            x = 165;
            y = 500;
        }

    }

    public List<Missile> getMissiles() {
        return missiles;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            fire();
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

    public void fire() {
        missiles.add(new Missile(x + width, y + height / 2));
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

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
