package br.com.fiap.checkpoint2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.builders.PedidoBuilder;
import br.com.fiap.checkpoint2.models.Pedido;
import br.com.fiap.checkpoint2.records.PedidoDto;
import br.com.fiap.checkpoint2.services.PedidoService;

@RequestMapping("pedidos")
@RestController
public class PedidoController extends GenericController<Pedido, PedidoService, PedidoDto, PedidoBuilder>{

	public PedidoController(PedidoService service) {
		super(service, new PedidoBuilder());
	}

	@Override
	public int getIdFromEntity(Pedido entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}
	
}
