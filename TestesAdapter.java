package loja;

import java.math.BigDecimal;

import loja.http.JavaHttpClient;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;
import loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}

}
