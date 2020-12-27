package com.vinicius.algafoodapi.infrastructure;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.vinicius.algafoodapi.domain.model.Cozinha;
import com.vinicius.algafoodapi.repositories.CozinhaRepository;

@Component
public class CozinhaServiceImpl implements CozinhaRepository {


	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Cozinha> listar() {
		
		TypedQuery<Cozinha> createQuery = entityManager.createQuery("from Cozinha", Cozinha.class);
		
		return createQuery.getResultList();
	}
	
	@Transactional
	@Override
	public Cozinha save( Cozinha cozinha ) {
		
		return entityManager.merge(cozinha);
	}
	
	@Override
	public Cozinha findById(Long id) {
		
		return entityManager.find(Cozinha.class, id);
	}
	
	@Transactional
	@Override
	public void delete( Cozinha cozinha ) {
		
		cozinha = findById(cozinha.getId());
		entityManager.remove(cozinha);
	}

	
}
