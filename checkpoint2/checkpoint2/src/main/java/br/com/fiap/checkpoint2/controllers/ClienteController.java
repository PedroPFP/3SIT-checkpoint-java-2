package br.com.fiap.checkpoint2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.builders.ClienteBuilder;
import br.com.fiap.checkpoint2.models.Cliente;
import br.com.fiap.checkpoint2.records.ClienteDto;
import br.com.fiap.checkpoint2.services.ClienteService;

@RequestMapping("clientes")
@RestController
public class ClienteController extends GenericController<Cliente, ClienteService, ClienteDto, ClienteBuilder>{
	
	public ClienteController(ClienteService service) {
		super(service, new ClienteBuilder());
		// TODO Auto-generated constructor stub
	}
	
		
}
