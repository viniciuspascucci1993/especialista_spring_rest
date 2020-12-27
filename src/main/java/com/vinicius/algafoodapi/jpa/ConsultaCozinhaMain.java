package com.vinicius.algafoodapi.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.vinicius.algafoodapi.AlgafoodApiApplication;
import com.vinicius.algafoodapi.domain.model.Cozinha;
import com.vinicius.algafoodapi.repositories.CozinhaRepository;

public class ConsultaCozinhaMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		List<Cozinha> listCozinhas = cozinhaRepository.listar();
		
		for (Cozinha cozinha : listCozinhas) {
			
			System.out.println(cozinha.getNome());
		}
	}
	

}
