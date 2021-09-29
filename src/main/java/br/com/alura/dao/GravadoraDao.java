package br.com.alura.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.entity.Gravadora;

public class GravadoraDao {
	
	private EntityManager em;
	
	public GravadoraDao(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Gravadora gravadora) {
		this.em.persist(gravadora);
	}

	public void atualizar(Gravadora gravadora) {
		this.em.merge(gravadora);
	}
	
	public void excluir(Gravadora gravadora) {
		this.em.merge(gravadora);
		this.em.remove(gravadora);
	}
	
	public List<Gravadora> buscarTodos() {
		String jpql = "SELECT g FROM Gravadora g";
		return this.em.createQuery(jpql, Gravadora.class).getResultList();
	}
	
	public Gravadora buscarPorNome(String nome) {
		String jpql = "SELECT g FROM Gravadora g WHERE g.nome = :nome";
		return this.em.createQuery(jpql, Gravadora.class).setParameter("nome", nome).getSingleResult(); 
	}
	
	public Gravadora buscarPorId(Long id) {
		return this.em.find(Gravadora.class, id);
	}
}
