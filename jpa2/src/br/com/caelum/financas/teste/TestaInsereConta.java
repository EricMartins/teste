package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDAO;
import br.com.caelum.financas.infra.JPAUtil;
import br.com.caelum.financas.modelo.Conta;

public class TestaInsereConta {

	public static void main(String[] args) {
		EntityManager entityManager = new JPAUtil().getEntityManager();
		ContaDAO dao = new ContaDAO(entityManager);

		long inicio = System.currentTimeMillis();

		Conta conta = new Conta();
		conta.setTitular("Juliano Alves");
		conta.setBanco("Banco do Brasil");
		conta.setNumero("123456-6");
		conta.setAgencia("0999");

		entityManager.getTransaction().begin();
		dao.adiciona(conta);
		entityManager.getTransaction().commit();

		System.out.println("Conta gravada com sucesso!");

		long fim = System.currentTimeMillis();
		System.out.println("Executado em " + (fim - inicio));
	}
}
