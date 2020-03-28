
import javax.swing.JOptionPane;

public class Engine {

//Metodo que detectar si ambos tags son iguales para detectarlos como un elemento padre o hijo.	
public static boolean CorrectTag(String o, String c) {
	
		if (o.equals(c)) {
			JOptionPane.showMessageDialog(null, "El tag abierto coincide con el tag cerrado", "InfoBox: " + "Fatal Error", JOptionPane.INFORMATION_MESSAGE);
			return true;
		}else
			JOptionPane.showMessageDialog(null, "El tag abierto no coincide con el tag cerrado", "InfoBox: " + "Fatal Error", JOptionPane.INFORMATION_MESSAGE);
		return false;
	}
	
}
