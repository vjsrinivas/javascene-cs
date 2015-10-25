import java.awt.*;
import java.applet.*;

class DJStand
   {
      public static void drawDJStand(Graphics g)
      {
         g.setColor(new Color(0,0,0));     //black cock
         g.fillRect(150,400,500,50);       //stage
         g.setColor(new Color(40,40,40));  //gray cock
         g.fillRect(280,330,240,70);       //table
         g.setColor(new Color(20,20,20));
         g.fillRect(295,315,75,15);        //disk one 
         
         int ranX1 = ((int)(Math.random() * 50) + 299);
         int ranX2 = ((int)(Math.random() * 50) + 310);
         
         g.setColor(new Color(255,255,255));
         g.drawLine(ranX1,318,ranX2,318);
         g.drawLine(ranX1,323,ranX2,323); 
         g.drawLine(ranX1,328,ranX2,328);
         
         g.setColor(new Color(20,20,20));
         g.fillRect(430,315,75,15);        //disk two
        
         ranX1 = ((int)(Math.random() * 50) + 434);
         ranX2 = ((int)(Math.random() * 50) + 435);
         
         g.setColor(new Color(255,255,255));
         g.drawLine(ranX1,318,ranX2,318);
         g.drawLine(ranX1,323,ranX2,323); 
         g.drawLine(ranX1,328,ranX2,328);

         
         

             
        
         
         
      }
     

   }