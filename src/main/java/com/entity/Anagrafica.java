package com.entity;

import java.time.LocalDate;

import com.enums.ComeConosciuto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "anagrafica_candidato")
public class Anagrafica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "candidato_id")
	private Long candidatoId;

	@Column(name = "codice_fiscale", nullable = false)
	private String codiceFiscale;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "cognome", nullable = false)
	private String cognome;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "data_nascita")
	private LocalDate dataNascita;

	@Column(name = "luogo_nascita", nullable = false)
	private String luogoNascita;

	@Column(name = "cittadinanza", nullable = false)
	private boolean cittadinanza;

	@Column(name = "residenza", nullable = false)
	private String residenza;

	@Column(name = "cap_residenza", nullable = false)
	private String capResidenza;

	@Column(name = "domicilio_uguale_residenza", nullable = false)
	private boolean domicilioUgualeResidenza;

	@Column(name = "domicilio")
	private String domicilio;

	@Column(name = "cap_domicilio")
	private String capDomicilio;

	@Column(name = "recapito_mobile", nullable = false)
	private String recapitoMobile;

	@Column(name = "recapito_fisso")
	private String recapitoFisso;

	@Column(name = "categoria_protetta")
	private boolean categoriaProtetta;

	@Column(name = "condanne_civili")
	private boolean condanneCivili;

	@Column(name = "come_conosciuto_combo")
	@Enumerated(EnumType.STRING)
	private ComeConosciuto comeConosciuto;

	// getters and setters
}
