package br.com.fiap.checkpoint2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.builders.ItemPedidoBuilder;
import br.com.fiap.checkpoint2.models.ItemPedido;
import br.com.fiap.checkpoint2.records.ItemPedidoDto;
import br.com.fiap.checkpoint2.services.ItemPedidoService;

@RequestMapping("itens_pedidos")
@RestController
public class ItemPedidoControler extends GenericController<ItemPedido, ItemPedidoService, ItemPedidoDto,ItemPedidoBuilder>{

	public ItemPedidoControler(ItemPedidoService service) {
		super(service, new ItemPedidoBuilder());
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getIdFromEntity(ItemPedido entity) {
		// TODO Auto-generated method stub
		return entity.getSequencia();
	}

}
