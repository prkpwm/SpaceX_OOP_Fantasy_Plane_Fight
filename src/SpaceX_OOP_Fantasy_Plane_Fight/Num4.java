package SpaceX_OOP_Fantasy_Plane_Fight;

import static SpaceX_OOP_Fantasy_Plane_Fight.Sprite.Can_Move;
import static SpaceX_OOP_Fantasy_Plane_Fight.Sprite.NUM_MUTI;
import static SpaceX_OOP_Fantasy_Plane_Fight.Sprite.dead;

public class Num4 extends Sprite {

    public Num4(int x, int y) {

        
    }



    public void move() {
        if(Can_Move==false && dead==true){
            y = 280;
            x = 240;
        }else{
            y = 800;
        } 
            
            if (num % 1000 == 0) {
                loadImage("/image/Numberic/0_Big.png");
                getImageDimensions();
            } else if (num % 1000 == 100) {
                loadImage("/image/Numberic/1_Big.png");
                getImageDimensions();
            } else if (num % 1000 == 200) {
                loadImage("/image/Numberic/2_Big.png");
                getImageDimensions();
            } else if (num % 1000 == 300) {
                loadImage("/image/Numberic/3_Big.png");
                getImageDimensions();
            } else if (num % 1000 == 400) {
                loadImage("/image/Numberic/4_Big.png");
                getImageDimensions();
            } else if (num % 1000 == 500) {
                loadImage("/image/Numberic/5_Big.png");
                getImageDimensions();
            } else if (num % 1000 == 600) {
                loadImage("/image/Numberic/6_Big.png");
                getImageDimensions();
            } else if (num % 1000 == 700) {
                loadImage("/image/Numberic/7_Big.png");
                getImageDimensions();
            } else if (num % 1000 == 800) {
                loadImage("/image/Numberic/8_Big.png");
                getImageDimensions();
            } else if (num % 1000 == 900) {
                loadImage("/image/Numberic/9_Big.png");
                getImageDimensions();
            }
      

    }
}