package SpaceX_OOP_Fantasy_Plane_Fight;

import static SpaceX_OOP_Fantasy_Plane_Fight.Sprite.NUM_MUTI;

public class Num2 extends Sprite {

    public Num2(int x, int y) {

        
    }

 

    public void move() {
        if (Can_Move == false && dead == true) {
            y = 280;
            x = 180;
        } else {
            y = 800;
        }

        if (num % 100000 == 0) {
            loadImage("/image/Numberic/0_Big.png");
            getImageDimensions();
        } else if (num % 100000 == 10000) {
            loadImage("/image/Numberic/1_Big.png");
            getImageDimensions();
        } else if (num % 100000 == 20000) {
            loadImage("/image/Numberic/2_Big.png");
            getImageDimensions();
        } else if (num % 100000 == 30000) {
            loadImage("/image/Numberic/3_Big.png");
            getImageDimensions();
        } else if (num % 100000 == 40000) {
            loadImage("/image/Numberic/4_Big.png");
            getImageDimensions();
        } else if (num % 100000 == 50000) {
            loadImage("/image/Numberic/5_Big.png");
            getImageDimensions();
        } else if (num % 100000 == 60000) {
            loadImage("/image/Numberic/6_Big.png");
            getImageDimensions();
        } else if (num % 100000 == 70000) {
            loadImage("/image/Numberic/7_Big.png");
            getImageDimensions();
        } else if (num % 100000 == 80000) {
            loadImage("/image/Numberic/8_Big.png");
            getImageDimensions();
        } else if (num % 100000 == 90000) {
            loadImage("/image/Numberic/9_Big.png");
            getImageDimensions();
        }

    }
}
