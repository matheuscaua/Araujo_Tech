import java.util.Scanner;

public class Salarios {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salarioMinimo;
		double salarioUsuario;
		System.out.println("Salário Mínimo: ");
		salarioMinimo = input.nextDouble();
		System.out.println("Salário Usuário: ");
		salarioUsuario = input.nextDouble();
		
		if(salarioUsuario > salarioMinimo) {
			double div = salarioUsuario / salarioMinimo;
			System.out.printf("O salário do Usuário é %.2fx maior que o salário mínimo!",div);
		}else
			System.out.println("O salário do usuário é menor que o salário mínimo!");
		
	}
}
