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
      red = ((int) (Math.random()*256));
      green  = ((int) (Math.random()*256));
      blue = 168;         
      g.setColor(new Color(red,green,blue));
      
      //draw stage
      g.fillRect(150,150,500,300);
       
   }
}  