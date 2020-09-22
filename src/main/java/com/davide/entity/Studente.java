package com.davide.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "Studente")
public class Studente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stud_generator")
	@SequenceGenerator(name = "stud_generator", sequenceName = "stud_seq", allocationSize = 1)
	@Column(name = "id_stud")
	private long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "cognome", nullable = false)
	private String cognome;

	@Column(name = "eta", nullable = false)
	private int eta;

	@Column(name = "email", nullable = true)
	private String email;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Studente_Corso", joinColumns = { @JoinColumn(name = "studente_id") }, inverseJoinColumns = {
			@JoinColumn(name = "corso_id") })
	private Set<Corso> corso;

	public Studente(String nome, String cognome, int eta, String email, Set<Corso> corso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.email = email;
		this.corso = corso;
	}

	public Studente() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Corso> getCorso() {
		return corso;
	}

	public void setCorso(Set<Corso> corso) {
		this.corso = corso;
	}
}