package com.junirallves.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Projeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotEmpty
	private String titulo;
	@NotEmpty
	private String descricao;
	private Integer estrelas;
		
	public Projeto(Integer id, @NotEmpty String titulo, @NotEmpty String descricao, Integer estrelas) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.estrelas = estrelas;
	}
	
	public Projeto() {

	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(Integer estrelas) {
		this.estrelas = estrelas;
	}


	@Override
	public String toString() {
		return "Projeto [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", estrelas=" + estrelas + "]";
	}
	
	
	
	
}
