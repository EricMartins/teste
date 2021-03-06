package br.com.caelum.financas.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDAO;
import br.com.caelum.financas.dao.MovimentacaoDAO;
import br.com.caelum.financas.infra.JPAUtil;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;

public class TestaSalvaMovimentaComConta {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		MovimentacaoDAO dao = new MovimentacaoDAO(em);
		ContaDAO contaDAO = new ContaDAO(em);
		
		Conta conta = new Conta();
		conta.setBanco("Banco Santander");
		conta.setNumero("99999-9");
		conta.setAgencia("999");
		conta.setTitular("Maria");
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setConta(conta);
		movimentacao.setData(Calendar.getInstance());
		movimentacao.setDescricao("conta de luz - abril/2010");
		movimentacao.setValor(new BigDecimal("100"));
		movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		
		em.getTransaction().begin();
		contaDAO.adiciona(conta);
		dao.adiciona(movimentacao);
		em.getTransaction().commit();
		
		em.close();
	}
}
