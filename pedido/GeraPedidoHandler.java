package loja.pedido;

import java.time.LocalDateTime;

import loja.orcamento.Orcamento;
import loja.pedido.acao.EnviarEmail;
import loja.pedido.acao.SalvarNoBancoDeDados;

public class GeraPedidoHandler {
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		EnviarEmail email = new EnviarEmail();
		SalvarNoBancoDeDados salvar = new SalvarNoBancoDeDados();
		
		email.executar(pedido);
		salvar.executar(pedido);
	}
}
