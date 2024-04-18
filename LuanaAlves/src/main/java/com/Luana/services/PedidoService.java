package com.Luana.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Luana.entities.Pedido;
import com.Luana.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	public List<Pedido> getAllPedidos() {
		return pedidoRepository.findAll();
	}

	public Pedido getPedidoById(long id_pedido) {
		return pedidoRepository.findById(id_pedido).orElse(null);
	}

	public Pedido savePedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

}
