package com.fiap.produto.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.produto.model.ProdutoModel;

import jakarta.validation.Valid;

@Controller
public class ProdutoController extends ValidationHandle {

 	@RequestMapping("/produtos")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("produtos/index");
		var monitor = new ProdutoModel();

		monitor.setId(1);
		monitor.setNomeProduto("Monitor");
		monitor.setQuantidade(3);
		monitor.setValor(new BigDecimal(300));
		monitor.setStatus(1);

		List<ProdutoModel> produtosList = Arrays.asList(monitor);
		modelView.addObject("produtos", produtosList);
		
		return modelView;
	}
 	
 	@GetMapping("/create")
	public ModelAndView create() {
		ModelAndView modelView = new ModelAndView("produtos/create");
		var monitor = new ProdutoModel();

		monitor.setId(1);
		monitor.setNomeProduto("Monitor");
		monitor.setQuantidade(3);
		monitor.setValor(new BigDecimal(300));
		monitor.setStatus(1);

		List<ProdutoModel> produtosList = Arrays.asList(monitor);
		modelView.addObject("produtos", produtosList);
		
		return modelView;
	}
 	
 	@PostMapping("/create")
 	public ResponseEntity<ProdutoModel> createProduto( @Valid @RequestBody ProdutoModel produto ) {
 		
 		return new ResponseEntity<>(produto, HttpStatus.CREATED);
 		
 	}
}
