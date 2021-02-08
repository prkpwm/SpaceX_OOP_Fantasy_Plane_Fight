package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;

public class Sprite {

    public static short POWER;
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible = false;
    protected Image image;
    protected int xE = 0;
    protected int yE = 0;
    protected short time;
    protected short timeM;
    protected short timeMi;
    protected int count = 0;
    protected int xPos;
    protected int yPos;
    protected int dx;
    protected int dy;
    public boolean alife = true;
    public boolean Bullet = false;
    public static boolean Can_Move = false;
    public static boolean dead = false;
    protected double e = 0;
    protected int blood;
    public static int MY_BLOOD;
    public static int Score_Value = 1;
    public static int num = 0;
    public static int NUM_MUTI = 10;
    public static int damage = 0;
    public static int run = 0;
    protected int c = 1;
    protected short TM;
    protected short a;
    protected final int BOARD_WIDTH = 720;
    protected boolean k = false;
    public static boolean run_at_first = false;
    protected static int max_score = 0;
    protected short short_num = 0;

    public Sprite(int x, int y) {

        this.x = x;
        this.y = y;
        visible = true;
    }

    public Sprite() {
        visible = true;
    }

    public void timeValue() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatterSS = DateTimeFormatter.ofPattern("ss");
        String a = now.format(formatterSS);
        DateTimeFormatter formatterMM = DateTimeFormatter.ofPattern("mm");
        String M = now.format(formatterMM);
        DateTimeFormatter formatterZZ = DateTimeFormatter.ofPattern("S");
        String Z = now.format(formatterZZ);
        time = Short.parseShort(a.trim());
        timeM = Short.parseShort(M.trim());
        timeMi = Short.parseShort(Z.trim());
    }

    protected void loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(new ImageIcon(getClass().getResource(imageName)).getImage());
        image = ii.getImage();
    }

    protected void getImageDimensions() {

        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXE() {
        return xE;
    }

    public int getYE() {
        return yE;
    }

    public boolean isVisible() {
        return visible;
    }

}
