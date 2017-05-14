import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MainFrame extends JFrame {
	private TextPanel textpanel; 
	private JButton btn1,btn2,btn3,btn4;
	
	public MainFrame (){
		
		 super ("Hello world! with BorderLayout Example");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 textpanel = new TextPanel();
	     btn1 = new JButton("Add \'Hello World\'");
	     btn2 = new JButton("Clear");
	     btn3 = new JButton("Add line");	     
	     btn4 = new JButton("add double line");	     
		     
	     setLayout(new BorderLayout());     
	    
	     btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				textpanel.appendText("Hello world \n");
			}
		});
	     
	     btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				textpanel.clearText();
			}
		});
	     
	     btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				textpanel.addLine();
			}
		});
	     
	     btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				textpanel.addDoubleLine();
			}
		});
	     add(textpanel, BorderLayout.CENTER);
	     add(btn1,BorderLayout.SOUTH);
	     add(btn2,BorderLayout.NORTH);
	     add(btn3,BorderLayout.WEST);
	     add(btn4,BorderLayout.EAST);
	   
	     setBounds(400, 200, 500, 400);
	     setVisible(true);
		
	}

}
