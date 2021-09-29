package br.com.alura.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GRAVADORA")
public class Gravadora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_gravadora")
	private Long id;
	
	@Column(name = "nome_gravadora", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "pais", length = 50)
	private String pais;
	
	@OneToMany(mappedBy = "gravadora", cascade = { CascadeType.ALL })
	private List<Gravacao> gravacao;

	public Gravadora() {
		
	}

	public Gravadora(String nome, String pais) {
		this.nome = nome;
		this.pais = pais;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<Gravacao> getGravacao() {
		return gravacao;
	}

	@Override
	public String toString() {
		return "Gravadora [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
	
}
