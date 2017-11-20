package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.MovimentacaoDAO;
import br.com.caelum.financas.infra.JPAUtil;
import br.com.caelum.financas.modelo.Movimentacao;

public class TestaBuscaContaDaMovimentacao {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		MovimentacaoDAO dao = new MovimentacaoDAO(em);

		Movimentacao movimentacao = dao.busca(4);
		System.out.println(movimentacao.getConta().getTitular());

		em.close();
	}
}
