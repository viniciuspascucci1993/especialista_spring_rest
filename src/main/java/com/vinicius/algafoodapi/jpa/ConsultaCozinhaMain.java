package com.vinicius.algafoodapi.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.vinicius.algafoodapi.AlgafoodApiApplication;
import com.vinicius.algafoodapi.domain.model.Cozinha;

public class ConsultaCozinhaMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha= applicationContext.getBean(CadastroCozinha.class);
		
		List<Cozinha> listCozinhas = cadastroCozinha.listar();
		
		for (Cozinha cozinha : listCozinhas) {
			
			System.out.println(cozinha.getNome());
		}
		
		
	}
}
