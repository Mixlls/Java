package entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class Play{
    private BufferedImage img_start,img_board,img_quit,img_gamename,img_rope,img_TTR;
    private BufferedImage img_back,img_easy,img_normal,img_hard;
    private BufferedImage imgOriganal,img,imgCicle;
    private BufferedImage img_bg_state,img_bg_home,img_bg_mode;
    private int x,y;

    public Play() {
        loadimg();
    }
    public void update(){

    }
    public void drawHome(Graphics g){
        g.drawImage(img_bg_state,0, 0,1280,800, null);
        g.drawImage(img_rope, 510, 320,270, 300, null);
        g.drawImage(img_start, 490, 300, 300, 150, null);
        g.drawImage(img_board, 490, 400, 300, 150, null);
        g.drawImage(img_quit, 490, 500, 300, 150, null);
        g.drawImage(img_gamename, 390, 100, 500, 250, null);
        g.drawImage(img_TTR, 0, 0, 114, 87, null);
    }
    public void drawMode(Graphics g){
        g.drawImage(img_bg_state,0, 0,1280,800, null);
        g.drawImage(img_back, 0,0, 112, 112, null);
        g.drawImage(img_rope, 490, 200,350, 450, null);
        g.drawImage(img_easy, 440, 100,436, 219, null);
        g.drawImage(img_normal, 440, 270,436, 219, null);
        g.drawImage(img_hard, 390, 390,535, 314, null);
    }
    public void drawState(Graphics g){
        g.drawImage(img_bg_state,0, 0, null);
        g.drawImage(imgOriganal, 25, 150, null);
        g.drawImage(img, 650, 150, null);
    }
    public void loadimg(){
        InputStream isCicle = getClass().getResourceAsStream("/res/cicle1.png");
        InputStream isBG = getClass().getResourceAsStream("/res/BG.png");
        InputStream isStage = getClass().getResourceAsStream("/res/Edit_Easy/stage1.png");
        InputStream isStageOrginal = getClass().getResourceAsStream("/res/Stage1_origanal.png");
        InputStream back  = getClass().getResourceAsStream("/res/back.png");
        InputStream easy  = getClass().getResourceAsStream("/res/Easy.png");
        InputStream normal  = getClass().getResourceAsStream("/res/Normal.png");
        InputStream hard  = getClass().getResourceAsStream("/res/Hard2.png");
        InputStream rope = getClass().getResourceAsStream("/res/rope.png");
        InputStream is = getClass().getResourceAsStream("/res/Start.png");
        InputStream board = getClass().getResourceAsStream("/res/Bord.png");
        InputStream quit = getClass().getResourceAsStream("/res/Quit.png");
        InputStream gamename = getClass().getResourceAsStream("/res/NameGame.png");
        InputStream TTR = getClass().getResourceAsStream("/res/TTR.png");
        try {
            img_bg_state = ImageIO.read(isBG);
            img = ImageIO.read(isStage);
            imgOriganal = ImageIO.read(isStageOrginal);
            imgCicle = ImageIO.read(isCicle);
            img_back = ImageIO.read(back);
            img_normal = ImageIO.read(normal);
            img_easy = ImageIO.read(easy);
            img_hard = ImageIO.read(hard);
            img_rope = ImageIO.read(rope);
            img_start = ImageIO.read(is);
            img_board = ImageIO.read(board);
            img_quit = ImageIO.read(quit);
            img_gamename = ImageIO.read(gamename);
            img_TTR = ImageIO.read(TTR);
        } catch (IOException e) { 
            e.printStackTrace();
        }
    }
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
}
