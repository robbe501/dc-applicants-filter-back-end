package com.entity;

import java.time.LocalDate;

import com.enums.Contratto;
import com.enums.Posizione;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "posizione_lavorativa")
public class PosizioneLavorativa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "posizione_lavorativa_id")
	private Long posizioneLavorativaId;

	private String azienda;

	@Column(name = "data_inizio")
	private LocalDate dataInizio;

	@Enumerated(EnumType.STRING)
	private Posizione posizione;

	@Enumerated(EnumType.STRING)
	private Contratto contratto;

	@Column(name = "altro_contratto")
	private String altroContratto;

	private Integer livello;
	private Integer ral;

	@Column(name = "tariffa_giornaliera_netta")
	private Integer tariffaGiornalieraNetta;

	@Column(name = "nome_referente")
	private String nomeReferente;

	@Column(name = "normativa_privacy")
	private boolean normativaPrivacy;

	@ManyToOne
	@JoinColumn(name = "candidato_id", referencedColumnName = "candidato_id")
	private Anagrafica candidato;

	// getters and setters
}
