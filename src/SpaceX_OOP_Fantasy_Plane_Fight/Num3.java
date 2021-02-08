package SpaceX_OOP_Fantasy_Plane_Fight;

import static SpaceX_OOP_Fantasy_Plane_Fight.Sprite.NUM_MUTI;

public class Num3 extends Sprite {

    public Num3(int x, int y) {

        
    }



    public void move() {
        if(Can_Move==false && dead==true){
            y = 280;
            x = 210;
        }else{
            y = 800;
        } 
            
            if (num % 10000 == 0) {
                loadImage("/image/Numberic/0_Big.png");
                getImageDimensions();
            } else if (num % 10000 == 1000) {
                loadImage("/image/Numberic/1_Big.png");
                getImageDimensions();
            } else if (num % 10000 == 2000) {
                loadImage("/image/Numberic/2_Big.png");
                getImageDimensions();
            } else if (num % 10000 == 3000) {
                loadImage("/image/Numberic/3_Big.png");
                getImageDimensions();
            } else if (num % 10000 == 4000) {
                loadImage("/image/Numberic/4_Big.png");
                getImageDimensions();
            } else if (num % 10000 == 5000) {
                loadImage("/image/Numberic/5_Big.png");
                getImageDimensions();
            } else if (num % 10000 == 6000) {
                loadImage("/image/Numberic/6_Big.png");
                getImageDimensions();
            } else if (num % 10000 == 7000) {
                loadImage("/image/Numberic/7_Big.png");
                getImageDimensions();
            } else if (num % 10000 == 8000) {
                loadImage("/image/Numberic/8_Big.png");
                getImageDimensions();
            } else if (num % 10000 == 9000) {
                loadImage("/image/Numberic/9_Big.png");
                getImageDimensions();
            }
      

    }
}