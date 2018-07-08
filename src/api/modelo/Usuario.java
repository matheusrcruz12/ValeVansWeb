package api.modelo;
/**
 *@author Matheus Rodrigues
 * 
 */
public class Usuario extends Identificador {
	private Long id;
	private String nome;
	private String senha;
	
	private static Usuario usuarioUniqueInstance = null;
	
	private Usuario() {}
	// designer patterns singleton
	public Usuario getInstance() {
		if(usuarioUniqueInstance == null)
			usuarioUniqueInstance = new Usuario();
		return usuarioUniqueInstance;
	}
	

	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
