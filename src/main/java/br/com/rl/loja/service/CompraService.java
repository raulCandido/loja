package br.com.rl.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rl.loja.client.FornecedorClient;
import br.com.rl.loja.modelo.dto.FornecedorDTO;
import br.com.rl.loja.modelo.dto.compraDTO;

@Service
public class CompraService {

    @Autowired
    private FornecedorClient fornecedorClient;
    
    public void realizarCompra(compraDTO compraDTO) {
	FornecedorDTO fornecedor = fornecedorClient.getFornecedor(compraDTO.getEndereco().getEstado());
    }
}
