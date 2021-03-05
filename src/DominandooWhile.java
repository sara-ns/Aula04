import java.util.Scanner;

public class DominandooWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calcular a media da idade de 5 alunos//

		// criei uma variavel com int que se chama idade, pq nao sera usado numeros
		// quebrados, criei a variavel N adicionei = ha 1 para ela começar na sequencia
		// no numero 1
		
		int idade, n = 0, qtdAlunos;
		
		String continuar = "sim";
		
		
		double totalidade = 0, media = 0;
		
		Scanner leitor = new Scanner(System.in);

		
		while ( continuar.equals("sim")) {
			System.out.println("Digite a idade do aluno" + (n+1));
		    idade = leitor.nextInt();
		    n = n + 1;
		
			totalidade = idade + totalidade;
			System.out.println("Digite sim para continuar ou nao para calcular a media");
			continuar = leitor.next();
		}

		
		media = totalidade / n;

		System.out.println("A media da idade dos alunos é " + media);
		
		leitor.close();

	}

}
