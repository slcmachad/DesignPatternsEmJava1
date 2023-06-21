package loja;

import java.math.BigDecimal;

import loja.desconto.CalculadoraDeDescontos;
import loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("100"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 2);
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo)); 
	}
}
