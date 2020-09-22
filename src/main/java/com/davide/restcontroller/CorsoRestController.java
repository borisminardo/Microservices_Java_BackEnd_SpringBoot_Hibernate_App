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

import com.davide.entity.Corso;
import com.davide.repository.CorsoRepository;

@RestController
@RequestMapping
public class CorsoRestController {
	
	@Autowired
	private CorsoRepository corsoRepository;
	
	@GetMapping("/corso")
	public List<Corso> getCorsi(){
		return corsoRepository.findAll();
	}
	
	@GetMapping("/corso/{id}")
	public Corso deleteCorsi(@PathVariable int id) {
		return (Corso) corsoRepository.findById(id).get();
	}
	
	@DeleteMapping("/contatto/{id}")
	public boolean deleteContatto(@PathVariable int id) {
		corsoRepository.deleteById(id);
		return true;
	}
	
	@PostMapping("/save")
	public Corso saveCorso(@RequestBody Corso corso) {
		return corsoRepository.save(corso);
	}
	
	@PostMapping("/update")
	public Corso updateCorso(@RequestBody Corso corso) {
		return corsoRepository.save(corso);
	}
}
