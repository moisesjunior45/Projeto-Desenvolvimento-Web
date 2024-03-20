package com.example.boraDeZero.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class PedidoProdutoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int id_Pedido;  
    private int id_Produto;
	
    //Getters
    public int getId_Pedido() {
		return id_Pedido;
	}
	public int getId_Produto() {
		return id_Produto;
	}
	// Setters
    public void setId_Pedido(int id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

    public void setId_Produto(int id_Produto) {
        this.id_Produto = id_Produto;
    }
	
	@Override
	public int hashCode() {
		return Objects.hash(id_Pedido, id_Produto);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoProdutoPK other = (PedidoProdutoPK) obj;
		return id_Pedido == other.id_Pedido && id_Produto == other.id_Produto;
	} 
}
