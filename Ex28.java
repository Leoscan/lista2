import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int r1 = 0;
		System.out.print("Telefonou para a vítima?(1-sim;2-não) ");
		r1 = entrada.nextInt();
		
		int r2 = 0;
		System.out.print("Esteve no local do crime?(1-sim;2-não) ");
		r2 = entrada.nextInt();
		
		int r3 = 0;
		System.out.print("Mora perto da vítima?(1-sim;2-não) ");
		r3 = entrada.nextInt();
		
		int r4 = 0;
		System.out.print("Devia para a vítima?(1-sim;2-não) ");
		r4 = entrada.nextInt();
		
		int r5 = 0;
		System.out.print("Já trabalhou com a vítima?(1-sim;2-não) ");
		r5 = entrada.nextInt();
		
		int total = 0; 
		if (r1 == 1) total = total + 1;
		if (r2 == 1) total = total + 1;
		if (r3 == 1) total = total + 1;
		if (r4 == 1) total = total + 1;
		if (r5 == 1) total = total + 1;
		
		String cl = null;
		if (total == 2) {
			cl = "Suspeito";
		} else if (total > 2 && total <= 4) {
			cl = "Cúmplice";
		} else if (total == 5) {
			cl = "Assassino";
		} else cl = "Inocente";

		System.out.println("Classificada como: "+cl);
		
		entrada.close();
	}

}
