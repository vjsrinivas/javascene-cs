import java.awt.*;
import java.applet.*;

class Environment
{
   static void drawCrowd(Graphics g,int x)
   {
      int rgb;
   
     Polygon crowd = new Polygon();
     crowd.addPoint(0+x,600);
     crowd.addPoint(0+x,560);
     crowd.addPoint(30+x,570);
     crowd.addPoint(90+x,470);
     crowd.addPoint(115+x,480);
     crowd.addPoint(100+x,540);
     crowd.addPoint(120+x,580);
     crowd.addPoint(130+x,550);
     crowd.addPoint(200+x,540);
     crowd.addPoint(220+x,580);
     crowd.addPoint(230+x,575);
     crowd.addPoint(225+x,500);
     crowd.addPoint(240+x,490);
     crowd.addPoint(255+x,560);
     crowd.addPoint(255+x,600);
          
     g.setColor(new Color(15, 15, 15));
     g.fillPolygon(crowd);
     
     
     
     
     
     
     
     
     
     
   }
} 































































































































































