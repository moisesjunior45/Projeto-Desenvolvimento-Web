package com.example.BoraDe0.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_Bebidas")
@Getter
@Setter
@EqualsAndHashCode
public class BebidaModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_Bebida;
	private String nome;
	private double preco;
	private String descricao;
	
	

}
