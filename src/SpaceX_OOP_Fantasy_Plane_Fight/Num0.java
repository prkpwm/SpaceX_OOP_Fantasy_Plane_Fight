package SpaceX_OOP_Fantasy_Plane_Fight;

public class Num0 extends Sprite {

    public Num0(int x, int y) {

    }

    public void move() {
        if (Can_Move == false && dead == true) {
            y = 280;
            x = 120;

        } else {
            y = 800;
        }
        if (num % 10000000 == 0) {
            loadImage("/image/Numberic/0_Big.png");
            getImageDimensions();
        } else if (num % 10000000 == 1000000) {
            loadImage("/image/Numberic/1_Big.png");
            getImageDimensions();
        } else if (num % 10000000 == 2000000) {
            loadImage("/image/Numberic/2_Big.png");
            getImageDimensions();
        } else if (num % 10000000 == 3000000) {
            loadImage("/image/Numberic/3_Big.png");
            getImageDimensions();
        } else if (num % 10000000 == 4000000) {
            loadImage("/image/Numberic/4_Big.png");
            getImageDimensions();
        } else if (num % 10000000 == 5000000) {
            loadImage("/image/Numberic/5_Big.png");
            getImageDimensions();
        } else if (num % 10000000 == 6000000) {
            loadImage("/image/Numberic/6_Big.png");
            getImageDimensions();
        } else if (num % 10000000 == 7000000) {
            loadImage("/image/Numberic/7_Big.png");
            getImageDimensions();
        } else if (num % 10000000 == 8000000) {
            loadImage("/image/Numberic/8_Big.png");
            getImageDimensions();
        } else if (num % 10000000 == 9000000) {
            loadImage("/image/Numberic/9_Big.png");
            getImageDimensions();
        }

    }
}
