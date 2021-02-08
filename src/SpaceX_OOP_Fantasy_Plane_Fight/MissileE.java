package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.event.KeyEvent;

public class MissileE extends Sprite {

    public MissileE(int xE, int yE) {
        super(xE - 140, yE - 60);
        initMissile();

    }

    private void initMissile() {
        timeValue();
        loadImage("/image/Missle/missleEnemy.png");
        getImageDimensions();
        if (time % 3 == 0) {
            xE = 213;
            yE = 180;

        } else if (time % 3 == 1) {
            xE = 150;
            yE = 180;

        } else {
            xE = 270;
            yE = 180;
        }
    }

    public void move() {
        yE += 3;

        if (yE > 590) {
            visible = false;
        }

    }

}
