package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.event.KeyEvent;
import java.util.Random;

public class itemDamage extends Sprite {

    public itemDamage(int x, int y) {
        super(x, y);
        xPos = x + 150;
        yPos = y + 480;
        initMissile();
    }

    private void initMissile() {
  
    }

    public void move() {
        if (Can_Move == true) {
            xPos += dx;
            yPos += dy;
            y += 2;
            Random rand = new Random();
            int n = rand.nextInt(40) + 30;
            timeValue();
            if (alife == true) {
                loadImage("/image/item/itemDamage.png");
                getImageDimensions();
            } else {
                short_num++;

                if (short_num % 91 == 10) {
                    loadImage("/image/light/1.png");
                    getImageDimensions();
                    x = 320;

                } else if (short_num % 91 == 20) {
                    loadImage("/image/light/2.png");
                    getImageDimensions();

                } else if (short_num % 91 == 30) {
                    loadImage("/image/light/3.png");
                    getImageDimensions();

                } else if (short_num % 91 == 40) {
                    loadImage("/image/light/4.png");
                    getImageDimensions();

                } else if (short_num % 91 == 50) {
                    loadImage("/image/light/5.png");
                    getImageDimensions();

                } else if (short_num % 91 == 60) {
                    loadImage("/image/light/6.png");
                    getImageDimensions();
                } else if (short_num % 91 == 70) {
                    loadImage("/image/light/7.png");
                    getImageDimensions();
                } else if (short_num % 91 == 80) {
                    loadImage("/image/light/8.png");
                    getImageDimensions();
                } else if (short_num % 91 == 90) {
                    loadImage("/image/light/9.png");
                    getImageDimensions();
                }
                if (short_num > 101) {
                    visible = false;
                    y = 800;
                    short_num = 0;
                }

            }
            if (Math.abs(xPos - x) <= 30 && Math.abs(yPos - y) <= 30) {
                //y=800;
                alife = false;
                k = true;
            } else if (Math.abs(time - a)%60 == 20) {
                visible = true;
                y = -100;
                x = 350;
                a = time;
                alife = true;
                k = false;
            }
            
            int D1=damage*3;
            int D2=damage;
            if (k == true) {
                damage = D1;
            }else{
                damage = D2;
            } 
        } else {
            timeValue();
            a = time;
            y = -1100;
            x = 350;
            alife = true;
            k = false;
        }

    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }

    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

}
