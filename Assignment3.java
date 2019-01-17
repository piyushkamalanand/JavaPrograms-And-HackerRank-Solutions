package practicetime;
import java.awt.*;
import java.awt.event.*;
class Assignment3 extends Frame implements ActionListener
{
	TextField t1;
	Button b;
	Assignment3()
	{
		t1=new TextField();
		t1.setBounds(100,200,80,30);
		add(t1);
		 b=new Button("Click Here");  
		    b.setBounds(100,70,80,30);  
		    add(b);  
		    setSize(300,300);  
		    setLayout(null);  
		    setVisible(true); 
		    b.addActionListener(this);
	}
	public static void main(String[] args) {    
	   new Assignment3();
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b)
		{
			b.setEnabled(true);
			if(b.isEnabled()==false)
			{
				t1.setText(" YES ");
			}
		}
	}
}
