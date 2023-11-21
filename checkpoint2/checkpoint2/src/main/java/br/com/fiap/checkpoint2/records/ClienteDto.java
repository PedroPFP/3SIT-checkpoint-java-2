package br.com.fiap.checkpoint2.records;

import java.time.Instant;

public record ClienteDto(Long id,
 String nome,
 String cep,
 String logradouro,
 String numero,
 String complemento,
 String bairro,
 String municipio,
 String uf,
 Instant dataCadastro,
 boolean ativo) {
	
}
