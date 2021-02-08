package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.event.KeyEvent;

public class ChooseHero extends Sprite {

    public boolean press = false;

    public ChooseHero(int x, int y) {

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_NUMPAD1 && Can_Move == false && dead == false && run_at_first == true) {
            run = 1;
            MY_BLOOD = 4000;
            damage = 350;
            Can_Move = true;
            POWER = 40;

        }
        if (key == KeyEvent.VK_NUMPAD2 && Can_Move == false && dead == false && run_at_first == true) {
            run = 2;
            MY_BLOOD = 8000;
            damage = 150;
            Can_Move = true;
            POWER = 80;

        }
        if (key == KeyEvent.VK_NUMPAD3 && Can_Move == false && dead == false && run_at_first == true) {
            run = 3;
            MY_BLOOD = 10000;
            damage = 135;
            Can_Move = true;
            POWER = 100;

        }
        if (key == KeyEvent.VK_NUMPAD4 && Can_Move == false && dead == false && run_at_first == true) {
            run = 4;
            MY_BLOOD = 6000;
            damage = 300;
            Can_Move = true;
            POWER = 60;

        }

    }

    public void move() {
        if (Can_Move == false && dead == false) {
            loadImage("/image/Page/ChooseHero.png");
            getImageDimensions();

            num = 0;
            y = -20;
            x = 0;
        } else {
            y = 900;
            x = 0;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

    }

}
