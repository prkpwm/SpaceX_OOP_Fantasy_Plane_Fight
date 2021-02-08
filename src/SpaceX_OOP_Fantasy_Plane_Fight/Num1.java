package SpaceX_OOP_Fantasy_Plane_Fight;

import static SpaceX_OOP_Fantasy_Plane_Fight.Sprite.NUM_MUTI;

public class Num1 extends Sprite {

    public Num1(int x, int y) {

       
    }



    public void move() {
        if (Can_Move == false && dead == true) {
            y = 280;
            x = 150;
        } else {
            y = 800;
        }

        if (num % 1000000 == 0) {
            loadImage("/image/Numberic/0_Big.png");
            getImageDimensions();
        } else if (num % 1000000 == 100000) {
            loadImage("/image/Numberic/1_Big.png");
            getImageDimensions();
        } else if (num % 1000000 == 200000) {
            loadImage("/image/Numberic/2_Big.png");
            getImageDimensions();
        } else if (num % 1000000 == 300000) {
            loadImage("/image/Numberic/3_Big.png");
            getImageDimensions();
        } else if (num % 1000000 == 400000) {
            loadImage("/image/Numberic/4_Big.png");
            getImageDimensions();
        } else if (num % 1000000 == 500000) {
            loadImage("/image/Numberic/5_Big.png");
            getImageDimensions();
        } else if (num % 1000000 == 600000) {
            loadImage("/image/Numberic/6_Big.png");
            getImageDimensions();
        } else if (num % 1000000 == 700000) {
            loadImage("/image/Numberic/7_Big.png");
            getImageDimensions();
        } else if (num % 1000000 == 800000) {
            loadImage("/image/Numberic/8_Big.png");
            getImageDimensions();
        } else if (num % 1000000 == 900000) {
            loadImage("/image/Numberic/9_Big.png");
            getImageDimensions();
        }

    }
}
