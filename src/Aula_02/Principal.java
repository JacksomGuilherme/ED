package Aula_02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int tm;
		

		tm = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		
		int[] Vet = new int[tm];

		for(int i = 0; i<tm; i++){
			Vet[i]= Integer.parseInt(JOptionPane.showInputDialog("Insira " +tm +" numeros"));
		}
		for(int i = 0; i<tm; i++){
		System.out.println(Vet[i]);
		}
	}

}
