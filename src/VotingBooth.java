import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
String input = JOptionPane.showInputDialog("How owld are you?");
	int cats = Integer.parseInt(input);
	
	if (cats<17) {
		JOptionPane.showMessageDialog(null,"You cant vote, no one will ever care abut what you think");	
}
	if (cats>17) {
		JOptionPane.showInputDialog("i thinm you can vote, who would you like the next president to be & why?");	
}
	
	
	}
	}
	
