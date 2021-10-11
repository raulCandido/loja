package br.com.rl.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rl.loja.modelo.dto.compraDTO;
import br.com.rl.loja.service.CompraService;

@RestController
@RequestMapping("/compras")
public class CompraController {
    
    @Autowired
    private CompraService compraService;

    @PostMapping()
    public ResponseEntity<compraDTO> cadastrarCompra(@RequestBody compraDTO compra) {
	
	compraService.realizarCompra(compra);
	
	return ResponseEntity.ok(compra);
    }
}
