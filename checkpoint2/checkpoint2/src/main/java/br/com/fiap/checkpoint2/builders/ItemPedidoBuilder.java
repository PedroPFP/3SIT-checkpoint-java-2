package br.com.fiap.checkpoint2.builders;

import br.com.fiap.checkpoint2.models.ItemPedido;
import br.com.fiap.checkpoint2.models.Pedido;
import br.com.fiap.checkpoint2.models.Produto;
import br.com.fiap.checkpoint2.records.ItemPedidoDto;

public class ItemPedidoBuilder implements IGenericBuilder<ItemPedido, ItemPedidoDto>{

	@Override
	public ItemPedido toEntity(ItemPedidoDto dto) {
		Pedido pedido = new Pedido();
		pedido.setId(dto.numero_pedido());
		Produto produto = new Produto();
		produto.setId(dto.codigo_produto());
		ItemPedido item = new ItemPedido(dto.sequencia(),pedido, produto, dto.quantidade(), dto.valor_total());
		return item;
	}

	@Override
	public ItemPedidoDto toDto(ItemPedido entity) {
		ItemPedidoDto item = new ItemPedidoDto(entity.getSequencia(), entity.getPedido().getId(), entity.getProduto().getId(), entity.getQuantidade(), entity.getValor());
		return item;
	}

}
