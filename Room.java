import java.awt.*;
import java.applet.*;

class Room
{
   public static void drawWalls(Graphics g)
   {
      int red;
      int green;
      int blue;
      
      //set canvas color and draw background
      g.setColor(new Color(110,110,110));
      g.fillRect(0,0,800,600);
      
      //generate random bluish color...
      red = 89;
      green  = ((int) ((Math.random()*45)+109));
      blue = 168;         
      g.setColor(new Color(red,green,blue));     
      //draw stage
      g.fillRect(150,150,500,300);
      
      //draw edges
      g.setColor(new Color(0,0,0));
      g.drawLine(0,0,150,150);
      g.drawLine(0,600,150,450);
      g.drawLine(650,150,800,0);
      g.drawLine(650,450,800,600);
      
      
   }
   
   public static void drawFloor(Graphics g)
   {
   //A1
   Polygon A1 = new Polygon();
   A1.addPoint(150,450);
   A1.addPoint(275,450);
   A1.addPoint(250,500);
   A1.addPoint(100,500);
   g.fillPolygon(A1);
   
   //B1
   Polygon B1 = new Polygon();
   B1.addPoint(50,550);
   B1.addPoint(225,550);
   B1.addPoint(250,500);
   B1.addPoint(100,500);
   g.setColor(new Color(0,255,0));
   g.fillPolygon(B1);
   
   //C1
   Polygon C1 = new Polygon();
   C1.addPoint(50,550);
   C1.addPoint(225,550);
   C1.addPoint(200,600);
   C1.addPoint(0,600);
   g.setColor(new Color(40,255,100));
   g.fillPolygon(C1);
      
   //A2
   Polygon A2 = new Polygon();
   A2.addPoint(275,450);
   A2.addPoint(400,450);
   A2.addPoint(400,500);
   A2.addPoint(250,500);
   g.setColor(new Color(0,255,0));
   g.fillPolygon(A2);
   
   //B2
   Polygon B2 = new Polygon();
   B2.addPoint(225,550);
   B2.addPoint(400,550);
   B2.addPoint(400,500);
   B2.addPoint(250,500);
   g.setColor(new Color(0,0,0));
   g.fillPolygon(B2);
   
   //C2
   Polygon C2 = new Polygon();
   C2.addPoint(225,550);
   C2.addPoint(400,550);
   C2.addPoint(400,600);
   C2.addPoint(200,600);
   g.setColor(new Color(0,255,0));
   g.fillPolygon(C2);
   
   
   //A3
   Polygon A3 = new Polygon();
   A3.addPoint(400,450);
   A3.addPoint(525,450);
   A3.addPoint(550,500);
   A3.addPoint(400,500);
   g.setColor(new Color(0,0,0));
   g.fillPolygon(A3);
   
   //B3
   Polygon B3 = new Polygon();
   B3.addPoint(400,550);
   B3.addPoint(575,550);
   B3.addPoint(550,500);
   B3.addPoint(400,500);
   g.setColor(new Color(0,225,0));
   g.fillPolygon(B3);
   
   }
}  