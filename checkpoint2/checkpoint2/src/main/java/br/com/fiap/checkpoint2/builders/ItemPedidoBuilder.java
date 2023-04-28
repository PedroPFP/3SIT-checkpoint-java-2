package br.com.fiap.checkpoint2.builders;

import br.com.fiap.checkpoint2.models.ItemPedido;
import br.com.fiap.checkpoint2.records.ItemPedidoDto;

public class ItemPedidoBuilder implements IGenericBuilder<ItemPedido, ItemPedidoDto>{

	@Override
	public ItemPedido toEntity(ItemPedidoDto dto) {
		ItemPedido item = new ItemPedido(dto.sequencia(),dto.numero_pedido(), dto.codigo_produto(), dto.quantidade(), dto.valor_total());
		return item;
	}

	@Override
	public ItemPedidoDto toDto(ItemPedido entity) {
		ItemPedidoDto item = new ItemPedidoDto(entity.getSequencia(), entity.getIdPedido(), entity.getIdProduto(), entity.getQuantidade(), entity.getValor());
		return item;
	}

}
