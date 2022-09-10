import java.util.Scanner;

public class HorasTrabalho {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Horas trabalhadas : ");
		double horas = input.nextDouble();
		double salarioH = horas * 10;
		System.out.printf("Salário: R$ %.2f",salarioH);
	}

}
