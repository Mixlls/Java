package main;

import java.awt.Graphics;
import entities.Play;

public class Game {
    private GamePanel gamePanel;
    private Play play;
    public Game(){
        gamePanel = new GamePanel(this);
        setting();
        new GameWindow(gamePanel);
        gamePanel.requestFocus();
        startGame();
    }
    public void setting(){
        play = new Play();
    }
    public void startGame(){
    }
    public void drawHome(Graphics g){
        play.drawHome(g);
    }
    public void drawMode(Graphics g){
        play.drawMode(g);
    }
    public void drawState(Graphics g){
        play.drawState(g);
    }
    public void sdfd(){
        
    }
}
