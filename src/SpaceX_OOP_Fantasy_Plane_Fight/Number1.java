package SpaceX_OOP_Fantasy_Plane_Fight;

public class Number1 extends Sprite {

    public Number1(int x, int y) {

       
    }

   
    public void move() {
        if (Can_Move == false && dead == true) {
            y = 375;
            x = 325;
            if (max_score % 1000000 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (max_score % 1000000 == 100000) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (max_score % 1000000 == 200000) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (max_score % 1000000 == 300000) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (max_score % 1000000 == 400000) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (max_score % 1000000 == 500000) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (max_score % 1000000 == 600000) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (max_score % 1000000 == 700000) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (max_score % 1000000 == 800000) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (max_score % 1000000 == 900000) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        } else {
            y = 45;
            x = 365;
            if (num % 1000000 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (num % 1000000 == 100000) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (num % 1000000 == 200000) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (num % 1000000 == 300000) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (num % 1000000 == 400000) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (num % 1000000 == 500000) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (num % 1000000 == 600000) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (num % 1000000 == 700000) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (num % 1000000 == 800000) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (num % 1000000 == 900000) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        }

    }
}
