package br.com.fiap.checkpoint2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.fiap.checkpoint2.models.Pedido;

public interface PedidoRepository extends IGenericRepository<Pedido>{
	@Query("select o from Pedido o where o.cliente.id = :id")
	List<Pedido> findByCliente(@Param("id") Long id);
}
