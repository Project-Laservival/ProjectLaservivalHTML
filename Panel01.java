import javax.swing.*;
import java.awt.*;

public class Panel01 extends JPanel
{
   public void paintComponent(Graphics g)
   {
      g.setColor(Color.RED);
      g.fillRect(100, 200, 150, 150);  //This is the color of the house
      
      
      g.setColor(Color.PINK.darker()); //I have no idea what this is nothing happens when its gone lol 
      //New note, this is drawing a line, probably to thin to see
      g.drawLine(0, 350, 400, 350);
      
      
      g.setColor(Color.RED);
      g.drawRect(100, 200, 150, 150); //This is an old addition to the house that now looks ugly
     // g.fillRect(100, 250, 150, 150); //Cuz it makes the house taller, not at the top but taller at the bottom
      
      g.setColor(Color.BLACK);
      g.fillRect(150, 275, 50, 75); //This is my door
      
      g.setColor(Color.YELLOW);
      g.fillOval(300, 75, 50, 50); //The sun
      
      g.setColor(Color.BLACK);
      g.drawString("Residence of Pardis Sabeti", 200, 50);
      g.drawString("Net lives saved: 87 Million", 200, 30);
      int xPoints[] = {75, 175, 275};
      int yPoints[] = {200, 150, 200};
                                                 //These are all for the roof triangle of the house
      g.drawPolygon(xPoints, yPoints, 3); // The x points go 75 over, 175 over, 275 over. Y values based on that.
      g.fillPolygon(xPoints, yPoints, 3);
      
      
      g.setColor(new Color(102, 52, 0));
      g.fillOval(180, 310, 10, 10); //Door Knob
      
      g.setColor(Color.WHITE);
      g.fillRect(125, 225, 30, 30);  
      g.fillRect(200, 225, 30, 30); //Windows
      
      g.setColor(Color.GREEN);
      for(int x = 0; x <= 98; x += 2) //Grass
      {
         g.drawLine(x, 350, x, 300);
      }
      for(int y = 252; y <= 400; y += 2)
      {
         g.drawLine(y, 350, y, 300);
      }
   }
}