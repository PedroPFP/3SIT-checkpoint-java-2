package br.com.fiap.checkpoint2.builders;

import br.com.fiap.checkpoint2.models.ItemPedido;
import br.com.fiap.checkpoint2.models.Pedido;
import br.com.fiap.checkpoint2.models.Produto;
import br.com.fiap.checkpoint2.records.ItemPedidoDto;

public class ItemPedidoBuilder implements IGenericBuilder<ItemPedido, ItemPedidoDto>{

	@Override
	public ItemPedido toEntity(ItemPedidoDto dto) {
		Pedido pedido = new Pedido();
		pedido.setId(dto.pedido().getId());
		Produto produto = new Produto();
		produto.setId(dto.produto().getId());
		ItemPedido item = new ItemPedido(dto.id(),pedido, produto, dto.quantidade(), dto.valorUnitario(), dto.valorTotal());
		return item;
	}

	@Override
	public ItemPedidoDto toDto(ItemPedido entity) {
		ItemPedidoDto item = new ItemPedidoDto(entity.getId(), entity.getPedido(), entity.getProduto(), entity.getQuantidade(), entity.getValorUnitario(), entity.getValorTotal());
		return item;
	}

}
