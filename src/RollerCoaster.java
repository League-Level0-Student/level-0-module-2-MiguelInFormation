import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
String input = JOptionPane.showInputDialog("Hoaw tale are you?");
	int cats = Integer.parseInt(input);
	
	if (cats<8) {
		JOptionPane.showMessageDialog(null,"You obviously canot enter this ryde.");	
}
	if (cats>8) {
		JOptionPane.showMessageDialog(null,"yu obviously CAYN enta this ryde.");	
}
	
	}
	}
	
