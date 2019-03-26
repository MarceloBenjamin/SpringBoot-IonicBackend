package com.benjamin.springbootmc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benjamin.springbootmc.domain.Estado;
import com.benjamin.springbootmc.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;
	
	public List<Estado> findAll() {
		return  repo.findAllByOrderByNome();
	}	
}
