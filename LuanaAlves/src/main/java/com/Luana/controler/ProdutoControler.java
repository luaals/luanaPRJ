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

import com.Luana.entities.Produto;
import com.Luana.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoControler {

	private final ProdutoService produtoService;

	@Autowired
	public ProdutoControler(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> findProdutoobyId(@PathVariable Long id_produto) {
		Produto produto = produtoService.getProdutoById(id_produto);
		if (produto != null) {
			return ResponseEntity.ok(produto);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<Produto>> findAllUsuarioscontrol() {
		List<Produto> produto = produtoService.getAllProdutos();
		return ResponseEntity.ok(produto);
	}

	@PostMapping("/")
	public ResponseEntity<Produto> insertUsuariosControl(@RequestBody Produto produto) {
		Produto novoproduto = produtoService.saveProduto(produto);
		return ResponseEntity.status(HttpStatus.CREATED).body(novoproduto);
	}

}


