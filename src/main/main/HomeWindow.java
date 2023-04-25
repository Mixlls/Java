package main;

import javax.swing.*;

public class HomeWindow extends JFrame{
    private JFrame jframe;
    public HomeWindow (HomePanel homePanel){
        jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(homePanel);

        jframe.setResizable(false);
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
