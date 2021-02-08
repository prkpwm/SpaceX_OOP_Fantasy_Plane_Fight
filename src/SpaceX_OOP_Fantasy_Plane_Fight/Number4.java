package SpaceX_OOP_Fantasy_Plane_Fight;

public class Number4 extends Sprite {

    public Number4(int x, int y) {

    }



    public void move() {
        if (Can_Move == false && dead == true) {
            y = 375;
            x = 370;
            if (max_score % 1000 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (max_score % 1000 == 100) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (max_score % 1000 == 200) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (max_score % 1000 == 300) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (max_score % 1000 == 400) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (max_score % 1000 == 500) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (max_score % 1000 == 600) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (max_score % 1000 == 700) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (max_score % 1000 == 800) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (max_score % 1000 == 900) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        } else {
            y = 45;
            x = 410;
            if (num % 1000 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (num % 1000 == 100) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (num % 1000 == 200) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (num % 1000 == 300) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (num % 1000 == 400) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (num % 1000 == 500) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (num % 1000 == 600) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (num % 1000 == 700) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (num % 1000 == 800) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (num % 1000 == 900) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        }

    }
}
