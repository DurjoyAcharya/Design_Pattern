package BrickBracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class gamePlay extends JPanel implements KeyListener, ActionListener {
    private boolean play=false;
    private int score=0;
    private int totalBricks=0;
    private Timer timer;
    private int delay=8;

    private int playerX=310;
    private int ballPosX=120;
    private int ballPosY=350;
    private int ballXdir=-1;
    private int ballYdir=-2;
    public gamePlay() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer=new Timer(delay,this);
        timer.start();
    }
    public void paint(Graphics g)
    {
        //background
        g.setColor(Color.BLACK);
        g.fillRect(1,1,692,592);


        //borders
        g.setColor(Color.yellow);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
        g.fillRect(692,0,3,592);

        //the paddle
        g.setColor(Color.green);
        g.fillRect(playerX,550,100,8);

        //the ball
        g.setColor(Color.yellow);
        g.fillRect(ballPosX,ballPosY,100,8);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                if(playerX >=600){
                    playerX=600;
                }else{
                    moveRight();
                }
            }
            if (e.getKeyCode()==KeyEvent.VK_LEFT){
                if(playerX <10){
                    playerX=10;
                }else{
                    moveLeft();
                }
            }

    }

    private void moveRight() {
        play=true;
        playerX+=20;
    }

    private void moveLeft() {
        play=true;
        playerX-=20;
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
