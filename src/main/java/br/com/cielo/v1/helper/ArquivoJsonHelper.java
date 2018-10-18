package br.com.cielo.v1.helper;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import br.com.cielo.v1.model.ws.LacamentoContaLegado;

/**
 * @author Bruno
 * 
 * Classe Helper para carregar arquivo Json.
 */
@Component
public class ArquivoJsonHelper {
	
	/**
	 * @see LoggerFactory
	 */
	Logger logger = LoggerFactory.getLogger(ArquivoJsonHelper.class);
	
	/**
	 * Carrega arquivo legado.
	 * 
	 * @return LacamentoContaLegado
	 */
	public LacamentoContaLegado carregarArquivoLegado() {
		
		final Gson gson = new Gson();
		
		LacamentoContaLegado lacamentoContaLegado = null;
		
		ClassLoader classLoader = getClass().getClassLoader();

		try {
			
			String file = classLoader.getResource("lancamento-conta-legado.json").getFile();
			
			lacamentoContaLegado = gson.fromJson(new FileReader(file), 
					LacamentoContaLegado.class);
			
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			
			logger.error(e.getMessage());
			
		} 
		
		return lacamentoContaLegado;
		
	}

}
