package loja;

import java.math.BigDecimal;

import loja.pedido.GeraPedido;
import loja.pedido.GeraPedidoHandler;

public class TestesPedidos {
	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);
		
		GeraPedido  gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler();
		handler.execute(gerador);
	}
}
