package br.com.fiap.checkpoint2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@Column(name = "numero_pedido")
	private int idPedido;
	@Column(name = "codigo_produto")
	private int idProduto; 
	@Column	
	private int quantidade;
	@Column(name = "valor_total")
	private double valor;
	public ItemPedido(int sequencia, int idPedido, int idProduto, int quantidade, double valor) {
		super();
		this.sequencia = sequencia;
		this.idPedido = idPedido;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public ItemPedido() {
		super();
	}
	
	
}
