package conta;
import java.util.Scanner;
import conta.util.Cores;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;


public class Menu {

	public static void main(String[] args) {
		// Teste da classe Conta
	
		Conta c1 = new Conta(1, 123,1, "Tais", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		
		
		//Teste de classe conta corrente
		ContaCorrente cc1 = new ContaCorrente(2,123,1,"Luiza", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//Teste conta poupança
		ContaPoupanca cp1 = new ContaPoupanca(3,123,"Luiz",2, 100000.0f,15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		Scanner leia = new Scanner(System.in);
		int menu, opcao;

		while (true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND);
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("                 BANCO DO BRAZIL                    ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("                  1 - Criar conta.                  ");
			System.out.println("                  2 - Listar todas as contas.       ");
			System.out.println("                  3 -Buscar conta por Numero.       ");
			System.out.println("                  4 - Atualizar dados da conta.     ");
			System.out.println("                  5 -Apagar conta.                  ");
			System.out.println("                  6 - Sacar.                        ");
			System.out.println("                  7 - Depositar.                    ");
			System.out.println("                  8 - Transferir valor entre contas.");
			System.out.println("                  9 - Sair.                         ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("Entre com a opção desejada:                         ");
			System.out.println("                                                    " + Cores.TEXT_RESET);

			menu = leia.nextInt();

			if (menu == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nBanco do Brasil - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
			switch (menu) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta \n\n");

				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as contas \n\n");

				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados de conta - por numero \n\n");

				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados de conta \n\n");

				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a conta \n\n");

				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque \n\n");

				break;

			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Deposito \n\n");

				break;

			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre contas \n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção Inválida! \n\n");

				break;

			}

		}
	}
}
