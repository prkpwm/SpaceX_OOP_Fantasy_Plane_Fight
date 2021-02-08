package SpaceX_OOP_Fantasy_Plane_Fight;

public class ScoreNum extends Sprite {

    public ScoreNum(int x, int y) {
        
        initMissile();
    }

    private void initMissile() {
        y=-20;
        x=350;
        loadImage("/image/Score.png");
        getImageDimensions();
    }
 
}