package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.event.KeyEvent;

public class EndPage extends Sprite {

    int max = 0;

    public EndPage(int x, int y) {

    }

    public void move() {
        if (Can_Move == false && dead == true) {
            loadImage("/image/Page/end.png");
            getImageDimensions();
            if (num > max_score) {
                max_score = num;
            }
            y = 0;
            x = 0;

        } else {
            y = 800;
            if (num > max_score) {
                max_score = num;
            }
        }

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_ENTER && dead == true && Can_Move == false) {
            dead = false;
            num = 0;
        }
    }

}
