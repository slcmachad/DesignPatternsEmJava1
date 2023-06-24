package loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import loja.orcamento.Orcamento;
import loja.pedido.acao.AcaoAposPedido;

public class GeraPedidoHandler {
	
	private List<AcaoAposPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {

		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(a -> a.executarAcao(pedido));
	}
}
