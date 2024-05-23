package com.example.BoraDe0.models;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "TB_Fornecedor")
public class FornecedorModel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Fornecedor;

    private String nome;
    private String cnpj;
	public int getId_Fornecedor() {
		return id_Fornecedor;
	}
	public void setId_Fornecedor(int id_Fornecedor) {
		this.id_Fornecedor = id_Fornecedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cnpj, id_Fornecedor, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FornecedorModel other = (FornecedorModel) obj;
		return Objects.equals(cnpj, other.cnpj) && id_Fornecedor == other.id_Fornecedor
				&& Objects.equals(nome, other.nome);
	}


}
