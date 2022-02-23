package br.com.alura.leilao.util.builder;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;

public class LeilaoBuilder {
	
	private String nome;
	private BigDecimal valorinicial;
	private Usuario usuario;
	private LocalDate data;
	
	
	public LeilaoBuilder comNome(String nome) {
		this.nome = nome;
		return this;
		
	}

	
	public LeilaoBuilder comValorInicial(String valor) {
		this.valorinicial = new BigDecimal(valor);
		return this;
		
	}
	
	
	public LeilaoBuilder comUsuario(Usuario usuario) {
		this.usuario = usuario;
		return this;
		
	}
	
	

	public LeilaoBuilder comData(LocalDate data) {
		this.data = data;
		return this;
		
	}
	
	
	
	public Leilao criar() {
		
		return  new Leilao(nome,valorinicial,data,usuario);
		
		
	}
}
