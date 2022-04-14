package it.uniroma3.siw.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Società {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String ragioneSociale;
	private String numeroDiTelefono;
	
	/*
	 * quando  carico la società voglio anche l'indizzo.
	 * rimuovo dal database l'indirizzo quando tolgo la società.
	 */
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}) 
	private Indirizzo indirizzo;
	
	public Società() {
		
	}

}
