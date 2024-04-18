package com.Luana.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "cliente")
public class Cliente {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id_cliente;
private String cidade;
private Long telefone;
private String nome;
private String email;
}
