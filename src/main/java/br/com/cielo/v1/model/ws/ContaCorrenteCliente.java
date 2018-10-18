package br.com.cielo.v1.model.ws;

/**
 * @author Bruno
 * 
 * Classe modelo para representar ContaCorrenteCliente.
 */
public class ContaCorrenteCliente {
	
	private Long numeroRemessaBanco;
	
	private String nomeSituacaoRemessa;
	
	private String nomeTipoOperacao;
	
	private DadosDomicilioBancario dadosDomicilioBancario;
	
	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	@Override
	public String toString() {
		
		return "LancamentoContaCorrenteCliente [numeroRemessaBanco=" + numeroRemessaBanco 
				+ ", nomeSituacaoRemessa=" + nomeSituacaoRemessa 
				+ ", nomeTipoOperacao=" + nomeTipoOperacao 
				+ ", dadosDomicilioBancario=" + dadosDomicilioBancario + "]";
	}

}
