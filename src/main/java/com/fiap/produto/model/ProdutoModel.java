package com.fiap.produto.model;

import java.math.BigDecimal;

public class ProdutoModel {

	public long id;
	private String nomeProduto;
	private BigDecimal valor;
	private Integer quantidade;
	private Integer status;
	
	public ProdutoModel( ) {}
	
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

}
