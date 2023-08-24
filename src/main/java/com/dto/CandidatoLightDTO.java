package com.dto;

import com.enums.Esito;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
@Setter
public class CandidatoLightDTO {
	private String nome;
	private String cognome;
	private String recapitoMobile;
	private String esito;

	public CandidatoLightDTO(String nome, String cognome, String recapitoMobile, Esito esito) {
		this.nome = nome;
		this.cognome = cognome;
		this.recapitoMobile = recapitoMobile;
		if (esito != null)
			this.esito = esito.getValue();
	}

}
