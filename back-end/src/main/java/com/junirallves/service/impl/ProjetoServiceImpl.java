package com.junirallves.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junirallves.model.Projeto;
import com.junirallves.repository.ProjetoRepository;
import com.junirallves.service.ProjetoService;

@Service
public class ProjetoServiceImpl implements ProjetoService{
	
	@Autowired
	private ProjetoRepository projetoRepository;

	@Override
	public Projeto save(Projeto projeto) {
		return projetoRepository.save(projeto);
	}

	@Override
	public List<Projeto> findAll() {
		return projetoRepository.findAll();
	}

}
