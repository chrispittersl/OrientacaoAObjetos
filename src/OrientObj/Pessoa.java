package OrientObj;

import javax.swing.JOptionPane;

public class Pessoa {
	
	public void andar() {
		JOptionPane.showMessageDialog(null,"Andando");
	}
	protected void respirar() {
		JOptionPane.showMessageDialog(null,"Respirando");
	}
	private void dormir() {// Este m�todo s� ser� utilizado dentro desta classe, pois ese m�todo � private(privado)
		JOptionPane.showMessageDialog(null,"Dormindo");
	}

	public static void main(String[] args) {
		

	}

}
