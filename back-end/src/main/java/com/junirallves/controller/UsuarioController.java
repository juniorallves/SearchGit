package com.junirallves.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junirallves.model.Usuario;
import com.junirallves.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@PostMapping
	public ResponseEntity<Usuario> save(@RequestBody @Valid Usuario usuario){
		Usuario usuari = usuarioService.save(usuario);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping({"", "/"})
	public ResponseEntity<List<Usuario>> findAll(){
		return ResponseEntity.ok(usuarioService.findAll());
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Usuario> update(@RequestBody Usuario usuario, @PathVariable Integer id) {
		Optional<Usuario> usuarioOptional = usuarioService.findById(id);
		if (!usuarioOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
		
		
		Usuario usuarioOriginal = usuarioOptional.get();
		usuarioOriginal.setNome((usuario.getNome() != null) ? usuario.getNome() : usuarioOriginal.getNome());
		usuarioOriginal.setEmpresa((usuario.getEmpresa() != null) ? usuario.getEmpresa() : usuarioOriginal.getEmpresa());
		usuarioOriginal.setLocalizacao((usuario.getLocalizacao() != null) ? usuario.getLocalizacao() : usuarioOriginal.getLocalizacao());
		usuarioService.save(usuarioOriginal);
        return ResponseEntity.noContent().build();
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Usuario> delete(@PathVariable("id")Usuario usuario) {
		usuarioService.delete(usuario);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
