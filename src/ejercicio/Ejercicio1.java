package ejercicio;
import java.util.Scanner;
public class Ejercicio1 {
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Introduce el lado del triangulo: ");
		int lado1 = sc.nextInt();
		System.out.println("Introduce el segundo lado");
		int lado2 = sc.nextInt();
		System.out.println("Introduce el tercero lado");
		int lado3 = sc.nextInt();
	
		double area = calcularArea(lado1, lado2, lado3);
		verResultado(area);
	}
	
	public static double calcularArea(int lado1, int lado2, int lado3) {
		
		double semiPer = (lado1 + lado2 + lado3) / 2;
		
		double area = Math.sqrt(semiPer * (semiPer - lado1) * (semiPer - lado2) * (semiPer - lado3));
		
		return area;
	}
	
	public static void verResultado(double area) {
		System.out.println("El área del triangulo es: " + area);
	}


}
