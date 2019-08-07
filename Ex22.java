import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Informe um número menor que mil: ");
		num = entrada.nextInt();
		
		if (num >= 1000){
			System.out.println("Número invalido");
		} else {
			int pCasa = num % 10;
			int sCasa = (num/10) % 10;
			int tCasa = (num/100) % 10;
			
			System.out.println(num+" = "+tCasa+" Centenas, "+sCasa+" Dezenas, "+pCasa+" Unidades");
		}
		
		entrada.close();
	}

}
