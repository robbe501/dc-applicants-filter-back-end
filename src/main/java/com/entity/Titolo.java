package com.entity;

import java.time.LocalDate;

import com.enums.Certificazione;
import com.enums.Diploma;
import com.enums.Laurea;

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
@Table(name = "titolo")
public class Titolo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "titolo_id")
	private Long titoloId;

	@Enumerated(EnumType.STRING)
	private Laurea laurea;

	@Column(name = "anno_laurea")
	private String annoLaurea;

	@Enumerated(EnumType.STRING)
	@Column(name = "laurea_in_corso")
	private Laurea laureaInCorso;

	@Enumerated(EnumType.STRING)
	private Diploma diploma;

	@Column(name = "data_diploma")
	private String dataDiploma;

	@Enumerated(EnumType.STRING)
	private Certificazione certificazione;

	@Column(name = "data_scadenza")
	private LocalDate dataScadenza;

	@ManyToOne
	@JoinColumn(name = "candidato_id", referencedColumnName = "candidato_id")
	private Anagrafica candidato;

	// getters and setters
}
