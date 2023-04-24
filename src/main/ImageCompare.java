// package main;
// import java.awt.Color;
// import java.awt.Graphics;
// import java.awt.Image;
// import java.awt.Point;
// import java.awt.event.MouseAdapter;
// import java.awt.event.MouseEvent;
// import java.awt.image.BufferedImage;
// import java.io.IOException;
// import java.net.URL;
// import javax.imageio.ImageIO;
// import javax.swing.JFrame;
// import javax.swing.JPanel;
// public class ImageCompare {
//     private static final long serialVersionUID = 1L;
//     private BufferedImage leftImage;
//     private BufferedImage rightImage;
//     private int width;
//     private int height;
//     private Point lastClick;

//     public ImageCompare(String leftImagePath, String rightImagePath) {
//         try {
//             URL leftImageUrl = getClass().getResource(leftImagePath);
//             URL rightImageUrl = getClass().getResource(rightImagePath);
//             leftImage = ImageIO.read(leftImageUrl);
//             rightImage = ImageIO.read(rightImageUrl);
//             width = leftImage.getWidth();
//             height = leftImage.getHeight();
//             addMouseListener(new MouseAdapter() {
//                 public void mouseClicked(MouseEvent e) {
//                     lastClick = e.getPoint();
//                     repaint();
//                 }
//             });
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     @Override
//     public void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         g.drawImage(leftImage, 0, 0, null);
//         g.drawImage(rightImage, width, 0, null);
//         if (lastClick != null) {
//             int x = lastClick.x;
//             int y = lastClick.y;
//             int rgbLeft = leftImage.getRGB(x, y);
//             int rgbRight = rightImage.getRGB(x - width, y);
//             if (rgbLeft != rgbRight) {
//                 g.setColor(Color.RED);
//                 g.drawLine(x, y, x - width, y);
//             }
//         }
//     }
// }
