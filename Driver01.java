import javax.swing.*; 
public class Driver01
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Lab01");
      frame.setSize(375, 400);
      frame.setLocation(440,180);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel01());
      frame.setVisible(true);
   }
}
