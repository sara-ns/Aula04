import java.util.Scanner;

public class WhileSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, n = 1, qtdAlunos, totalidade=0;
		
		// o double aqui tem a finalidade para se caso a media for numero quebrado//
		 double media = 0;
		 
		// Aqui foi criado um Scanner com o nome de leitor para capturar oq o usuario
		// digita
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a quantidade de alunos");
		qtdAlunos = leitor.nextInt();
		

		// Enquanto essa condiçao N for menor ou a igual que o total de alunos, ele ira executar as 4 linhas abaixo
		while (n <= qtdAlunos) {
			System.out.println("Digite a idade do aluno " + n);
			//
			idade = leitor.nextInt();
			// minha variavel N ela é igual a 1, quando executar o loop, ele vai começar a somar as vezes de loop ex: existe 3 aluno vai rodar 3 vezes, 1+1=2 primeiro loop,2+1=3 segundo loop
			n = n + 1;
			//
			totalidade = idade + totalidade;
		}

		media = totalidade / qtdAlunos;

		System.out.println("A media da idade dos alunos é " + media);
		
		leitor.close();


	}

}
