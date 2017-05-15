import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class mainFrame extends JFrame {

    private JTextArea textarea;
    private Toolbar toolbar;
    
	public mainFrame (){
	   super("Communicating between components Example!");
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setLayout(new BorderLayout());
	   
	   toolbar = new Toolbar();
	   textarea = new JTextArea();
	   
	   toolbar.setTextarea(textarea);
       add(toolbar,BorderLayout.NORTH);
	   add(textarea,BorderLayout.CENTER);
	   
	   setBounds(200, 100, 600, 400);
	   setVisible(true);
	   
   }
}
