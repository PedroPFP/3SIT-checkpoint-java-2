package br.com.fiap.checkpoint2.models;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(optional = false)	
	private Cliente cliente;

	@Column(nullable = false)
	private Instant dataPedido;

	@Column(nullable = false)
	private Instant dataEntrega;

	private BigDecimal valorTotal;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 10)
	private SituacaoPedidoEnum situacao;
	
}
