//|=======================}//
//| JavaScene             |//
//|                       |//
//| This program displays |//
//| a scene using Java    |//
//| graphics.             |//
//|=======================|//

//|=================================================|//
//|Scratch-A-Bear inc.                              |//
//|                                                 |//
//|please visit:                                    |//
//|      http://www.scratch-a-bear.edu              |//
//|                                                 |//
//|Developers:                                      |//
//|      Vijaysrinivas Rajagopal                    |//
//|                                                 |//
//|      Lukas Marinovic                            |//
//|         https://github.com/LukasMMarinovic      |//
//|      Alejandro Scroggs                          |//
//|         https://github.com/handroishonda        |//
//|=================================================|//

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
  //play music
   try
   {
      AudioInputStream audioInputStream =
      AudioSystem.getAudioInputStream(
      this.getClass().getResource("Kalimba.wav"));
      Clip clip = AudioSystem.getClip();
      clip.open(audioInputStream);
      clip.start();
   }
   catch(Exception ex)
   {
   
   }      
  }
   //remove white flickers
   public void update(Graphics g)
   {
   paint(g); 
   }      
  public void paint(Graphics g)
  { 
     //Draw components
     setSize(800,600);
     Room.drawWalls(g);
     DJ.drawDJ(g);
     DJStand.drawDJStand(g);
     DJStand.drawEqualizer(g);
     DJStand.drawIndianStuff(g);
     Room.drawFloor(g);            
            //int[] painting1 = {30,200, 30,400, 100,350, 100,250};
     Speaker.drawSpeaker(g,150,150);
     Speaker.drawSpeaker(g, 550, 150);
     Decor.drawCeilingLights(g);
     Decor.drawRails(g);
     Decor.drawProjectors(g, 150, 105, 140, 301);
     Decor.drawProjectors(g, 375, 105, 100, 501);
     Decor.drawProjectors(g, 600, 105, 140, 701);
     Decor.drawRandomWallLinesBoyssssss(g);
            //Decor.drawMoneyWaster(g, painting1);
     Environment.drawCrowd(g, 0);
     Environment.drawCrowd(g, 255);
     
     //prevent seizures
     try 
     {
         Thread.sleep(350);                 
     } 
         catch(InterruptedException ex)
     {
         Thread.currentThread().interrupt();
     }
          
     //loopity-looop             
     repaint();
  }  
}