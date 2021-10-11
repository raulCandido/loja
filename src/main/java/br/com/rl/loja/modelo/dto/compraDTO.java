package br.com.rl.loja.modelo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class compraDTO {
    
    private List<ItemCompraDTO> itens;
    private EnderecoDTO endereco;
    
    
}
