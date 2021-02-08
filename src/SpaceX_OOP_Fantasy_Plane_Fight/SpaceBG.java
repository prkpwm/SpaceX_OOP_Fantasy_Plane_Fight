package SpaceX_OOP_Fantasy_Plane_Fight;


public class SpaceBG extends Sprite {



    public SpaceBG(int x, int y) {
        super(x, y);
        initSpaceShip();
        
    }

    private void initSpaceShip() {



        loadImage("/image/Page/BG.png");
        getImageDimensions();
        x = 0;
        y = -2160;

    }
    public void move() {

        y += 3;

        if (y > 0) {
            visible = true;
            x = 0;
            y = -2160;
            
        }
    }

  
}
