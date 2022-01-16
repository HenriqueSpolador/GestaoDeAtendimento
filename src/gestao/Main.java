package gestao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main (String [] args) {


		Rodovias R = new Rodovias();
		List <String> rodoviaSp = new ArrayList<>();
		rodoviaSp.add("272");
		rodoviaSp.add("421");
		rodoviaSp.add("425");
		rodoviaSp.add("457");
		rodoviaSp.add("483");
		rodoviaSp.add("501");
		rodoviaSp.add("563");
		rodoviaSp.add("613");

		System.out.println("---BEM VINDO AO SISTEMA DE ATENDIMENTO AO USUÁRIO---");

		System.out.println("\nEscolha a opção desejada: ");
		System.out.println("1 - Solicitar apoio do guincho");
		System.out.println("2 - Cancelar");	

		Scanner scanner = new Scanner(System.in);
		int opcao;
		opcao = scanner.nextInt();	

		if (opcao == 1) {

			System.out.println ("Informe a rodovia em que se encontra: ");
			R.rodoviaDigitada  = scanner.next();

			if (rodoviaSp.contains(R.rodoviaDigitada)) {

				System.out.println("Informe o km aproximado que se encontra: ");
				R.kmDigitado = scanner.nextDouble();

				System.out.println("Está no acostamento?  S/N");
				R.acostamento = scanner.next();	

				System.out.println("O guincho já está se deslocando para o local. Aguarde.");

			} else {

				System.out.println("Este trecho nao pertence à concessionária");
				System.out.println ("\nDeseja tentar novamente? S/N");
				R.rodoviaDigitada = scanner.next();					

				while (R.rodoviaDigitada.equalsIgnoreCase("S")) {

					System.out.println ("Informe a rodovia em que se encontra: ");
					R.rodoviaDigitada  = scanner.next();

					if (rodoviaSp.contains(R.rodoviaDigitada)) {

						System.out.println("Informe o km aproximado que se encontra: ");
						R.kmDigitado = scanner.nextDouble();
						System.out.println("Está no acostamento?  S/N");
						R.acostamento = scanner.next();				
						System.out.println("O guincho já está se deslocando para o local. Aguarde.");

					} else {

						System.out.println("Este trecho nao pertence à concessionária");
						System.out.println ("\nDeseja tentar novamente? S/N");
						R.rodoviaDigitada = scanner.next();	

					} 

				}

				if (R.rodoviaDigitada.equalsIgnoreCase("N")) {

					System.out.println ("Obrigado.");

				}
			}

		}
		else if (opcao == 2) {

			System.out.println ("Deseja realmente cancelar o atendimento? S/N");
			R.rodoviaDigitada= scanner.next();	

			if (R.rodoviaDigitada.equalsIgnoreCase("S")){

				System.out.println("Obrigado.");


			} else if (R.rodoviaDigitada.equalsIgnoreCase("N")){

				System.out.println ("Informe a rodovia em que se encontra: ");
				R.rodoviaDigitada  = scanner.next();

				if (rodoviaSp.contains(R.rodoviaDigitada)) {

					System.out.println("Informe o km aproximado que se encontra: ");
					R.kmDigitado = scanner.nextDouble();
					System.out.println("Está no acostamento?  S/N");
					R.acostamento = scanner.next();				
					System.out.println("O guincho já está se deslocando para o local. Aguarde.");

				} else {

					System.out.println("Este trecho nao pertence à concessionária");
					System.out.println ("\nDeseja tentar novamente? S/N");
					R.rodoviaDigitada = scanner.next();					

					while (R.rodoviaDigitada.equalsIgnoreCase("S")) {

						System.out.println ("Informe a rodovia em que se encontra: ");
						R.rodoviaDigitada  = scanner.next();

						if (rodoviaSp.contains(R.rodoviaDigitada)) {

							System.out.println("Informe o km aproximado que se encontra: ");
							R.kmDigitado = scanner.nextDouble();
							System.out.println("Está no acostamento?  S/N");
							R.acostamento = scanner.next();				
							System.out.println("O guincho já está se deslocando para o local. Aguarde.");

						} else {

							System.out.println("Este trecho nao pertence à concessionária");
							System.out.println ("\nDeseja tentar novamente? S/N");
							R.rodoviaDigitada = scanner.next();	

						}

					}

					if (R.rodoviaDigitada.equalsIgnoreCase("N")) {

						System.out.println ("Obrigado.");

					}
				}
			}

		}
	}
}





