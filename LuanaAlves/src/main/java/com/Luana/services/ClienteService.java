package com.Luana.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Luana.entities.Cliente;
import com.Luana.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> getAllCliente() {
		return clienteRepository.findAll();
	}

	public Cliente getClienteById(long id_cliente) {
		return clienteRepository.findById(id_cliente).orElse(null);
	}

	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}