package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Número de produtos: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Produto #" + i + " dados:");
			System.out.print("Comum, usado ou importado (c/u/i)");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			if(ch == 'c') {
				list.add(new Product(nome, preco));				
			}
			else if (ch == 'u') {
				System.out.print("Data de fabricação (DD/MM/AAAA): ");
				Date data = sdf.parse(sc.next());
				list.add(new UsedProduct(nome, preco, data));
			}
			else {
				System.out.print("Taxa da alfândega: ");
				double taxa = sc.nextDouble();
				list.add(new ImportedProduct(nome, preco, taxa));
			}
		}
		System.out.println();
		System.out.println("Tabela de preços: ");
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}		
		sc.close();
	}
}