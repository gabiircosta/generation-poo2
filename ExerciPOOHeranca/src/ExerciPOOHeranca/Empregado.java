package ExerciPOOHeranca;

import java.text.NumberFormat;

//1- Crie a Classe
public class Empregado extends Pessoa 
{
//2- Dê Atributos
	int codigoSetor;
	double salarioBase;
	double imposto;

//3- Crie o construtor, atribua parâmetros inicalize os atributos, chame os atributos da mãe dentro das chaves
	public Empregado (String nome, String endereco, String telefone, int setor, double salariob, double imposto)
	{
		super (nome, endereco, telefone);
		codigoSetor = setor;
		salarioBase = salariob;
		this.imposto = imposto;
	}
	
//4- Crie os métodos
	public void obterSalarioLiquido() 
	{
		double salarioLiquido;
		
		if (salarioBase <= 1045)
		{
			imposto = 7.5/100;
		}
		else if (salarioBase > 1045 && salarioBase<= 2089)
		{
			imposto = 9.0/100;
		}
		else if (salarioBase > 2089 && salarioBase<= 3134)
		{
			imposto = 12/100;
		}
		else if (salarioBase > 3134 && salarioBase<= 6101)
		{
			imposto = 14/100;
		}
		
		salarioLiquido = salarioBase - (salarioBase * imposto);
		System.out.println("Seu salário líquido é de:R$ "+salarioLiquido);
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
}
