package com.davide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.davide.entity.Studente;
import com.davide.repository.StudentiRepository;

public class StudenteServiceImp implements StudenteService{
	@Autowired
	StudentiRepository studentiRepository;

	@Override
	public void saveStudente(Studente s) {
		studentiRepository.save(s);
	}

	@Override
	public List<Studente> getAll() {
		return studentiRepository.findAll();
	}

	@Override
	public Optional<Studente> findById(Integer id) {
		return studentiRepository.findById(id);
	}

	@Override
	public void deleteStudente(Integer id) {
		studentiRepository.deleteById(id);
	}
}
