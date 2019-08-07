import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float altura = 0;
		System.out.print("Informe sua altura: ");
		altura = entrada.nextFloat();			
		entrada.nextLine();
		
		String sexo;
		System.out.print("Informe o sexo (m,f): ");
		sexo = entrada.nextLine();	
		
		float peso = 0;
		System.out.print("Informe seu peso: ");
		peso = entrada.nextFloat();							
		
		float  pIdeal = 0;
		
		System.out.print("Altura: "+altura+"; peso: "+peso+" ");
		if (sexo.equals("m")){
			System.out.println("É um homem usando a fórmula ((altura*72.7) - 58)");
			pIdeal = (float) ((altura*72.7) - 58) ;
		} else {
			System.out.println("É uma mulher usando a fórmula ((altura*62.1) - 44.7)");
			pIdeal = (float) ((altura*62.1) - 44.7) ;
		}
		
	 
		System.out.println("O Peso ideal para está altura é: "+pIdeal+" kg");
		
		if (peso >= pIdeal) {
			System.out.println("Esta acima do peso ideal");
		} else if (peso <= pIdeal) {
			System.out.println("Esta acima do peso ideal");
		} else System.out.println("Esta no peso ideal");
		
		
		entrada.close();


	}

}
