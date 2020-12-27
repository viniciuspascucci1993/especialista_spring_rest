package com.vinicius.algafoodapi.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe Cozinha que irá representar uma tabela na base de dados algafood.
 * @author Vinicius-PC - Vinicius Torres Pascucci.
 */
@Entity
public class Cozinha implements Serializable{

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Representa o identificador da cozinha.
	 */
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	/**
	 * Representa o nome da cozinha.
	 */
	@Column(nullable = false)
	private String nome;
	
	/* Construtor default*/
	public Cozinha() { }

	/**
	 * Construtor com argumenyos.
	 * @param id - Long - identificador da cozinha.
	 * @param nome - String - nome da cozinha
	 */
	public Cozinha(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	/**
	 * Metogo get().
	 * @return id - Long - identificador da cozinha.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Metodo set().
	 * @param id - Long - identificador da cozinha.
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Metodo get().
	 * @return nome - String - nome da cozinha.
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Metodo set().
	 * @param nome - String - nome da cozinha.
	 */
	public void setNome(final String nome) {
		this.nome = nome;
	}

	/**
	 * Metodo hasCode comparando apenas por ID.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * Metodo equals comparando se um ID é igual a outro.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cozinha other = (Cozinha) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/**
	 * Metodo toString().
	 */
	@Override
	public String toString() {
		return "Cozinha "
				+ "[IDENTIFICADOR: " + id + ", \n"
				+ "NOME DA COZINHA: " + nome + "]";
	}	
}
