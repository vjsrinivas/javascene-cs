import java.awt.*;
import java.applet.*;

public class JavaScene extends Applet
{
  public void paint(Graphics g)
  {
     Room.drawWalls(g);
     DJStand.drawDJStand(g); 
  }
}