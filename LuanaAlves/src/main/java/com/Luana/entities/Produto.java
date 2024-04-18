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
@Table (name = "protudo") 
public class Produto {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY) 
@Column(name = "id", nullable = false)
private Integer id_produto;

@Column(name = "categoria", nullable = false, length = 100)
private String cat;

@Column(name = "descricao", nullable = false, precision = 10, scale = 2) 
private String descri;

@Column(name = "nome", nullable = false, precision = 10, scale = 2) 
private String nome;

@Column(name = "preco", nullable = false, precision = 10, scale = 2) 
private BigDecimal preco;

@ManyToOne (fetch = FetchType.LAZY) 
@JoinColumn (name = "id_fornecedor", nullable = false) 
private Fornecedor fornecedor;
}
