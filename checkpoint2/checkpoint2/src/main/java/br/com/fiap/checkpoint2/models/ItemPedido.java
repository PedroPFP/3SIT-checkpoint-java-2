package br.com.fiap.checkpoint2.models;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "itens_pedidos")
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(optional = false)
	private Pedido pedido;
	
	@ManyToOne(optional = false)
	private Produto produto;
	
	@Column(nullable = false)
	private BigDecimal quantidade;
	
	@Column(nullable = false)
	private BigDecimal valorUnitario;
		
	@Column(nullable = false)
	private BigDecimal valorTotal;
	
	
}
