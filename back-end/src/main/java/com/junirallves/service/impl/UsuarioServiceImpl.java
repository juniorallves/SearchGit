package com.junirallves.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junirallves.model.Usuario;
import com.junirallves.repository.UsuarioRepository;
import com.junirallves.service.UsuarioService;


@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario save(Usuario Usuario){
		return usuarioRepository.save(Usuario);
	}

	@Override
	public List<Usuario> findAll() {
    	return usuarioRepository.findAll();
	}
	

	@Override
	public Usuario update(Usuario Usuario) {
		return usuarioRepository.save(Usuario);
	}
	
	
	@Override
    public Optional<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
    }

	@Override
	public void delete(Usuario Usuario){
		usuarioRepository.delete(Usuario);
	}


}
