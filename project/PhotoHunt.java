package project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;

// หลายสิ่งได้อธิบายไปแล้วในซอร์สโค้ดก่อนหน้านี้ ดังนั้นในซอร์สโค้ดนี้จะอธิบายสิ่งที่นอกเหนือไปจากนั้น
public class PhotoHunt extends JApplet
{
DrawingPanel drawingPanel ;
JLabel northLabel , scoreLabel ;
JButton startButton ; // ประกาศสร้างออบเจ็กต์ ชื่อ startButton เพื่อใช้คลาส JButton สำหรับสร้างปุ่มกด
JPanel southPanel ; // ประกาศสร้างออบเจ็กต์ ชื่อ southPanel เพื่อใช้คลาส JPanel สำหรับเป็นที่วางลาเบลและปุ่มกด
Timer timeForGame; // ประกาศสร้างออบเจ็กต์ ชื่อ timeForGame เพื่อใช้คลาส Timer สำหรับรันเวลา

boolean oneClick1 = false;
boolean oneClick2 = false;
boolean oneClick3 = false;

int mark = 0 ;

public void init()
{
Image picture1 = getImage(getCodeBase() , "original.gif");
Image picture2 = getImage(getCodeBase() , "change.gif");

doWork(getContentPane() , picture1 , picture2);
}
public void doWork(Container container , Image picture1 , Image picture2)
{
northLabel = new JLabel("Pics Hunt BY ECT");
northLabel.setFont(new Font("Lucida Handwriting" , Font.BOLD+Font.ITALIC , 31));
northLabel.setForeground(Color.blue);
northLabel.setHorizontalAlignment(JLabel.CENTER);


scoreLabel = new JLabel("Score : ");
scoreLabel.setFont(new Font("Cordia" , Font.BOLD+Font.ITALIC , 20));
scoreLabel.setForeground(Color.black);
scoreLabel.setHorizontalAlignment(JLabel.LEFT);

startButton = new JButton("Start");
startButton.setFont(new Font("Cordia" , Font.BOLD+Font.ITALIC , 16));
startButton.setForeground(Color.black);

southPanel = new JPanel();
southPanel.add(scoreLabel);
southPanel.add(startButton);

drawingPanel = new DrawingPanel(picture1 , picture2);

container.add(southPanel , BorderLayout.SOUTH);
container.add(northLabel , BorderLayout.NORTH);
container.add(drawingPanel , BorderLayout.CENTER);

startButton.addActionListener(new ActionListener(){ //สร้างคลาสย่อยสำหรับจัดการเมาส์คลิ้ก
public void actionPerformed(ActionEvent e) {

timeForGame.start(); // ให้ไทม์เมอร์เริ่มเดิน
oneClick1 = true; // เซตค่าให้เป็นจริงใหม่เพื่อให้เราคลิ้กแล้วมีผลเกิดขึ้นได้
drawingPanel.callDraw1 = false; // เซตค่าให้เป็นเท็จเพื่อที่จะได้ไม่สามารถวาดวงกลมได้

oneClick2 = true;
drawingPanel.callDraw2 = false;

oneClick3 = true;
drawingPanel.callDraw3 = false;

mark = 0;
scoreLabel.setText("Score : ");
drawingPanel.showWinnerGame = false ;
drawingPanel.showEndGame = false;
drawingPanel.time = 0;
drawingPanel.repaint();
}
});

timeForGame = new Timer(1000 , new ActionListener() { // สร้างไทม์เมอร์ให้รันเวลาของเกม
public void actionPerformed(ActionEvent e) {

drawingPanel.time ++ ; // ให้ตัวแปร time ในคลาส DrawingPanel เพิ่มทีละหนึ่ง

if (mark == 3)
{
timeForGame.stop(); // ไทม์เมอร์หยุดเมื่อเราหาตำแหน่งครบ
drawingPanel.showWinnerGame = true; // ให้แสดงข้อความยินดี
}

if ( drawingPanel.time > 30)
{
timeForGame.stop(); // ไทม์เมอร์หยุดเมื่อเราหาตำแหน่งไม่ครบแต่เวลาหมด
oneClick1 = false;
drawingPanel.callDraw1 = false;

oneClick2 = false;
drawingPanel.callDraw2 = false;

oneClick3 = false;
drawingPanel.callDraw3 = false;

drawingPanel.showEndGame = true;
drawingPanel.time = 0;
}
drawingPanel.repaint();
}
});

drawingPanel.addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent e) {
// ตัวเลขต่างๆ ได้มาจากโปรแกรมที่แล้วโดยจดใส่เศษกระดาษไว้
// และที่ใช้เครื่องหมาย || (or) หมายถึงคลิ้กที่รูปทางซ้ายหรือขวาก็ได้
if (oneClick1 == true)
{
if (
( (e.getX() < 150) && (e.getX() > 115 ) && (e.getY() < 35) && (e.getY() > 20 ) ) ||
( (e.getX() < 515) && (e.getX() > 480 ) && (e.getY() < 35) && (e.getY() > 20 ) ) )
{
mark ++; // ให้คะแนนเพิ่มทีละหนึ่ง
scoreLabel.setText("score :" + mark); // แสดงข้อความที่ลาเบล
drawingPanel.callDraw1 = true; // ให้วาดภาพวงกลม
oneClick1 = false ; // สิ่งที่อยู่ในบล็อกนี้จะไม่ถูกทำซ้ำอีกจนกว่าจะเริ่มเกมใหม่
drawingPanel.repaint(); // ให้ paint สิ่งต่างๆ ใหม่อีกครั้งหลังจากที่เราทำอะไรไป
}
}

if (oneClick2 == true)
{
if (
((e.getX() <235) && (e.getX() > 210 ) && (e.getY() < 150) && (e.getY() > 135 ) ) ||
((e.getX() < 600) && (e.getX() > 575 ) && (e.getY() < 150) && (e.getY() >135 ) ) )
{
mark ++;
scoreLabel.setText("score :" + mark);
drawingPanel.callDraw2 = true;
oneClick2 = false ;
drawingPanel.repaint();
}

}

if (oneClick3 == true)
{
if (
((e.getX() < 250) && (e.getX() > 225 ) && (e.getY() < 220) && (e.getY() >190 ) ) ||
((e.getX() < 620) && (e.getX() > 595 ) && (e.getY() <220) && (e.getY() > 190) ) )
{
mark ++;
scoreLabel.setText("score :" + mark);
drawingPanel.callDraw3 = true;
oneClick3 = false ;
drawingPanel.repaint();
}
}
}
});
}
public static void main(String[] args)
{
Image picture1 = Toolkit.getDefaultToolkit().getImage("C:/Users/skyva/Downloads/kuy.jpg");
Image picture2 = Toolkit.getDefaultToolkit().getImage("C:/Users/skyva/Downloads/kuy.jpg");

JFrame frame = new JFrame("PhotoHunt Game By ECT");
frame.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e){
System.exit(0);
}
});

PhotoHunt ph = new PhotoHunt();
ph.doWork(frame.getContentPane() , picture1 , picture2);
frame.setSize(new Dimension(750,400));
frame.setVisible(true);
}
}

class DrawingPanel extends JPanel
{
Image image1, image2 ;
boolean callDraw1 , callDraw2 , callDraw3 ; // สร้างตัวแปรชนิดบูลีน คือมีแค่สองค่า true กับ false
boolean showEndGame , showWinnerGame ;
int time; // สร้างตัวแปรชื่อ time เป็นชนิดเลขจำนวนเต็ม

// คอนสตัคเตอร์สำหรับกำหนดค่าเริ่มต้นให้กับตัวแปรต่างๆ และรับภาพที่ส่งเข้ามาในคลาสนี้
public DrawingPanel(Image image1 , Image image2 )
{
this.image1 = image1 ;
this.image2 = image2 ;

showEndGame = false ;
showWinnerGame = false ;
time = 0 ;
callDraw1 = false;
callDraw2 = false;
callDraw3 = false;
}
public void paintComponent(Graphics g)
{
super.paintComponent(g);
Graphics2D g2 = (Graphics2D)g ;

setBackground(Color.pink); // กำหนดสีให้กับ Background เป็นสีชมพู
g2.drawImage(image1,10,0,this); // วาดภาพชื่อ image1ที่ตำแหน่ง 10 ,0
g2.drawImage(image2,380,0,this);
g2.setPaint(Color.green); // กำหนดสีให้กับวงกลมเป็นสีเขียว
g2.setStroke(new BasicStroke(4.0f)); // กำหนดความหนาของเส้นของวงกลมเป็น 4.0f

if(callDraw1 == true) // ถ้าเงื่อนไขเป็นจริงให้ (คือคลิ้กถูก) จะวาดวงกลมสองวง
{
g2.draw(new Ellipse2D.Double(120 , 10 , 35 ,35)) ; // วาดที่ตำแหน่ง 120 ,10 มีรัศมี 35
g2.draw(new Ellipse2D.Double(490 , 10 , 35 ,35)) ;
}

if(callDraw2 == true)
{
g2.draw(new Ellipse2D.Double(210 , 130 , 35 ,35)) ;
g2.draw(new Ellipse2D.Double(580 , 130 , 35 ,35)) ;
}

if(callDraw3 == true)
{
g2.draw(new Ellipse2D.Double(230 , 195 , 35 ,35)) ;
g2.draw(new Ellipse2D.Double(605 , 195 , 35 ,35)) ;
}
// ถ้าเงื่อนไขเป็นจริงให้ทำสิ่งต่างๆ ในบล็อกนี้ (คลุมด้วย {?}) ถ้าไม่จริง (false) ก็ไม่ต้องทำ
if( showEndGame == true)
{
g2.setColor(Color.red); // กำหนดสีให้ฟอนต์เป็นสีแดง
g2.setFont(new Font("Comic Sans MS" , Font.BOLD+Font.ITALIC , 55));
g2.drawString("Game Over" , 220 , 80); // วาดข้อความ Game Over ที่ตำแหน่ง 220,80
}

// ถ้าเงื่อนไขเป็นจริงให้ทำสิ่งต่างๆ ในบล็อกนี้ (คลุมด้วย {?}) ถ้าไม่จริง (false) ก็ไม่ต้องทำ
if( showWinnerGame == true)
{
g2.setColor(Color.orange); // กำหนดสีให้ฟอนต์เป็นสีส้ม
g2.setFont(new Font("Lucida Handwriting" , Font.BOLD , 45)); // กำหนดรูปแบบฟอนต์
g2.drawString("Congratulations !" , 150 , 80); // วาดข้อความที่ตำแหน่ง 150,80
}
g2.setColor(Color.magenta); // กำหนดสีให้ฟอนต์เป็นสีม่วง
g2.setFont(new Font("Comic Sans MS",Font.BOLD+Font.ITALIC ,18)); // กำหนดรูปแบบฟอนต์
g2.drawString("Time for you : " + (30-time) , 550 , 270); // วาดข้อความที่ตำแหน่ง 550,270
g2.drawString("Find 3 different spots of pic" , 20 , 270); // วาดข้อความที่ตำแหน่ง 20,270
}
}
