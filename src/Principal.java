import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, media;
		String nome;
		
		Scanner input = new Scanner(System.in);
		System.out.println("\n /////////////////////////");
		System.out.println("\n Qual o seu nome?");
		nome = input.next();
		System.out.println("\n Muito prazer em conhece-lo "+ nome +"! Agora vamos calcular a sua média de notas!");
		System.out.println("\n /////////////////////////");
		
		
		System.out.println("\n Insira o valor da nota 1:");
		nota1 = input.nextDouble();
		
		System.out.println("\n Insira o valor da nota 2:");
		nota2 = input.nextDouble();
		
		System.out.println("\n Insira o valor da nota 3:");
		nota3 = input.nextDouble();
		
		System.out.println("\n Insira o valor da nota 4:");
		nota4 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("\n A média das suas notas é: "+ media);
		
		if (media >= 7) {
			System.out.println("\n \n Você passou de ano meu chapa! \n");
		} else {
			if(media >= 4) {
				System.out.println("\n \n Você está de recuperação, seu lixo! \n");
			} else {
				System.out.println("\n \n Você reprovou de ano! Parabéns!!!");
			}
		}
	}
}
