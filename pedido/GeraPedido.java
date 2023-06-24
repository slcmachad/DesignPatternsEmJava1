package loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import loja.orcamento.Orcamento;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeDeItens;
	
	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeDeItens) {
		super();
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeDeItens = quantidadeDeItens;
	}
	
	public void executa() {
		Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeDeItens);
		
		Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no banco de dados");
	}
	
}
