package br.com.codenation.calculadora;


import sun.security.krb5.internal.PAData;

public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		if(salarioBase<1039.00)
			return 0;
		else
		return Math.round(calcularIRRF(calcularINSS(salarioBase)));
	}
	
	
	//Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	private double calcularINSS(double salarioBase) {

		double inss = 0;
		if(salarioBase<=1500)
			inss = salarioBase * 0.08;
		else if(salarioBase<=4000)
			inss = salarioBase * 0.09;
		else
			inss = salarioBase * 0.11;
		return salarioBase-inss;
	}
	private double calcularIRRF(double salarioBase) {
		double irrf = 0.0;
		if(salarioBase<=3000)
			irrf = 0.0;
		else if(salarioBase<=6000)
			irrf = salarioBase * 0.075;
		else
			irrf = salarioBase * 0.15;
		return salarioBase-irrf;
	}

}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/