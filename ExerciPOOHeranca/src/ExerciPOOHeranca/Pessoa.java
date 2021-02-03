package ExerciPOOHeranca;

//1- Crie a Classe
public class Pessoa {
//2- Crie os Atributos
	private String nome;
	private String endereco;
	private String telefone;
//3- Crie o construtor, atribua par�metros e inicalize os atributos
	public Pessoa (String nome, String endereco, String telefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
//4 - Crie m�todos
	public void ImprimirInfo () 
	{
		System.out.println("Dados de Voo\n*******\nNome da(o) Cliente: "+nome+"\nEndere�o: "+endereco+"\nTelefone: "+telefone);
	}

	public void WhatsApp ()
	{
		System.out.println("Favor informar se esse n�mero possui WhatsApp: ");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
