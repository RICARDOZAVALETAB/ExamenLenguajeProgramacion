package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.subject;

public class subjectDaoImpl implements subjectDao{

	
	EntityManagerFactory factory;
	EntityManager em;
	
	public subjectDaoImpl() {
		factory = Persistence.createEntityManagerFactory("ZavaletaBeramendiRicardo_CL1");
		em = factory.createEntityManager();
	}
	
	
	@Override
	public void create(subject subject) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(subject);
		em.getTransaction().commit();
	}

	@Override
	public void update(subject subject) {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.merge(subject);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		subject subject = find(id);
		em.getTransaction().begin();
		em.remove(subject);
		em.getTransaction().commit();
	}

	@Override
	public subject find(Integer id) {
		// TODO Auto-generated method stub
		return em.find(subject.class, id);
	}

	@Override
	public List<subject> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createNamedQuery("subject.findAll");
		List<subject> lista = query.getResultList();
		return lista;
	}
	 
	
  // va a implementar a la interface roldao
  // se añaden los metodos
	
	
	
}
