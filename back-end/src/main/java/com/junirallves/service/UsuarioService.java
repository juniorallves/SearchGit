package com.junirallves.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.junirallves.model.Usuario;

@Service
public interface UsuarioService {
	
	Usuario save(Usuario usuario);

	List<Usuario> findAll();

	Usuario update(Usuario usuario);

	Optional<Usuario> findById(Integer id);

	void delete(Usuario usuario);
	
}
