package com.Luana.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "fornecedor")
public class Fornecedor {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id_fornecedor;
private String nome;
private Long telefone;
private String email;
}