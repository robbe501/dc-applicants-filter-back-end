package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.CandidatoDTO;
import com.dto.CandidatoLightDTO;
import com.enums.Certificazione;
import com.enums.Contratto;
import com.enums.Diploma;
import com.enums.Laurea;
import com.repository.CandidatoRepository;

@Service
public class CandidatoServiceImpl implements CandidatoService {

	@Autowired
	private CandidatoRepository cr;

	@Override
	public List<CandidatoDTO> getFiltered(String nome, String residenza, String laurea, String diploma,
			String certificazione, String contratto, Integer ral, Integer tariffa) {

		Laurea laureaEnum = null;
		Diploma diplomaEnum = null;
		Certificazione certificazioneEnum = null;
		Contratto contrattoEnum = null;
		String nomeLike = null;
		String residenzaLike = null;

		if (laurea != null)
			laureaEnum = Laurea.fromString(laurea);
		if (diploma != null)
			diplomaEnum = Diploma.fromString(diploma);
		if (certificazione != null)
			certificazioneEnum = Certificazione.fromString(certificazione);
		if (contratto != null)
			contrattoEnum = Contratto.fromString(contratto);
		if (nome != null)
			nomeLike = "%" + nome + "%";
		if (residenza != null)
			residenzaLike = "%" + residenza + "%";
		System.out.println(nomeLike + " " + residenzaLike + " " + laureaEnum + " " + diplomaEnum + " "
				+ certificazioneEnum + " " + contrattoEnum + " " + ral + " " + tariffa);
		return cr.getFiltered(nomeLike, residenzaLike, laureaEnum, diplomaEnum, certificazioneEnum, contrattoEnum, ral,
				tariffa);
	}

	@Override
	public List<CandidatoLightDTO> getFilteredLight(String nome, String residenza, String laurea, String diploma,
			String certificazione, String contratto, Integer ral, Integer tariffa) {
		Laurea laureaEnum = null;
		Diploma diplomaEnum = null;
		Certificazione certificazioneEnum = null;
		Contratto contrattoEnum = null;
		String nomeLike = null;
		String residenzaLike = null;

		if (laurea != null)
			laureaEnum = Laurea.fromString(laurea);
		if (diploma != null)
			diplomaEnum = Diploma.fromString(diploma);
		if (certificazione != null)
			certificazioneEnum = Certificazione.fromString(certificazione);
		if (contratto != null)
			contrattoEnum = Contratto.fromString(contratto);
		if (nome != null)
			nomeLike = "%" + nome + "%";
		if (residenza != null)
			residenzaLike = "%" + residenza + "%";
		System.out.println(nomeLike + " " + residenzaLike + " " + laureaEnum + " " + diplomaEnum + " "
				+ certificazioneEnum + " " + contrattoEnum + " " + ral + " " + tariffa);
		return cr.getFilteredLight(nomeLike, residenzaLike, laureaEnum, diplomaEnum, certificazioneEnum, contrattoEnum,
				ral, tariffa);
	}

}
