//Kamron Soldozy, e-mail: 2018ksoldozy@tjhsst.edu
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
public class DriverGUI
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("BG");
      frame.setSize(400, 400);
      frame.setLocation(100, 50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new DriverGUI());
      frame.setVisible(true);
   }
}