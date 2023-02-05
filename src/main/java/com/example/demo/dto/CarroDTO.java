package com.example.demo.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class CarroDTO implements Serializable {
	private static final long serialVersionUID=1L;
	
	private Long id;
	private String modelo;
	private String ano;
	private String cor;
	private DocumentDTO documentDTO;
	

}
