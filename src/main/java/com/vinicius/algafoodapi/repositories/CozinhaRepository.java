package com.vinicius.algafoodapi.repositories;

import java.util.List;

import com.vinicius.algafoodapi.domain.model.Cozinha;

/**
 * Repositorio de Cozinhas, onde irmeos armazenar nossas cozinhas.
 * @author Vinicius-PC - Vinicius Pascucci.
 */
public interface CozinhaRepository {

	List<Cozinha> listar();
	Cozinha findById( Long id );
	Cozinha save( Cozinha cozinhga );
	void delete( Cozinha cozinha );
}
