package SpaceX_OOP_Fantasy_Plane_Fight;

public class Number5 extends Sprite {

    public Number5(int x, int y) {

     
    }

    public void move() {
        if (Can_Move == false && dead == true) {
            y = 375;
            x = 385;
            if (max_score % 100 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (max_score % 100 == 10) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (max_score% 100 == 20) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (max_score % 100 == 30) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (max_score % 100 == 40) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (max_score % 100 == 50) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (max_score % 100 == 60) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (max_score % 100 == 70) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (max_score % 100 == 80) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (max_score % 100 == 90) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        } else {
            y = 45;
            x = 425;
            if (num % 100 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (num % 100 == 10) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (num % 100 == 20) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (num % 100 == 30) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (num % 100 == 40) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (num % 100 == 50) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (num % 100 == 60) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (num % 100 == 70) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (num % 100 == 80) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (num % 100 == 90) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        }

    }
}
