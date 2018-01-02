import javafx.application.*;
import javax.swing.*;
import java.awt.*;



import javafx.*;



public class Gui{

    JFrame myFrame;
    JPanel myPanel; 
    JButton equals;
    JButton plus;


	public Gui(){
		myFrame = new JFrame("Java Calculator");
		myFrame.setSize(345,612);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        myFrame.setVisible(true);  	
        myFrame.setResizable(false);
        equals = new JButton("=");
        plus  = new JButton("+");
        myPanel = new JPanel();
        myFrame.add(myPanel);
       	myPanel.add(equals);
       	myPanel.add(plus);
	}
}