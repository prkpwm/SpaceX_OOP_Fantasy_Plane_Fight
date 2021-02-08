package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.event.KeyEvent;
import java.util.Random;

public class itemHeal extends Sprite {

    public itemHeal(int x, int y) {
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

            timeValue();

            if (alife == true) {
                loadImage("/image/item/itemHeal.png");
                getImageDimensions();
            } else {
                short_num++;

                if (short_num % 91 == 10) {
                    loadImage("/image/light/1.png");
                    getImageDimensions();
                    x = 20;

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
                if (short_num > 110) {
                    visible = false;
                    y = 800;
                    short_num = 0;
                }

            }
            Random rand = new Random();
            int n = rand.nextInt(40) + 40;
            if (Math.abs(xPos - x) <= 30 && Math.abs(yPos - y) <= 30) {
                //y=800;
                alife = false;
                MY_BLOOD += 50;

            } else if (Math.abs(time - a)%60 == 40) {
                visible = true;
                y = -100;
                x = 50;
                a = time;
                alife = true;
            }
        } else {
            timeValue();
            a = time;
            y = -1100;
            x = 50;
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
