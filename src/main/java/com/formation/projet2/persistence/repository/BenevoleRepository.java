package com.formation.projet2.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.formation.projet2.persistence.entity.Benevole;

public interface BenevoleRepository extends JpaRepository<Benevole, Long>{
	//@Override
	//@Query(value= "SELECT * FROM benevole ORDER BY Nom", nativeQuery = true)
	//List<Benevole> findAll();
	
	@Query(value= "SELECT * FROM benevole WHERE Login = ?1 AND Password = ?2", nativeQuery = true)
	Benevole findByLoginPass(String login, String password);
}