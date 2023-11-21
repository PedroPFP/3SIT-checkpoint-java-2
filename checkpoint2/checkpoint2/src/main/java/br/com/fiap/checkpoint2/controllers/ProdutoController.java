package br.com.fiap.checkpoint2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.builders.ProdutoBuilder;
import br.com.fiap.checkpoint2.models.Produto;
import br.com.fiap.checkpoint2.records.ProdutoDto;
import br.com.fiap.checkpoint2.services.ProdutoService;

@RequestMapping("produtos")
@RestController
public class ProdutoController extends GenericController<Produto, ProdutoService, ProdutoDto, ProdutoBuilder>{
	
	public ProdutoController(ProdutoService service) {
		super(service, new ProdutoBuilder());
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Long getIdFromEntity(Produto entity) {
		// TODO Auto-generated method stub
		return entity.getId();	
		}

}
