package ExerciPOOHeranca;

import java.util.Scanner;

//1- Crie a classe
public class testeEmpregado {

//2-Crie o main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//B�nus Intera��o:
		String nome;
		String endereco;
		String telefone;
		int codigoSetor;
		double salarioBase;
		double imposto=0; 

//3 - Instancie seus objetos
		Scanner ler = new Scanner (System.in);	

//B�nus Intera��o:
		System.out.print("*** CADASTRO DE COLABORADOR(A) ***\n");
		System.out.print("Nome do(a) Colaborador(a): ");
		nome = ler.next();
		System.out.print("Endere�o: ");
		endereco = ler.next();
		System.out.print("Telefone: ");
		telefone = ler.next();
		System.out.print("C�digo Setor: ");
		codigoSetor = ler.nextInt();
		System.out.print("Salario Base: R$ ");
		salarioBase = ler.nextDouble();
		
//3- Finalizando o instanciamento de objetos
		//Aqui voc� esqueceu de colocar todas os atributos da classe m�e, se voc� vai fazer intera��o com o usu�rio,
		//Lembre-se ent�o, de fazer todas as vari�veis de acordo com o que voc� precisa preecher da classe m�e
		//nesse caso, o nome, endere�o e telefone, voc� tinha esquecido de colocar... quando colocou, deu certo.
		Empregado emp1 = new Empregado (nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		
		emp1.setNome(nome);
		emp1.setEndereco(endereco);
		emp1.setTelefone(telefone);
		emp1.setCodigoSetor(codigoSetor);
		emp1.setSalarioBase(salarioBase);
		emp1.setImposto(imposto);

//4- Fa�a as impress�es e chame os m�todos criados na classe Empregado
		
		System.out.println("\n***** RESULTADO *****\nFuncion�rio: "+emp1.getNome()+"\nContratado para o setor: "+emp1.getCodigoSetor());
		emp1.obterSalarioLiquido();	
	
	
	}

}
