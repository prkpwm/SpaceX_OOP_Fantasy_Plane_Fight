package SpaceX_OOP_Fantasy_Plane_Fight;

import java.util.Random;

public class MissileEnemyFree extends Sprite {

    public MissileEnemyFree(int x, int y) {
        super(x, y);
        xPos = x + 150;
        yPos = y + 480;
        initMissile();
    }

    public MissileEnemyFree(boolean x) {
        this.Bullet = x;
    }

    private void initMissile() {

        timeValue();
        Random rand = new Random();
        loadImage("/image/Enemy/botFree.png");
        getImageDimensions();
        int[] pos = new int[]{300, 90, 150, 210, 270, 330, 390};
        int b = rand.nextInt(7);
        x = pos[3];
        y = -60;
        visible = true;
        e = timeMi;
        count = 1;
        alife = true;
    }

    public void move() {
        //xPos+=dx;
        //yPos+=dy;
        y += 2;
        visible = true;

        Random rand = new Random();
        int n = rand.nextInt(20) + 40;
        timeValue();
        if (alife == true) {
            loadImage("/image/Enemy/botFree.png");
            getImageDimensions();
        } else {
            if (Math.abs(timeMi - e) > 0) {
                count++;
                e = timeMi;
                x = 190;
            }

            if (count == 1) {
                loadImage("/image/explosions/explosions1.png");
                getImageDimensions();

            } else if (count == 2) {
                loadImage("/image/explosions/explosions2.png");
                getImageDimensions();

            } else if (count == 3) {
                loadImage("/image/explosions/explosions3.png");
                getImageDimensions();

            } else if (count == 4) {
                loadImage("/image/explosions/explosions4.png");
                getImageDimensions();

            } else if (count == 5) {
                loadImage("/image/explosions/explosions5.png");
                getImageDimensions();

            } else if (count == 6) {
                loadImage("/image/explosions/explosions6.png");
                getImageDimensions();
            }
            if (count > 6) {
                visible = false;
                count = 0;
                x = 210;
                alife = true;
            }

        }
        if (Math.abs(xPos - x) <= 30 && Math.abs(yPos - y) <= 100) {
            //visible=false;
            alife = false;

        }
        if (y > 800) {
            visible = false;
        }

    }

}
