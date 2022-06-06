import java.util.Scanner;

public class InversãoVetor {
	public void main (String args[]) {
		// Declaração de Variaveis
		Scanner leitor = new Scanner (System.in);
		int[] vetor =  new int[10];
		//Entrada de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Digite o valor do indice " + i + ":");
			vetor[i] = leitor.nextInt();
			leitor.close();
		}
		//Processamento
		for (int i = (vetor.length - 1) ; i >=0 ; i--) {
			System.out.print("vetor{" + 1+"]=" +vetor[i]);
		}

























	}
}