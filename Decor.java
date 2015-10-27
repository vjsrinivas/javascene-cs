import java.awt.*;
import java.applet.*;

class Decor
{
   public static void drawRails(Graphics g)
   {
      g.setColor(new Color(30,30,30));
      g.fillRect(113, 130, 573, 15);
   }
   
   public static void drawProjectors(Graphics g, int x, int y, int carry, int carry2)
   {
      g.setColor(new Color(80, 80, 80));
      g.fillRect(x, y , 75, 25);
      
      g.setColor(new Color(0, 0, 0));
      g.fillOval(x + 10, y + 2, 20 ,20);
      g.setColor(new Color(0, 0, 0));
      g.fillOval(x + 40, y + 2, 20 ,20);
      
      shootLazer(g, x + 10 + 10, y + 7, 540, carry, carry2);
      shootLazer(g, x + 40 + 10, y + 7, 540, carry, carry2);
   }
   
   public static void shootLazer(Graphics g, int sx, int sy, int length, int alphaovr, int range)
   {
      Polygon lzbody = new Polygon();
      lzbody.addPoint(sx, sy);
      int min = range / 3;
      range = (range - min) + 1;
      lzbody.addPoint((int)((Math.random()* range) + min), length);
      lzbody.addPoint((int)((Math.random()* range) + min), length);
      
      int redran = (int)((Math.random() * 26));
      int blueran = (int)((Math.random() * 156) + 100);;
      int greenran = (int)((Math.random() * 156) + 100);;
      int alpharan = (int)((Math.random() * alphaovr)); //default alpha at 90 for outer-projectors
      g.setColor(new Color(redran, blueran, greenran, alpharan));
      
      g.fillPolygon(lzbody);
   }
   
   public static void drawMoneyWaster(Graphics g, int[] coorls)
   {
      Polygon art = new Polygon();
      art.addPoint(coorls[0],coorls[1]);
      art.addPoint(coorls[2], coorls[3]);
      art.addPoint(coorls[4], coorls[5]);
      art.addPoint(coorls[6], coorls[7]);
      g.setColor(new Color(200, 200, 250));
      g.fillPolygon(art);   
   }
   
}