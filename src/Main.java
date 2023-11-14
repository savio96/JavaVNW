import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int cont = 0;
		int acerto = 0;
		List<Integer> numerosEscolhidos = new ArrayList<Integer>();
		List<Integer> numerosSorteados = new ArrayList<Integer>();
		Scanner scNumeroEscolhido = new Scanner(System.in);
		while(cont!=7) {
			try {
                System.out.println("Digite um numero entre 0 a 100:");
                int num = scNumeroEscolhido.nextInt();

                if (num < 100 && num > 0) {
                    numerosEscolhidos.add(num);
                    cont++;
                } else {
                    System.out.println("O número deve estar entre 0 e 100. Tente novamente.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, digite um número válido.");
                scNumeroEscolhido.next();
            }
			
		}
		for(int i=0;i<7;i++) {
			Random random = new Random();
			int valor = random.nextInt(101);
			numerosSorteados.add(valor);
		}
		for(int i:numerosEscolhidos) {
			for(int y: numerosSorteados) {
				if(i==y) {
					acerto++;
				}
			}
		}
		if(acerto==5) {
			System.out.println("Ganhou premio de 10 mil reais");
		}
		if(acerto==6) {
			System.out.println("Ganhou premio de 50 mil reais");
		}
		if(acerto==7) {
			System.out.println("Ganhou premio de 200 mil reais");
		}
		System.out.println("Acertou " + acerto + " numero(s)");
		System.out.println(numerosEscolhidos);
		System.out.println(numerosSorteados);
		scNumeroEscolhido.close();
		}};


