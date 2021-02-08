package SpaceX_OOP_Fantasy_Plane_Fight;

public class Number3 extends Sprite {

    public Number3(int x, int y) {

       
    }



    public void move() {

        if (Can_Move == false && dead == true) {
            y = 375;
            x = 355;
            if (max_score % 10000 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (max_score % 10000 == 1000) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (max_score % 10000 == 2000) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (max_score % 10000 == 3000) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (max_score % 10000 == 4000) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (max_score % 10000 == 5000) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (max_score % 10000 == 6000) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (max_score % 10000 == 7000) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (max_score % 10000 == 8000) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (max_score % 10000 == 9000) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        } else {
            y = 45;
            x = 395;
            if (num % 10000 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (num % 10000 == 1000) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (num % 10000 == 2000) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (num % 10000 == 3000) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (num % 10000 == 4000) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (num % 10000 == 5000) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (num % 10000 == 6000) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (num % 10000 == 7000) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (num % 10000 == 8000) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (num % 10000 == 9000) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        }

    }
}
