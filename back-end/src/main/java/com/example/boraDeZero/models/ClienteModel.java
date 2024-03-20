package com.example.boraDeZero.models;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Clientes")
public class ClienteModel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Cliente;

    private String nome;
    private String cpf;
    private String email;
    private String endereco;
	
    
    
    // Getters e Setters
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getId() {
		return id_Cliente;
	}
	public String getCpf() {
		return cpf;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf, email, endereco, id_Cliente, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteModel other = (ClienteModel) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && id_Cliente == other.id_Cliente
				&& Objects.equals(nome, other.nome);
	}
    

    
	

}
