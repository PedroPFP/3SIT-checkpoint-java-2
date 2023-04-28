package br.com.fiap.checkpoint2.records;

import java.sql.Date;

public record PedidoDto(int numero_pedido, int codigo_cliente, Date data_pedido) {

}
