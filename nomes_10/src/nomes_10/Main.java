package nomes_10;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		String nomes[] = new String[10];
			
			for(int i = 0; i < 10; i++) {
				nomes[i] = JOptionPane.showInputDialog(null, "Insira um nome.");
			}
			JOptionPane.showMessageDialog(null, nomes);
	}

}
