package br.com.fiap.checkpoint2.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.fiap.checkpoint2.builders.IGenericBuilder;
import br.com.fiap.checkpoint2.services.IGenericService;

public class GenericController<E,S extends IGenericService<E>,D,B extends IGenericBuilder<E, D>> {

	private S service;
	
	private B builder;
	
	public GenericController(S service, B builder){
		this.builder = builder;
		setService(service);
	}
	
	@Autowired
	private void setService(S service) {
		this.service = service;
	}
	
	
	@GetMapping
	ResponseEntity<List<D>> list(){
		List<D> all = (List<D>) service.findAll().stream().map(e -> builder.toDto(e)).collect(Collectors.toList());
		return ResponseEntity.ok(all);
	}
	
	@PostMapping
	ResponseEntity<E> save(@RequestBody D data) {
		E prd = builder.toEntity(data);		
		E prod = service.save(prd);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(prod);
	}
	
	@PutMapping
	ResponseEntity<E> update(@RequestBody D data){
		return null;
	}
	
	@DeleteMapping
	ResponseEntity<String> delete(@RequestBody D data) {
		E prd = builder.toEntity(data);

		service.delete(prd);
		return ResponseEntity.ok("Deletado com sucesso");
	}
	
}
