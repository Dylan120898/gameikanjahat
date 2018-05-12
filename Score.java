import greenfoot.*; 


import java.applet.*;
import java.awt.*;

public class Score extends Actor

{

  public Score(String text)
  {
      GreenfootImage img_field = new GreenfootImage(140,50);
      img_field.drawString(text, 0, 45);
      setImage(img_field);
   }
      
  public void setText(String text)
   {
       GreenfootImage img_field = getImage();
       img_field.clear();
       img_field.drawString(text, 0, 45);
       
   }
}