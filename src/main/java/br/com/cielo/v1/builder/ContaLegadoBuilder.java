package br.com.cielo.v1.builder;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import br.com.cielo.v1.model.vo.LancamentoContaLegadoVO;
import br.com.cielo.v1.model.ws.ControleLancamento;
import br.com.cielo.v1.model.ws.LacamentoContaLegado;

/**
 * @author Bruno
 * 
 * Builder - Cria objeto LancamentoContaLegadoVO.
 */
@Component
public class ContaLegadoBuilder {
	
	public static class Builder {
		
		/**
		 * @see LoggerFactory
		 */
		Logger logger = LoggerFactory.getLogger(Builder.class);
		
		/**
		 * @see LancamentoContaLegadoVO
		 */
		private List<LancamentoContaLegadoVO> listaLancamentoContaLegadoVO = new ArrayList<>();

		public Builder(final LacamentoContaLegado lacamentoContaLegado) {
			
			lacamentoContaLegado.getListaControleLancamento().forEach(c -> {
				
				LancamentoContaLegadoVO lancamentoContaLegadoVO = new LancamentoContaLegadoVO();
				
	            lancamentoContaLegadoVO.setDadosBancarios(getDadosBancarios(c));
	            lancamentoContaLegadoVO.setDataDeConfirmacao(c.getDataEfetivaLancamento());
	            lancamentoContaLegadoVO.setDataDeLancamento(c.getDataLancamentoContaCorrenteCliente());
	            lancamentoContaLegadoVO.setDescricao(c.getDescricaoGrupoPagamento());
	            lancamentoContaLegadoVO.setNumero(c.getNumeroEvento());
	            lancamentoContaLegadoVO.setSituacao(getSituacao(c));
	            lancamentoContaLegadoVO.setValorFinal(c.getValorLancamentoRemessa());
	            
	            logger.info("LancamentoContaLegadoVO " + lancamentoContaLegadoVO.toString());
	            
	            listaLancamentoContaLegadoVO.add(lancamentoContaLegadoVO);
			});
        }
		
		private String getSituacao(final ControleLancamento controleLancamento) {
			
			String situacao = null;
			
			if (controleLancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa() != null) {
			
				situacao = controleLancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa();
			}
			
			logger.info("getSituacao " + situacao);
			
			return situacao;
		}

		private String getDadosBancarios(final ControleLancamento controleLancamento) {
			
			StringBuilder dadosBancarios = new StringBuilder();
			
			dadosBancarios.append("BANCO ");
			dadosBancarios.append(controleLancamento.getNomeBanco());
			dadosBancarios.append(" Ag ");
			
			if(controleLancamento.getLancamentoContaCorrenteCliente() != null && 
					controleLancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario() != null) {
				
				dadosBancarios.append(controleLancamento.getLancamentoContaCorrenteCliente()
						.getDadosDomicilioBancario().getNumeroAgencia());
				dadosBancarios.append(" CC ");
				dadosBancarios.append(controleLancamento.getLancamentoContaCorrenteCliente()
						.getDadosDomicilioBancario().getNumeroContaCorrente());
			}
			
			logger.info("getDadosBancarios " + dadosBancarios.toString());
			
			return dadosBancarios.toString();
		}

		public List<LancamentoContaLegadoVO> build() {
			
			return this.listaLancamentoContaLegadoVO;
		}
		
	}

}
