import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Toolbar extends JPanel implements ActionListener {

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JTextArea textarea;
      
	public Toolbar (){
		setLayout(new FlowLayout());
		btn1 = new JButton("Add \'Hello world\'");
		btn2 = new JButton("Clear");
		btn3 = new JButton("Exit");	
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		
		add(btn1);
        add(btn2);
        add(btn3);
		
	}
	
	public void  setTextarea( JTextArea textarea){
		this.textarea= textarea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton)e.getSource();
		
		if (clicked == btn1){
		  this.textarea.append("Hello world\n");
		}
		if (clicked == btn2){
		  this.textarea.setText("");	
		}
		if (clicked == btn3){
		  System.exit(0);	
		}
		
		
		
	}
}
