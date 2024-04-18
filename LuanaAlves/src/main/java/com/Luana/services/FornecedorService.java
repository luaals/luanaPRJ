package com.Luana.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Luana.entities.Fornecedor;
import com.Luana.repositories.FornecedorRepository;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository fornecedorRepository;

	public List<Fornecedor> getAllFornecedor() {
		return fornecedorRepository.findAll();
	}

	public Fornecedor getFornecedorById(long id_fornecedor) {
		return fornecedorRepository.findById(id_fornecedor).orElse(null);
	}

	public Fornecedor saveFornecedor(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}

}