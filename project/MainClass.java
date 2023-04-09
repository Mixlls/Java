package project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainClass extends JFrame {
    
    public MainClass() {
        initUI();
    }
    
    private void initUI() {
        setSize(600, 400);
        setTitle("Find the Difference");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(1080, 720));
        
        JLabel imageLabel = new JLabel(new ImageIcon("C:/Users/skyva/Downloads/kuy.jpg"));
        imageLabel.setBounds(50, 50, 250, 300);
        
        JLabel textLabel = new JLabel("Click on the difference");//ตำแหนงtxt
        textLabel.setBounds(250, 360, 150, 30);
        
        JPanel imagePanel = new JPanel();
        imagePanel.setBackground(Color.GREEN);
        imagePanel.setBounds(350, 50, 250, 300);
        imagePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getX() > 100 && e.getX() < 150 && e.getY() > 150 && e.getY() < 250) {
                    // ถ้าคลิกที่ตำแหน่งที่ต้องการให้ผู้เล่นจับผิด
                    textLabel.setText("Point X "+e.getX()+" Y "+e.getY());
                    textLabel.setForeground(Color.GREEN);
                } else {
                    // ถ้าคลิกที่ตำแหน่งอื่น ๆ
                    textLabel.setText("Try again");
                    textLabel.setForeground(Color.RED);
                }
            }
        });
        
        panel.add(imageLabel);
        panel.add(textLabel);
        panel.add(imagePanel);
        
        add(panel);
        pack();
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainClass game = new MainClass();
            game.setVisible(true);
        });
    }

}
