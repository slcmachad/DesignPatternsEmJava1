package loja;

import java.math.BigDecimal;

import loja.desconto.CalculadoraDeDescontos;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;

public class TestesDesconto {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento();
		primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		Orcamento segundo = new Orcamento();
		segundo.adicionarItem(new ItemOrcamento(new BigDecimal("600")));
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo)); 
	}
}
