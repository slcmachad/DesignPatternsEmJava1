package loja;

import java.math.BigDecimal;
import java.util.Arrays;

import loja.pedido.GeraPedido;
import loja.pedido.GeraPedidoHandler;
import loja.pedido.acao.EnviarEmail;
import loja.pedido.acao.SalvarNoBancoDeDados;

public class TestesPedidos {
	public static void main(String[] args) {
		String cliente = "jão";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido  gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(
						new SalvarNoBancoDeDados(), 
						new EnviarEmail()						
						)
				);
		handler.execute(gerador);
	}
}
