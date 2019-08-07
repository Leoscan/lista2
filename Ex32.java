import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String q1 = null;
		System.out.print("Informe Resultado da primeira questão: ");
		q1 = entrada.nextLine();
		
		String q2 = null;
		System.out.print("Informe Resultado da segunda questão: ");
		q2 = entrada.nextLine();
		
		String q3 = null;
		System.out.print("Informe Resultado da terceira questão: ");
		q3 = entrada.nextLine();
		
		String q4 = null;
		System.out.print("Informe Resultado da quarta questão: ");
		q4 = entrada.nextLine();
		
		String q5 = null;
		System.out.print("Informe Resultado da quinta questão: ");
		q5 = entrada.nextLine();
		
		String q6 = null;
		System.out.print("Informe Resultado da sexta questão: ");
		q6 = entrada.nextLine();
		
		String q7 = null;
		System.out.print("Informe Resultado da setima questão: ");
		q7 = entrada.nextLine();
		
		String q8 = null;
		System.out.print("Informe Resultado da oitava questão: ");
		q8 = entrada.nextLine();
		
		String q9 = null;
		System.out.print("Informe Resultado da nona questão: ");
		q9 = entrada.nextLine();
		
		String q10 = null;
		System.out.print("Informe Resultado da decima questão: ");
		q10 = entrada.nextLine();
	
		System.out.println("Q1: "+q1+": (a)");
		System.out.println("Q2: "+q2+": (a)");
		System.out.println("Q3: "+q3+": (b)");
		System.out.println("Q4: "+q4+": (b)");
		System.out.println("Q5: "+q5+": (c)");
		System.out.println("Q6: "+q6+": (c)");
		System.out.println("Q7: "+q7+": (d)");
		System.out.println("Q8: "+q8+": (d)");
		System.out.println("Q9: "+q9+": (e)");
		System.out.println("Q10: "+q10+": (e)");
		
		int resultado = 0;
		
		if (q1.equals("a")) resultado = resultado + 1;
		if (q2.equals("a")) resultado = resultado + 1;
		if (q3.equals("b")) resultado = resultado + 1;
		if (q4.equals("b")) resultado = resultado + 1;
		if (q5.equals("c")) resultado = resultado + 1;
		if (q6.equals("c")) resultado = resultado + 1;
		if (q7.equals("d")) resultado = resultado + 1;
		if (q8.equals("d")) resultado = resultado + 1;
		if (q9.equals("e")) resultado = resultado + 1;
		if (q10.equals("e")) resultado = resultado + 1;
		
		System.out.println("Pontuação Final: "+resultado);
		
		entrada.close();
	}

}
