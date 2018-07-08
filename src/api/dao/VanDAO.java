package api.dao;

import java.util.List;
import api.modelo.Van;

public interface VanDAO {
	public Van insert(Van rota);
    
    public Van findById(Long id);

    public Van findByName(String name);
    
    public List<Van> findAll();
    
    public Van update(Van vanAnterior, Van vanAtual);
    
    public boolean delete(Van rota);
    
    public boolean delete(Long id);  
}
