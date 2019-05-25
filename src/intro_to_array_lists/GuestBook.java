package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JButton button = new JButton();
		JButton button2 = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook guestbook = new GuestBook();
		guestbook.createButtons();
	}
	void createButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button);
		panel.add(button2);
		button.addActionListener(this);
		button2.addActionListener(this);
		button.setText("Add name");
		button2.setText("View Names");
		names.add("Bob Banders");
		names.add("Sandy Sumemrs");
		names.add("Greg Ganders");
		names.add("Donny Doners");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if (button == buttonPressed) {
		String a = JOptionPane.showInputDialog("Add Name");
		names.add(a);
	}
	else if(button2 == buttonPressed) {
		String message = "";
		for(int i = 0; i < names.size(); i++){
		message+="Guest #"+(i+1)+": " + names.get(i)+"\n";
		}
		JOptionPane.showMessageDialog(null, message);
	}
	}
}
