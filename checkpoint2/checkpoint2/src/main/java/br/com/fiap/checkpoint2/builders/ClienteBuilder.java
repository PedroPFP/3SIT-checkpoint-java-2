package br.com.fiap.checkpoint2.builders;

import br.com.fiap.checkpoint2.models.Cliente;
import br.com.fiap.checkpoint2.records.ClienteDto;

public class ClienteBuilder implements IGenericBuilder<Cliente, ClienteDto>{

	@Override
	public Cliente toEntity(ClienteDto dto) {
		Cliente cliente = new Cliente(dto.codigo_cliente(), dto.nome(), dto.inscricao_federal(), dto.cep());
		return cliente;
	}

	@Override
	public ClienteDto toDto(Cliente entity) {
		ClienteDto dto = new ClienteDto(entity.getId(), entity.getNome(), entity.getInscFederal(), entity.getCep());
		return dto;
	}

}
