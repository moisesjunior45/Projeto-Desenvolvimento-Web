package com.example.BoraDe0.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Pedidos")
public class PedidoModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Pedido;

    @ManyToOne
    @JoinColumn(name = "id_Cliente")
    private ClienteModel cliente;

    private LocalDateTime dataPedido;
    private String status;

    @OneToMany(mappedBy = "pedido")
    private List<PedidoBebida> pedidoProdutos;

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDateTime dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PedidoBebida> getPedidoProdutos() {
		return pedidoProdutos;
	}

	public void setPedidoProdutos(List<PedidoBebida> pedidoProdutos) {
		this.pedidoProdutos = pedidoProdutos;
	}

	public int getId_Pedido() {
		return id_Pedido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, dataPedido, id_Pedido, pedidoProdutos, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoModel other = (PedidoModel) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(dataPedido, other.dataPedido)
				&& id_Pedido == other.id_Pedido && Objects.equals(pedidoProdutos, other.pedidoProdutos)
				&& Objects.equals(status, other.status);
	}


}
