package br.com.alura.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.entity.Musica;

public class MusicaDao {

	private EntityManager em;
	
	public MusicaDao(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Musica musica) {
		this.em.persist(musica);
	}
	
	public void atualizar(Musica musica) {
		this.em.merge(musica);
	}
	
	public void excluir(Musica musica) {
		this.em.merge(musica);
		this.em.remove(musica);
	}
	
	public List<Musica> buscarTodos() {
		String jpql = "SELECT m FROM Musica m";
		return this.em.createQuery(jpql, Musica.class).getResultList();
	}
	
	public Musica buscarPorTitulo(String titulo) {
		String jpql = "SELECT m FROM Musica m WHERE m.titulo = :titulo";
		return this.em.createQuery(jpql, Musica.class).setParameter("titulo", titulo).getSingleResult(); 
	}
	
	public Musica buscarPorId(Long id) {
		return this.em.find(Musica.class, id);
	}
}
