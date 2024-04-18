package com.Luana.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Luana.entities.Produto;
import com.Luana.repositories.ProdutoRepository;



@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> getAllProdutos() {
		return produtoRepository.findAll();
	}

	public Produto getProdutoById(long id_produto) {
		return produtoRepository.findById(id_produto).orElse(null);
	}

	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

}
