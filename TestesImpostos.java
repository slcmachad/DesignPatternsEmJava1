package loja;

import java.math.BigDecimal;

import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.ISS;
import loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ISS()));
	}
}
