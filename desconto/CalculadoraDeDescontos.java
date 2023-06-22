package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = 
				new DescontoParaMaisDeCincoItens(
						new DescontoPorValor(new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
}
