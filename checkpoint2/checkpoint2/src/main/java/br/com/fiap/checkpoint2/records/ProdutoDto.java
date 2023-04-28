package br.com.fiap.checkpoint2.records;

import java.sql.Date;

import br.com.fiap.checkpoint2.models.Produto;

public record ProdutoDto(int codigo_produto, String nome, double preco, Date data_validade, Date data_garantia, boolean em_estoque) {
	
	public static ProdutoDto toDto(Produto prd) {
		return new ProdutoDto(prd.getId(),prd.getNome(),prd.getPreco(),prd.getDataVal(),prd.getDataGarant(),prd.isEmEstoque());
	}
	
}
