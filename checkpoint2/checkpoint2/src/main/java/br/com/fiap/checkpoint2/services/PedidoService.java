package br.com.fiap.checkpoint2.services;

import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.models.Pedido;
import br.com.fiap.checkpoint2.repositories.PedidoRepository;

@Service
public class PedidoService extends GenericService<Pedido>{

	public PedidoService(PedidoRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}
