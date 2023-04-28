package br.com.fiap.checkpoint2.services;

import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.models.ItemPedido;
import br.com.fiap.checkpoint2.repositories.ItemPedidoRepositoy;

@Service
public class ItemPedidoService extends GenericService<ItemPedido>{

	public ItemPedidoService(ItemPedidoRepositoy repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}
