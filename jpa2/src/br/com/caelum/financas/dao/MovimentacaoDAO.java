package br.com.caelum.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Movimentacao;

public class MovimentacaoDAO {

	private final DAO<Movimentacao> dao;

	public MovimentacaoDAO(EntityManager em) {
		this.dao = new DAO<Movimentacao>(em, Movimentacao.class);
	}

	public Movimentacao busca(Integer id) {
		return dao.busca(id);
	}

	public List<Movimentacao> lista() {
		return dao.lista();
	}

	public void remove(Movimentacao movimentacao) {
		dao.remove(movimentacao);
	}

	public void adiciona(Movimentacao movimentacao) {
		dao.adiciona(movimentacao);
	}
}
