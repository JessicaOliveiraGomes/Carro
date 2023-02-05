package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DocumentDTO;
import com.example.demo.services.DocumentService;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/document")
@AllArgsConstructor
public class DocumentController {
	
	private final DocumentService documentService;
	
	@ApiOperation(value = "Retorna uma lista de Clientes")
	@GetMapping
	public ResponseEntity<List<DocumentDTO>> buscarDocuments() {
		return ResponseEntity.ok(documentService.getDocuments());
	}	
	
	@ApiOperation(value = "Salva um novo cadastro de cliente")
	@PostMapping
	public ResponseEntity<DocumentDTO> saveDocument(@RequestBody DocumentDTO document) {
		return ResponseEntity.ok(documentService.saveDocument(document));
	}
	
	@ApiOperation(value = "Atualiza a lista de Clientes")
	@PutMapping
	public ResponseEntity<DocumentDTO> updateDocument(@RequestBody DocumentDTO document) {
		return ResponseEntity.ok(documentService.updateDocument(document));
	}
	
	@ApiOperation(value = "Deleta cliente por id")
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		documentService.deleteDocument(id);
		return ResponseEntity.noContent().build();
	}
	
	

}
