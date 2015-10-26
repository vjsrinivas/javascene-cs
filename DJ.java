import java.awt.*;
import java.applet.*;

class DJ
{
   public static void drawDJ(Graphics g)
   {
      int red;
      int green;
      int blue;
      //draw body
      g.setColor(new Color(135,109,61));
      g.fillOval(350,200,100,100);
      Polygon A1 = new Polygon();
      A1.addPoint(430,245);
      A1.addPoint(370,290);
      A1.addPoint(360,300);
      A1.addPoint(440,300);
      g.fillPolygon(A1);      
      g.setColor(new Color(0,0,0));
      g.fillArc(370,250,20,15,180,180);
      g.fillOval(355,240,5,5);
      g.fillOval(400,240,5,5);
      g.setColor(new Color(30,30,30));     
      g.fillOval(420,240,25,25);
      g.fillRect(430,250,25,12);     
      g.setColor(new Color(0,0,0));
      g.drawLine(430,290,460,270);
      g.drawLine(430,245,460,270);
      

   

      
      
      

      g.drawLine(370,290,260,170);

   }
}