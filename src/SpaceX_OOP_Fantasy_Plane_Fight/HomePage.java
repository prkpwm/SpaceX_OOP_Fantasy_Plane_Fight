package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.event.KeyEvent;

public class HomePage extends Sprite {

    
    public int run_num = 0;

    public HomePage(int x, int y) {
        initMissile();
    }

    private void initMissile() {
        loadImage("/image/Page/home.png");
        getImageDimensions();
        y = 0;
        x = 0;
        e = timeMi;
        a = time;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_ENTER && run_at_first == false) {
            visible = false;
            y = -720;
            run_at_first = true;
            run_num=0;

        }

    }

    public void move() {
        //e = timeMi;
        if (run_at_first == false) {
            
            run_num+= 1;
            if (run_num % 41 == 0) {
                loadImage("/image/home/home1.png");
                getImageDimensions();
            } else if (run_num % 41 == 10) {
                loadImage("/image/home/home2.png");
                getImageDimensions();
            } else if (run_num % 41 == 20) {
                loadImage("/image/home/home3.png");
                getImageDimensions();
            } else if (run_num % 41 == 30) {
                loadImage("/image/home/home4.png");
                getImageDimensions();
            } else if (run_num % 41 == 40) {
                loadImage("/image/home/home5.png");
                getImageDimensions();
            }
        }

    }
   

}
