package com.Luana.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Luana.entities.ItemPedido;

import com.Luana.services.ItempedidoService;


@RestController
@RequestMapping("/ItemPedido")
public class ItemPedidoControler {

	private final ItempedidoService itempedidoService;

	@Autowired
	public ItemPedidoControler(ItempedidoService itempedidoService) {
		this.itempedidoService = itempedidoService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<ItemPedido> findItemPedidobyId(@PathVariable Long id_itempedido) {
		ItemPedido itempedido = itempedidoService.getItemPedidoById(id_itempedido);
		if (itempedido != null) {
			return ResponseEntity.ok(itempedido);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<ItemPedido>> findAllUsuarioscontrol() {
		List<ItemPedido> itempedido = itempedidoService.getAllItemPedidos();
		return ResponseEntity.ok(itempedido);
	}
	@PostMapping("/")
	public ResponseEntity<ItemPedido> insertUsuariosControl(@RequestBody ItemPedido itempedido) {
		ItemPedido novoitempedido = itempedidoService.saveItemPedido(itempedido);
		return ResponseEntity.status(HttpStatus.CREATED).body(novoitempedido);
	}

}

