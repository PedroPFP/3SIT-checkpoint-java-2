package br.com.fiap.checkpoint2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.checkpoint2.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
