import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		float morango = 0;
		System.out.print("Quantidade de Kg Morango: ");
		morango = entrada.nextFloat();
		
		float maca = 0;
		System.out.print("Quantidade de Kg Maça: ");
		maca = entrada.nextFloat();
		
		float pTotal = 0;
		float pMor = 0;
		float pMaca = 0;
		float tKg = morango + maca;
		
		
		if (morango < 5) {
			pMor = (float) (morango * 2.50);
		} else pMor = (float) (morango * 2.20);
		
		if (maca < 5) {
			pMaca = (float) (maca * 1.80);
		} else pMaca = (float) (maca * 1.50);
		
		pTotal = pMaca + pMor;
		
		if (pTotal > 25 || tKg > 8) {
			float desconto = (pTotal/100)*10;
			pTotal = pTotal - desconto;
		}
		
		System.out.println("Valor a Pagar: "+pTotal);
		
		
		entrada.close();
	}

}
