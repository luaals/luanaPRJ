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

import com.Luana.entities.Pedido;
import com.Luana.services.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoControler {

	private final PedidoService pedidoService;

	@Autowired
	public PedidoControler(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pedido> findPedidobyId(@PathVariable Long id_pedido) {
		Pedido pedido = pedidoService.getPedidoById(id_pedido);
		if (pedido != null) {
			return ResponseEntity.ok(pedido);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<Pedido>> findAllUsuarioscontrol() {
		List<Pedido> pedido = pedidoService.getAllPedidos();
		return ResponseEntity.ok(pedido);
	}

	@PostMapping("/")
	public ResponseEntity<Pedido> insertUsuariosControl(@RequestBody Pedido pedido) {
		Pedido novopedido = pedidoService.savePedido(pedido);
		return ResponseEntity.status(HttpStatus.CREATED).body(novopedido);
	}

}

