import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextPanel extends JPanel {
	
	private JTextArea textArea;
	public TextPanel (){
	    
     	setLayout(new BorderLayout());
     	textArea = new JTextArea();
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	
	}
	public void appendText (String str){
		textArea.append(str);
	}

	public void clearText (){
		textArea.setText("");
	}
	public void addLine (){
		textArea.append("-----------------------------------------------------------------------\n");
	}
	public void addDoubleLine (){
		textArea.append("========================================\n");
	}
}
