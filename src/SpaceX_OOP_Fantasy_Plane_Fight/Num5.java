package SpaceX_OOP_Fantasy_Plane_Fight;

import static SpaceX_OOP_Fantasy_Plane_Fight.Sprite.Can_Move;
import static SpaceX_OOP_Fantasy_Plane_Fight.Sprite.NUM_MUTI;
import static SpaceX_OOP_Fantasy_Plane_Fight.Sprite.dead;

public class Num5 extends Sprite {

    public Num5(int x, int y) {

        
    }



    public void move() {
        if (Can_Move == false && dead == true) {
            y = 280;
            x = 270;
        } else {
            y = 800;
        }

        if (num % 100 == 0) {
            loadImage("/image/Numberic/0_Big.png");
            getImageDimensions();
        } else if (num % 100 == 10) {
            loadImage("/image/Numberic/1_Big.png");
            getImageDimensions();
        } else if (num % 100 == 20) {
            loadImage("/image/Numberic/2_Big.png");
            getImageDimensions();
        } else if (num % 100 == 30) {
            loadImage("/image/Numberic/3_Big.png");
            getImageDimensions();
        } else if (num % 100 == 40) {
            loadImage("/image/Numberic/4_Big.png");
            getImageDimensions();
        } else if (num % 100 == 50) {
            loadImage("/image/Numberic/5_Big.png");
            getImageDimensions();
        } else if (num % 100 == 60) {
            loadImage("/image/Numberic/6_Big.png");
            getImageDimensions();
        } else if (num % 100 == 70) {
            loadImage("/image/Numberic/7_Big.png");
            getImageDimensions();
        } else if (num % 100 == 80) {
            loadImage("/image/Numberic/8_Big.png");
            getImageDimensions();
        } else if (num % 100 == 90) {
            loadImage("/image/Numberic/9_Big.png");
            getImageDimensions();
        }

    }
}
