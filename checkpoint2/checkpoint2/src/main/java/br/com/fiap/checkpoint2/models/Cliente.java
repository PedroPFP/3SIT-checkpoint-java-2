package br.com.fiap.checkpoint2.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codigo_cliente")
	private int id; 
	@Column
	private String nome;
	@Column(name = "inscricao_federal")
	private String inscFederal;
	@Column
	private String cep;
	public Cliente(int id, String nome, String inscFederal, String cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.inscFederal = inscFederal;
		this.cep = cep;
	}
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;
	public Cliente() {
		super();
	}
}
