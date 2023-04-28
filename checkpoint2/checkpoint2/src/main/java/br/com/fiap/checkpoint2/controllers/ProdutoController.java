package br.com.fiap.checkpoint2.controllers;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.fiap.checkpoint2.models.Produto;
import br.com.fiap.checkpoint2.records.ProdutoDto;
import br.com.fiap.checkpoint2.services.ProdutoService;

@RequestMapping("produtos")
@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@GetMapping
	ResponseEntity<List<ProdutoDto>> list(){
		return ResponseEntity.ok(service.getAll().stream().map(ProdutoDto::toDto).collect(Collectors.toList()));
	}
	
	@PostMapping
	ResponseEntity<Produto> save(@RequestBody ProdutoDto data) {
		Produto prod = service.save(data);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(prod);
	}
	
	
}
