package loja;

import java.math.BigDecimal;

import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.ICMS;
import loja.imposto.ISS;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;

public class TesteImposto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
	}
}
