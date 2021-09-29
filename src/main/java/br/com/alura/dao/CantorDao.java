package br.com.alura.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.entity.Cantor;

public class CantorDao {
	
	private EntityManager em;
	
	public CantorDao(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Cantor cantor) {
		this.em.persist(cantor);
	}
	
	public void atualizar(Cantor cantor) {
		this.em.merge(cantor);
	}
	
	public void excluir(Cantor cantor) {
		this.em.merge(cantor);
		this.em.remove(cantor);
	}

	public List<Cantor> buscarTodos() {
		String jpql = "SELECT c FROM Cantor c";
		return this.em.createQuery(jpql, Cantor.class).getResultList();
	}
	
	public Cantor buscarPorNome(String nome) {
		String jpql = "SELECT c FROM Cantor c WHERE c.nome = :nome";
		return this.em.createQuery(jpql, Cantor.class).setParameter("nome", nome).getSingleResult(); 
	}
	
	public Cantor buscarPorId(Long id) {
		return this.em.find(Cantor.class, id);
	}
}
