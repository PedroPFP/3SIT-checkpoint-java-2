package br.com.fiap.checkpoint2.builders;

import br.com.fiap.checkpoint2.models.Cliente;
import br.com.fiap.checkpoint2.models.Pedido;
import br.com.fiap.checkpoint2.records.PedidoDto;

public class PedidoBuilder implements IGenericBuilder<Pedido, PedidoDto>{

	@Override
	public Pedido toEntity(PedidoDto dto) {
		Cliente cliente = new Cliente();
		cliente.setId(dto.id());
		Pedido pedido = new Pedido(dto.id(), cliente, dto.dataPedido(), dto.dataEntrega(), dto.valorTotal(), dto.situacao());
		return pedido;
	}

	@Override
	public PedidoDto toDto(Pedido entity) {
		PedidoDto pedido = new PedidoDto(entity.getId(), entity.getCliente().getId(), entity.getDataPedido(), entity.getDataEntrega(), entity.getValorTotal(), entity.getSituacao());
		return pedido;
	}
	

}
