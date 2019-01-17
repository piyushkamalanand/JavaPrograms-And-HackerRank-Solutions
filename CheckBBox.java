package practicetime;
import java.awt.*;  
import java.awt.event.*; 
public class CheckBBox extends Frame implements ItemListener
{
	Label l,l2;
	Checkbox c,c1,c2,c3;
	CheckboxGroup cb,cb1;
	CheckBBox()
	{
		l=new Label(" Select Your Gender ");
		l.setBounds(80,50,170,20);
		c=new Checkbox(" Male ");
		c.setBounds(100,100,170,20);
		c1=new Checkbox(" Female ");
		c1.setBounds(100,150,170,20);
		l2=new Label(" Select Your Language ");
		l2.setBounds(80, 200, 170, 20);
		cb=new CheckboxGroup();
		cb1=new CheckboxGroup();
		c2=new Checkbox(" C++ ",cb,false);
		c2.setBounds(100,250,170,20);
		c3=new Checkbox(" Java ",cb1,true);
		c3.setBounds(100,300,170,20);
		c2.addItemListener(this);
		c3.addItemListener(this);
		add(c);add(c1);add(c2);add(c3);
		add(l);add(l2);
		setSize(300,300);  
		setLayout(null);  
		setVisible(true); 
	}
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getSource()==c2)
		{
			
		}
	}
	public static void main(String args[]){  
		new CheckBBox();  
		}  
}
