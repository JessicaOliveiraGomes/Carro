package com.example.demo.services;

import java.util.List;



import org.springframework.stereotype.Service;


import com.example.demo.dto.DocumentDTO;
import com.example.demo.entities.Document;
import com.example.demo.mappers.DocumentMapper;
import com.example.demo.repositorie.DocumentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DocumentService {
	
	private final DocumentRepository documentRepository;
	private final DocumentMapper documentMapper;
	
	
	public List<DocumentDTO> getDocuments() {
		return documentMapper.entidadesParaDTO(documentRepository.findAll());
	}
	
	
	public DocumentDTO saveDocument(DocumentDTO document) {
		Document entidade = documentMapper.dtoParaEntidade(document);
		return documentMapper.entidadeParaDTO(documentRepository.save(entidade));
	}
	
	
	public DocumentDTO updateDocument (DocumentDTO document) {
		Document entidade = documentMapper.dtoParaEntidade(document);
		return documentMapper.entidadeParaDTO(documentRepository.save(entidade));
	}
	
	public void deleteDocument (Long id) {
		documentRepository.deleteById(id);
	}
	

}
