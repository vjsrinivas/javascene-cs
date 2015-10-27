import java.awt.*;
import java.applet.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class JavaScene extends Applet
{
  public void init()
  {
   try
   {
      AudioInputStream audioInputStream =
      AudioSystem.getAudioInputStream(
      this.getClass().getResource("./javascene-cs/Kalimba.mp3"));
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.start();
   }
   catch(Exception ex)
   {
   
   }
  }
   
  public void paint(Graphics g)
  {
     //Draw components
     setSize(800,600);
     Room.drawWalls(g);
     DJ.drawDJ(g);
     DJStand.drawDJStand(g);
     Room.drawFloor(g);
     
     int[] painting1 = {30,200, 30,400, 100,350, 100,250};
     Speaker.drawSpeaker(g,150,150);
     Speaker.drawSpeaker(g, 550, 150);
     Decor.drawRails(g);
     Decor.drawProjectors(g, 150, 105, 140, 301);
     Decor.drawProjectors(g, 375, 105, 100, 501);
     Decor.drawProjectors(g, 600, 105, 140, 701);
     Decor.drawMoneyWaster(g, painting1);
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