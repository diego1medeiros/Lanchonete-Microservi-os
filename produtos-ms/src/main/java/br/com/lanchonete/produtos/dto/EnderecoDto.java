package br.com.lanchonete.produtos.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EnderecoDto {

	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private String numero;
	private String cep;
}
