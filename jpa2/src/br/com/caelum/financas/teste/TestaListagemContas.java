package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDAO;
import br.com.caelum.financas.infra.JPAUtil;
import br.com.caelum.financas.modelo.Conta;

public class TestaListagemContas {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		ContaDAO dao = new ContaDAO(em);
		
		List<Conta> lista = dao.lista();
		for (Conta conta : lista) {
			System.out.println(conta.getNumero());
		}
		
		em.close();
	}
}
