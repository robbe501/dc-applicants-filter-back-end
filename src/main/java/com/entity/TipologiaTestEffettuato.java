package com.entity;

import com.enums.Esito;

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
@Table(name = "tipologia_test_effettuato")
public class TipologiaTestEffettuato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tipologia_test_effettuato_id")
	private Long tipologiaTestEffettuatoId;

	@Enumerated(EnumType.STRING)
	private Esito esito;

	@ManyToOne
	@JoinColumn(name = "candidato_id", referencedColumnName = "candidato_id")
	private Anagrafica candidato;
}
