package practicetime;
import java.awt.*;  
import javax.swing.*;  
  
public class MyFlowLayout{  
JFrame f;  
MyFlowLayout(){  
    f=new JFrame();  
      
    JTextField b1=new JTextField("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
              
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
      
    f.setLayout(new FlowLayout(FlowLayout.TRAILING,6,5));  
    //setting flow layout of right alignment  
  
    f.setSize(300,300);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new MyFlowLayout();  
}  
}
