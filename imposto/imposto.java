package imposto;

import java.util.Scanner;

public class imposto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome, cpf;
		int idade, opcao;
		double salario;
	
		PessoaFisica Pf = new PessoaFisica();
		CalculoImposto calculo = new CalculoImposto();
		
		
		System.out.println("----------------------------------");
		System.out.println("          CONTA PRA MIM");
		System.out.println("   Calcule seu imposto de renda");
		System.out.println("----------------------------------");
		System.out.println("Informe 1- pessoa fisica | 2- pessoa Juridica ");
		opcao = ler.nextInt();
		if (opcao == 1) {
			System.out.println("Insira seu nome completo : ");
			nome = ler.next();
			System.out.println("Digite o cpf : ");
			cpf = ler.next();
			System.out.println("Digite sua idade : ");
			idade = ler.nextInt();
			System.out.println("Digite seu salario anual do ano anterior : ");
			salario = ler.nextInt();
			
			Pf.setNome(nome);
			Pf.setCpf(cpf);
			Pf.setIdade(idade);
			Pf.setSalario(salario);
			
			if(salario < (1903.98*12)) {
				System.out.println(Pf.getNome() + " voce esta isento de pagar imposto de renda neste ano");
			}else if (salario >= (1903.98*12) && salario < (2826.65*12) ) {
			  calculo.calcimposto(salario);
			  System.out.println("Voce devera pagar 7.5% de imposto de renda");
			  System.out.println("Valor da tributação :" + calculo.getResultado());
			}else if (salario >= (2826.65*12) && salario < (3751.05*12)) {
				  System.out.println("Voce devera pagar 15% de imposto de renda");
				  System.out.println("Valor da tributação :" + calculo.getResultado15());
			}else if (salario >= (3751.05*12) &&  salario < (4664.68*12)) {
				  System.out.println("Voce devera pagar 22.5% de imposto de renda");
				  System.out.println("Valor da tributação :" + calculo.getResultado225());
			}else if (salario > (4664.68*12)) {
				  System.out.println("Voce devera pagar 27% de imposto de renda");
				  System.out.println("Valor da tributação :" + calculo.getResultado275());
			}
			
		}else if(opcao == 2) {
			
		}
		
		
		
	}
}
