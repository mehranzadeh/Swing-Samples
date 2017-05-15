import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;


public class mainFrame extends JFrame {

	private Toolbar toolbar;
	private JTextArea textArea;
	public mainFrame (){
		super("Communication between componenets with an interface");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		textArea = new JTextArea();
		
		toolbar.setStringListener(new StringListener() {
			
			@Override
			public void setTextEmitted(String text) {
				// TODO Auto-generated method stub
				textArea.append(text);
			}
			
			@Override
			public void setTextClear() {
				// TODO Auto-generated method stub
				textArea.setText("");
			}
		});
			
			
		
	    add (toolbar,BorderLayout.NORTH);
	    add (textArea, BorderLayout.CENTER);
	    
		setBounds(350,200,600,400);
		setVisible(true);
	}
}
