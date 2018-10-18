package br.com.cielo.v1.model.vo;

import java.math.BigDecimal;

/**
 * @author Bruno
 * 
 * Classe value object para transportar dados LancamentoContaLegado.
 *
 */
public class LancamentoContaLegadoVO {
	
	private String dataDeLancamento;
	private String descricao;
	private Long numero;
	private String situacao;
	private String dataDeConfirmacao;
	private String dadosBancarios;
	private BigDecimal valorFinal;
	
	public String getDataDeLancamento() {
		return dataDeLancamento;
	}
	
	public void setDataDeLancamento(String dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Long getNumero() {
		return numero;
	}
	
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public String getDataDeConfirmacao() {
		return dataDeConfirmacao;
	}
	
	public void setDataDeConfirmacao(String dataDeConfirmacao) {
		this.dataDeConfirmacao = dataDeConfirmacao;
	}
	
	public String getDadosBancarios() {
		return dadosBancarios;
	}
	
	public void setDadosBancarios(String dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}
	
	public BigDecimal getValorFinal() {
		return valorFinal;
	}
	
	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}

	@Override
	public String toString() {
		
		return "LancamentoContaLegadoVO [dataDeLancamento=" + dataDeLancamento 
				+ ", descricao=" + descricao
				+ ", numero=" + numero 
				+ ", situacao=" + situacao 
				+ ", dataDeConfirmacao=" + dataDeConfirmacao
				+ ", dadosBancarios=" + dadosBancarios 
				+ ", valorFinal=" + valorFinal + "]";
	}
	
}
