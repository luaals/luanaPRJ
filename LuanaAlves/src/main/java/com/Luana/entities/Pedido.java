package com.Luana.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "pedido") 
public class Pedido {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY) 
@Column(name = "id", nullable = false)
private Integer id_pedido;

@Column(name = "data_pedido", nullable = false, length = 100)
private Integer datapedido;

@Column(name = "valor_total", nullable = false, precision = 10, scale = 2) 
private BigDecimal valortotal;

@ManyToOne (fetch = FetchType.LAZY) 
@JoinColumn (name = "id_cliente", nullable = false) 
private Cliente cliente;

@JoinColumn (name = "id_fornecedor", nullable = false) 
private Fornecedor fornecedor;
}
