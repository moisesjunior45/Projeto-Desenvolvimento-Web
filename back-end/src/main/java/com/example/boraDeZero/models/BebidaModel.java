package com.example.boraDeZero.models;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Bebidas")
public class BebidaModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_Bebida;
	private String nome;
	private double preco;
	private String descricao;
	private int estoque;
	private String linkImagem;
	
	
	public int getIdBebida() {
		return id_Bebida;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public String getLinkImagem() {
		return linkImagem;
	}
	public void setLinkImagem(String linkImagem) {
		this.linkImagem = linkImagem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, estoque, id_Bebida, linkImagem, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BebidaModel other = (BebidaModel) obj;
		return Objects.equals(descricao, other.descricao) && estoque == other.estoque && id_Bebida == other.id_Bebida
				&& Objects.equals(linkImagem, other.linkImagem) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}
	

}
