package br.com.fiap.checkpoint2.records;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.Instant;

import br.com.fiap.checkpoint2.models.SituacaoPedidoEnum;

public record PedidoDto(Long id,
Long cliente_id,
Instant dataPedido,
Instant dataEntrega,
BigDecimal valorTotal,
SituacaoPedidoEnum situacao) {

}
