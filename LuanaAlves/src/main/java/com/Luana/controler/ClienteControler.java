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

import com.Luana.entities.Cliente;
import com.Luana.services.ClienteService;

@RestController
@RequestMapping("/CLIENTE")
public class ClienteControler {

	private final ClienteService clienteService;

	@Autowired
	public ClienteControler(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> findClientebyId(@PathVariable Long id_cliente) {
		Cliente cliente = clienteService.getClienteById(id_cliente);
		if (cliente != null) {
			return ResponseEntity.ok(cliente);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<Cliente>> findAllUsuarioscontrol() {
		List<Cliente> cliente = clienteService.getAllCliente();
		return ResponseEntity.ok(cliente);
	}

	@PostMapping("/")
	public ResponseEntity<Cliente> insertUsuariosControl(@RequestBody Cliente cliente) {
		Cliente novocliente = clienteService.saveCliente(cliente);
		return ResponseEntity.status(HttpStatus.CREATED).body(novocliente);
	}

}