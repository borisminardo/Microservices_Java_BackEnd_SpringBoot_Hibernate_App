package com.davide.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davide.entity.Studente;
import com.davide.repository.StudentiRepository;

@RestController
@RequestMapping
public class StudenteRestController {
	
	@Autowired
	private StudentiRepository studentiRepository;
	
	@GetMapping("/corso")
	public List<Studente> getCorsi(){
		return studentiRepository.findAll();
	}
	
	@GetMapping("/corso/{id}")
	public Studente deleteCorsi(@PathVariable int id) {
		return (Studente) studentiRepository.findById(id).get();
	}
	
	@DeleteMapping("/contatto/{id}")
	public boolean deleteContatto(@PathVariable int id) {
		studentiRepository.deleteById(id);
		return true;
	}
	
	@PostMapping("/save")
	public Studente saveCorso(@RequestBody Studente studente) {
		return studentiRepository.save(studente);
	}
	
	@PostMapping("/update")
	public Studente updateCorso(@RequestBody Studente studente) {
		return studentiRepository.save(studente);
	}
}
