package br.com.cielo.v1.model.ws;

import java.math.BigDecimal;

/**
 * @author Bruno
 * 
 * Classe modelo para representar TotalControleLancamento.
 */
public class TotalControleLancamento {
	
	private Long quantidadeLancamentos;
	
	private Long quantidadeRemessas;
	
	private BigDecimal valorLancamentos;

	public Long getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}

	public void setQuantidadeLancamentos(Long quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}

	public Long getQuantidadeRemessas() {
		return quantidadeRemessas;
	}

	public void setQuantidadeRemessas(Long quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}

	public BigDecimal getValorLancamentos() {
		return valorLancamentos;
	}

	public void setValorLancamentos(BigDecimal valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}

	@Override
	public String toString() {
		
		return "TotalControleLancamento ["
				+ "quantidadeLancamentos=" + quantidadeLancamentos 
				+ ", quantidadeRemessas=" + quantidadeRemessas 
				+ ", valorLancamentos=" + valorLancamentos + "]";
	}
	
}
