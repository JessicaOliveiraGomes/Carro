package com.example.demo.mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.example.demo.dto.DocumentDTO;
import com.example.demo.entities.Document;


@Component
public class DocumentMapper {

	
	public DocumentDTO entidadeParaDTO(Document entidade) {
		if (Objects.isNull(entidade)) {
			return null;
		}
		return DocumentDTO.builder()
		.id(entidade.getId())
		.renavam(entidade.getRenavam())
		.placa(entidade.getPlaca())
		.build();
	}
	
	public Document dtoParaEntidade(DocumentDTO dto) {
		if (Objects.isNull(dto)) {
			return null;
		}
		return Document.builder()
				.id(dto.getId())
				.renavam(dto.getRenavam())
				.placa(dto.getPlaca())
				.build();
	}

	public List<DocumentDTO> entidadesParaDTO(List<Document> entidades) {
		List<DocumentDTO> dtos = new ArrayList<>();
		
		for (int i = 0; i < entidades.size(); i++) {
			
			Document docEntity = entidades.get(i);
			if (Objects.nonNull(dtos)) {
				DocumentDTO dto = new DocumentDTO(docEntity.getId(), docEntity.getRenavam(), docEntity.getPlaca());
				dtos.add(dto);
			}
		}
		return dtos;
	}
	
}
