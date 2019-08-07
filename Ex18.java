import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float l1 = 0;
		System.out.print("Informe o primeiro lado do triângulo: ");
		l1 = entrada.nextFloat();
		
		float l2 = 0;
		System.out.print("Informe o segundo lado do triângulo: ");
		l2 = entrada.nextFloat();
		
		float l3 = 0;
		System.out.print("Informe o terceiro lado do triângulo: ");
		l3 = entrada.nextFloat();
		
		float sLado = l1+l2;
		
		if (sLado > l3) {
			System.out.println("É um triângulo");
			
			if(l1 == l2 && l1 == l3) {
				System.out.println("Triângulo Equilátero: três lados iguais");
			} else if (l1 != l2 && l1 != l3 && l2!= l3) {
				System.out.println("Triângulo Escaleno: três lados diferentes");
			} else System.out.println("Triângulo Isósceles: quaisquer dois lados iguais;"); 
			
		} else System.out.println("Não é um triângulo");
		
		entrada.close();
	}

}
