import java.util.Scanner;

public class SistemaTeste {

	public static void main(String[] args) {
		Calculo calculadora = new Calculo();
		Scanner input = new Scanner(System.in);
		double x;
		double y;
		int opcao;
		System.out.println("-- Escolha a operação desejada --");
		try {
			System.out.println("1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão, 5 - Sair");
			System.out.println("Informe a opção: ");
			opcao = input.nextInt();

			System.out.println("Informe X: ");
			x = input.nextDouble();

			System.out.println("Informe Y: ");
			y = input.nextDouble();

			while (opcao != 5) {
				switch (opcao) {
				case 1:
					calculadora.soma(x, y);
					break;
				case 2:
					calculadora.sub(x, y);
					break;
				case 3:
					calculadora.mult(x, y);
					break;
				case 4:
					calculadora.div(x, y);
					break;
				}
				System.out.println("Escolha novamente a opção: ");
				opcao = input.nextInt();
			}
		} catch (Exception e) {
			System.out.println("Inválido! Informe um valor válido!");
		}
	}
}
