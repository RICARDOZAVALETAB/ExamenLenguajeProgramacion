package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
@NamedQuery(name = "subject.findAll", query = "SELECT r FROM subject r")
public class subject {
	// atributos
	@Id
	@Column(name = "idsubject")
	private int idsubject;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "credits")
	private int credits;

	public subject() {
		
	}

	public int getIdsubject() {
		return idsubject;
	}

	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	//propiedades
	// accedemos a los atributos a traves de sus propiedades
	// get set
	
	// todas las persistencias se registran en persistence 
	// para que este disponible
	
	
	
}
