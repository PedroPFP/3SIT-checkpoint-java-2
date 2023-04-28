package br.com.fiap.checkpoint2.builders;

public interface IGenericBuilder<E,D> { 
	E toEntity(D dto);
	D toDto(E entity);
}
