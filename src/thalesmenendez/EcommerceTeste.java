package thalesmenendez;

import java.util.*;

public class EcommerceTeste {

	public static void main(String[] args) {

		
		Ecommerce ecommerce = new Ecommerce("Talao","123","www.com.br");
		
		ecommerce.cadastrarCliente("123", "thales", 123);
		ecommerce.cadastrarProduto(1, "Notebok", 12.5, 4);
		ecommerce.listarProdutos();
		ecommerce.venderProduto("123",123,1,4);
		ecommerce.reporEstoque(1,3);
	}

}
