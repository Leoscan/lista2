import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float preco = 0;
		System.out.print("Informe o valor do produto: ");
		preco = entrada.nextFloat();
		
		int cod = 0;
		System.out.print("Informe o código do produto: ");
		cod = entrada.nextInt();
		
		String origem;
		
		switch (cod) {
		case 1:
			origem = "Sul";
		break;
		case 2:
			origem = "Norte";
		break;
		case 3:
			origem = "Leste";
		break;
		case 4:
			origem = "Oeste";
		break;
		case 5:
			origem = "Nordeste";
		break;
		case 6:
			origem = "Nordeste";
		break;
		case 7:
			origem = "Centro-oeste";
		break;
		case 8:
			origem = "Centro-oeste";
		break;

		default:
			origem = "Importado";
		}
		
		System.out.println("Preço:   R$"+preco);
		System.out.println("Procedência:   "+origem);
		entrada.close();
	}

}
