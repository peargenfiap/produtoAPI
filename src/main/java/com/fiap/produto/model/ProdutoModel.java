package com.fiap.produto.model;

import java.math.BigDecimal;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public class ProdutoModel {

	public long id;

	@NotNull(message = "O campo nome é obrigatório.")
	private String nomeProduto;

	@NotBlank(message = "É necessário informar a descrição")
	private String descricao;
	private BigDecimal valor;

	@Positive
	@Min(value = 1, message = "É necessário ter ao menos uma unidade.")
	private Integer quantidade;
	private Integer status;
	
	// AAAA0000 /[a-z/A-Z]{4}[0-9]{4}
	@Pattern(regexp = "[A-Z]{4}[0-9]{4}[A-Z]{1}", message = "Padrão inserido é inválido.")
	private String codigo;
	
	public ProdutoModel() {}

	public ProdutoModel(long id, String nomeProduto, BigDecimal valor, Integer quantidade, Integer status) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.quantidade = quantidade;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
