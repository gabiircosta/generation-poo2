package ExerciPOOHeranca;

import java.text.NumberFormat;

//1 - Crie a Classe linkando com a Classe mãe
public class Fornecedor extends Pessoa 
{
//2- Dê os atributos
	private double valorCredito;
	private double valorDivida;
	private double saldo;
//3- Crie o construtor, atribua parâmetros inicalize os atributos, chame os atributos da mãe dentro das chaves

	public Fornecedor (String nome, String endereco, String telefone, double valorCredito, double valorDivida, double saldo)
	{
		super (nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.saldo = saldo;
	}
//4- Crie os métodos
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
		System.out.println("\n**ATENÇÃO**");
		
		if (saldo<0) 
		{
		saldo = saldo * (-1);
		System.out.println("O valor a pagar ao fornecedor é de: "+this.formatarMoeda());
		}
		else if (saldo>0)
		{
		System.out.println("O saldo a receber do fornecedor é de: "+this.formatarMoeda());
		}
		else if (saldo==0)
		{
		System.out.println("O valor da dívida é igual ao valor de crédito, portanto, você não deve mais nada ao fornecedor!");
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
