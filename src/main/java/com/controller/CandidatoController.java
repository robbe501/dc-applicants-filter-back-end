package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.CandidatoDTO;
import com.dto.CandidatoLightDTO;
import com.dto.EnumDTO;
import com.dto.EnumNameDTO;
import com.enums.Certificazione;
import com.enums.Contratto;
import com.enums.Diploma;
import com.enums.Esito;
import com.enums.Laurea;
import com.service.CandidatoService;

@CrossOrigin
@RequestMapping("/api/v1")
@RestController
public class CandidatoController {
	@Autowired
	private CandidatoService cs;

//	@GetMapping("/getAll")
//	public List<CandidatoDTO> getAll() {
//		return cr.getAll();
//	}

	@GetMapping("/getFiltered")
	public List<CandidatoDTO> getFiltered(@RequestParam(required = false) String nome,
			@RequestParam(required = false) String residenza, @RequestParam(required = false) String laurea,
			@RequestParam(required = false) String diploma, @RequestParam(required = false) String certificazione,
			@RequestParam(required = false) String contratto, @RequestParam(required = false) Integer ral,
			@RequestParam(required = false) Integer tariffa) {
		return cs.getFiltered(nome, residenza, laurea, diploma, certificazione, contratto, ral, tariffa);

	}

	@GetMapping("/getFilteredLight")
	public List<CandidatoLightDTO> getFilteredLight(@RequestParam(required = false) String nome,
			@RequestParam(required = false) String residenza, @RequestParam(required = false) String laurea,
			@RequestParam(required = false) String diploma, @RequestParam(required = false) String certificazione,
			@RequestParam(required = false) String contratto, @RequestParam(required = false) Integer ral,
			@RequestParam(required = false) Integer tariffa) {
		return cs.getFilteredLight(nome, residenza, laurea, diploma, certificazione, contratto, ral, tariffa);

	}

	@GetMapping("/getEnums")
	public EnumDTO getEnums() {
		EnumDTO enums = new EnumDTO();
		for (Certificazione b : Certificazione.values()) {
			enums.getCertificazione().add(new EnumNameDTO(b.getValue()));
		}
		for (Laurea b : Laurea.values()) {
			enums.getLaurea().add(new EnumNameDTO(b.getValue()));
		}
		for (Diploma b : Diploma.values()) {
			enums.getDiploma().add(new EnumNameDTO(b.getValue()));
		}
		for (Contratto b : Contratto.values()) {
			enums.getContratto().add(new EnumNameDTO(b.getValue()));
		}
		for (Esito b : Esito.values()) {
			enums.getEsito().add(new EnumNameDTO(b.getValue()));
		}
		return enums;
	}
}
