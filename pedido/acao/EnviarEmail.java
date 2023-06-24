package loja.pedido.acao;

import loja.pedido.Pedido;

public class EnviarEmail implements AcaoAposPedido{
	
	public void executarAcao(Pedido pedido) {
		System.out.println("enviando email com dados do pedido");
	}
}
