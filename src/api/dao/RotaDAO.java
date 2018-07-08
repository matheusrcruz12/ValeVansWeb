package api.dao;

import java.util.List;

import api.modelo.Rota;
import api.modelo.Usuario;

public interface RotaDAO {
	
	public Rota insert(Rota rota);
    
    public Rota findById(Long id);

    public Usuario findByName(String name);
    
    public List<Rota> findAll();
    
    public Rota update(Rota rotaAnterior, Rota rotaAtual);
    
    public boolean delete(Rota rota);
    
    public boolean delete(Long id);   
}
