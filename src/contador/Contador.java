package contador;

import java.util.Scanner;

public class Contador {
	public static void main (String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		terminal.close();
		
		try {
			contar(parametroUm, parametroDois);
		}
		catch(ParametrosInvalidosException e){
			System.out.println("O Segundo parâmetro deve ser maior que o primeiro.");
		}
		
	}
	
	public static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		int diferenca = 0;
		
		if (parametroUm>parametroDois) {
			throw new ParametrosInvalidosException();
		}
		else {
			diferenca = parametroDois - parametroUm;
			for (int i = 0; i<diferenca; i++) {
				System.out.println("Imprimindo o numero: "+ (i+1));
			}
		}
		
	}
}
