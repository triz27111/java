
		Scanner teclado = new Scanner(System.in);
		double largura, comprimento;
		double areaT = 0.0;
		String comodo, escolha, Sim, Não;

		System.out.println("...............................");
		System.out.println("             Área              ");
		System.out.println("...............................");

		System.out.println("Você quer calcular a área do cômodo?");
		escolha = teclado.next();

		escolha.equals("Sim");
		{

		}
		System.out.println("Cômodo que deseja calcular a área: ");
		comodo = teclado.next();

		System.out.println("Largura do(a) " + comodo + ": ");
		largura = teclado.nextDouble();

		System.out.println("Comprimento do(a)" + comodo + ": ");
		comprimento = teclado.nextDouble();

		double area = largura * comprimento;
		areaT += area;

		System.out.println("A área do(a)" + comodo + " é: " + area + "m²");

		System.out.println("\nVocê deseja continuar calculando novos cômodos?");
		teclado.nextLine();
		escolha = teclado.nextLine().trim().toUpperCase();
		
	}

	}
