package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dto.CandidatoDTO;
import com.dto.CandidatoLightDTO;
import com.entity.Anagrafica;
import com.enums.Certificazione;
import com.enums.Contratto;
import com.enums.Diploma;
import com.enums.Laurea;

public interface CandidatoRepository extends JpaRepository<Anagrafica, Long> {

	@Query("SELECT NEW com.dto.CandidatoDTO(ac.candidatoId, ac.codiceFiscale, ac.nome, ac.cognome, ac.email, "
			+ "    ac.dataNascita, ac.luogoNascita, ac.cittadinanza, ac.residenza, "
			+ "    ac.capResidenza, ac.domicilioUgualeResidenza, ac.domicilio, "
			+ "    ac.capDomicilio, ac.recapitoMobile, ac.recapitoFisso, "
			+ "    ac.categoriaProtetta, ac.condanneCivili, ac.comeConosciuto,"
			+ "    t.titoloId, t.laurea, t.annoLaurea, t.laureaInCorso, "
			+ "    t.diploma, t.dataDiploma, t.certificazione, t.dataScadenza,"
			+ "    pl.posizioneLavorativaId, pl.azienda, pl.dataInizio, "
			+ "    pl.posizione, pl.contratto, pl.altroContratto, "
			+ "    pl.livello, pl.ral, pl.tariffaGiornalieraNetta, " + "    pl.nomeReferente, pl.normativaPrivacy"
			+ ") " + "FROM Anagrafica ac " + "JOIN Titolo t ON ac.candidatoId = t.candidato.candidatoId "
			+ "JOIN PosizioneLavorativa pl ON ac.candidatoId = pl.candidato.candidatoId")
	public List<CandidatoDTO> getAll();

	@Query("SELECT ac.candidatoId FROM Anagrafica ac " + "JOIN Titolo t ON ac.candidatoId = t.candidato.candidatoId "
			+ "JOIN PosizioneLavorativa pl ON ac.candidatoId = pl.candidato.candidatoId "
			+ "WHERE (:codiceFiscale IS NULL OR ac.codiceFiscale = :codiceFiscale)")
	public List<String> getAll2(String codiceFiscale);

//	@Query("SELECT NEW com.dto.CandidatoDTO(ac.candidatoId, ac.codiceFiscale, ac.nome, ac.cognome, ac.email, "
//			+ "    ac.dataNascita, ac.luogoNascita, ac.cittadinanza, ac.residenza, "
//			+ "    ac.capResidenza, ac.domicilioUgualeResidenza, ac.domicilio, "
//			+ "    ac.capDomicilio, ac.recapitoMobile, ac.recapitoFisso, "
//			+ "    ac.categoriaProtetta, ac.condanneCivili, ac.comeConosciuto,"
//			+ "    t.titoloId, t.laurea, t.annoLaurea, t.laureaInCorso, "
//			+ "    t.diploma, t.dataDiploma, t.certificazione, t.dataScadenza,"
//			+ "    pl.posizioneLavorativaId, pl.azienda, pl.dataInizio, "
//			+ "    pl.posizione, pl.contratto, pl.altroContratto, "
//			+ "    pl.livello, pl.ral, pl.tariffaGiornalieraNetta, " + "    pl.nomeReferente, pl.normativaPrivacy"
//			+ ") " + "FROM Anagrafica ac " + "JOIN Titolo t ON ac.candidatoId = t.candidato.candidatoId "
//			+ "JOIN PosizioneLavorativa pl ON ac.candidatoId = pl.candidato.candidatoId"
//			+ "WHERE (:nome IS NULL OR ac.nome LIKE :nome)")
//	public List<CandidatoDTO> getFiltered(String nome, String residenza, String laurea, String diploma,
//			String certificazione, String contratto, Integer ral, Integer tariffa);

	@Query("SELECT NEW com.dto.CandidatoDTO(ac.candidatoId, ac.codiceFiscale, ac.nome, ac.cognome, ac.email, "
			+ "    ac.dataNascita, ac.luogoNascita, ac.cittadinanza, ac.residenza, "
			+ "    ac.capResidenza, ac.domicilioUgualeResidenza, ac.domicilio, "
			+ "    ac.capDomicilio, ac.recapitoMobile, ac.recapitoFisso, "
			+ "    ac.categoriaProtetta, ac.condanneCivili, ac.comeConosciuto,"
			+ "    t.titoloId, t.laurea, t.annoLaurea, t.laureaInCorso, "
			+ "    t.diploma, t.dataDiploma, t.certificazione, t.dataScadenza,"
			+ "    pl.posizioneLavorativaId, pl.azienda, pl.dataInizio, "
			+ "    pl.posizione, pl.contratto, pl.altroContratto, "
			+ "    pl.livello, pl.ral, pl.tariffaGiornalieraNetta, " + "    pl.nomeReferente, pl.normativaPrivacy"
			+ ") " + "FROM Anagrafica ac " + "JOIN Titolo t ON ac.candidatoId = t.candidato.candidatoId "
			+ "JOIN PosizioneLavorativa pl ON ac.candidatoId = pl.candidato.candidatoId "
			+ "WHERE (:nome IS NULL OR ac.nome LIKE :nome) AND "
			+ "(:residenza IS NULL OR ac.residenza LIKE :residenza) AND "
			+ "(:laurea IS NULL OR t.laurea = :laurea) AND " + "(:diploma IS NULL OR t.diploma = :diploma) AND "
			+ "(:certificazione IS NULL OR t.certificazione = :certificazione) AND "
			+ "(:contratto IS NULL OR pl.contratto = :contratto) AND " + "(:ral IS NULL OR pl.ral = :ral) AND "
			+ "(:tariffa IS NULL OR pl.tariffaGiornalieraNetta = :tariffa)")
	public List<CandidatoDTO> getFiltered(String nome, String residenza, Laurea laurea, Diploma diploma,
			Certificazione certificazione, Contratto contratto, Integer ral, Integer tariffa);

	@Query("SELECT NEW com.dto.CandidatoLightDTO(ac.nome, ac.cognome, ac.recapitoMobile, tte.esito) "
			+ "FROM Anagrafica ac " + "JOIN Titolo t ON ac.candidatoId = t.candidato.candidatoId "
			+ "JOIN PosizioneLavorativa pl ON ac.candidatoId = pl.candidato.candidatoId "
			+ "JOIN TipologiaTestEffettuato tte ON ac.candidatoId = tte.candidato.candidatoId "
			+ "WHERE (:nome IS NULL OR ac.nome LIKE :nome) AND "
			+ "(:residenza IS NULL OR ac.residenza LIKE :residenza) AND "
			+ "(:laurea IS NULL OR t.laurea = :laurea) AND " + "(:diploma IS NULL OR t.diploma = :diploma) AND "
			+ "(:certificazione IS NULL OR t.certificazione = :certificazione) AND "
			+ "(:contratto IS NULL OR pl.contratto = :contratto) AND " + "(:ral IS NULL OR pl.ral = :ral) AND "
			+ "(:tariffa IS NULL OR pl.tariffaGiornalieraNetta = :tariffa)")
	public List<CandidatoLightDTO> getFilteredLight(String nome, String residenza, Laurea laurea, Diploma diploma,
			Certificazione certificazione, Contratto contratto, Integer ral, Integer tariffa);

}
