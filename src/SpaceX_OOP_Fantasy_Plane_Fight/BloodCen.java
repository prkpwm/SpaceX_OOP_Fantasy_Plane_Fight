package SpaceX_OOP_Fantasy_Plane_Fight;


import java.awt.event.KeyEvent;

public class BloodCen extends Sprite {

    public int i = 0;
    
    public int W;

    public BloodCen(int x, int y) {
        initMissile();
    }

    private void initMissile() {

        

    }

    public void move() {
        
        W =MY_BLOOD;
        
        if (W > 90 * POWER ) {
            loadImage("/image/Blood/BloodPercen100.png");
            getImageDimensions();
            y = 631;
            x = 37;
        } else if (W > 80 * POWER && W <= 90 * POWER) {
            loadImage("/image/Blood/BloodPercen90.png");
            getImageDimensions();
            y = 631;
            x = 37;
        } else if (W > 70 * POWER && W <= 80 * POWER) {
            loadImage("/image/Blood/BloodPercen80.png");
            getImageDimensions();
            y = 631;
            x = 37;
        } else if (W > 60 * POWER && W <= 70 * POWER) {
            loadImage("/image/Blood/BloodPercen70.png");
            getImageDimensions();
            y = 631;
            x = 37;
        } else if (W > 50 * POWER && W <= 60 * POWER) {
            loadImage("/image/Blood/BloodPercen60.png");
            getImageDimensions();
            y = 631;
            x = 37;
        } else if (W > 40 * POWER && W <= 50 * POWER) {
            loadImage("/image/Blood/BloodPercen50.png");
            getImageDimensions();
            y = 631;
            x = 37;
        } else if (W > 30 * POWER && W <= 40 * POWER) {
            loadImage("/image/Blood/BloodPercen40.png");
            getImageDimensions();
            y = 631;
            x = 37;
        } else if (W > 20 * POWER && W <= 30 * POWER) {
            loadImage("/image/Blood/BloodPercen30.png");
            getImageDimensions();
            y = 631;
            x = 37;
        } else if (W > 10 * POWER && W <= 20 * POWER) {
            loadImage("/image/Blood/BloodPercen20.png");
            getImageDimensions();
            y = 631;
            x = 37;
        } else if (W > 0 && W <= 10 * POWER) {
            loadImage("/image/Blood/BloodPercen10.png");
            getImageDimensions();
            y = 631;
            x = 37;
        } else if (W < 0) {
            loadImage("/image/Blood/BloodEmtry.png");
            getImageDimensions();
            y = 630;
            x = 37;
        }

    }

}
