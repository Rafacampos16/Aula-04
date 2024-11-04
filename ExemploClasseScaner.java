import java.util.Scanner;

public class ExemploClasseScaner {
	
	public static void main (String[] args) {
			System.out.println(args[0]);
			System.out.println(args[1]);
			
			Scanner leia = new Scanner (System.in);
			Scanner leiaString = new Scanner (System.in);
			
			int idade;
			String nome, endereco;
			double altura;
			
			System.out.println("Entre com sua idade: ");
			idade = leia.nextInt();
			System.out.println("Sua idade eh: " + idade);
			
			System.out.println("\nEntre com seu nome: ");
			nome = leia.next();
			System.out.println("Seu nome eh: " + nome);
			
			System.out.println("\nEntre com seu endereco: ");
			endereco = leiaString.nextLine();
			System.out.println("Seu endereco eh: " + endereco);
			
			System.out.println("\nEntre com sua altura: ");
			altura = leia.nextDouble();
			System.out.println("Sua altura eh: " + altura);
			
	}
}

