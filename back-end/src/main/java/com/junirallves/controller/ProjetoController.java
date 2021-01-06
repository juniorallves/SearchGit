package com.junirallves.controller;

import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junirallves.model.Projeto;
import com.junirallves.service.ProjetoService;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
	
	@Autowired
	private ProjetoService projetoService;
	
	@PostMapping
	public ResponseEntity<Projeto> save(@RequestBody @Valid Projeto projeto){
		Projeto projet = projetoService.save(projeto);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping({"", "/"})
	public ResponseEntity<List<Projeto>> findAll(){
		return ResponseEntity.ok(projetoService.findAll());
	}
	
}
