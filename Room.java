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
}  