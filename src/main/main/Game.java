package main;

import java.awt.Graphics;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

import entities.Play;

public class Game {
    private HomePanel homePanel;
    private Play play;
    public Game(){
        homePanel = new HomePanel(this);
        setting();
        new HomeWindow(homePanel);
        homePanel.requestFocus();
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
