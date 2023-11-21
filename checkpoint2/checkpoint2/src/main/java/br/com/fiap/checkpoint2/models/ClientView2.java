package br.com.fiap.checkpoint2.models;

import org.springframework.beans.factory.annotation.Value;

public interface ClientView2 extends View{
	Long getId();

	String getNome();
		
	@Value("#{target.municipio + '/' + target.uf}")
    String getEnderecoCompleto();
}
