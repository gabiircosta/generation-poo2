package ExerciPOOHeranca;
import java.util.Scanner;

//1- Crie a Classe
public class testeFornecedor {
//2- Crie o main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//B�nus Intera��o:
		String fornecedor;
		String endereco;
		String telefone;
		double valorDivida;
		double valorCredito;
		double saldo=0;
				
//3 - Instancie seus objetos
		Scanner ler = new Scanner (System.in);
		
//B�nus Intera��o:
		System.out.print("Nome do Fornecedor: ");
		fornecedor = ler.nextLine();
		System.out.print("Cidade: ");
		endereco = ler.nextLine();
		System.out.print("Telefone: ");
		telefone = ler.nextLine();
		System.out.print("Valor da D�vida: R$ ");
		valorDivida = ler.nextDouble();
		System.out.print("Valor do Cr�dito: R$ ");
		valorCredito = ler.nextDouble();
				
//3 - Finalizando o instanciamento de objetos
		Fornecedor for1 = new Fornecedor (fornecedor, endereco, telefone, valorDivida, valorCredito,saldo);
		
		for1.setNome(fornecedor);
		for1.setEndereco(endereco);
		for1.setTelefone(telefone);
		for1.setValorDivida(valorDivida);
		for1.setValorCredito(valorCredito);
		for1.setSaldo(saldo);
		
//4- Fa�a as impress�es e chame os m�todos criados na classe Fornecedor
		System.out.println("****************************\n");
		System.out.println("**Informa��es**");
		System.out.println("Fornecedor:"+for1.getNome()+"\nEndere�o: "+for1.getEndereco()+"\nTelefone: "+for1.getTelefone()+"\nSua d�vida atual � de: R$ "+for1.getValorDivida()+"\nValor de cr�dito: R$ "+for1.getValorCredito());

		for1.obterSaldo();
		for1.ImprimirInfo();
	
		}					
	}


