package br.com.fiap.checkpoint2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.models.Produto;
import br.com.fiap.checkpoint2.records.ProdutoDto;
import br.com.fiap.checkpoint2.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> getAll(){
		return repository.findAll();
	}
	
	public void save(ProdutoDto data) {
		Produto prd = new Produto(data.codigo_produto(),data.nome(), data.preco(), data.data_validade(), data.data_garantia(), data.em_estoque());
		repository.save(prd);
	}
}
