import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int carne = 0;
		System.out.print("Carne escolhida (1-Alcatra; 2- File Duplo; 3-Picanha): ");
		carne = entrada.nextInt();
		
		int pag = 0;
		System.out.print("Forma de pagamento escolhida (1-Cartão tabajara; 2- Dinheiro; 3-Cartão Debito; 4-Cartão Crédito): ");
		pag = entrada.nextInt();

		float alcatra = 0;
		float pAlcatra = 0;
		float fDuplo = 0;
		float pFile = 0;
		float picanha = 0;
		float pPicanha = 0;
		float pTotal = 0;
		float desconto = 0;

		switch (carne) {
		case 1:
			System.out.print("Quantidade de Kg Alcatra: ");
			alcatra = entrada.nextFloat();
			if (picanha < 5) {
				pAlcatra = (float) (alcatra * 6.9);
			} else {
				pAlcatra = (float) (alcatra * 7.8);
			}
			if (pag == 1) desconto = (pAlcatra/100)*5;
			pTotal = pAlcatra - desconto;
			System.out.println("Tipo escolhido Alcatra, Quantidade de carne comprada: "+alcatra);
			System.out.println("Preço total: "+pAlcatra);
			if (pag == 1) {
				System.out.println("Forma de pagamento: Cartão Tabajara");
			} else if (pag == 2) {
				System.out.println("Forma de pagamento: Dinheiro");
			} else if (pag == 3) {
				System.out.println("Forma de pagamento: Cartão Debito");
			} else if (pag == 4) {
				System.out.println("Forma de pagamento: Cartão Credito");
			}
			System.out.println("Desconto: "+desconto);
			System.out.println("Preço a pagar: "+pTotal);
			
			
		break;
		case 2:
			System.out.print("Quantidade de Kg File duplo: ");
			fDuplo = entrada.nextFloat();			
			if (picanha < 5) {
				pFile = (float) (fDuplo * 4.9);
			} else {
				pFile = (float) (fDuplo * 5.8);
			}
			if (pag == 1) desconto = (pFile/100)*5;
			pTotal = pFile - desconto;
			System.out.println("Tipo escolhido File Duplo, Quantidade de carne comprada: "+fDuplo);
			System.out.println("Preço total: "+pFile);
			if (pag == 1) {
				System.out.println("Forma de pagamento: Cartão Tabajara");
			} else if (pag == 2) {
				System.out.println("Forma de pagamento: Dinheiro");
			} else if (pag == 3) {
				System.out.println("Forma de pagamento: Cartão Debito");
			} else if (pag == 4) {
				System.out.println("Forma de pagamento: Cartão Credito");
			}
			System.out.println("Desconto: "+desconto);
			System.out.println("Preço a pagar: "+pTotal);
			
		break;
		case 3:
			System.out.print("Quantidade de Kg Picanha: ");
			picanha = entrada.nextFloat();
						if (picanha < 5) {
				pPicanha = (float) (picanha * 6.9);
			} else {
				pPicanha = (float) (picanha * 7.8);
			}
			if (pag == 1) desconto = (pPicanha/100)*5;
			pTotal = pPicanha - desconto;
			System.out.println("Tipo escolhido Picanha, Quantidade de carne comprada: "+picanha);
			System.out.println("Preço total: "+pPicanha);
				if (pag == 1) {
					System.out.println("Forma de pagamento: Cartão Tabajara");
				} else if (pag == 2) {
					System.out.println("Forma de pagamento: Dinheiro");
				} else if (pag == 3) {
					System.out.println("Forma de pagamento: Cartão Debito");
				} else if (pag == 4) {
					System.out.println("Forma de pagamento: Cartão Credito");
				}
			System.out.println("Desconto: "+desconto);
			System.out.println("Preço a pagar: "+pTotal);
						
		break;
		default:
			System.out.println("Codigo inválido");
		}
		
		entrada.close();
	}

}
