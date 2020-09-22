package com.davide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.davide.entity.Corso;
import com.davide.entity.Studente;

public interface StudentiRepository extends JpaRepository<Studente, Integer>{
	@Query(value = "select * from corso where nome like ?1 ", nativeQuery = true)
	List<com.davide.entity.Studente> findByNome(String nome);

	@Query(value = "select count(*) from corso", nativeQuery = true)
	Long conteggioStudenti();
}
