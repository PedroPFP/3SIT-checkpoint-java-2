package br.com.fiap.checkpoint2.builders;

import br.com.fiap.checkpoint2.models.Pedido;
import br.com.fiap.checkpoint2.records.PedidoDto;

public class PedidoBuilder implements IGenericBuilder<Pedido, PedidoDto>{

	@Override
	public Pedido toEntity(PedidoDto dto) {
		Pedido pedido = new Pedido(dto.numero_pedido(), dto.codigo_cliente(), dto.data_pedido());
		return pedido;
	}

	@Override
	public PedidoDto toDto(Pedido entity) {
		PedidoDto pedido = new PedidoDto(entity.getId(), entity.getIdCliente(), entity.getData());
		return pedido;
	}
	

}
