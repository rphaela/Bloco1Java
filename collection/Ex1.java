package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Ex1 {

	public static void main(String[] args) {
		
		String prod1 = "Refrigerantes";
		String prod2 = "Cervejas";
		String prod3 = "Sucos";

		Collection<String> estoque = new ArrayList <>();

		estoque.add(prod1);
		estoque.add(prod2);
		estoque.add(prod3);
		
		System.out.println("Produtos:\n"+estoque);
		
		estoque.remove(prod2);
		
		System.out.println("\nProdutos:");
		for (String atualizacao : estoque) {
			System.out.println(atualizacao); }
	}
}