package br.com.fiap.checkpoint2.models;

import java.sql.Date;
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
@Table(name = "produtos")
public class Produto {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getDataVal() {
		return dataVal;
	}

	public void setDataVal(Date dataVal) {
		this.dataVal = dataVal;
	}

	public Date getDataGarant() {
		return dataGarant;
	}

	public void setDataGarant(Date dataGarant) {
		this.dataGarant = dataGarant;
	}

	public boolean isEmEstoque() {
		return emEstoque;
	}

	public void setEmEstoque(boolean emEstoque) {
		this.emEstoque = emEstoque;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="codigo_produto")
	private int id;
	@Column
	private String nome;
	@Column
	private double preco;
	@Column(name = "data_validade")
	private Date dataVal; 
	@Column(name = "data_garantia")
	private Date dataGarant;
	@Column(name = "em_estoque")
	private boolean emEstoque;
	@OneToMany(mappedBy = "produto")
	private List<ItemPedido> itensPedidos;
	
	public Produto() {
		
	}
	
	public Produto(int id, String nome, double preco, Date dataVal, Date dataGarant, boolean emEstoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.dataVal = dataVal;
		this.dataGarant = dataGarant;
		this.emEstoque = emEstoque;
	}
	

	
}
