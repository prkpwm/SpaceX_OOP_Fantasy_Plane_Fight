package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class MovingSprite extends JFrame {

    public MovingSprite() {
      
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        setTitle("Space X OOP Fantasy Plane Fight");
        setSize(480, 720);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //SoundClipTest s=new SoundClipTest();
    }
    
  
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            MovingSprite run = new MovingSprite();
            run.setVisible(true); 
        });
        
    }
}