package br.com.fiap.checkpoint2.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.records.ProdutoDto;
import br.com.fiap.checkpoint2.services.ProdutoService;

@RequestMapping("produtos")
@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public List<ProdutoDto> teste() {
		return service.getAll().stream().map(ProdutoDto::toDto).collect(Collectors.toList());
	}
	
	@PostMapping
	public void save(@RequestBody ProdutoDto data) {
		service.save(data);
	}
	
	
}
