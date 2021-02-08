package SpaceX_OOP_Fantasy_Plane_Fight;


public class BloodEm extends Sprite {

    public BloodEm(int x, int y) {
        initMissile();
    }

    private void initMissile() {
        loadImage("/image/Blood/BloodEmtry.png");
        getImageDimensions();
        y=630;
        x=40;

    }

    
}