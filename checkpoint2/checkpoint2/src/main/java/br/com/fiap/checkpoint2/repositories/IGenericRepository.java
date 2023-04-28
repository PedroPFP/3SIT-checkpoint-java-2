package br.com.fiap.checkpoint2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IGenericRepository<T> extends JpaRepository<T, Integer>{

}
