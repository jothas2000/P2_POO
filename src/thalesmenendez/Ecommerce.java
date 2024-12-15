package thalesmenendez;

import java.util.*;

public class Ecommerce {
	private String nomeEmpresa;
	private String cnpj;
	private String dominio;
	private List<Cliente> cliente;
	private List<Produto> produto;
	
	public Ecommerce(String nomeEmpresa, String cnpj, String dominio) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.dominio = dominio;
		this.cliente = new ArrayList<Cliente>();
		this.produto = new ArrayList<Produto>();
	}
	
	public void cadastrarProduto(int codProd, String nomeProd, double precoUnitProd, int qntdEstoqProd) {
		if(this.produto.isEmpty()) {
			Produto produto = new Produto(codProd, nomeProd,precoUnitProd, qntdEstoqProd);
			this.produto.add(produto);
		} else {
			for(Produto produto : produto) {
				if(produto.getCodProd() == codProd) {
					System.out.println("Produto já existe!");
					return;
				} else if(produto.getCodProd() != codProd){
					Produto produto1 = new Produto(codProd, nomeProd, precoUnitProd, qntdEstoqProd);
					this.produto.add(produto1);
					System.out.println("Produto cadastrado!");
					return;
				}
			}
		}
	}
	
	public void cadastrarCliente(String cpfCliente, String nomeCliente, int senhaCliente) {
		if(this.cliente.isEmpty()) {
			Cliente cliente = new Cliente(cpfCliente, nomeCliente,senhaCliente);
			this.cliente.add(cliente);
		}else {
			for(Cliente cliente : cliente) {
				Cliente cliente1 = new Cliente( cpfCliente, nomeCliente, senhaCliente);
				this.cliente.add(cliente1);
				return;
			}
		}
	}
	
	public void listarProdutos() {
		for(Produto produto : produto) {
			produto.listar();
		}
	}
	
	public void venderProduto(String cpfCliente, int senhaCliente, int codProd, int qntdVendida) {
		for(Cliente cliente : cliente) {
			if(cliente.getCpfCliente() == cpfCliente && cliente.getSenhaCliente() == senhaCliente) {
				for(Produto produto : produto) {
					if(produto.getCodProd() == codProd) {
						if(produto.getQntdEstoqProd() - qntdVendida >= 0) {
							produto.vender(codProd,qntdVendida);
							produto.listar();
							return;
						}
					}	
				}
			} 
		}
			System.out.println("A venda não pôde ser concluida!");
	}
	
	public void reporEstoque(int codProd, int qntdReestocada) {
		for(Produto produto : produto) {
			if(produto.getCodProd() == codProd){
				produto.estocar(codProd,qntdReestocada);
			} else
				return;
		}
	}
}
