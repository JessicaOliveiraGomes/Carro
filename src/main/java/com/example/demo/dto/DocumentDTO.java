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
public class DocumentDTO implements Serializable {
	private static final long serialVersionUID=1L;
	
	private Long id;
	private String renavam;
	private String placa;

}
