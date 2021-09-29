package br.com.alura.simulado;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import br.com.alura.dao.CantorDao;
import br.com.alura.dao.CategoriaDao;
import br.com.alura.dao.FoneDao;
import br.com.alura.dao.GravacaoDao;
import br.com.alura.dao.GravadoraDao;
import br.com.alura.dao.JPAUtil;
import br.com.alura.dao.MusicaDao;
import br.com.alura.dao.PessoaDao;
import br.com.alura.entity.Cantor;
import br.com.alura.entity.Categoria;
import br.com.alura.entity.Fone;
import br.com.alura.entity.Gravacao;
import br.com.alura.entity.Gravadora;
import br.com.alura.entity.Musica;
import br.com.alura.entity.Pessoa;

public class Simulado {

	public static void main(String[] args) {
		
		/*
		PessoaDao 		pessoaDao = new PessoaDao(em);
		FoneDao   		foneDao  = new FoneDao(em);
		*/
		
		/*
		incluirPessoa();        	
    	ListarTodasPessoas();
    	ListarTodosFones();    	
    	validarPessoa();
    	*/
    	        	
    	incluirGravacao();
    	ListarTodosCantores();
    	ListarTodasCategorias();        	        	
    	ListarTodasGravadoras();
    	ListarTodasMusicas();        	
    	ListarTodasGravacoes();    	
    	
	}
	
	public static void incluirGravacao() {

		EntityManager em = JPAUtil.getEntityManager();
		CantorDao 		cantorService = new CantorDao(em);
		GravadoraDao 	gravadoraService = new GravadoraDao(em);
		MusicaDao 		musicaService = new MusicaDao(em);
		GravacaoDao 	gravacaoService = new GravacaoDao(em);
		CategoriaDao 	categoriaService = new CategoriaDao(em);
		
		em.getTransaction().begin();
		
		Cantor marisaMonte = new Cantor("Marisa Monte","Brasil");
		cantorService.salvar(marisaMonte);
		
		Cantor coldplay = new Cantor("Coldplay","Inglaterra");
		cantorService.salvar(coldplay);
		
		Cantor u2 = new Cantor("U2","Irlanda");
		cantorService.salvar(u2);
		
		Cantor djavan= new Cantor("Djavan","Brasil");
		cantorService.salvar(djavan);
		
		Cantor lauraPausini = new Cantor("Laura Pausini","Italia");
		cantorService.salvar(lauraPausini);
		
		Cantor robertoLeal = new Cantor("Roberto Leal","Portugal");
		cantorService.salvar(robertoLeal);
		
		Cantor corrs = new Cantor("The Corrs","Estados Unidos");
		cantorService.salvar(corrs);
		
		Cantor legiaoUrbana = new Cantor("Legiao Urbana","Brasil");
		cantorService.salvar(legiaoUrbana);
		
		Cantor cazuza = new Cantor("Cazuza","Brasil");
		cantorService.salvar(cazuza);
		
		Cantor tomJobim = new Cantor("Tom Jobim","Brasil");
		cantorService.salvar(tomJobim);
		
		Cantor frankSinatra = new Cantor("Frank Sinatra","Estados Unidos");
		cantorService.salvar(frankSinatra);

    	/*
    	 * ListarTodosCantores();
    	 */
		
		Gravadora sony = new Gravadora("Sony","Estados Unidos");
		gravadoraService.salvar(sony);
		
		Gravadora somLivre = new Gravadora("Som livre","Brasil");
		gravadoraService.salvar(somLivre);
		
		Gravadora emi = new Gravadora("EMI","Estados Unidos");
		gravadoraService.salvar(emi);
		
		Gravadora globo = new Gravadora("Globo","Brasil");
		gravadoraService.salvar(globo);
		
		Gravadora trama = new Gravadora("Trama","Brasil");
		gravadoraService.salvar(trama);
		
    	/*
    	 * ListarTodasGravadoras();
    	 */
        
		
		Categoria mpb = new Categoria("MPB");
		//categoriaService.salvar(mpb);
		
		Categoria rock = new Categoria("Rock");
		//categoriaService.salvar(rock);
		
		Categoria vira = new Categoria("Vira");
		//categoriaService.salvar(vira);
		
		Categoria bossaNova = new Categoria("Bossa Nova");
		//categoriaService.salvar(bossaNova);
		
		Categoria jazz = new Categoria("Jazz");
		//categoriaService.salvar(jazz);
		
		Categoria popRock = new Categoria("Pop rock");
		//categoriaService.salvar(popRock);
		
		Categoria eletronic = new Categoria("Eletronic");
		//categoriaService.salvar(eletronic);
		
		Categoria pop = new Categoria("Pop");
		//categoriaService.salvar(pop);
		
		/*
		categoriaService.salvar(mpb);
		categoriaService.salvar(rock);
		categoriaService.salvar(vira);
		categoriaService.salvar(bossaNova);
		categoriaService.salvar(jazz);
		categoriaService.salvar(popRock);
		categoriaService.salvar(eletronic);
		categoriaService.salvar(pop);
		
    	ListarTodasCategorias(categoriaService);  
    	*/      	        	
		

		Musica amorIloveYou = new Musica(mpb,240,"Amor I love you");
		musicaService.salvar(amorIloveYou);		
		
		Musica naoEFacil = new Musica(mpb,300,"Não é facil");
		musicaService.salvar(naoEFacil);
		
		Musica gentileza = new Musica(mpb,250,"Gentileza");
		musicaService.salvar(gentileza);
		
		Musica danielNaCovaDosLeoes = new Musica(rock,500,"Daniel na cova dos leões");
		musicaService.salvar(danielNaCovaDosLeoes);
		
		Musica fabrica = new Musica(rock,322,"Fábrica");
		musicaService.salvar(fabrica);
		
		Musica tempoPerdido = new Musica(rock,440,"Tempo perdido");
		musicaService.salvar(tempoPerdido);
		
		Musica acrilicOnCanvas = new Musica(rock,312,"Acrilic on canvas");
		musicaService.salvar(acrilicOnCanvas);
		
		Musica viraVira = new Musica(vira,298,"Vira-vira");
		musicaService.salvar(viraVira);
		
		Musica chegaDeSaudade = new Musica(bossaNova,348,"Chega de saudade");
		musicaService.salvar(chegaDeSaudade);
		
		Musica luiza = new Musica(bossaNova,231,"Luiza");
		musicaService.salvar(luiza);
		
		Musica aguasDeMarco = new Musica(bossaNova,355,"Aguas de março");
		musicaService.salvar(aguasDeMarco);
		
		Musica wave = new Musica(bossaNova,250,"Wave");
		musicaService.salvar(wave);
		
		Musica politik = new Musica(popRock,333,"Politik");
		musicaService.salvar(politik);
		
		Musica greenEyes = new Musica(popRock,225,"Green eyes");
		musicaService.salvar(greenEyes);
		
		Musica aRushOfBloodToTheHead = new Musica(popRock,440,"A Rush of Blood to the head");
		musicaService.salvar(aRushOfBloodToTheHead);
		
		Musica clocks = new Musica(popRock,320,"Clocks");
		musicaService.salvar(clocks);
		
		Musica codinomeBeijaFlor = new Musica(popRock,300,"Codinome beija-flor");
		musicaService.salvar(codinomeBeijaFlor);
		
		Musica fazParteDoMeuShow = new Musica(popRock,290,"Faz parte do meu show");
		musicaService.salvar(fazParteDoMeuShow);
		
		Musica newYork = new Musica(jazz,446,"New York");
		musicaService.salvar(newYork);
		
		Musica solitudine = new Musica(pop,299,"Solitudine");
		musicaService.salvar(solitudine);
		
		Musica oceano = new Musica(mpb,430,"Oceano");
		musicaService.salvar(oceano);
		
		Musica withOrWithoutYou = new Musica(rock,511,"With or without you");
		musicaService.salvar(withOrWithoutYou);
		
		Musica beautifulDay = new Musica(rock,300,"Beautiful day");
		musicaService.salvar(beautifulDay);
		
		Musica bulletTheBlueSky = new Musica(rock,458,"Bullet The Blue Sky");
		musicaService.salvar(bulletTheBlueSky);
		
		Musica sua = new Musica(mpb,300,"Sua");
		musicaService.salvar(sua);
		
		/*
		 * ListarTodasCategorias();
		 */		
		
		categoriaService.salvar(mpb);
		categoriaService.salvar(rock);
		categoriaService.salvar(vira);
		categoriaService.salvar(bossaNova);
		categoriaService.salvar(jazz);
		categoriaService.salvar(popRock);
		categoriaService.salvar(eletronic);
		categoriaService.salvar(pop);
		
		/*
		 * ListarTodasMusicas();    
		 */
    	
		gravacaoService.salvar(new Gravacao(sony,  marisaMonte,  amorIloveYou,          LocalDate.of(2000,07,10)));
		gravacaoService.salvar(new Gravacao(sony,  marisaMonte,  naoEFacil,             LocalDate.of(2000,12,07)));
		gravacaoService.salvar(new Gravacao(sony,  marisaMonte,  gentileza,             LocalDate.of(2001,05,30)));
		gravacaoService.salvar(new Gravacao(sony,  coldplay,     politik,               LocalDate.of(2004, 9,12)));
		gravacaoService.salvar(new Gravacao(sony,  coldplay,     greenEyes,	            LocalDate.of(2004, 9,20)));
		gravacaoService.salvar(new Gravacao(sony,  coldplay,     aRushOfBloodToTheHead, LocalDate.of(2004, 8,30)));
		gravacaoService.salvar(new Gravacao(sony,  coldplay,     clocks,	            LocalDate.of(2004,10,01)));
		gravacaoService.salvar(new Gravacao(sony,  u2,           withOrWithoutYou,      LocalDate.of(1989,05,05)));
		gravacaoService.salvar(new Gravacao(sony,  u2,           beautifulDay,	        LocalDate.of(1991,10,20)));
		gravacaoService.salvar(new Gravacao(sony,  u2,           bulletTheBlueSky,      LocalDate.of(1992,03,25)));
		gravacaoService.salvar(new Gravacao(sony,  frankSinatra, newYork,               LocalDate.of(1971, 8,29)));
		gravacaoService.salvar(new Gravacao(emi,   lauraPausini, solitudine,            LocalDate.of(1998,10,10)));
		gravacaoService.salvar(new Gravacao(emi,   robertoLeal,  viraVira,              LocalDate.of(1988,07,30)));
		gravacaoService.salvar(new Gravacao(emi,   legiaoUrbana, danielNaCovaDosLeoes,  LocalDate.of(2005,12,29)));
		gravacaoService.salvar(new Gravacao(emi,   legiaoUrbana, fabrica,               LocalDate.of(1993,04,25)));
		gravacaoService.salvar(new Gravacao(emi,   legiaoUrbana, tempoPerdido,          LocalDate.of(1989,01,31)));
		gravacaoService.salvar(new Gravacao(emi,   legiaoUrbana, acrilicOnCanvas,       LocalDate.of(1991,12,01)));
		gravacaoService.salvar(new Gravacao(globo, cazuza,       codinomeBeijaFlor,     LocalDate.of(1986,06,30)));
		gravacaoService.salvar(new Gravacao(globo, tomJobim,     chegaDeSaudade,        LocalDate.of(1978,10,14)));
		gravacaoService.salvar(new Gravacao(globo, tomJobim,     luiza,                 LocalDate.of(1975, 8,11)));
		gravacaoService.salvar(new Gravacao(globo, tomJobim,     aguasDeMarco,          LocalDate.of(1979,05,05)));
		gravacaoService.salvar(new Gravacao(globo, tomJobim,     wave,                  LocalDate.of(1981,04,18)));
		gravacaoService.salvar(new Gravacao(trama, marisaMonte,  sua,                   LocalDate.of(1998,10,20)));
		gravacaoService.salvar(new Gravacao(trama, djavan,       oceano,                LocalDate.of(1995,01,20)));
		gravacaoService.salvar(new Gravacao(trama, cazuza,       fazParteDoMeuShow,     LocalDate.of(1987,07,06)));
		
    	/*
    	 * ListarTodasGravacoes();
    	 */
    	
    	em.getTransaction().commit();
    	em.close();
    	
	}
	
	private static void ListarTodosCantores() {
		
		EntityManager em = JPAUtil.getEntityManager();
		CantorDao cantorService = new CantorDao(em);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Listar todos os Cantores");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (Cantor cantor : cantorService.buscarTodos() ) {
        	System.out.println(cantor.toString());
        }	
	}
	

	private static void ListarTodasCategorias() {
		
		EntityManager em = JPAUtil.getEntityManager();
		CategoriaDao categoriaService = new CategoriaDao(em);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Listar todas as Categorias");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (Categoria categoria : categoriaService.buscarTodos() ) {
        	System.out.println(categoria.toString());
        }	
	}
	
	private static void ListarTodasGravacoes() {
		
		EntityManager em = JPAUtil.getEntityManager();
		GravacaoDao gravacaoService = new GravacaoDao(em);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Listar todas as Gravações");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (Gravacao gravacao : gravacaoService.buscarTodos() ) {
        	System.out.println(gravacao.toString());
        }	
	}
	
	private static void ListarTodasGravadoras() {
		
		EntityManager em = JPAUtil.getEntityManager();
		GravadoraDao gravadoraService = new GravadoraDao(em);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Listar todas as Gravadoras");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (Gravadora gravadora : gravadoraService.buscarTodos() ) {
        	System.out.println(gravadora.toString());
        }	
	}
	
	private static void ListarTodasMusicas() {

		EntityManager em = JPAUtil.getEntityManager();
		MusicaDao musicaService = new MusicaDao(em);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Listar todas as Musicas");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (Musica musica : musicaService.buscarTodos() ) {
        	System.out.println(musica.toString());
        }	
	}
	
	private static void incluirPessoa() {
		
		//PessoaDao pessoaService, FoneDao   foneService
		EntityManager em = JPAUtil.getEntityManager();
		PessoaDao pessoaService = new PessoaDao(em);
		FoneDao   foneService = new FoneDao(em);
				
		em.getTransaction().begin();
		
        for (Pessoa pessoa : pessoaService.buscarTodos() ) {
        	pessoaService.excluir(pessoa);
        }

		Pessoa ana = new Pessoa("Ana");				
		foneService.salvar(new Fone("3333-1111",'R',ana));
		foneService.salvar(new Fone("4444-1111",'C',ana));
		foneService.salvar(new Fone("9999-1111",'L',ana));
		//pessoaService.salvar(ana);
		
		Pessoa beto = new Pessoa("Beto");
		foneService.salvar(new Fone("3333-2222",'R',beto));
		foneService.salvar(new Fone("4444-2222",'C',beto));
		foneService.salvar(new Fone("9999-2222",'L',beto));
		//pessoaService.salvar(beto);
		
		Pessoa carlos = new Pessoa("Carlos");
		foneService.salvar(new Fone("3333-3333",'R',carlos));
		foneService.salvar(new Fone("4444-3333",'C',carlos));
		foneService.salvar(new Fone("9999-3333",'L',carlos));
		//pessoaService.salvar(carlos);
		
		Pessoa daniel = new Pessoa("Daniel");
		foneService.salvar(new Fone("3333-4444",'R',daniel));
		foneService.salvar(new Fone("4444-4444",'C',daniel));
		foneService.salvar(new Fone("9999-4444",'L',daniel));
		//pessoaService.salvar(daniel);
		
		Pessoa eduardo = new Pessoa("Eduardo");
		foneService.salvar(new Fone("3333-5555",'R',eduardo));
		foneService.salvar(new Fone("4444-5555",'C',eduardo));
		foneService.salvar(new Fone("9999-5555",'L',eduardo));
		//pessoaService.salvar(eduardo);
		
		Pessoa flavio = new Pessoa("Flavio");
		foneService.salvar(new Fone("3333-6666",'R',flavio));
		foneService.salvar(new Fone("4444-6666",'C',flavio));
		foneService.salvar(new Fone("9999-6666",'L',flavio));
		//pessoaService.salvar(flavio);
		
		Pessoa giuliana = new Pessoa("Giuliana");
		foneService.salvar(new Fone("3333-7777",'R',giuliana));
		foneService.salvar(new Fone("4444-7777",'C',giuliana));
		foneService.salvar(new Fone("9999-7777",'L',giuliana));
		//pessoaService.salvar(giuliana);
		
		Pessoa helena = new Pessoa("Helena");	
		foneService.salvar(new Fone("3333-8888",'R',helena));
		foneService.salvar(new Fone("4444-8888",'C',helena));
		foneService.salvar(new Fone("9999-8888",'L',helena));
		//pessoaService.salvar(helena);
		
		Pessoa ivan = new Pessoa("Ivan");
		foneService.salvar(new Fone("3333-9999",'R',ivan));
		foneService.salvar(new Fone("4444-9999",'C',ivan));
		foneService.salvar(new Fone("9999-9999",'L',ivan));
		//pessoaService.salvar(ivan);
		
		Pessoa lara = new Pessoa("Lara");
		foneService.salvar(new Fone("3333-1010",'R',lara));
		foneService.salvar(new Fone("4444-1010",'C',lara));
		foneService.salvar(new Fone("9999-1010",'L',lara));
		//pessoaService.salvar(lara);
				
		em.getTransaction().commit();
		em.close();
		
	}

	
	private static void ListarTodasPessoas() {

		EntityManager em = JPAUtil.getEntityManager();
		PessoaDao pessoaService = new PessoaDao(em);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Listar todas as Pessoas");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (Pessoa pessoa : pessoaService.buscarTodos() ) {
        	System.out.println(pessoa.toString());
        }	
	}
	
	private static void ListarTodosFones() {
		
		EntityManager em = JPAUtil.getEntityManager();
		FoneDao foneService = new FoneDao(em);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Listar todos os Fones");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (Fone fone : foneService.buscarTodos() ) {
        	System.out.println(fone.toString());
        }	
	}


	private static void validarPessoa() {
		
		EntityManager em = JPAUtil.getEntityManager();
		PessoaDao pessoaService = new PessoaDao(em);
		
		Long id = 1L;
		String nome = "Ana";
		
		Pessoa pessoa = pessoaService.buscarPorId(1L);
		if (pessoa != null) {
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Listar id Pessoa = " + id);
	        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			System.out.println(pessoa.toString());
		} else {
			System.out.println("Não Encontrado " + id);
		}
		
		Pessoa pessoa1 = pessoaService.buscarPorNome(nome);
		
		if (pessoa1 != null) {
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Listar nome Pessoa = " + nome);
	        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			System.out.println(pessoa1.toString());
		} else {
			System.out.println("Não Encontrado " + nome);
		}
	}
}
