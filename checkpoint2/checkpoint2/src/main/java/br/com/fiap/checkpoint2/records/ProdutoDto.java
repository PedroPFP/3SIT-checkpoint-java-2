package br.com.fiap.checkpoint2.records;

import java.sql.Date;

public record ProdutoDto(int codigo_produto, String nome, double preco, Date data_validade, Date data_garantia, boolean em_estoque) {
	
}
