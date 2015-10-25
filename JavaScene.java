import java.awt.*;
import java.applet.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class JavaScene extends Applet
{
  public void main(String args[])
  {
     System.out.println("safasfas");
  }
   
  public void paint(Graphics g)
  {
     //Draw components
     setSize(800,600);
     Room.drawWalls(g);
     DJStand.drawDJStand(g);
     Speaker.drawSpeaker(g,150,150);
     Speaker.drawSpeaker(g, 550, 150);
     Lazers.drawRails(g);
     Lazers.drawProjectors(g, 150, 105, 140, 301);
     Lazers.drawProjectors(g, 350, 105, 100, 501);
     Lazers.drawProjectors(g, 600, 105, 140, 701);
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
     /*String bip = "Kalimba.mp3";
     Media hit = new Media(bip);
     MediaPlayer mediaPlayer = new MediaPlayer(hit);
     mediaPlayer.play();*/
  }
  
}