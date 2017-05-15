import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Toolbar extends JPanel implements ActionListener  {
	
 private JButton btn1,btn2,btn3;
 private StringListener stringListener;
 
  
  
  public Toolbar (){
	  btn1 = new JButton("Add");
	  btn2 = new JButton("Clear");
	  btn3 = new JButton("Exit");
	  
	  setLayout(new FlowLayout(FlowLayout.CENTER));
	  add(btn1);
	  add(btn2);
	  add(btn3);
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      btn3.addActionListener(this);
      

  }
  public void setStringListener (StringListener stringlistener){
	  this.stringListener = stringlistener;
  }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton clicked = (JButton) e.getSource();
	
	if (clicked == btn1) {
		if (stringListener != null) {
		    stringListener.setTextEmitted("Hello\n");	
		}
	}
	if (clicked == btn2) {
		if (stringListener != null) {
		    stringListener.setTextClear();	
		}
	}
	if (clicked == btn3) {
	  System.exit(0);	
	}
	
	
}
  
}
