package com.junirallves.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotEmpty
	private String nome;
	@NotEmpty
	private String empresa;
	@NotEmpty
	private String localizacao;
	@ManyToMany
	private List<Projeto> projetos;
	
	
	public Usuario(Integer id, @NotEmpty String nome, @NotEmpty String empresa, @NotEmpty String localizacao,
			List<Projeto> projetos) {
		this.id = id;
		this.nome = nome;
		this.empresa = empresa;
		this.localizacao = localizacao;
		this.projetos = projetos;
	}
	
	public Usuario() {
		
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public List<Projeto> getProjetos() {
		return projetos;
	}
	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", empresa=" + empresa + ", localizacao=" + localizacao
				+ ", projetos=" + projetos + "]";
	}
	
	
	
	
}
