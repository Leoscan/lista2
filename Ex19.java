import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float a = 0;
		System.out.print("Informe o valor de A: ");
		a = entrada.nextFloat();
		
		
		if(a != 0){
			float b = 0;
			System.out.print("Informe o valor de B: ");
			b = entrada.nextFloat();
			
			float c = 0;
			System.out.print("Informe o valor de C: ");
			c = entrada.nextFloat();
			
		float delta = (b*b)-4*a*c;
		
		if (delta >= 0) {
			if (delta == 0) {
				System.out.println("Só existe um raiz real");
				System.out.println("Delta: "+delta);
				float rDelta = (float) Math.sqrt(delta);
				float resultado = ((-b+rDelta)/2*a);
				System.out.println("Raiz: "+resultado);
			} else {
				float rDelta = (float) Math.sqrt(delta);
				System.out.println("Existe duas raizes reais");
				System.out.println("Delta: "+delta);
				float resultado = (float) ((-b+rDelta)/2*a) ;
				System.out.println("Raiz 1: "+resultado);
				float resultado2 = (float) ((-b-rDelta)/2*a) ;
				System.out.println("Raiz 2: "+resultado2);
			}
			
		} else System.out.println("A equação não possui raizes reais");
			
		} else System.out.println("Não é uma equação de segundo grau");
		
		entrada.close();
	}

}
