package br.com.fiap.checkpoint2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fiap.checkpoint2.repositories.IGenericRepository;

public class GenericService<T> implements IGenericService<T>{
	
	
	private IGenericRepository<T> repository;
	
	@Autowired
	public GenericService(IGenericRepository<T> repository){
		this.repository=repository;
	}
	
	public List<T> findAll(){
		return repository.findAll();
	}
	
	public T save(T entity) {
		return repository.save(entity);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}		

	@Override
	public Optional<T> findById(long id) {		
		return repository.findById(id);
	}

	
	
	
}
