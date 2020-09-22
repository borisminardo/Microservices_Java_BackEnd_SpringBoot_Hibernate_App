package com.davide.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.davide.entity.Studente;


public interface StatRepository extends JpaRepository<Studente, String> {
	@Query(value = "select * from studente where nome like ?1 ", nativeQuery = true)
	List<com.davide.entity.Studente> findByNome(String nome);

	@Query(value = "select count(*) from studente", nativeQuery = true)
	Long conteggioStudenti();
	
}