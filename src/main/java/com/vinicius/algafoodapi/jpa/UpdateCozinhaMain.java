package com.vinicius.algafoodapi.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.vinicius.algafoodapi.AlgafoodApiApplication;
import com.vinicius.algafoodapi.domain.model.Cozinha;
import com.vinicius.algafoodapi.repositories.CozinhaRepository;

public class UpdateCozinhaMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(2L);
		cozinha.setNome("Cozinha Brasileira");
		
		cozinhaRepository.save(cozinha);
		
		System.out.printf("%d - %s\n", cozinha.getId(), cozinha.getNome() );
	}
	

}
