package br.com.fiap.checkpoint2.records;

import java.sql.Date;
import java.time.Instant;

public record ProdutoDto(Long id,

 String nome,

 Instant dataCadastro) {
	
}
