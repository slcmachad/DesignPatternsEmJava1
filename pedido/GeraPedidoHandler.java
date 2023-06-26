package loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;
import loja.pedido.acao.AcaoAposPedido;

public class GeraPedidoHandler {
	
	private List<AcaoAposPedido> acao;
	
	public GeraPedidoHandler(List<AcaoAposPedido> acoes) {
		acao = acoes;
	}

	public void execute(GeraPedido gerarPedido) {

		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		
		Pedido pedido = new Pedido(gerarPedido.getCliente(), LocalDateTime.now(), orcamento);
		
		this.acao.forEach(a -> a.executarAcao(pedido));
	}
}
