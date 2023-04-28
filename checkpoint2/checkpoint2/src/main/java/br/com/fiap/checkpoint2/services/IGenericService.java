package br.com.fiap.checkpoint2.services;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T> {
	List<T> findAll();
	Optional<T> findById(int id);
	T save(T entity);
	void delete(int id);
}
