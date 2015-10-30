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
      
      int rangesize2 = (40 - 15) + 1;
      int size2 = (int)((Math.random() * rangesize2) + 25);
      
      int rangecoor = 20 + ((60 - size)/2);
      int rangecoor2 = 20 + ((60 - size2)/2);
      
      g.setColor(new Color(100,100,100));
      g.fillOval(x + 20, y + 20, 60, 60);
      g.fillOval(x + 20, y + 220, 60, 60);
      g.fillOval(x + 20, y + 125, 60,60);
      
      g.setColor(new Color(50,50,50));
      g.fillOval(x + rangecoor, y + rangecoor, size, size);
      g.fillOval(x + rangecoor, y + rangecoor + 200, size, size);
      g.fillOval(x + rangecoor2, y + rangecoor2 + 105, size2, size2);
      
      g.setColor(new Color(40,40,40));       //little boxes with brand
      g.fillRect(179,243,41,20);
      g.fillRect(581,243,41,20);
      
      g.setColor(new Color(100,100,100));    //big brand name boys
      int fontSize = 10;
      g.setFont(new Font("Comic Sans MS",Font.PLAIN,fontSize));
      g.drawString("Scrugs",183,256);
      g.drawString("Scrugs",585,256);
   }
}