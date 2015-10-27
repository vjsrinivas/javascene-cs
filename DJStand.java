import java.awt.*;
import java.applet.*;

class DJStand
   {
      public static void drawDJStand(Graphics g)
      {
         g.setColor(new Color(0,0,0));     //black
         g.fillRect(150,400,500,50);       //stage
         g.setColor(new Color(40,40,40));  //gray
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
      public static void drawEqualizer(Graphics g)
      {
         g.setColor(new Color(0,0,0));
         g.fillRect(425,333,80,65);
         for(int t=0; t<=60; t+=12)
         {
         
            int yDifference = 0;
            int barHeight = (int)(Math.random() * 5);
            int height = 0;
            switch(barHeight)
            {
               
               case 0: height = 12;
                       yDifference = 48;
                       g.setColor(new Color(2,247,7));
                       break;
               case 1: height = 24;
                       yDifference = 36;
                       g.setColor(new Color(170,247,2));
                       break;
               case 2: height = 36;
                       yDifference = 24;
                       g.setColor(new Color(235,247,2));
                       break;
               case 3: height = 48;
                       yDifference = 12;
                       g.setColor(new Color(247,125,2));
                       break;
               case 4: height = 60;
                       yDifference = 0;
                       g.setColor(new Color(247,43,2));
                       break;
                       
            }
         
         g.fillRect((430 + t),(335 + yDifference),10,height);
         }
         g.setColor(new Color(0,0,0));
         g.fillRect(425,340,80,2);
         g.fillRect(425,346,80,2);
         g.fillRect(425,352,80,2);
         g.fillRect(425,358,80,2);
         g.fillRect(425,364,80,2);
         g.fillRect(425,370,80,2);
         g.fillRect(425,376,80,2);
         g.fillRect(425,382,80,2);
         g.fillRect(425,388,80,2);
         g.fillRect(425,394,80,2);
         g.fillRect(425,400,80,2);
         
        }
      
     
 
   }
