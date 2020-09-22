package com.davide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.davide.entity.Corso;
import com.davide.repository.CorsoRepository;

public class CorsoServiceImp implements CorsoService{
	@Autowired
	CorsoRepository corsoRepository;

	@Override
	public void saveCorso(Corso s) {
		corsoRepository.save(s);
	}

	@Override
	public List<Corso> getAll() {
		return corsoRepository.findAll();
	}

	@Override
	public Optional<Corso> findById(Integer id) {
		return corsoRepository.findById(id);
	}

	@Override
	public void deleteCorso(Integer id) {
		corsoRepository.deleteById(id);
		
	}
	
	
}
