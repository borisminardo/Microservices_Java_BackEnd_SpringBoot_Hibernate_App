package com.davide.service;

import java.util.List;
import java.util.Optional;

import com.davide.entity.Studente;


public interface StudenteService {
	public void saveStudente(Studente s);
	public List<Studente> getAll();
	public Optional<Studente>findById(Integer id);
	public void deleteStudente(Integer id);
}