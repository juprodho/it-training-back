package com.ittraining.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Resultat_test_formateur")
public class ResultatTestFormateur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

}