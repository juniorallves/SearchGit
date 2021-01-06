package com.junirallves.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.junirallves.model.Projeto;

@Service
public interface ProjetoService {

	Projeto save(Projeto projeto);
	
	List<Projeto> findAll();

}
