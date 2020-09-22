package com.davide.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;


@Entity
@Table(name="corso")
public class Corso {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="corsi_generator")
	@SequenceGenerator(name="corsi_generator", sequenceName = "corsi_seq", allocationSize = 1)
	@Column(name="id_corso")
	private long id;
	
	@Column(name="nome_corso")
	private String nome_corso;
	
	@Column(name="capienza")
	private long capienza;
	
	@ManyToMany(mappedBy = "corso", cascade = CascadeType.ALL )
	private Set<Studente>studente;

	public Corso() {}
	
	public Corso(String nome_corso, long capienza, Set<Studente> studente) {
		super();
		this.nome_corso = nome_corso;
		this.capienza = capienza;
		this.studente = studente;
		
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_corso() {
		return nome_corso;
	}

	public void setNome_corso(String nome_corso) {
		this.nome_corso = nome_corso;
	}

	public long getCapienza() {
		return capienza;
	}

	public void setCapienza(long capienza) {
		this.capienza = capienza;
	}

	public Set<Studente> getStudente() {
		return studente;
	}

	public void setStudente(Set<Studente> studente) {
		this.studente = studente;
	}
}
