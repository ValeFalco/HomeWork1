package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Allievo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	private LocalDate dataDiNascita;
	private String luogoDiNascita;
	
	@Column(nullable = false)
	private int matricola;
	
	private String email;
	
	/*
	 * quando immetto un allievo, si vuole inserire 
	 * anche la sua società di appartenenza
	 */
	@OneToOne(cascade = {CascadeType.PERSIST})
	private Società società;
	
	@ManyToMany
	private List<Corso> corsi;
	
	public Allievo() {
		
	}

}
