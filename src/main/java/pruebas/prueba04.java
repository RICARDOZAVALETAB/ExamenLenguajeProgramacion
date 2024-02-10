package pruebas;

import java.util.List;


import daos.subjectDao;
import daos.subjectDaoImpl;
import model.subject;
 
public class prueba04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		subjectDao dao = new subjectDaoImpl();
		
		subject subject = new subject();
		subject.setIdsubject(11);
		subject.setSubject("leonel messi");
		subject.setCredits(23);
		
		List<subject> subjectList = dao.findAll(); 
		
		for(subject r: subjectList) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}

		
	}

}
