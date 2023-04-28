package main;
import java.awt.*;
import javax.swing.*;

import input.MouseInputs;
public class GamePanel extends JPanel{
    private MouseInputs mouseInputs;
    private int posX, posY;
    private Game game;
    public GamePanel(Game game){
        mouseInputs = new MouseInputs(this);
        this.game = game;
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
        setPanelSize();
    }
    public Game getGame(){
        return game;
    }
    private void setPanelSize() {
        Dimension size = new Dimension(1280, 800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        game.drawHome(g);
        if(posX > 495 && posX < 715 && posY > 345 && posY < 404)
            game.drawMode(g);
        if(posX > 650 && posX < 700 && posY > 190 && posY < 220)
            game.drawState(g);

    }

    public void setPosition(int x, int y){
        this.posX = x;
        this.posY = y;
        repaint();
    }
}
/*
 start 495-715 345-404
 */