package ExerciPOOHeranca;

import java.util.Scanner;

//1- Crie a classe
public class testeEmpregado {

//2-Crie o main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Bônus Interação:
		String nome;
		String endereco;
		String telefone;
		int codigoSetor;
		double salarioBase;
		double imposto=0; 

//3 - Instancie seus objetos
		Scanner ler = new Scanner (System.in);	

//Bônus Interação:
		System.out.print("*** CADASTRO DE COLABORADOR(A) ***\n");
		System.out.print("Nome do(a) Colaborador(a): ");
		nome = ler.next();
		System.out.print("Endereço: ");
		endereco = ler.next();
		System.out.print("Telefone: ");
		telefone = ler.next();
		System.out.print("Código Setor: ");
		codigoSetor = ler.nextInt();
		System.out.print("Salario Base: R$ ");
		salarioBase = ler.nextDouble();
		
//3- Finalizando o instanciamento de objetos
		//Aqui você esqueceu de colocar todas os atributos da classe mãe, se você vai fazer interação com o usuário,
		//Lembre-se então, de fazer todas as variáveis de acordo com o que você precisa preecher da classe mãe
		//nesse caso, o nome, endereço e telefone, você tinha esquecido de colocar... quando colocou, deu certo.
		Empregado emp1 = new Empregado (nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		
		emp1.setNome(nome);
		emp1.setEndereco(endereco);
		emp1.setTelefone(telefone);
		emp1.setCodigoSetor(codigoSetor);
		emp1.setSalarioBase(salarioBase);
		emp1.setImposto(imposto);

//4- Faça as impressões e chame os métodos criados na classe Empregado
		
		System.out.println("\n***** RESULTADO *****\nFuncionário: "+emp1.getNome()+"\nContratado para o setor: "+emp1.getCodigoSetor());
		emp1.obterSalarioLiquido();	
	
	
	}

}
