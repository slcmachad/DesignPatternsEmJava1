package loja.pedido.acao;

import loja.pedido.Pedido;

public class LogDePedido implements AcaoAposPedido{
	
	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido foi gerado: " + pedido);		
	}
}
