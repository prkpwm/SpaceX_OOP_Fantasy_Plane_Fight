package SpaceX_OOP_Fantasy_Plane_Fight;

public class Missile extends Sprite {

    public Missile(int x, int y) {
        super(x - 140, y - 60);
        initMissile();
    }

    private void initMissile() {
        loadImage("/image/Missle/missle.png");
        getImageDimensions();

    }

    public void move() {

        y -= 10;

        if (y > BOARD_WIDTH) {
            visible = false;
        }
    }
}
