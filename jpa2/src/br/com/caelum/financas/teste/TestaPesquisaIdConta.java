package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDAO;
import br.com.caelum.financas.infra.JPAUtil;
import br.com.caelum.financas.modelo.Conta;

public class TestaPesquisaIdConta {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		ContaDAO dao = new ContaDAO(em);
		
		Conta encontrado = dao.busca(2);
		System.out.println(encontrado.getTitular());
		
		em.close();
	}
}
