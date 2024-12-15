package thalesmenendez;

public class Cliente {

	private String cpfCliente;
	private String nomeCliente;
	private int senhaCliente;
	
	
	public Cliente(String cpfCliente, String nomeCliente, int senhaCliente) {
		super();
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.senhaCliente = senhaCliente;
	}


	public String getCpfCliente() {
		return cpfCliente;
	}


	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}


	public int getSenhaCliente() {
		return senhaCliente;
	}	
}
