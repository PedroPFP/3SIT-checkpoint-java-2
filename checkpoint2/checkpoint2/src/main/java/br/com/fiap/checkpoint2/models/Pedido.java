package br.com.fiap.checkpoint2.models;

import java.sql.Date;

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
@Table(name = "pedidos")
public class Pedido {

	public Pedido() {
		super();
	}
	public Pedido(int id, int idCliente, Date data) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.data = data;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "numero_pedido")
	private int id;
	@Column(name = "codigo_cliente")
	private int idCliente;
	@Column(name = "data_pedido")
	private Date data;
	
}
