package com.service;

import java.util.List;

import com.dto.CandidatoDTO;
import com.dto.CandidatoLightDTO;

public interface CandidatoService {
	public List<CandidatoDTO> getFiltered(String nome, String residenza, String laurea, String diploma,
			String certificazione, String contratto, Integer ral, Integer tariffa);

	public List<CandidatoLightDTO> getFilteredLight(String nome, String residenza, String laurea, String diploma,
			String certificazione, String contratto, Integer ral, Integer tariffa);
}
