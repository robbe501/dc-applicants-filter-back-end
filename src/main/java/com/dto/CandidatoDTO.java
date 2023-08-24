package com.dto;

import java.time.LocalDate;

import com.enums.Certificazione;
import com.enums.ComeConosciuto;
import com.enums.Contratto;
import com.enums.Diploma;
import com.enums.Laurea;
import com.enums.Posizione;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
@Setter
public class CandidatoDTO {
	private Long candidatoId;
	private String codiceFiscale;
	private String nome;
	private String cognome;
	private String email;
	private LocalDate dataNascita;
	private String luogoNascita;
	private boolean cittadinanza;
	private String residenza;
	private String capResidenza;
	private boolean domicilioUgualeResidenza;
	private String domicilio;
	private String capDomicilio;
	private String recapitoMobile;
	private String recapitoFisso;
	private boolean categoriaProtetta;
	private boolean condanneCivili;
	private String comeConosciuto;

	private Long titoloId;
	private String laurea;
	private String annoLaurea;
	private String laureaInCorso;
	private String diploma;
	private String dataDiploma;
	private String certificazione;
	private LocalDate dataScadenza;

	private Long posizioneLavorativaId;
	private String azienda;
	private LocalDate dataInizio;
	private String posizione;
	private String contratto;
	private String altroContratto;
	private Integer livello;
	private Integer ral;
	private Integer tariffaGiornalieraNetta;
	private String nomeReferente;
	private boolean normativaPrivacy;

	public CandidatoDTO(Long candidatoId, String codiceFiscale, String nome, String cognome, String email,
			LocalDate dataNascita, String luogoNascita, boolean cittadinanza, String residenza, String capResidenza,
			boolean domicilioUgualeResidenza, String domicilio, String capDomicilio, String recapitoMobile,
			String recapitoFisso, boolean categoriaProtetta, boolean condanneCivili, ComeConosciuto comeConosciuto,
			Long titoloId, Laurea laurea, String annoLaurea, Laurea laureaInCorso, Diploma diploma, String dataDiploma,
			Certificazione certificazione, LocalDate dataScadenza, Long posizioneLavorativaId, String azienda,
			LocalDate dataInizio, Posizione posizione, Contratto contratto, String altroContratto, Integer livello,
			Integer ral, Integer tariffaGiornalieraNetta, String nomeReferente, boolean normativaPrivacy) {
		this.candidatoId = candidatoId;
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.cittadinanza = cittadinanza;
		this.residenza = residenza;
		this.capResidenza = capResidenza;
		this.domicilioUgualeResidenza = domicilioUgualeResidenza;
		this.domicilio = domicilio;
		this.capDomicilio = capDomicilio;
		this.recapitoMobile = recapitoMobile;
		this.recapitoFisso = recapitoFisso;
		this.categoriaProtetta = categoriaProtetta;
		this.condanneCivili = condanneCivili;
		if (comeConosciuto != null)
			this.comeConosciuto = comeConosciuto.getValue();
		this.titoloId = titoloId;
		if (laurea != null)
			this.laurea = laurea.getValue();
		this.annoLaurea = annoLaurea;
		if (laureaInCorso != null)
			this.laureaInCorso = laureaInCorso.getValue();
		if (diploma != null)
			this.diploma = diploma.getValue();
		this.dataDiploma = dataDiploma;
		if (certificazione != null)
			this.certificazione = certificazione.getValue();
		this.dataScadenza = dataScadenza;
		this.posizioneLavorativaId = posizioneLavorativaId;
		this.azienda = azienda;
		this.dataInizio = dataInizio;
		if (posizione != null)
			this.posizione = posizione.getValue();
		if (contratto != null)
			this.contratto = contratto.getValue();
		this.altroContratto = altroContratto;
		this.livello = livello;
		this.ral = ral;
		this.tariffaGiornalieraNetta = tariffaGiornalieraNetta;
		this.nomeReferente = nomeReferente;
		this.normativaPrivacy = normativaPrivacy;
	}

}
