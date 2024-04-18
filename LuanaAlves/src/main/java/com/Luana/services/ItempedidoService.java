package com.Luana.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Luana.entities.ItemPedido;
import com.Luana.repositories.ItempedidoRepository;


@Service
public class ItempedidoService {

	@Autowired
	private ItempedidoRepository itempedidoRepository;

	public List<ItemPedido> getAllItemPedidos() {
		return itempedidoRepository.findAll();
	}

	public ItemPedido getItemPedidoById(long id_itempedido) {
		return itempedidoRepository.findById(id_itempedido).orElse(null);
	}

	public ItemPedido saveItemPedido(ItemPedido itempedido) {
		return itempedidoRepository.save(itempedido);
	}

}