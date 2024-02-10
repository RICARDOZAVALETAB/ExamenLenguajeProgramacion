package daos;

import java.util.List;

import model.subject;

public interface subjectDao {
	// defino los metodos
	
	public void create(subject subject);
	
	public void update(subject subject);
	
	public void delete(Integer id);
	
	public subject find(Integer id);
	
	public List<subject> findAll();

	
	
	
	

}
