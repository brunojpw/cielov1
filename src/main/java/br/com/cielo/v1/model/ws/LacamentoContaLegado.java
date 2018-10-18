package br.com.cielo.v1.model.ws;

import java.util.List;

/**
 * @author Bruno
 *
 * Classe modelo para representar LacamentoContaLegado.
 */
public class LacamentoContaLegado {
	
	private Long indice;
	
	private Long tamanhoPagina;
	
	private Long totalElements;
	
	/**
	 * @see TotalControleLancamento
	 */
	private TotalControleLancamento totalControleLancamento;
	
	/**
	 * @see ControleLancamento
	 */
	private List<ControleLancamento> listaControleLancamento;
	
	public Long getIndice() {
		return indice;
	}

	public void setIndice(Long indice) {
		this.indice = indice;
	}

	public Long getTamanhoPagina() {
		return tamanhoPagina;
	}

	public void setTamanhoPagina(Long tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}

	public Long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}

	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}

	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}
	
	public List<ControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}

	public void setListaControleLancamento(List<ControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}
	
	@Override
	public String toString() {
		
		return "LacamentoContaLegado [indice=" + indice 
				+ ", tamanhoPagina=" + tamanhoPagina 
				+ ", totalElements=" + totalElements 
				+ ", totalControleLancamento=" + totalControleLancamento 
				+ ", listaControleLancamento=" + listaControleLancamento + "]";
	}

}
