package com.junirallves.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junirallves.model.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer>{

}
