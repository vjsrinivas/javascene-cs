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
      
      int redran, blueran, greenran;      
      redran = (int)(Math.random() * 255);  
      blueran = (int)(Math.random() * 255);
      greenran = (int)(Math.random() * 255);
      g.setColor(new Color(redran, blueran, greenran));
      g.fillPolygon(art);             
   }
   
   
   public static void drawCeilingLights(Graphics g)
   {

      int red;
      int green;
      int blue;
      int positionX;
      int positionY;
      
      for(int k=0; k <= 30; k++)
      {
         
         positionX = (int)((Math.random() * 500)+130);
         positionY = (int)((Math.random() * 130));
         int length = (int)((Math.random() * 8)+20);
         int width = (int)((Math.random() * 4)+4);
         red = 30;
         green  = ((int) ((Math.random()*45)+109));
         blue = ((int) ((Math.random()*62)+100));;          
         g.setColor(new Color(red,green,blue,160)); 

         g.fillOval(positionX,positionY,length,width);


      }

      int fontSize = 20;
      g.setFont(new Font("Comic Sans MS",Font.PLAIN,fontSize));
      g.drawString("Sakul",385,100);

   }  
    public static void drawRandomWallLinesBoyssssss(Graphics g)
    {
      for(int t=0; t<=20; t+=1)
      {
      
         int red;
         int green;
         int blue;
         red = 30;
         green  = ((int) ((Math.random()*45)+109));
         blue = ((int) ((Math.random()*62)+100));;          
         g.setColor(new Color(red,green,blue,160));
         
         int y1 = (int)(Math.random()*600);
         int y2 = (int)((Math.random()*300)+150);
         
         g.drawLine(0,y1,150,y2);
         g.drawLine(800,y1,650,y2);
      }
     }
}