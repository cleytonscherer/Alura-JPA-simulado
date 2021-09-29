package br.com.alura.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MUSICA")
public class Musica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_musica")
	private Long id;

	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "cod_categoria")
	private Categoria categoria;
	
	private Integer duracao;
	
	@Column(name = "titulo", nullable = false, length = 50)
	private String titulo;
	
	@OneToMany(mappedBy = "musica", cascade = { CascadeType.ALL  })
	private List<Gravacao> gravacao;
	
	public Musica() {
		
	}

	public Musica(Categoria categoria, Integer duracao, String titulo) {
		this.duracao = duracao;
		this.titulo = titulo;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public List<Gravacao> getGravacao() {
		return gravacao;
	}

	@Override
	public String toString() {
		return "Musica [id=" + id + ", duracao=" + duracao + ", titulo=" + titulo + ", categoria=" + categoria.toString() + "]";
	}
	
	
	
	
}
