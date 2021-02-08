package SpaceX_OOP_Fantasy_Plane_Fight;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

    private final int ICRAFT_X = 40;
    private final int ICRAFT_Y = 60;
    private final int DELAY = 10;
    private Timer timer;
    private SpaceShip1 spaceShip1;
    private SpaceBG Spacebg;
    private EnemyBoss1 EBoss1;
    private EnemyBoss2 EBoss2;
    private EnemyBoss3 EBoss3;
    private EnemyBoss4 EBoss4;
    private EnemyBot1 EBot1;
    private EnemyBot2 EBot2;
    private EnemyBot3 EBot3;
    private EnemyBot4 EBot4;
    private EnemyBot5 EBot5;
    private HomePage Home;
    private EndPage End;
    private ChooseHero Choose;
    private Score score;
    private BloodEm BloodEm;
    private BloodCen BloodCen;
    private itemHeal itemHeal;
    private itemDamage itemDamage;
    private itemScore itemScore;
    private FreeStyeBot FreeStyeBot;
    private MissileEnemyFree MissileEnemyFree;
    private Bot1 Bot1;
    private Bot2 Bot2;
    private Bot3 Bot3;
    private Bot4 Bot4;
    private Bot5 Bot5;
    private Bot6 Bot6;
    private Bot7 Bot7;
    private Bot8 Bot8;
    private Bot9 Bot9;
    private Bot10 Bot10;
    private Num0 Num0;
    private Num1 Num1;
    private Num2 Num2;
    private Num3 Num3;
    private Num4 Num4;
    private Num5 Num5;
    private Num6 Num6;
    private Number0 Number0;
    private Number1 Number1;
    private Number2 Number2;
    private Number3 Number3;
    private Number4 Number4;
    private Number5 Number5;
    private Number6 Number6;

    public Board() {

        initBoard();
    }

    private void initBoard() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.darkGray);
        setDoubleBuffered(true);

        Spacebg = new SpaceBG(ICRAFT_X, ICRAFT_Y);
        spaceShip1 = new SpaceShip1(ICRAFT_X, ICRAFT_Y);
        EBoss1 = new EnemyBoss1(ICRAFT_X, ICRAFT_Y);
        EBoss2 = new EnemyBoss2(ICRAFT_X, ICRAFT_Y);
        EBoss3 = new EnemyBoss3(ICRAFT_X, ICRAFT_Y);
        EBoss4 = new EnemyBoss4(ICRAFT_X, ICRAFT_Y);
        EBot1 = new EnemyBot1(ICRAFT_X, ICRAFT_Y);
        EBot2 = new EnemyBot2(ICRAFT_X, ICRAFT_Y);
        EBot3 = new EnemyBot3(ICRAFT_X, ICRAFT_Y);
        EBot4 = new EnemyBot4(ICRAFT_X, ICRAFT_Y);
        EBot5 = new EnemyBot5(ICRAFT_X, ICRAFT_Y);
        Home = new HomePage(ICRAFT_X, ICRAFT_Y);
        End = new EndPage(ICRAFT_X, ICRAFT_Y);
        Choose = new ChooseHero(ICRAFT_X, ICRAFT_Y);
        score = new Score(ICRAFT_X, ICRAFT_Y);
        BloodEm = new BloodEm(ICRAFT_X, ICRAFT_Y);
        BloodCen = new BloodCen(ICRAFT_X, ICRAFT_Y);
        itemHeal = new itemHeal(ICRAFT_X, ICRAFT_Y);
        itemDamage = new itemDamage(ICRAFT_X, ICRAFT_Y);
        itemScore = new itemScore(ICRAFT_X, ICRAFT_Y);
        FreeStyeBot = new FreeStyeBot(ICRAFT_X, ICRAFT_Y);
        MissileEnemyFree = new MissileEnemyFree(ICRAFT_X, ICRAFT_Y);
        Bot1 = new Bot1(ICRAFT_X, ICRAFT_Y);
        Bot2 = new Bot2(ICRAFT_X, ICRAFT_Y);
        Bot3 = new Bot3(ICRAFT_X, ICRAFT_Y);
        Bot4 = new Bot4(ICRAFT_X, ICRAFT_Y);
        Bot5 = new Bot5(ICRAFT_X, ICRAFT_Y);
        Bot6 = new Bot6(ICRAFT_X, ICRAFT_Y);
        Bot7 = new Bot7(ICRAFT_X, ICRAFT_Y);
        Bot8 = new Bot8(ICRAFT_X, ICRAFT_Y);
        Bot9 = new Bot9(ICRAFT_X, ICRAFT_Y);
        Bot10 = new Bot10(ICRAFT_X, ICRAFT_Y);
        Num0 = new Num0(ICRAFT_X, ICRAFT_Y);
        Num1 = new Num1(ICRAFT_X, ICRAFT_Y);
        Num2 = new Num2(ICRAFT_X, ICRAFT_Y);
        Num3 = new Num3(ICRAFT_X, ICRAFT_Y);
        Num4 = new Num4(ICRAFT_X, ICRAFT_Y);
        Num5 = new Num5(ICRAFT_X, ICRAFT_Y);
        Num6 = new Num6(ICRAFT_X, ICRAFT_Y);
        Number0 = new Number0(ICRAFT_X, ICRAFT_Y);
        Number1 = new Number1(ICRAFT_X, ICRAFT_Y);
        Number2 = new Number2(ICRAFT_X, ICRAFT_Y);
        Number3 = new Number3(ICRAFT_X, ICRAFT_Y);
        Number4 = new Number4(ICRAFT_X, ICRAFT_Y);
        Number5 = new Number5(ICRAFT_X, ICRAFT_Y);
        Number6 = new Number6(ICRAFT_X, ICRAFT_Y);

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Homepage(g);

        Toolkit.getDefaultToolkit().sync();
    }

    public void Homepage(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        doDrawingHERO1(g);
        Choosehero(g);
        g2d.drawImage(Home.getImage(), Home.getX(),
                Home.getY(), this);

    }

    public void Endpage(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(End.getImage(), End.getX(),
                End.getY(), this);
        g2d.drawImage(Num0.getImage(), Num0.getX(),
                Num0.getY(), this);
        g2d.drawImage(Num1.getImage(), Num1.getX(),
                Num1.getY(), this);
        g2d.drawImage(Num2.getImage(), Num2.getX(),
                Num2.getY(), this);
        g2d.drawImage(Num3.getImage(), Num3.getX(),
                Num3.getY(), this);
        g2d.drawImage(Num4.getImage(), Num4.getX(),
                Num4.getY(), this);
        g2d.drawImage(Num5.getImage(), Num5.getX(),
                Num5.getY(), this);
        g2d.drawImage(Num6.getImage(), Num6.getX(),
                Num6.getY(), this);
        g2d.drawImage(Number0.getImage(), Number0.getX(),
                Number0.getY(), this);
        g2d.drawImage(Number1.getImage(), Number1.getX(),
                Number1.getY(), this);
        g2d.drawImage(Number2.getImage(), Number2.getX(),
                Number2.getY(), this);
        g2d.drawImage(Number3.getImage(), Number3.getX(),
                Number3.getY(), this);
        g2d.drawImage(Number4.getImage(), Number4.getX(),
                Number4.getY(), this);
        g2d.drawImage(Number5.getImage(), Number5.getX(),
                Number5.getY(), this);
        g2d.drawImage(Number6.getImage(), Number6.getX(),
                Number6.getY(), this);

    }

    public void Choosehero(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(Choose.getImage(), Choose.getX(),
                Choose.getY(), this);

    }

    private void doDrawingEnemyBot(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(EBot1.getImage(), EBot1.getX(),
                EBot1.getY(), this);
        g2d.drawImage(EBot2.getImage(), EBot2.getX(),
                EBot2.getY(), this);
        g2d.drawImage(EBot3.getImage(), EBot3.getX(),
                EBot3.getY(), this);
        g2d.drawImage(EBot4.getImage(), EBot4.getX(),
                EBot4.getY(), this);
        g2d.drawImage(EBot5.getImage(), EBot5.getX(),
                EBot5.getY(), this);
        g2d.drawImage(Bot1.getImage(), Bot1.getX(),
                Bot1.getY(), this);
        g2d.drawImage(Bot2.getImage(), Bot2.getX(),
                Bot2.getY(), this);
        g2d.drawImage(Bot3.getImage(), Bot3.getX(),
                Bot3.getY(), this);
        g2d.drawImage(Bot4.getImage(), Bot4.getX(),
                Bot4.getY(), this);
        g2d.drawImage(Bot5.getImage(), Bot5.getX(),
                Bot5.getY(), this);
        g2d.drawImage(Bot6.getImage(), Bot6.getX(),
                Bot6.getY(), this);
        g2d.drawImage(Bot7.getImage(), Bot7.getX(),
                Bot7.getY(), this);
        g2d.drawImage(Bot8.getImage(), Bot8.getX(),
                Bot8.getY(), this);
        g2d.drawImage(Bot9.getImage(), Bot9.getX(),
                Bot9.getY(), this);
        g2d.drawImage(Bot10.getImage(), Bot10.getX(),
                Bot10.getY(), this);
    }

    private void Draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(itemHeal.getImage(), itemHeal.getX(),
                itemHeal.getY(), this);
        g2d.drawImage(itemDamage.getImage(), itemDamage.getX(),
                itemDamage.getY(), this);
        g2d.drawImage(itemScore.getImage(), itemScore.getX(),
                itemScore.getY(), this);
        g2d.drawImage(EBoss1.getImage(), EBoss1.getXE(),
                EBoss1.getYE(), this);
        g2d.drawImage(EBoss2.getImage(), EBoss2.getXE(),
                EBoss2.getYE(), this);
        g2d.drawImage(EBoss3.getImage(), EBoss3.getXE(),
                EBoss3.getYE(), this);
        g2d.drawImage(EBoss4.getImage(), EBoss4.getXE(),
                EBoss4.getYE(), this);
        g2d.drawImage(score.getImage(), score.getX(),
                score.getY(), this);

        g2d.drawImage(BloodEm.getImage(), BloodEm.getX(),
                BloodEm.getY(), this);
        g2d.drawImage(BloodCen.getImage(), BloodCen.getX(),
                BloodCen.getY(), this);

    }

    private void Fire(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        List<MissileEnemyFree> missEnemyFree = FreeStyeBot.getMissilesmissEnemyFree();

        for (MissileEnemyFree missileE : missEnemyFree) {

            g2d.drawImage(missileE.getImage(), missileE.getX(),
                    missileE.getY(), this);
        }
    }

    private void Boss(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        List<MissileE> missilesE = EBoss1.getMissilesE();

        for (MissileE missileE : missilesE) {

            g2d.drawImage(missileE.getImage(), missileE.getXE(),
                    missileE.getYE(), this);
        }

        List<MissileE> missilesE1 = EBoss2.getMissilesE();

        for (MissileE missileE : missilesE1) {

            g2d.drawImage(missileE.getImage(), missileE.getXE(),
                    missileE.getYE(), this);
        }
        List<MissileE> missilesE2 = EBoss3.getMissilesE();

        for (MissileE missileE : missilesE2) {

            g2d.drawImage(missileE.getImage(), missileE.getXE(),
                    missileE.getYE(), this);
        }
        List<MissileE> missilesE3 = EBoss4.getMissilesE();

        for (MissileE missileE : missilesE3) {

            g2d.drawImage(missileE.getImage(), missileE.getXE(),
                    missileE.getYE(), this);
        }
        Fire(g);
    }

    private void doDrawingHERO1(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(Spacebg.getImage(), Spacebg.getX(),
                Spacebg.getY(), this);
        doDrawingEnemyBot(g);
        Draw(g);
        g2d.drawImage(spaceShip1.getImage(), spaceShip1.getX(),
                spaceShip1.getY(), this);
        Endpage(g);

        List<Missile> missiles = spaceShip1.getMissiles();

        for (Missile missile : missiles) {

            g2d.drawImage(missile.getImage(), missile.getX(),
                    missile.getY(), this);
        }
        Boss(g);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateMissiles1();
        updateSpaceShip();
        updateMissilesE();
        updateMissilesEBoss2();
        updateMissilesEBoss3();
        updateMissilesEBoss4();
        updateMissilesmissEnemyFree();
        repaint();

    }

    private void updateMissiles1() {

        List<Missile> missiles = spaceShip1.getMissiles();
        for (int i = 0; i < missiles.size(); i++) {

            Missile missile = missiles.get(i);

            if (missile.isVisible()) {

                missile.move();

            } else {

                missiles.remove(i);
            }
        }
    }

    private void updateMissilesE() {

        List<MissileE> missilesE = EBoss1.getMissilesE();
        for (int i = 0; i < missilesE.size(); i++) {

            MissileE missileE = missilesE.get(i);

            if (missileE.isVisible()) {

                missileE.move();

            } else {

                missilesE.remove(i);
            }
        }

    }

    private void updateMissilesmissEnemyFree() {

        List<MissileEnemyFree> missEnemyFree = FreeStyeBot.getMissilesmissEnemyFree();
        for (int i = 0; i < missEnemyFree.size(); i++) {

            MissileEnemyFree missile = missEnemyFree.get(i);

            if (missile.isVisible()) {

                missile.move();

            } else {

                missEnemyFree.remove(i);
            }
        }

    }

    private void updateMissilesEBoss2() {

        List<MissileE> missilesE = EBoss2.getMissilesE();
        for (int i = 0; i < missilesE.size(); i++) {

            MissileE missileE = missilesE.get(i);

            if (missileE.isVisible()) {

                missileE.move();

            } else {

                missilesE.remove(i);
            }
        }

    }

    private void updateMissilesEBoss3() {

        List<MissileE> missilesE = EBoss3.getMissilesE();
        for (int i = 0; i < missilesE.size(); i++) {

            MissileE missileE = missilesE.get(i);

            if (missileE.isVisible()) {

                missileE.move();

            } else {

                missilesE.remove(i);
            }
        }

    }

    private void updateMissilesEBoss4() {

        List<MissileE> missilesE = EBoss4.getMissilesE();
        for (int i = 0; i < missilesE.size(); i++) {

            MissileE missileE = missilesE.get(i);

            if (missileE.isVisible()) {

                missileE.move();

            } else {

                missilesE.remove(i);
            }
        }

    }

    private void updateSpaceShip() {

        End.move();
        Choose.move();
        Home.move();
        spaceShip1.move();
        Spacebg.move();
        EBot1.move();
        EBot2.move();
        EBot3.move();
        EBot4.move();
        EBot5.move();
        EBoss1.move();
        EBoss2.move();
        EBoss3.move();
        EBoss4.move();
        itemHeal.move();
        itemDamage.move();
        itemScore.move();
        // MissileEnemyFree.move();
        //FreeStyeBot.move();
        Bot1.move();
        Bot2.move();
        Bot3.move();
        Bot4.move();
        Bot5.move();
        Bot6.move();
        Bot7.move();
        Bot8.move();
        Bot9.move();
        Bot10.move();
        BloodCen.move();
        Num0.move();
        Num1.move();
        Num2.move();
        Num3.move();
        Num4.move();
        Num5.move();
        Num6.move();
        Number0.move();
        Number1.move();
        Number2.move();
        Number3.move();
        Number4.move();
        Number5.move();
        Number6.move();

    }

    void actionPerformed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            Choose.keyReleased(e);
            spaceShip1.keyReleased(e);
            itemDamage.keyReleased(e);
            itemHeal.keyReleased(e);
            itemScore.keyReleased(e);
            FreeStyeBot.keyReleased(e);
            EBot1.keyReleased(e);
            EBot2.keyReleased(e);
            EBot3.keyReleased(e);
            EBot4.keyReleased(e);
            EBot5.keyReleased(e);
            Bot1.keyReleased(e);
            Bot2.keyReleased(e);
            Bot3.keyReleased(e);
            Bot4.keyReleased(e);
            Bot5.keyReleased(e);
            Bot6.keyReleased(e);
            Bot7.keyReleased(e);
            Bot8.keyReleased(e);
            Bot9.keyReleased(e);
            Bot10.keyReleased(e);
            EBoss1.keyReleased(e);
            EBoss2.keyReleased(e);
            EBoss3.keyReleased(e);
            EBoss4.keyReleased(e);

        }

        @Override
        public void keyPressed(KeyEvent e) {
            Choose.keyPressed(e);
            Home.keyPressed(e);
            spaceShip1.keyPressed(e);
            itemDamage.keyPressed(e);
            itemHeal.keyPressed(e);
            itemScore.keyPressed(e);
            FreeStyeBot.keyPressed(e);
            EBot1.keyPressed(e);
            EBot2.keyPressed(e);
            EBot3.keyPressed(e);
            EBot4.keyPressed(e);
            EBot5.keyPressed(e);
            Bot1.keyPressed(e);
            Bot2.keyPressed(e);
            Bot3.keyPressed(e);
            Bot4.keyPressed(e);
            Bot5.keyPressed(e);
            Bot6.keyPressed(e);
            Bot7.keyPressed(e);
            Bot8.keyPressed(e);
            Bot9.keyPressed(e);
            Bot10.keyPressed(e);
            EBoss1.keyPressed(e);
            EBoss2.keyPressed(e);
            EBoss3.keyPressed(e);
            EBoss4.keyPressed(e);
            End.keyPressed(e);

        }

    }

}
