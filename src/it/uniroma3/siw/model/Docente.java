package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
	private String luogoDiNascita;
	private String partitaIva;
	
	/*
	 * metto nel database tutti i corsi di un docente
	 * assumiamo che il corso non può avere un cambio cattedra, quindi tolto il docente, si tolgono i corsi
	 */
	@OneToMany(mappedBy = "curatore", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Corso> corsi;
	
	public Docente() {
		
	}

}
