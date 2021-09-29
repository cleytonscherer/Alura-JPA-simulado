package br.com.alura.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.entity.Pessoa;

public class PessoaDao {

	private EntityManager em;
	
	public PessoaDao(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Pessoa pessoa) {
		this.em.persist(pessoa);
	}
	
	public void atualizar(Pessoa pessoa) {
		this.em.merge(pessoa);
	}
	
	public void excluir(Pessoa pessoa) {
		this.em.merge(pessoa);
		this.em.remove(pessoa);
	}
	
	public List<Pessoa> buscarTodos() {
		String jpql = "SELECT p FROM Pessoa p";
		return this.em.createQuery(jpql, Pessoa.class).getResultList();
	}
	
	public Pessoa buscarPorNome(String nome) {
		String jpql = "SELECT p FROM Pessoa p WHERE p.nome = :nome";
		return this.em.createQuery(jpql, Pessoa.class).setParameter("nome", nome).getSingleResult(); 
	}
	
	public Pessoa buscarPorId(Long id) {
		return this.em.find(Pessoa.class, id);
	}
}

