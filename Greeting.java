import java.applet.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Greeting extends Applet implements ActionListener
{
	public Button btn = new Button("GREET");
	public TextField txt = new TextField(20);
	public Label lbl = new Label();
	
	
	
	public void init()
	{
		setSize(500, 500);
		setBackground(Color.yellow);
//		add(lbl);
//		lbl.setText("Enter name ");
		add(new Label("Please Enter Your Name"));
		add(txt);
		add(btn);
		add(lbl);
		lbl.setText("Result Goes Here: ");
		btn.addActionListener(this);
		
	}
	
	
	public TextField getText()
	{
		return txt;
	}
	
	public void setText(TextField txt)
	{
		this.txt = txt;
	}
	
	public void actionPerformed(ActionEvent a)
	{
		String name = txt.getText();
		lbl.setText("Hello, " + name);
		
		
	}
	
	
	
	
	
	
}
