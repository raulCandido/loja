package br.com.rl.loja.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.rl.loja.modelo.dto.FornecedorDTO;

@FeignClient(name = "fornecedor", url = "http://localhost:8081/")
public interface FornecedorClient {

    @GetMapping("fornecedor/{id}")
    FornecedorDTO getFornecedor(@PathVariable String estado);
}
