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
      g.setColor(new Color(60,60,60));
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
   int red;
   int green;
   int blue;
   
   //color 1
   red = 30;
   green  = ((int) ((Math.random()*62)+193));
   blue = ((int) ((Math.random()*62)+100));;        
   g.setColor(new Color(red,green,blue));
    
   //A1
   Polygon A1 = new Polygon();
   A1.addPoint(150,450);
   A1.addPoint(275,450);
   A1.addPoint(250,500);
   A1.addPoint(100,500);
   g.fillPolygon(A1);
   
   //A3
   Polygon A3 = new Polygon();
   A3.addPoint(400,450);
   A3.addPoint(525,450);
   A3.addPoint(550,500);
   A3.addPoint(400,500);
   g.fillPolygon(A3);

   //C2
   Polygon C2 = new Polygon();
   C2.addPoint(225,550);
   C2.addPoint(400,550);
   C2.addPoint(400,600);
   C2.addPoint(200,600);
   g.fillPolygon(C2);
   
   //C4
   Polygon C4 = new Polygon();
   C4.addPoint(600,600);
   C4.addPoint(800,600);
   C4.addPoint(750,550);
   C4.addPoint(575,550);
   g.fillPolygon(C4);
   
   //color 2

   red = 30;
   green  = ((int) ((Math.random()*45)+109));
   blue = ((int) ((Math.random()*62)+100));;          
   g.setColor(new Color(red,green,blue)); 
   
   //B4
   Polygon B4 = new Polygon();
   B4.addPoint(575,550);
   B4.addPoint(750,550);
   B4.addPoint(700,500);
   B4.addPoint(550,500);
   g.fillPolygon(B4);  
   
   //B2
   Polygon B2 = new Polygon();
   B2.addPoint(225,550);
   B2.addPoint(400,550);
   B2.addPoint(400,500);
   B2.addPoint(250,500);
   g.fillPolygon(B2);
   
   //C1
   Polygon C1 = new Polygon();
   C1.addPoint(50,550);
   C1.addPoint(225,550);
   C1.addPoint(200,600);
   C1.addPoint(0,600);
   g.fillPolygon(C1);
   
   //C3
   Polygon C3 = new Polygon();
   C3.addPoint(400,550);
   C3.addPoint(575,550);
   C3.addPoint(600,600);
   C3.addPoint(400,600);
   g.fillPolygon(C3);
     
   //color 2
   red = 20;
   green  = ((int) ((Math.random()*62)+193));
   blue = ((int) ((Math.random()*62)+100));;        
   g.setColor(new Color(red,green,blue));
     
   //B1
   Polygon B1 = new Polygon();
   B1.addPoint(50,550);
   B1.addPoint(225,550);
   B1.addPoint(250,500);
   B1.addPoint(100,500);
   g.fillPolygon(B1);
      
   //A2
   Polygon A2 = new Polygon();
   A2.addPoint(275,450);
   A2.addPoint(400,450);
   A2.addPoint(400,500);
   A2.addPoint(250,500);
   g.fillPolygon(A2);
   
   //B3
   Polygon B3 = new Polygon();
   B3.addPoint(400,550);
   B3.addPoint(575,550);
   B3.addPoint(550,500);
   B3.addPoint(400,500);
   g.fillPolygon(B3);
     
   //A4
   Polygon A4 = new Polygon();
   A4.addPoint(525,450);
   A4.addPoint(650,450);
   A4.addPoint(700,500);
   A4.addPoint(550,500);
   g.fillPolygon(A4);
   
 
   
   
   }
}  