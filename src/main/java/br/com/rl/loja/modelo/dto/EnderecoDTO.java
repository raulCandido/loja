package br.com.rl.loja.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EnderecoDTO {

    private String rua;
    private Long numero;
    private String estado;
}
