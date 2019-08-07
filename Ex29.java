import java.util.Scanner;


public class Ex29 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		float litros = 0;
		System.out.print("Quantos Litros: ");
		litros = entrada.nextFloat();
		
		entrada.nextLine();
		String cod = null;
		System.out.print("Informe o codigo (A;G): ");
		cod = entrada.nextLine();
		
		float preco = 0;
	
		if (cod.equals("A")) {
			preco = (float) (litros * 1.90);
			if (litros < 20) {
				float desconto = (preco/100)*3;
				preco = preco - desconto;
			} else if (litros >= 20) {
				float desconto = (preco/100)*5;
				preco = preco - desconto;
			}
		} else {
			preco = (float) (litros * 2.50);
			if (litros < 20) {
				float desconto = (preco/100)*4;
				preco = preco - desconto;
			} else if (litros >= 20) {
				float desconto = (preco/100)*6;
				preco = preco - desconto;
			}
		}
		System.out.println("Total a Pagar: "+preco);
				
		entrada.close();
	}

}
