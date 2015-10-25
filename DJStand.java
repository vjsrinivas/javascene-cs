import java.awt.*;
import java.applet.*;

class DJStand
   {
      public static void drawDJStand(Graphics g)
      {
         g.setColor(new Color(0,0,0)); //black cock
         g.fillRect(150,400,500,50);   //stage
         g.fillRect(280,330,240,70);   //table
         g.fillRect(295,315,75,15);    //disk one 
         g.fillRect(430,315,75,15);    //disk two
         
   }