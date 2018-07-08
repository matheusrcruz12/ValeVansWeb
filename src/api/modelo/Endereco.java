package api.modelo;
/**
 *@author Matheus Rodrigues
 * 
 */
public class Endereco {
	
	private String rua;
	private long cep;
	private String bairro;
	private int numero;
	private String cidade;
	private String estado;
	
private static Endereco enderecoUniqueInstance = null;
	
	


	// designer patterns singleton
	public Endereco getInstance() {
		if(enderecoUniqueInstance == null)
			enderecoUniqueInstance = new Endereco();
		return enderecoUniqueInstance;
	}
	private Endereco() {
		
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	

}
