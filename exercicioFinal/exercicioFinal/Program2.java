package exercicioFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities2.Pessoa;
import entities2.PessoaFisica;
import entities2.PessoaJuridica;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Numero de funcionarios: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Funcionario #" + i + " dados:");
			System.out.print("Pessoa fisica ou juridica (f/j)?");
			char ch = sc.next().charAt(0);
	    	System.out.print("Nome: ");
	    	sc.nextLine();
	    	String nome = sc.nextLine();
	    	System.out.print("Renda anual: ");
	    	double rendaAnual = sc.nextDouble();
	    	if(ch == 'f') {
	    		System.out.print("Gastos com saude: ");
	    		double gastosSaude = sc.nextDouble();
	    		list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));	    		
			}
	    	else {
	    		System.out.print("Número de funcionarios: ");
	    		int numFuncionarios = sc.nextInt();
	    		list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
	    	}
	   }
	    	System.out.println();
	    	System.out.println("Impostos pagos:");
	    	double soma = 0.0;
	    	for (Pessoa p : list) {	    		
	    		System.out.println(p);	
	    		soma += p.imposto();
	    	}
	    	System.out.println();
    		System.out.printf("Total pago: $ %.2f", soma);
		sc.close();
	}
}