import java.util.Scanner;
import javax.swing.*;
class main
{
  int a,b;
  main()
  {
    JFrame jfrm=new JFrame("It's a matrix calculator");
    jfrm.setSize(400, 300);
    String aj=JOptionPane.showInputDialog("Enter a number");
    String bj=JOptionPane.showInputDialog("Enter a number");
    
    a=Integer.parseInt(aj);
    b=Integer.parseInt(bj);
    int sum=a+b;
    
    JLabel jl=new JLabel("Sum ="+sum);
    jfrm.add(jl);
    
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setVisible(true);
  }
  
  public static void main(String[]args)
  {
    Scanner er=new Scanner(System.in);
    SwingUtilities.invokeLater(new Runnable()
                                 {
      public void run()
      {
        new main();
      }
    });
    
  }
}