package br.com.alura.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.entity.Fone;

public class FoneDao {
	
	private EntityManager em;
	
	public FoneDao(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Fone fone) {
		this.em.persist(fone.getPessoa());
		this.em.persist(fone);
	}
	
	public void atualizar(Fone fone) {
		this.em.merge(fone);
	}	
	
	public void excluir(Fone fone) {
		this.em.merge(fone);
		this.em.remove(fone);
	}
	
	public List<Fone> buscarTodos() {
		String jpql = "SELECT f FROM Fone f";
		return this.em.createQuery(jpql, Fone.class).getResultList();
	}
	
	public Fone buscarPorNumero(String numero) {
		String jpql = "SELECT f FROM Fone f WHERE f.numero = :numero";
		return this.em.createQuery(jpql, Fone.class).setParameter("numero", numero).getSingleResult(); 
	}
	
	public Fone buscarPorId(Long id) {
		return this.em.find(Fone.class, id);
	}

}
