import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String per;
		System.out.print("Qual periodo você estuda (m,v,n): ");
		per = entrada.nextLine();
		
		switch (per) {
		case "m":
			System.out.println("Bom Dia");
		break;	
			
		case "v":
			System.out.println("Boa Tarde");
		break;
		case "n":
			System.out.println("Boa Noite");
		break;	
		
		default:
			System.out.println("Padrão errado, escreva m, v ou n");
		}
		
		entrada.close();

	}

}
