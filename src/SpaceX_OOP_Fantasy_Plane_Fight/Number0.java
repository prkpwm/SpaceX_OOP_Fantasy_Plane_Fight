package SpaceX_OOP_Fantasy_Plane_Fight;

public class Number0 extends Sprite {

    public Number0(int x, int y) {

       
    }

    public void move() {

        if (Can_Move == false && dead == true) {
            y = 375;
            x = 310;
            if (max_score % 10000000 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (max_score % 10000000 == 1000000) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (max_score % 10000000 == 2000000) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (max_score % 10000000 == 3000000) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (max_score % 10000000 == 4000000) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (max_score % 10000000 == 5000000) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (max_score % 10000000 == 6000000) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (max_score % 10000000 == 7000000) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (max_score % 10000000 == 8000000) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (max_score % 10000000 == 9000000) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        } else {
            y = 45;
            x = 350;
            if (num % 10000000 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (num % 10000000 == 1000000) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (num % 10000000 == 2000000) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (num % 10000000 == 3000000) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (num % 10000000 == 4000000) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (num % 10000000 == 5000000) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (num % 10000000 == 6000000) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (num % 10000000 == 7000000) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (num % 10000000 == 8000000) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (num % 10000000 == 9000000) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        }

    }
}
