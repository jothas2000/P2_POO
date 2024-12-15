package thalesmenendez;

public class Produto {
	
	private int codProd;
	private String nomeProd;
	private double precoUnitProd;
	private int qntdEstoqProd;
	
	public Produto(int codProd, String nomeProd, double precoUnitProd, int qntdEstoqProd) {
		super();
		this.codProd = codProd;
		this.nomeProd = nomeProd;
		this.precoUnitProd = precoUnitProd;
		this.qntdEstoqProd = qntdEstoqProd;
	}

	public void listar() {
		System.out.println("--------------");
		System.out.println("Código do produto: "+this.codProd);
		System.out.println("Nome do produto: "+this.nomeProd);
		System.out.println("Preço unitário do produto: "+this.precoUnitProd);
		System.out.println("Quantidade de estoque do produto: "+this.qntdEstoqProd);
		System.out.println("--------------");
	}
	
	public void vender(int codProd, int qntdRemov) {
		
		this.qntdEstoqProd -= qntdRemov;
		System.out.println("Produto vendido do estoque com sucesso! \nEstoque atual: "+qntdEstoqProd);
	}
	
	public void estocar(int codProd,int qntdReestocada) {
		this.qntdEstoqProd += qntdReestocada;
		System.out.println("Produto adicionado ao estoque com sucesso! \nEstoque atual: "+qntdEstoqProd);
	}
	
	public int getCodProd() {
		return codProd;
	}

	public int getQntdEstoqProd() {
		return qntdEstoqProd;
	}
	
	
}
