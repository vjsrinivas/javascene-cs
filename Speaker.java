import java.awt.*;
import java.applet.*;

class Speaker
{
   public static void drawSpeaker(Graphics g, int x, int y)
   {
      g.setColor(new Color(12,12,12));
      g.fillRect(x, y, 100, 300);
         
      int rangesize = (50 - 25) + 1;
      int size = (int)((Math.random() * rangesize) + 25);
      
      int rangecoor = 50 - size;
      g.setColor(new Color(255,255,255));
      g.fillOval(x + 20, y + 20, 60, 60);
      g.fillOval(x + 20, y + 220, 60, 60);
      g.fillOval(x + 20, y + 125, 60,60);
      
      g.setColor(new Color(155,155,155));
      g.fillOval(x + size + rangecoor, y + size, size, size);
      g.fillOval(x+25 + rangecoor, y + 225 + rangecoor, size, size);
      g.fillOval(x+25 + rangecoor, y + 130 + rangecoor, size, size);
   }
}