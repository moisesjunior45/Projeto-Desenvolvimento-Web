package com.example.BoraDe0.models;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PedidoProduto")
public class PedidoBebida {
	@EmbeddedId
    private PedidoBebidaPK id_PedidoProduto;

    @ManyToOne
    @JoinColumn(name = "id_Pedido", insertable = false, updatable = false)
    private PedidoModel pedido;

    @ManyToOne
    @JoinColumn(name = "id_Bebida", insertable = false, updatable = false)
    private BebidaModel bebida;

    private int quantidade;

	public PedidoModel getPedido() {
		return pedido;
	}

	public void setPedido(PedidoModel pedido) {
		this.pedido = pedido;
	}

	public BebidaModel getBebida() {
		return bebida;
	}

	public void setBebida(BebidaModel bebida) {
		this.bebida = bebida;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public PedidoBebidaPK getId_PedidoProduto() {
		return id_PedidoProduto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bebida, id_PedidoProduto, pedido, quantidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoBebida other = (PedidoBebida) obj;
		return Objects.equals(bebida, other.bebida) && Objects.equals(id_PedidoProduto, other.id_PedidoProduto)
				&& Objects.equals(pedido, other.pedido) && quantidade == other.quantidade;
	}

}