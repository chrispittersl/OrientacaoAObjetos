package OrientObj;

import javax.swing.JOptionPane;

public class Pessoa {
	
	public void andar() {
		JOptionPane.showMessageDialog(null,"Andando");
	}
	protected void respirar() {
		JOptionPane.showMessageDialog(null,"Respirando");
	}
	private void dormir() {// Este método só será utilizado dentro desta classe, pois esse método é private(privado)
		JOptionPane.showMessageDialog(null,"Dormindo");
	}

	public static void main(String[] args) {
		

	}

}
