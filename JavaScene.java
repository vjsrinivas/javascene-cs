import java.awt.*;
import java.applet.*;

public class JavaScene extends Applet
{
   
   
  public void paint(Graphics g)
  {
     //Draw components
     setSize(800,600);
     Room.drawWalls(g);
     DJStand.drawDJStand(g);
     Speaker.drawSpeaker(g,150,150);
     
     //prevent seizures
     try 
     {
         Thread.sleep(250);                 
     } 
         catch(InterruptedException ex)
     {
         Thread.currentThread().interrupt();
     } 
     
     //loopity-looop             
     repaint();
      
  }
  
}