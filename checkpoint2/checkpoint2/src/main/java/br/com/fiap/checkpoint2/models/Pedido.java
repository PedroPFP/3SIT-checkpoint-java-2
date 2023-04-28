package br.com.fiap.checkpoint2.models;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pedidos")
public class Pedido {

	public Pedido() {
		super();
	}
	public Pedido(int id, Cliente cliente, Date data) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.data = data;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "numero_pedido")
	private int id;
	@ManyToOne
	@JoinColumn(name = "codigo_cliente", nullable = false)
	private Cliente cliente;
	@OneToMany(mappedBy = "pedido")
	private List<ItemPedido> itensPedidos;
	@Column(name = "data_pedido")
	private Date data;
	
}
