package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.subject;

public class prueba02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("ZavaletaBeramendiRicardo_CL1");
			EntityManager em = factory.createEntityManager();
			
			Query query = em.createQuery("SELECT r FROM subject r");
			
			List<subject> subjectList = (List<subject>) query.getResultList();
			
			for(subject r: subjectList) {
				System.out.println(r.getIdsubject());
				System.out.println(r.getSubject());
				System.out.println(r.getCredits());
			}


	}

}
