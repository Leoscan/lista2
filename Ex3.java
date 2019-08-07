import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String sexo;
		System.out.print("Informe o sexo (M,F): ");
		sexo = entrada.nextLine();
		
		switch (sexo) {
		case "m":
			System.out.println("Masculino");
		break;	
			
		case "f":
			System.out.println("Feminino");
		break;
		case "M":
			System.out.println("Masculino");
		break;	
			
		case "F":
			System.out.println("Feminino");
		break;
		
		default:
			System.out.println("Padrão errado, escreva m ou f, em maiúsculo ou minusculo");
		}
		
		entrada.close();
	}

}
