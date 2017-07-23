import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

class Calculator {
    JPanel pl;
    JPanel pl2;
    JPanel pl3;
    JTextField resultField;
    JButton[] numButton= new JButton[10];
    JButton numPlus;
    JButton numMinus;
    JButton numMultiplication;
    JButton numDivision;
    JButton numEqual;
    JButton numPoint;
    
    Calculator() {
      pl= new JPanel();
      BorderLayout bl= new BorderLayout();
      pl.setLayout(bl);
      
      resultField= new JTextField(30);
      pl.add("North", resultField);
      
      pl2= new JPanel();
      GridLayout gl= new GridLayout(4, 3);
      pl2.setLayout(gl);
      
      for(int i=0; i<10; i++) {
        numButton[i]= new JButton(""+i);
        pl2.add(numButton[i]);
      }
      
      numEqual= new JButton("=");
      pl2.add(numEqual);
      numPoint= new JButton(".");
      pl2.add(numPoint);
      
      pl.add("Center", pl2);
      
      pl3= new JPanel();
      GridLayout gl2= new GridLayout(4, 1);
      pl3.setLayout(gl2);
      numPlus= new JButton("+");
      numMinus= new JButton("-");
      numMultiplication= new JButton("*");
      numDivision= new JButton("/");
      
      pl3.add(numPlus);
      pl3.add(numMinus);
      pl3.add(numMultiplication);
      pl3.add(numDivision);
      
      pl.add("East", pl3);
      
      JFrame frame= new JFrame();
      frame.setContentPane(pl);
      frame.pack();
      frame.setVisible(true);
    }
    
    public static void main(String args[]) {
      Calculator cl= new Calculator();
    }
}