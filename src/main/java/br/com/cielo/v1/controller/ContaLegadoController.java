package br.com.cielo.v1.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.v1.model.vo.LancamentoContaLegadoVO;
import br.com.cielo.v1.service.IContaLegadoService;

@RestController
@RequestMapping ("/api/cielo/conta-legado/")
public class ContaLegadoController {
	
	/**
	 * @see LoggerFactory
	 */
	Logger logger = LoggerFactory.getLogger(ContaLegadoController.class);
	
	/**
	 * @see IContaLegadoService
	 */
	@Autowired
	private IContaLegadoService iContaLegadoService;
	
	/**
	 * GET - Buscar lacamento conta legado.
	 * 
	 * @return ResponseEntity<LancamentoContaLegadoVO>
	 */
	@GetMapping ("buscar-lacamento")
	public ResponseEntity<List<LancamentoContaLegadoVO>> buscarLacamentoContaLegado() {
		
		logger.info("GET buscar-lacamento");
		
		final List<LancamentoContaLegadoVO> contaLegadoVO = iContaLegadoService.buscarLacamentoContaLegado();
		
		return new ResponseEntity<List<LancamentoContaLegadoVO>>(contaLegadoVO, HttpStatus.OK);
	}

}
