package br.com.alura.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GRAVACAO")
public class Gravacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_gravacao")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cod_gravadora", nullable = false) 
	private Gravadora gravadora;
	
	@ManyToOne
	@JoinColumn(name = "cod_cantor", nullable = false)
	private Cantor cantor;
	

	
	@ManyToOne
	@JoinColumn(name = "cod_musica", nullable = false)
	private Musica musica;
	
	@Column(name = "data_gravacao", nullable = false)
	private LocalDate dataGravacao;

	public Gravacao() {
		
	}

	public Gravacao(Gravadora gravadora, Cantor cantor,  Musica musica, LocalDate dataGravacao) {
		this.cantor = cantor;
		this.gravadora = gravadora;
		this.musica = musica;
		this.dataGravacao = dataGravacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cantor getCantor() {
		return cantor;
	}

	public void setCantor(Cantor cantor) {
		this.cantor = cantor;
	}

	public Gravadora getGravadora() {
		return gravadora;
	}

	public void setGravadora(Gravadora gravadora) {
		this.gravadora = gravadora;
	}

	public Musica getMusica() {
		return musica;
	}

	public void setMusica(Musica musica) {
		this.musica = musica;
	}

	public LocalDate getDataGravacao() {
		return dataGravacao;
	}

	public void setDataGravacao(LocalDate dataGravacao) {
		this.dataGravacao = dataGravacao;
	}

	@Override
	public String toString() {
		return "Gravacao [id=" + id 
				+ ", cantor=" + cantor.toString() 
				+ ", gravadora=" + gravadora.toString()
				+ ", musica=" + musica.toString()
				+ ", dataGravacao=" + dataGravacao.toString() + "]";
	}
	
	
	
	
}
