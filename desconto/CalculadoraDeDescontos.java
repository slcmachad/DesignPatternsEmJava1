package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = 
				new DescontoParaMaisDeCincoItens(
						new DescontoPorValor(new SemDesconto()));
		
		return cadeiaDeDescontos.calcular(orcamento);
	}
}
