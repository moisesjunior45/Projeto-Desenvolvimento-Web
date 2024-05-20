package com.example.BoraDe0.Models;

import org.springframework.data.annotation.Transient;

//import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_Clientes")
@Getter
@Setter
@EqualsAndHashCode
public class ClienteModel {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id_Cliente;
  
  
  private String nome;
  private String cpf;
  private String telefone;
  private String email;
  private String endereco;
  private String senha;
  private String confirmarSenha;

}

