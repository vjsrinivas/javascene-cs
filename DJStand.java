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
         g.fillRect(425,333,80,65);  //background rectangle
         
         //Block code for multi-gradient
         Graphics2D g2 = (Graphics2D) g;
         
         GradientPaint primary = new GradientPaint(
         430, 335, new Color(231, 76, 60), 430, 350, new Color(241, 196, 15));
         
         GradientPaint shade = new GradientPaint(
         430, 360, new Color(0, 0, 0, 0),
         430, 375, new Color(46, 204, 113));;
         //
            
         for(int t=0; t<=60; t+=12)
         {
            int yDifference = 0;
            int barHeight = (int)(Math.random() * 5);
            int height = 0;
            switch(barHeight)
            {
               
               case 0: height = 12;
                       yDifference = 48;
                       break;
               case 1: height = 24;
                       yDifference = 36;
                       break;
               case 2: height = 36;
                       yDifference = 24;
                       break;
               case 3: height = 48;
                       yDifference = 12;
                       break;
               case 4: height = 60;
                       yDifference = 0;
                       break;
                       
            }            
            g2.setPaint(primary);
            g2.fillRect((430 + t),(335 + yDifference),10,height);  //bars            
            g2.setPaint(shade);
            g2.fillRect((430 + t),(335 + yDifference),10,height);
         }
         g.setColor(new Color(0,0,0));   //rectangles dividing bars into rectangles
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
      
        public static void drawIndianStuff(Graphics g)
        {
        
        g.setColor(new Color(0,0,0));    //rectangle encasing text
        g.fillRect(288,333,120,65);
        
        g.setColor(new Color(255,153,51));    //saffron red
        g.fillRect(292,335,112,20);
        g.setColor(new Color(255,255,255));   //white
        g.fillRect(292,355,112,20);
        g.setColor(new Color(19,136,8));      //india green
        g.fillRect(292,375,112,20);
        
        g.setColor(new Color(255,50,50));  //Indian dot
        g.fillRect(380,225,3,4);
        
        g.setColor(new Color(0,0,160));    //India blue
        int fontSize = 20;
        g.setFont(new Font("Comic Sans MS",Font.PLAIN,fontSize));
        g.drawString("DiJay",322,373);
        
            
        }
 
   }