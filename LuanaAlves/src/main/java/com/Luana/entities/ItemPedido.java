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
@Table (name = "itempedido") 
public class ItemPedido {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY) 
@Column(name = "id", nullable = false)
private Integer id_itempedido;

@Column(name = "quantidade", nullable = false, length = 100)
private Integer qntd;

@Column(name = "valor_unitario", nullable = false, precision = 10, scale = 2) 
private BigDecimal valortotal;

@ManyToOne (fetch = FetchType.LAZY) 
@JoinColumn (name = "id_pedido", nullable = false) 
private Pedido pedido;

@JoinColumn (name = "id_produto", nullable = false) 
private Produto produto;
}