package br.com.fiap.checkpoint2.builders;

import br.com.fiap.checkpoint2.models.Produto;
import br.com.fiap.checkpoint2.records.ProdutoDto;

public class ProdutoBuilder implements IGenericBuilder<Produto, ProdutoDto>{

	@Override
	public Produto toEntity(ProdutoDto dto) {
		Produto prd = new Produto(dto.id(), dto.nome(), dto.dataCadastro());
		return prd;
	}

	@Override
	public ProdutoDto toDto(Produto entity) {
		ProdutoDto prd = new ProdutoDto(entity.getId(), entity.getNome(),entity.getDataCadastro() );
		return prd;
	}

}
