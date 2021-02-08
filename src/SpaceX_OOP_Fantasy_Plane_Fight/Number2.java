package SpaceX_OOP_Fantasy_Plane_Fight;

public class Number2 extends Sprite {

    public Number2(int x, int y) {

        
    }

  

    public void move() {

        if (Can_Move == false && dead == true) {
            y = 375;
            x = 340;
            if (max_score % 100000 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (max_score % 100000 == 10000) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (max_score % 100000 == 20000) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (max_score % 100000 == 30000) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (max_score % 100000 == 40000) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (max_score % 100000 == 50000) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (max_score % 100000 == 60000) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (max_score % 100000 == 70000) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (max_score % 100000 == 80000) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (max_score % 100000 == 90000) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        } else {
            y = 45;
            x = 380;
            if (num % 100000 == 0) {
                loadImage("/image/Numberic/0.png");
                getImageDimensions();
            } else if (num % 100000 == 10000) {
                loadImage("/image/Numberic/1.png");
                getImageDimensions();
            } else if (num % 100000 == 20000) {
                loadImage("/image/Numberic/2.png");
                getImageDimensions();
            } else if (num % 100000 == 30000) {
                loadImage("/image/Numberic/3.png");
                getImageDimensions();
            } else if (num % 100000 == 40000) {
                loadImage("/image/Numberic/4.png");
                getImageDimensions();
            } else if (num % 100000 == 50000) {
                loadImage("/image/Numberic/5.png");
                getImageDimensions();
            } else if (num % 100000 == 60000) {
                loadImage("/image/Numberic/6.png");
                getImageDimensions();
            } else if (num % 100000 == 70000) {
                loadImage("/image/Numberic/7.png");
                getImageDimensions();
            } else if (num % 100000 == 80000) {
                loadImage("/image/Numberic/8.png");
                getImageDimensions();
            } else if (num % 100000 == 90000) {
                loadImage("/image/Numberic/9.png");
                getImageDimensions();
            }
        }

    }

}
