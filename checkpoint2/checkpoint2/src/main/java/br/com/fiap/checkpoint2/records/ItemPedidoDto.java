package br.com.fiap.checkpoint2.records;

import java.math.BigDecimal;

import br.com.fiap.checkpoint2.models.Pedido;
import br.com.fiap.checkpoint2.models.Produto;

public record ItemPedidoDto(Long id,
 Pedido pedido,
 Produto produto,
 BigDecimal quantidade,
 BigDecimal valorUnitario,
 BigDecimal valorTotal) {

}
