package loja.orcamento;

import java.util.Map;

import loja.DomainException;
import loja.http.HttpAdapter;

public class RegistroDeOrcamento {
	
	private HttpAdapter http;

	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento não finalizado");
		}
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados= Map.of(
		            "Valor", orcamento.getValor(),
		            "quantidadeItens", orcamento.getQuantidadeItens()
		            );
		http.post(url, dados);
	}
}
