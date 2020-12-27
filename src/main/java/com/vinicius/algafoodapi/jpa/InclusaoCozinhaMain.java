package com.vinicius.algafoodapi.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.vinicius.algafoodapi.AlgafoodApiApplication;
import com.vinicius.algafoodapi.domain.model.Cozinha;

public class InclusaoCozinhaMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha= applicationContext.getBean(CadastroCozinha.class);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Cozinha Brasileira");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Cozinha Japonesa");
		
		cozinha1 = cadastroCozinha.save(cozinha1);
		cozinha2 = cadastroCozinha.save(cozinha2);
		
		System.out.printf("%d - %s\n", cozinha1.getId(), cozinha1.getNome() );
		System.out.printf("%d - %s\n", cozinha2.getId(), cozinha2.getNome() );
	}
	

}
