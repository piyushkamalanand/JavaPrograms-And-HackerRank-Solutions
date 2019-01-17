package practicetime;
import java.util.Scanner;
import java.awt.*;  
import java.awt.event.*;  
public class AEvent extends Frame implements ActionListener{  
TextField tf,tf1,tf2;
Button b,b1,b2,b3;
Label l1,l2,l3,l4;
AEvent(){ 
	l4=new Label(" Calculator ");
	l4.setBounds(100,50,170,20);
	l1=new Label(" First Number - ");
	l1.setBounds(10,100,170,20);
tf=new TextField(); 
tf.setBounds(180,100,170,20);
l2=new Label(" Second Number - ");
l2.setBounds(10,150,170,20);
tf1=new TextField();
tf1.setBounds(180,150,170,20);
l3=new Label(" Result - ");
l3.setBounds(10,200,170,20);
tf2=new TextField();
tf2.setBounds(180,200,170,20);
 b=new Button("ADD");
 b.setBounds(220,250,80,30);
 b1=new Button("SUBSTRACT");
 b1.setBounds(220,300,80,30);
 b2=new Button("MULTIPLY");
 b2.setBounds(220,350,80,30);
 b3=new Button("DIVISION");   
b3.setBounds(220,400,80,30); 
//register listener  
b.addActionListener(this);//passing current instance  
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
//add components and set size, layout and visibility  
add(b);add(b1);add(b2);add(b3);add(l1);add(l2);add(l3);add(l4);
add(tf);add(tf1);add(tf2); 
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public void actionPerformed(ActionEvent e){
	String s1=tf.getText();
	String s2=tf1.getText();
	double a=Double.parseDouble(s1);  
    double a1=Double.parseDouble(s2);  
    double c=0;
    if(e.getSource()==b){  
        c=a+a1;  
    }else if(e.getSource()==b1){  
        c=a-a1;  
    }  
    else if(e.getSource()==b2){  
        c=a*a1;  
    } 
    else if(e.getSource()==b3){  
        c=a/a1;  
    } 
    String result=String.valueOf(c);  
    tf2.setText(result);  
}   
public static void main(String args[]){  
new AEvent();  
}  
}  
