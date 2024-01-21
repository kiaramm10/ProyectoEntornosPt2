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
		
		
		System.out.println("Introduce el radio del circulo: ");
        double radio = entradaDouble();
        System.out.println("El área del círculo de radio "+radio+" es "+area(radio));
        System.out.println("El perímetro del círculo de radio "+radio+" es "+perimetro(radio));
        
        System.out.println("Ingresa el radio del cilindro: ");
		double radioCilindro = sc.nextDouble();
		System.out.println("Introduce la altura el cilindro: ");
		double altura = sc.nextDouble();
	
		double areaCilindro = calcularAreaCilindro(radio, altura);
		verResultado(area, areaCilindro);
	}
	
	public static double calcularAreaCilindro(double radioCilindro, double altura) {
		double areaCilindro = 2 * 3.14 * radioCilindro * altura + 2*3.14 *radioCilindro*radioCilindro; 
		return areaCilindro;
	}
	
	public static double calcularArea(int lado1, int lado2, int lado3) {
		
		double semiPer = (lado1 + lado2 + lado3) / 2;
		
		double area = Math.sqrt(semiPer * (semiPer - lado1) * (semiPer - lado2) * (semiPer - lado3));
		
		return area;
	}
  
    private static double entradaDouble(){
        return sc.nextDouble();
    }
    
    private static double area(double radio) {
    	
    	double area = Math.PI * Math.pow(radio, 2);
    	
    	return area;
    	
}
    private static double perimetro(double radio) {
    	
    	double perimetro = 2 * Math.PI * radio;
    	
    	return perimetro;
    	
    }
    
    public static void verResultado(double area, double areaCilindro) {
		System.out.println("El área del triangulo es: " + area);
		System.out.println("El área del cilindro es: " + areaCilindro);
	}

}