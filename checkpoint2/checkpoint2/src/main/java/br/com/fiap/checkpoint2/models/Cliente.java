package br.com.fiap.checkpoint2.models;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, length = 100)
	private String nome;

	@Column(length = 9)
	private String cep;

	@Column(length = 100)
	private String logradouro;

	@Column(length = 10)
	private String numero;

	@Column(length = 20)
	private String complemento;

	@Column(length = 60)
	private String bairro;

	@Column(length = 60)
	private String municipio;

	@Column(length = 2)
	private String uf;

	@Column(nullable = false)
	private Instant dataCadastro;


	@Column(nullable = false)
	private boolean ativo;
	
	public boolean getAtivo() {
		return ativo;
	}
}
