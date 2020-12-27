package com.vinicius.algafoodapi.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.vinicius.algafoodapi.domain.model.Cozinha;

/**
 * Classe para realizar cadastro de uma nova coznha.
 * @author Vinicius-PC - Vinicius Torres Pascucci.
 */
@Component
public class CadastroCozinha {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Cozinha> listar() {
		
		TypedQuery<Cozinha> createQuery = entityManager.createQuery("from Cozinha", Cozinha.class);
		
		return createQuery.getResultList();
	}
	
	@Transactional
	public Cozinha save( Cozinha cozinha ) {
		
		return entityManager.merge(cozinha);
		
	}
}
