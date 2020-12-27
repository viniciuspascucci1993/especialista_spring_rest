package com.vinicius.algafoodapi.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
* Classe Restaurante que irá representar uma tabela na base de dados algafood.
* @author Vinicius-PC - Vinicius Torres Pascucci.
*/
@Entity
public class Restaurante implements Serializable {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(nullable = false)
	private String nome;

	@Column( name = "taxa_frete", nullable = false)
	private BigDecimal taxaFrete;
	
	@ManyToOne
	@JoinColumn( name = "cozinha_id", nullable = false)
	private Cozinha cozinha;
	
	/* Construtor default*/
	public Restaurante() { }

	/**
	 * Construtor com argumentos.
	 * @param id - Long - identificador restaurante.
	 * @param nome - String - nome do restaurante.
	 * @param taxaFrete - BigDecimal - taxa do frete.
	 * @param cozinha - Cozinha - cozinha do restaurante.
	 */
	public Restaurante(Long id, String nome, BigDecimal taxaFrete, Cozinha cozinha) {
		super();
		this.id = id;
		this.nome = nome;
		this.taxaFrete = taxaFrete;
		this.cozinha = cozinha;
	}

	/**
	 * Metodo get().
	 * @return id - Long - identificador do restaurante.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Metodo set().
	 * @param id - Long - identificador do restaurante.
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Metodo get().
	 * @return nome - String - nome do restaurante.
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Metodo set().
	 * @param nome - String - nome do restaurante.
	 */
	public void setNome(final String nome) {
		this.nome = nome;
	}

	/**
	 * Metodo get().
	 * @return taxaFrete - BigDecimal - taxa do frete.
	 */
	public BigDecimal getTaxaFrete() {
		return this.taxaFrete;
	}

	/**
	 * Metodo set().
	 * @param taxaFrete - BigDecimal - taxa do frete.
	 */
	public void setTaxaFrete(final BigDecimal taxaFrete) {
		this.taxaFrete = taxaFrete;
	}
	

	/**
	 * Metodo get().
	 * @return cozinha - Cozinha - cozinha.
	 */
	public Cozinha getCozinha() {
		return this.cozinha;
	}

	/**
	 * Metodo set().
	 * @param cozinha - Cozinha - cozinha.
	 */
	public void setCozinha(final Cozinha cozinha) {
		this.cozinha = cozinha;
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
		Restaurante other = (Restaurante) obj;
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
		return "Restaurante "
				+ "[IDENTIFICADOR: " + id + ", \n"
				+ "NOME DO RESTAURANTE: " + nome + ", \n"
				+ "TAXA FRETE: " + taxaFrete + "]";
	}
	
	
	
}
