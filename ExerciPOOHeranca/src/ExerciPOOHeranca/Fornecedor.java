package ExerciPOOHeranca;

import java.text.NumberFormat;

//1 - Crie a Classe linkando com a Classe m�e
public class Fornecedor extends Pessoa 
{
//2- D� os atributos
	private double valorCredito;
	private double valorDivida;
	private double saldo;
//3- Crie o construtor, atribua par�metros inicalize os atributos, chame os atributos da m�e dentro das chaves

	public Fornecedor (String nome, String endereco, String telefone, double valorCredito, double valorDivida, double saldo)
	{
		super (nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.saldo = saldo;
	}
//4- Crie os m�todos
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(saldo);
		return formatoMoeda;
	}
	public void obterSaldo() 
	{
		saldo = valorCredito - valorDivida;
		
	}
	public void ImprimirInfo()
	{
		System.out.println("\n**ATEN��O**");
		
		if (saldo<0) 
		{
		saldo = saldo * (-1);
		System.out.println("O valor a pagar ao fornecedor � de: "+this.formatarMoeda());
		}
		else if (saldo>0)
		{
		System.out.println("O saldo a receber do fornecedor � de: "+this.formatarMoeda());
		}
		else if (saldo==0)
		{
		System.out.println("O valor da d�vida � igual ao valor de cr�dito, portanto, voc� n�o deve mais nada ao fornecedor!");
		}

	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
