package pruebas;

import java.util.List;

import daos.subjectDao;
import daos.subjectDaoImpl;
import model.subject;

public class prueba03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subjectDao dao = new subjectDaoImpl();
		List<subject> rolList = dao.findAll(); 
		
		for(subject r: rolList) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}
	}

}
