package SpaceX_OOP_Fantasy_Plane_Fight;

public class Number6 extends Sprite {

    public Number6(int x, int y) {

     
    }


    public void move() {
        if (Can_Move == false && dead == true) {
            y = 375;
            x = 400;
            if (max_score % 10 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (max_score% 10 == 1) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (max_score % 10 == 2) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (max_score % 10 == 3) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (max_score % 10 == 4) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (max_score % 10 == 5) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (max_score % 10 == 6) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (max_score % 10 == 7) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (max_score % 10 == 8) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (max_score% 10 == 9) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        } else {
            y = 45;
            x = 440;
            if (num % 10 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (num % 10 == 1) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (num % 10 == 2) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (num % 10 == 3) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (num % 10 == 4) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (num % 10 == 5) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (num % 10 == 6) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (num % 10 == 7) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (num % 10 == 8) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (num % 10 == 9) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        }

    }
}
