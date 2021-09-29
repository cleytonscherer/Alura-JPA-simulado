package br.com.alura.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FONE")
public class Fone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_fone")
	private Long id;
	
	@Column(name = "numero", nullable = false, length = 20)
	private String numero;
	
	@Column(name = "tipo")
	private char tipo;
	
	@ManyToOne
	@JoinColumn(name = "cod_pessoa", nullable = false)
	private Pessoa pessoa;

	public Fone() {
		
	}

	public Fone(String numero, char tipo, Pessoa pessoa) {
		this.numero = numero;
		this.tipo = tipo;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Fone [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", pessoa=" + pessoa.toString() + "]";
	}
	
	
	
}
