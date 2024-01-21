package ejercicio;
import java.util.Scanner;

public class Ejercicio1 {
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Introduce el lado del triangulo: ");
		double lado1 = sc.nextDouble();
		System.out.println("Introduce el segundo lado");
		double lado2 = sc.nextDouble();
		System.out.println("Introduce el tercer lado");
		double lado3 = sc.nextDouble();
	
		double area = calcularArea(lado1, lado2, lado3);
		
		verResultadoTriangulo(area);
		
		
		System.out.println("Introduce el radio del circulo: ");
        double radio = entradaDouble();
        System.out.println("El área del círculo de radio "+radio+" es "+area(radio));
        System.out.println("El perímetro del círculo de radio "+radio+" es "+perimetro(radio));
        
        System.out.println("Ingresa el radio del cilindro: ");
		double radioCilindro = sc.nextDouble();
		System.out.println("Introduce la altura el cilindro: ");
		double altura = sc.nextDouble();
	
		double areaCilindro = calcularAreaCilindro(radio, altura);
		verResultadoCilindro(areaCilindro);
		
		System.out.println("Introduce la base: ");
		double base = entradaDouble();
		System.out.println("Introduce la altura: ");
		double alturarec = entradaDouble();
		
		System.out.println("El área del rectángulo es "+calcularAreaRectangulo(base, alturarec));
		
		System.out.println("Introduce la altura de la arista: ");
		double arista = entradaDouble();
		System.out.println("El área del cubo es: " + calcAreaCubo(arista));
	}
	
	public static double calcularAreaCilindro(double radioCilindro, double altura) {
		double areaCilindro = 2 * 3.14 * radioCilindro * altura + 2*3.14 *radioCilindro*radioCilindro; 
		return areaCilindro;
	}
	
	public static double calcularArea(double lado1, double lado2, double lado3) {
		
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
    
    public static void verResultadoTriangulo(double area) {
		System.out.println("El área del triangulo es: " + area);
	}
    
    public static void verResultadoCilindro(double areaCilindro) {
		System.out.println("El área del cilindro es: " + areaCilindro);
	}
    
    
    
    public static double calcularAreaRectangulo(double base, double altura) {
		
		return base * altura;
	}
    
    private static double calcAreaCubo(double arista) {
		
		return 6 * Math.pow(arista, 2);
		
	}

}