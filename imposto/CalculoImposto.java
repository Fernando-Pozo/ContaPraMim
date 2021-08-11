package ImpostoRenda;

public class CalculoImposto {

	private double resultado075, resultado15, resultado225, resultado275;
	private double resultado15pj, resultado25pj, tri15pj, tri25pj, anual15pj, anual25pj; 

	public double calcimposto( double salario) {
		
		resultado075 = salario*0.075;
		
		return resultado075;
	}
	
	public double calcimposto15( double salario) {
		
		resultado15 = salario*0.15;
		
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
	

	public void setResultado075(double resultado075) {
		this.resultado075 = resultado075;
	}
		public double getResultado075() {
			return resultado075;
		}

		public void setResultado15(double resultado15) {
			this.resultado15 = resultado15;
		}

			public double getResultado15() {
				return resultado15;
			}

		public void setResultado225(double resultado225) {
			this.resultado225 = resultado225;
		}

			public double getResultado225() {
				return resultado225;
			}

		public void setResultado275(double resultado275) {
			this.resultado275 = resultado275;
		}
			public double getResultado275() {
				return resultado275;
			}
				
			
		
		public double calcMensal15 (double renda ) {
			resultado15pj = renda*0.15;
			
			return resultado15pj;
			
		}
		public void setResultado15pj(double resultado15pj) {
			this.resultado15pj = resultado15pj;
		}
			
			public double getResultado15pj() {
				return resultado15pj;
			}
			
			
			
			public double calcMensal25 (double resto ) {
				resultado25pj = resto*0.10;
				
				return resultado25pj;
				
			}
			public void setResultado25pj(double resultado25pj) {
				this.resultado25pj = resultado25pj;
			}
				
				public double getResultado25pj() {
					return resultado25pj;
				}
			
				
			public double calcTrimestral15 (double renda ) {
				tri15pj = renda*0.15;
					
				return tri15pj;
				}
			
			public void setTrimestral15(double trimestral15pj) {
				this.tri15pj = trimestral15pj;
				}	
					public double getTrimestral15() {
						return tri15pj;
					}
			
			
			public double calcTrimestral25 (double resto ) {
				tri25pj = resto*0.10;
							
				return tri25pj;
				}
					
			public void setTrimestral25(double trimestral25pj) {
				this.tri25pj = trimestral25pj;
				}	
					public double getTrimestral25() {
						return tri25pj;
					}
					public double calcAnual15 (double renda ) {
						anual15pj = renda*0.15;
									
						return anual15pj;
						}
							
					public void setAnual15(double resultadoAnual15pj) {
						this.anual15pj = resultadoAnual15pj;
						}	
							public double getAnual15() {
								return anual15pj;
							}
					
					public double calcAnual25 (double resto ) {
						anual25pj = resto*0.10;
											
						return anual25pj;
						}
									
					public void setAnual25(double resultadoAnual25pj) {
						this.anual25pj = resultadoAnual25pj;
							}	
							public double getAnual25() {
								return anual25pj;
							}			

	
	
	
}

