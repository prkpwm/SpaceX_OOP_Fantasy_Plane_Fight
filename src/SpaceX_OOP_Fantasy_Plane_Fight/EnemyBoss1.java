package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class EnemyBoss1 extends Sprite {

    private List<MissileE> missilesE;

    public EnemyBoss1(int xE, int yE) {
        xPos = 165 - 80;
        yPos = 530 - 480;
        initSpaceShip();

    }

    private void initSpaceShip() {

        missilesE = new ArrayList<>();
        loadImage("/image/Enemy/boss1.png");
        getImageDimensions();
        timeValue();
        a = time;
        TM = timeM;
        xE = 900;
        yE = -2000;
        blood = 100000;

    }

    public int getXSpace() {
        return xE;
    }

    public List<MissileE> getMissilesE() {
        return missilesE;
    }

    public void move() {
        if (Can_Move == true) {
            visible = true;
            e = timeMi;
            xPos += dx;
            yPos += dy;
            timeValue();

            if (Math.abs(xPos - xE) <= 30 && Bullet == true && xE > 0) {
                //y = 800;        
                blood -= damage;
            } else if (Math.abs(timeM - TM) < 1) {
                if (blood < 0) {
                    yE -= 1;
                    c++;
                    if (c <= 500) {
                        num += 1;
                    }
                    if (yE == -200) {
                        visible = false;
                        yE = -400;

                    }

                } else if (yE < 0) {
                    xE = 90;
                    yE += 3;

                } else if (Math.abs(time - a) % 2 == 0 && yE >= 0) {
                    if (blood > 0) {
                        c = 0;
                        fire();
                        if (Math.abs(xPos - xE) <= 50) {
                            if (Math.abs(timeMi - e) > 0) {
                                count++;
                                e = timeMi;
                            }
                            if (count % 2 == 0) {
                                MY_BLOOD -= 10;

                            }
                        }
                        a = time;
                    }
                }
            } else {
                yE -= 1;
                if (yE == -200) {
                    visible = false;
                    yE = -400;
                }
            }
        } else {
            timeValue();
            a = time;
            TM = timeM;
            xE = 90;
            yE = -2000;
            c = 0;

        }

    }

    public void fire() {
        missilesE.add(new MissileE(xE + width, yE + height / 2));
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
