package loja.pedido;

import java.time.LocalDateTime;

import loja.orcamento.Orcamento;

public class GeraPedidoHandler {
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no banco de dados");
	}
}
