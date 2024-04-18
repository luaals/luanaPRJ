package com.Luana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Luana.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

