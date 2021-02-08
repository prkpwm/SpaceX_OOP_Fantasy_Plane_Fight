package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.event.KeyEvent;

public class EnemyBot3 extends Sprite {

    public EnemyBot3(int x, int y) {
        super(x, y);
        xPos = x + 150;
        yPos = y + 480;
       

    }

   

    public void move() {
        if (Can_Move == true) {
            visible = true;
            xPos += dx;
            yPos += dy;
            y += 2;

            timeValue();
            if (alife == true) {
                loadImage("/image/Enemy/bot1.png");
                getImageDimensions();
            } else {
                short_num++;
                if (short_num % 61 == 10) {
                    loadImage("/image/explosions/explosions1.png");
                    getImageDimensions();
                } else if (short_num % 61 == 20) {
                    loadImage("/image/explosions/explosions2.png");
                    getImageDimensions();

                } else if (short_num % 61 == 30) {
                    loadImage("/image/explosions/explosions3.png");
                    getImageDimensions();

                } else if (short_num % 61 == 40) {
                    loadImage("/image/explosions/explosions4.png");
                    getImageDimensions();

                } else if (short_num % 61 == 50) {
                    loadImage("/image/explosions/explosions5.png");
                    getImageDimensions();

                } else if (short_num % 61 == 60) {
                    loadImage("/image/explosions/explosions6.png");
                    getImageDimensions();
                }
                if (short_num > 61) {
                    visible = false;
                    y = 800;
                    short_num = 0;
                }

            }

            if (blood < 0) {
                alife = false;
                c++;
                if(c<=NUM_MUTI){
                    num += 1;
                }
            }
            if (Math.abs(xPos - x) <= 30 && Math.abs(yPos - y) <= 30) {
                MY_BLOOD -= 10;
            }

            if (Math.abs(xPos - x) <= 30 && Bullet == true && y > 0 && yPos > y) {
                //y = 800;
          
                
                blood -= damage;

            } else if (Math.abs(time - a) % 15 == 0) {
                visible = true;
                x = 200;
                y = -200;
                a = time;
                alife = true;
                blood = 1000;
                c=0;

            }
        } else {
            timeValue();
            a = time;
            x = 200;
            y = -200;
            alife = true;
            blood =  1000;
            c=0;
        }

    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
            Bullet = true;
        }
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
        if (key == KeyEvent.VK_SPACE) {
            Bullet = false;
        }
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
