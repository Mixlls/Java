package main;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.*;

import input.MouseInputs;

public class GamePanel extends JPanel{
    private BufferedImage imgOriganal,img,img_bg,imgCicle;
    private MouseInputs mouseInputs;
    private int posx = 0,posy = 0;
    public GamePanel(){
        mouseInputs = new MouseInputs(this);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
        setPanelSize();
        importImg_BG();
        importImg_Origanal();
        importImg();
        imgportCicle();
    }
    public void Compare(int posx,int posy){
        this.posx = posx;
        this.posy = posy;
        repaint();
    }
    private void imgportCicle(){
        InputStream is = getClass().getResourceAsStream("/res/cicle1.png");
        try {
            imgCicle = ImageIO.read(is);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    private void importImg_BG() {
        InputStream is = getClass().getResourceAsStream("/res/BG.png");
        try {
            img_bg = ImageIO.read(is);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    private void importImg() {
        InputStream is = getClass().getResourceAsStream("/res/Stage1.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    private void importImg_Origanal() {
        InputStream is = getClass().getResourceAsStream("/res/Stage1_origanal.png");
        try {
            imgOriganal = ImageIO.read(is);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    private void setPanelSize() {
        Dimension size = new Dimension(1280, 800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img_bg,0, 0, null);
        g.drawImage(imgOriganal, 25, 150, null);
        g.drawImage(img, 650, 150, null);
        if(posx > 930 && posy > 300){
            g.drawImage(imgCicle, 915, 282, null);
        }
    }

}