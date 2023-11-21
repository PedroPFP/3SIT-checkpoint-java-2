package br.com.fiap.checkpoint2.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.models.Cliente;
import br.com.fiap.checkpoint2.models.View;
import br.com.fiap.checkpoint2.repositories.ClienteRepository;

@Service
public class ClienteService extends GenericService<Cliente>{
	public ClienteService(ClienteRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}
	
}
