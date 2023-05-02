package br.com.fiap.checkpoint2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "itens_pedidos")
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int sequencia;
	@ManyToOne
	@JoinColumn(name ="numero_pedido")
	private Pedido pedido;
	@ManyToOne
	@JoinColumn(name ="codigo_produto")
	private Produto produto; 
	@Column	
	private int quantidade;
	@Column(name = "valor_total")
	private double valor;
	public ItemPedido(int sequencia, Pedido pedido, Produto produto, int quantidade, double valor) {
		super();
		this.sequencia = sequencia;
		this.pedido = pedido;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public ItemPedido() {
		super();
	}
	
	
}
