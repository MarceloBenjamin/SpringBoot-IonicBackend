package com.benjamin.springbootmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benjamin.springbootmc.domain.Cidade;
import com.benjamin.springbootmc.repositories.CidadeRepository;

@Service
public class CidadeService {

	
	@Autowired
	private CidadeRepository repo;
	
	public List<Cidade> findByEstado(Integer estadoId) {
		return repo.findCidade(estadoId);
	}
}
