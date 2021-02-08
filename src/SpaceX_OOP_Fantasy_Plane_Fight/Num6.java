package SpaceX_OOP_Fantasy_Plane_Fight;

import static SpaceX_OOP_Fantasy_Plane_Fight.Sprite.Can_Move;
import static SpaceX_OOP_Fantasy_Plane_Fight.Sprite.dead;

public class Num6 extends Sprite {

    public Num6(int x, int y) {

    }

    public void move() {
        if (Can_Move == false && dead == true) {
            y = 280;
            x = 300;
        } else {
            y = 800;
        }
        if (num % 10 == 0) {
            loadImage("/image/Numberic/0_Big.png");
            getImageDimensions();
        } else if (num % 10 == 1) {
            loadImage("/image/Numberic/1_Big.png");
            getImageDimensions();
        } else if (num % 10 == 2) {
            loadImage("/image/Numberic/2_Big.png");
            getImageDimensions();
        } else if (num % 10 == 3) {
            loadImage("/image/Numberic/3_Big.png");
            getImageDimensions();
        } else if (num % 10 == 4) {
            loadImage("/image/Numberic/4_Big.png");
            getImageDimensions();
        } else if (num % 10 == 5) {
            loadImage("/image/Numberic/5_Big.png");
            getImageDimensions();
        } else if (num % 10 == 6) {
            loadImage("/image/Numberic/6_Big.png");
            getImageDimensions();
        } else if (num % 10 == 7) {
            loadImage("/image/Numberic/7_Big.png");
            getImageDimensions();
        } else if (num % 10 == 8) {
            loadImage("/image/Numberic/8_Big.png");
            getImageDimensions();
        } else if (num % 10 == 9) {
            loadImage("/image/Numberic/9_Big.png");
            getImageDimensions();
        }

    }
}
