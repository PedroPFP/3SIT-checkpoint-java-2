package br.com.fiap.checkpoint2.services;

import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.models.Produto;
import br.com.fiap.checkpoint2.repositories.ProdutoRepository;

@Service
public class ProdutoService extends GenericService<Produto>{
	
	public ProdutoService(ProdutoRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	
}
