package imposto;

public class CalculoImposto {
	
	private double resultado075, resultado15, resultado225, resultado275;
	

	public double calcimposto( double salario) {
		
		resultado075 = salario*0.075;
		
		return resultado075;
	}
	
	public double calcimposto15( double salario) {
		
		resultado075 = salario*0.15;
		
		return resultado15;
	}
	public double calcimposto225( double salario) {
		
		resultado225 = salario*0.225;
		
		return resultado225;
	}
	public double calcimposto275( double salario) {
		
		resultado275 = salario*0.275;
		
		return resultado275;
	}
	


	public double getResultado() {
		return resultado075;
	}


	public double getResultado075() {
		return resultado075;
	}


	public void setResultado075(double resultado075) {
		this.resultado075 = resultado075;
	}


	public double getResultado15() {
		return resultado15;
	}


	public void setResultado15(double resultado15) {
		this.resultado15 = resultado15;
	}


	public double getResultado225() {
		return resultado225;
	}


	public void setResultado225(double resultado225) {
		this.resultado225 = resultado225;
	}


	public double getResultado275() {
		return resultado275;
	}


	public void setResultado275(double resultado275) {
		this.resultado275 = resultado275;
	}


	public void setResultado(double resultado) {
		this.resultado075 = resultado;
	}

	
	
	
}
