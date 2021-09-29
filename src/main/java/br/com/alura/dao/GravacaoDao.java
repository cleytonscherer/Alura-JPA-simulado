package br.com.alura.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.entity.Cantor;
import br.com.alura.entity.Categoria;
import br.com.alura.entity.Gravacao;
import br.com.alura.entity.Gravadora;
import br.com.alura.entity.Musica;

public class GravacaoDao {
	
	private EntityManager em;
	
	public GravacaoDao(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Gravacao gravacao) {
		this.em.persist(gravacao);
	}

	public void atualizar(Gravacao gravacao) {
		this.em.merge(gravacao);
	}
	
	public void excluir(Gravacao gravacao) {
		this.em.merge(gravacao);
		this.em.remove(gravacao);
	}
	
	public List<Gravacao> buscarTodos() {
		String jpql = "SELECT g FROM Gravacao g";
		return this.em.createQuery(jpql, Gravacao.class).getResultList();
	}
	
	public List<Gravacao> buscarPorGravadora(Gravadora gravadora) {
		String jpql = "SELECT g FROM Gravacao g WHERE g.gravadora = :gravadora";
		return this.em.createQuery(jpql, Gravacao.class)
				.setParameter("gravadora", gravadora)
				.getResultList();
	}
	
	public List<Gravacao> buscarPorCantor(Cantor cantor) {
		String jpql = "SELECT g FROM Gravacao g WHERE g.cantor = :cantor";
		return this.em.createQuery(jpql, Gravacao.class)
				.setParameter("cantor", cantor)
				.getResultList();
	}
	
	public List<Gravacao> buscarPorMusica(Musica musica) {
		String jpql = "SELECT g FROM Gravacao g WHERE g.musica = :musica";
		return this.em.createQuery(jpql, Gravacao.class)
				.setParameter("musica", musica)
				.getResultList();
	}
	
	public List<Gravacao> buscarPorCategoria(Categoria categoria) {
		String jpql = "SELECT g FROM Gravacao g WHERE g.musica.categoria = :categoria";
		return this.em.createQuery(jpql, Gravacao.class)
				.setParameter("categoria", categoria)
				.getResultList();
	}
	
	public List<Gravacao> buscarPorGravadoraNome(String nome) {
		String jpql = "SELECT g FROM Gravacao g WHERE g.gravadora.nome = :nome";
		return this.em.createQuery(jpql, Gravacao.class)
				.setParameter("nome", nome)
				.getResultList();
	}
	
	public List<Gravacao> buscarPorCantorNome(String nome) {
		String jpql = "SELECT g FROM Gravacao g WHERE g.cantor.nome = :nome";
		return this.em.createQuery(jpql, Gravacao.class)
				.setParameter("nome", nome)
				.getResultList();
	}
	
	public List<Gravacao> buscarPorMusicaTitulo(String titulo) {
		String jpql = "SELECT g FROM Gravacao g WHERE g.musica.titulo = :titulo";
		return this.em.createQuery(jpql, Gravacao.class)
				.setParameter("titulo", titulo)
				.getResultList();
	}
	
	public List<Gravacao> buscarPorCategoriaNome(String nome) {
		String jpql = "SELECT g FROM Gravacao g WHERE g.musica.categoria.nome = :nome";
		return this.em.createQuery(jpql, Gravacao.class)
				.setParameter("nome", nome)
				.getResultList();
	}
	
	public Gravacao buscarPorId(Long id) {
		return this.em.find(Gravacao.class, id);				
	}
}
	

