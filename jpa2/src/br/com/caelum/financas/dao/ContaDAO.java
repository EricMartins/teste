package br.com.caelum.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;

public class ContaDAO {

	private DAO<Conta> dao;

	public ContaDAO(EntityManager em) {
		dao = new DAO<Conta>(em, Conta.class);
	}

	public Conta busca(Integer id) {
		return dao.busca(id);
	}

	public List<Conta> lista() {
		return dao.lista();
	}

	public void adiciona(Conta conta) {
		dao.adiciona(conta);
	}

	public void remove(Conta conta) {
		dao.remove(conta);
	}
}
