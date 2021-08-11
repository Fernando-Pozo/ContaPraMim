package ImpostoRenda;

import java.util.Scanner;

public class imposto {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome, cpf, cnpj;
		int idade, opcao;
		double salario, renda;
		
		PessoaJuridica pj = new PessoaJuridica();
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
			
			System.out.println("Digite o seu rendimento anual do ano anterior : ");
			salario = ler.nextInt();
			
			Pf.setNome(nome);
			Pf.setCpf(cpf);
			Pf.setIdade(idade);
			Pf.setSalario(salario);
			
			if(salario < (1903.98*12)) {
				System.out.println(Pf.getNome() + " voce esta isento de pagar imposto de renda neste ano");
			}
			
			else if (salario >= (1903.98*12) && salario < (2826.65*12) ) {
			  calculo.calcimposto(salario);
			  System.out.println("Voce devera pagar 7.5% de imposto de renda");
			  System.out.println("Valor da tributação :" + calculo.getResultado075());
			}
			
			else if (salario >= (2826.65*12) && salario < (3751.05*12)) {
				  calculo.calcimposto15(salario);
				  System.out.println("Voce devera pagar 15% de imposto de renda");
				  System.out.println("Valor da tributação :" + calculo.getResultado15());
			}
			
			else if (salario >= (3751.05*12) &&  salario < (4664.68*12)) {
				  calculo.calcimposto225(salario);
				  System.out.println("Voce devera pagar 22.5% de imposto de renda");
				  System.out.println("Valor da tributação :" + calculo.getResultado225());
			}
			
			else if (salario > (4664.68*12)) {
				  calculo.calcimposto275(salario);
				  System.out.println(Pf.getNome() + " devera pagar 27% de imposto de renda");
				  System.out.println("Valor da tributação :" + calculo.getResultado275());
			}
			
		}
			else if(opcao == 2) {
				
				System.out.println("Digite a opção que deseja calcular o IRPJ: ");
				System.out.println("1 - Calculo mensal | 2 - Calculo trimestral | 3 - Calculo anual");
				opcao = ler.nextInt();
				System.out.println();
				
				System.out.println("Digite o nome da empresa: ");
				nome = ler.next();
				
				System.out.println("Digite o CNPJ da empresa: ");
				cnpj = ler.next();
				
				System.out.println("Digite a renda da empresa referente a opção escolhida: ");
				renda = ler.nextDouble();
				
				pj.setNome(nome);
				pj.setCnpj(cnpj);
				pj.setRenda(renda);
				
				if (opcao == 1) {
			
					if (renda <= 20000.00) {
					
				 calculo.calcMensal15(renda);
				 System.out.println(pj.getNome() + " devera pagar 15% de imposto de renda");
				 System.out.println("Valor da tributação :" + calculo.getResultado15pj());
					
				}
					else if (renda > 20000.00) {
					
					 calculo.calcMensal25(renda);
					 System.out.println(pj.getNome() + " devera pagar 25% de imposto de renda");
					 System.out.println("Valor da tributação referente a 1 mes é de :" + calculo.getResultado25pj());
						
					}
				}
				else if (opcao == 2) {
				
					if (renda <= (20000.00*3)) {
						calculo.calcTrimestral15(renda);
						System.out.println(pj.getNome() + " devera pagar 15% de imposto de renda");
						System.out.println("Valor da tributação referente a 3 meses é de :" + calculo.getTrimestral15());
							}
					else if (renda >= (20000.00*3)) {
						calculo.calcTrimestral25(renda);
						System.out.println(pj.getNome() + " devera pagar 25% de imposto de renda");
						System.out.println("Valor da tributação :" + calculo.getTrimestral25());					
							}
						}
				else if (opcao == 3) {
					
					if (renda <= 20000.00*12) {
						calculo.calcAnual15(renda);
						System.out.println(pj.getNome() + " devera pagar 15% de imposto de renda");
						System.out.println("Valor da tributação referente a 1 é de :" + calculo.getAnual15());
							}
					else if (renda >= (20000.00*12)) {
						calculo.calcAnual25(renda);
						System.out.println(pj.getNome() + " devera pagar 25% de imposto de renda");
						System.out.println("Valor da tributação :" + calculo.getAnual25());					
							}
				}
				
				
					}
				}
			}



