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
@Table(name = "CANTOR")
public class Cantor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_cantor")
	private Long id;
	
	@Column(name = "nome_cantor", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "pais", length = 50)
	private String pais;
	
	@OneToMany(mappedBy = "cantor", cascade = { CascadeType.ALL })
	private List<Gravacao> gravacao;

	public Cantor() {
		
	}

	public Cantor(String nome, String pais) {
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
		return "Cantor [id=" + id + ", nome=" + nome + ", pais=" + pais + "]";
	}

}
