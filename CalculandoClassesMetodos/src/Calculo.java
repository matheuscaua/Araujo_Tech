
public class Calculo {
	public void soma(double x, double y) {
		double resultado = x + y;
		System.out.println("A soma é: "+resultado);
	}
	public void sub(double x, double y) {
		double resultado = x - y;
		System.out.println("A subtração é: "+resultado);
	}
	public void mult(double x, double y) {
		double resultado = x * y;
		System.out.printf("A Multiplicação é %.2f",resultado);
	}
	public void div(double x, double y) {
		double resultado = x / y;
		System.out.printf("A Divisão é: %.2f",resultado);
	}
}	
