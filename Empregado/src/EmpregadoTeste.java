import java.util.Scanner;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Empregado empregado = new Empregado("Matheus", 3500);
		
		String nome;
		double salario;

		System.out.println("Informações definidas manualmente");
		System.out.println(empregado.exibir());
		System.out.println("---------------------------------");

		System.out.println("Informações mudadas a partir do Scanner");
		
		System.out.println("Nome: ");
		nome = input.next();
		System.out.println("Salário: ");
		salario = input.nextDouble();

		empregado.setSalario(salario);
		empregado.setNome(nome);

		System.out.println(empregado.exibir());

	}

}
