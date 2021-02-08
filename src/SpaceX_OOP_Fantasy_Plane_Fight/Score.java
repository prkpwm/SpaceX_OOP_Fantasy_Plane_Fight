package SpaceX_OOP_Fantasy_Plane_Fight;



public class Score extends Sprite {

    public Score(int x, int y) {
        
        initMissile();
    }

    private void initMissile() {
        y=-20;
        x=355;
        loadImage("/image/Numberic/Score.png");
        getImageDimensions();
        

    }

    
}