package com.fiap.produto.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.produto.model.ProdutoModel;

@Controller
public class ProdutoController {

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
	
}
