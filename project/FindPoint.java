package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;

// สร้างคลาสชื่อ FindPoint โดยให้เป็นคลาสลูกของคลาส JApplet เพื่อให้เราได้รับคุณสมบัติ
// บางอย่างมาใช้ (โดยใช้คำว่า extends)ในที่นี้คือความสามารถต่างๆ ที่ให้รันบนบราวเซอร์ได้
// คำว่า public บงบอกว่าคลาสที่สร้างนี้ให้คลาสอื่นเข้ามาใช้คลาสนี้ได้

public class FindPoint 
{
DrawingPanel drawingPanel ; // ประกาศใช้คลาส DrawingPanel
JLabel northLabel , southLabel ; // ประกาศใช้ลาเบล

public void doWork(Container container , Image picture1 , Image picture2)
{
northLabel = new JLabel("Photo Hunt By ECT"); // สร้างลาเบลที่มีข้อความ Photo Hunt
northLabel.setFont(new Font("Lucida Handwriting" , Font.BOLD+Font.ITALIC , 31));
northLabel.setForeground(Color.red); // ให้ตัวอักษรมีสีน้ำเงิน
northLabel.setHorizontalAlignment(JLabel.CENTER); // ให้ข้อความอยู่ตรงกลาง

southLabel = new JLabel(); // สร้างลาเบลที่ไม่มีข้อความ
southLabel.setFont(new Font("Cordia" , Font.BOLD+Font.ITALIC ,18)); //กำหนดรูปแบบฟอนต์
southLabel.setForeground(Color.GREEN); // ให้ตัวอักษรมีสีม่วง
southLabel.setHorizontalAlignment(JLabel.CENTER);

drawingPanel = new DrawingPanel(picture1 , picture2 ); // สร้างออบเจ็กต์ขึ้น


container.add(southLabel , BorderLayout.SOUTH); //นำลาเบลมาวางในคอนเทนเนอร์ทางใต้
container.add(northLabel , BorderLayout.NORTH); //นำลาเบลมาวางในคอนเทนเนอร์ทางเหนือ
container.add(drawingPanel , BorderLayout.CENTER); // นำ drawingPanel มาวางตรงกลาง

drawingPanel.addMouseMotionListener(new MouseMotionAdapter() { //ใส่แอ็กชันให้กับภาพ
public void mouseMoved(MouseEvent e) { // คือแอ็กชันจากเมาส์คลิ้ก
    southLabel.setText( "Point = (" + e.getX() + "," + e.getY() +")" ); //แสดงผลที่ลาเบลใต้
    }
    });
}

public static void main(String[] args) // สำหรับรันแบบ stand alone
{
Image picture1 = Toolkit.getDefaultToolkit().getImage("C:/Users/skyva/Downloads/kuy.jpg"); // โหลดภาพ
Image picture2 = Toolkit.getDefaultToolkit().getImage("C:/Users/skyva/Downloads/kuy.jpg"); // โหลดภาพ

JFrame frame = new JFrame("PhotoHunt Game By ECT "); // สร้างเฟรม
frame.addWindowListener(new WindowAdapter() { // สำหรับปิด Window
public void windowClosing(WindowEvent e){
System.exit(0);
}
});

FindPoint findPoint = new FindPoint(); // สร้างออบเจ็กต์ของคลาสนี้
findPoint.doWork(frame.getContentPane() , picture1 , picture2); // เรียก doWork method
frame.setSize(new Dimension(750,400)); // กำหนดขนาดหน้าจอเกม
frame.setVisible(true); // ให้ทุกสิ่ง paint บนจอ
}
}

class DrawingPanel extends JPanel // คลาสสำหรับจัดการแสดงภาพต่างๆ ในเกม
{
Image image1, image2 ;

public DrawingPanel(Image image1 , Image image2 ) // คอนสตัคเตอร์
{
this.image1 = image1 ;
this.image2 = image2 ;

}
public void paintComponent(Graphics g) // เมทธอดสำหรับด้านกราฟิก
{
super.paintComponent(g); // เคลียลร์จอ
Graphics2D g2 = (Graphics2D)g ; // สร้างออบเจ็กต์ g2 โดยแปลงมาจากออบเจ็กต์ g
// ทำให้เราสามารถใช้งานด้านสองมิติได้ถ้าจะใช้
setBackground(Color.LIGHT_GRAY); // ให้ background มีสีขาว
g2.drawImage(image1,10,0,this); // คำสั่งสำหรับวาดภาพชื่อ image1 ที่ตำแหน่ง 10,0
g2.drawImage(image2,380,0,this);
}
}
