package br.com.cielo.v1.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.v1.builder.ContaLegadoBuilder;
import br.com.cielo.v1.helper.ArquivoJsonHelper;
import br.com.cielo.v1.model.vo.LancamentoContaLegadoVO;
import br.com.cielo.v1.model.ws.LacamentoContaLegado;
import br.com.cielo.v1.service.IContaLegadoService;

/**
 * @author Bruno
 *
 * Class para implementacao de operacoes de ContaLegado.
 */
@Service
public class ContaLegadoService implements IContaLegadoService {

	/**
	 * @see LoggerFactory
	 */
	Logger logger = LoggerFactory.getLogger(ContaLegadoService.class);
	
	/**
	 * @see ArquivoJsonHelper
	 */
	@Autowired
	private ArquivoJsonHelper arquivoJsonHelper;
	
	/*
	 * (non-Javadoc)
	 * @see br.com.cielo.v1.service.IContaLegadoService#buscarLacamentoContaLegado()
	 */
	@Override
	public List<LancamentoContaLegadoVO> buscarLacamentoContaLegado() {
		
		logger.info("buscarLacamentoContaLegado");
		
		final LacamentoContaLegado lacamentoContaLegado = arquivoJsonHelper.carregarArquivoLegado();
		
		if (lacamentoContaLegado != null ) {
			
			logger.info("LacamentoContaLegado " + lacamentoContaLegado.toString());
			
			return new ContaLegadoBuilder.Builder(lacamentoContaLegado).build();
		} 
		
		return null;
	}
	
}
