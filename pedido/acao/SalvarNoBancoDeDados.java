package loja.pedido.acao;

import loja.pedido.Pedido;

public class SalvarNoBancoDeDados implements AcaoAposPedido{
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados");
	}
}
