package com.example.BoraDe0.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class PedidoBebidaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int id_Pedido;  
    private int id_Bebida;
	
    //Getters
    public int getId_Pedido() {
		return id_Pedido;
	}
    public int getId_Bebida() {
		return id_Bebida;
	}
	// Setters
    public void setId_Pedido(int id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

    public void setId_Bebida(int id_Bebida) {
		this.id_Bebida = id_Bebida;
	} 
	
	@Override
	public int hashCode() {
		return Objects.hash(id_Pedido, id_Bebida);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoBebidaPK other = (PedidoBebidaPK) obj;
		return id_Pedido == other.id_Pedido && id_Bebida == other.id_Bebida;
	}
	
	
}
