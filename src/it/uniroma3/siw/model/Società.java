package it.uniroma3.siw.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Societ� {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String ragioneSociale;
	private String numeroDiTelefono;
	
	/*
	 * quando  carico la societ� voglio anche l'indizzo.
	 * rimuovo dal database l'indirizzo quando tolgo la societ�.
	 */
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}) 
	private Indirizzo indirizzo;
	
	public Societ�() {
		
	}

}
