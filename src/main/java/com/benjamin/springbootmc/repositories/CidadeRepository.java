package com.benjamin.springbootmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.benjamin.springbootmc.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	
}
