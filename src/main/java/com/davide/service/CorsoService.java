package com.davide.service;

import java.util.List;
import java.util.Optional;

import com.davide.entity.Corso;


public interface CorsoService {
	public void saveCorso(Corso s);
	public List<Corso> getAll();
	public Optional<Corso>findById(Integer id);
	public void deleteCorso(Integer id);
}