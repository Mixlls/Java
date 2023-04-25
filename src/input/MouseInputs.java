package input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import entities.Play;
import main.HomePanel;

public class MouseInputs implements MouseListener , MouseMotionListener{
    private Play play;
    private HomePanel homePanel;
    public MouseInputs(HomePanel homePanel){
        this.homePanel = homePanel;
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
/*
 * ให้โปรแกรมถามผลลัพ
 * ให้คลาสไดอะแกรม เขียนโค้ด
 */
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("PosX: "+e.getX()+" PosY: "+e.getY());
        homePanel.setPosition(e.getX(), e.getY());
        // switch (Gamestate.state) {
        //     case MENU:
        //         gamePanel.getGame().getMenu().mouseClicked(e);
        //         break;
        //     case PLAYING:
        //         gamePanel.getGame().getPlaying().mouseClicked(e);
        //         break;
        //     default:
        //         break;
    
        //     }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
