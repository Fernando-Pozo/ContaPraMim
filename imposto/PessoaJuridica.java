package ImpostoRenda;

public class PessoaJuridica {
	private String cnpj;
	private String nome;
	private double renda;

	public void setNome(String nome) {
		this.nome = nome;
	}
		public String getNome() {
			return nome;
		}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}	
		public String getCnpj() {
			return cnpj;
		}
	
	public void setRenda(double renda) {
		this.renda = renda;
	}
		
		public double getRenda() {
			return renda;
		}
		
		

}