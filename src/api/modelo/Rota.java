package api.modelo;
/**
 *@author Matheus Rodrigues
 * 
 */
public class Rota extends Identificador{
	private Long id;
	private String bairroSaida;
	private String instDestino;
	private String placaVan;
	private String periodo;
	private static Rota rotaUniqueInstance = null;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	// designer patterns singleton
	public Rota getInstance() {
		if(rotaUniqueInstance == null)
			rotaUniqueInstance = new Rota();
		return rotaUniqueInstance;
	}
	private Rota() {
		
	}
	public String getBairroSaida() {
		return bairroSaida;
	}
	public void setBairroSaida(String bairroSaida) {
		this.bairroSaida = bairroSaida;
	}
	public String getInstDestino() {
		return instDestino;
	}
	public void setInstDestino(String instDestino) {
		this.instDestino = instDestino;
	}
	public String getPlacaVan() {
		return placaVan;
	}
	public void setPlacaVan(String placaVan) {
		this.placaVan = placaVan;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	
}
