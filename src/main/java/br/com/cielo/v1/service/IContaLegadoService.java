package br.com.cielo.v1.service;

import java.util.List;

import br.com.cielo.v1.model.vo.LancamentoContaLegadoVO;

/**
 * @author Bruno
 *
 * Interface para definicao de operacoes de ContaLegado.
 */
@FunctionalInterface
public interface IContaLegadoService {

	/**
	 * Busca lacamento do ContaLegado.
	 * 
	 * @return List<LancamentoContaLegadoVO>.
	 * 
	 * @see LancamentoContaLegadoVO.
	 */
	public List<LancamentoContaLegadoVO> buscarLacamentoContaLegado();
	
}
