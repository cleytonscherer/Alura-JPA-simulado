package br.com.alura.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.entity.Categoria;

public class CategoriaDao {
	
	private EntityManager em;
	
	public CategoriaDao(EntityManager em) {
		this.em = em;
	}

	public void salvar(Categoria categoria) {
		this.em.persist(categoria);
	}

	public void atualizar(Categoria categoria) {
		this.em.merge(categoria);
	}
	
	public void excluir(Categoria categoria) {
		this.em.merge(categoria);
		this.em.remove(categoria);
	}
	
	public List<Categoria >buscarTodos() {
		String jpql = "SELECT c FROM Categoria c";
		return this.em.createQuery(jpql, Categoria.class).getResultList();
	}
	
	public Categoria buscarPorNome(String nome) {
		String jpql = "SELECT c FROM Categoria c WHERE c.nome = :nome";
		return this.em.createQuery(jpql, Categoria.class).setParameter("nome", nome).getSingleResult(); 
	}
	
	public Categoria buscarPorId(Long id) {
		return this.em.find(Categoria.class, id);
	}
}