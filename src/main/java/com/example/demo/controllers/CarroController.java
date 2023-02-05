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

import com.example.demo.dto.CarroDTO;
import com.example.demo.services.CarroService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/carros")
@AllArgsConstructor
public class CarroController {
	
	private final CarroService carroService;
	
	
	@GetMapping
	public ResponseEntity<List<CarroDTO>> buscarCarros() {
		return ResponseEntity.ok(carroService.getCarros());
	}	
	
	@PostMapping
	public ResponseEntity<CarroDTO> saveCarro(@RequestBody CarroDTO carro) {
		return ResponseEntity.ok(carroService.saveCarro(carro));
	}
	
	@PutMapping
	public ResponseEntity<CarroDTO> updateCarro(@RequestBody CarroDTO carro) {
		return ResponseEntity.ok(carroService.updateCarro(carro));
	}
	 
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		carroService.deleteCarro(id);
		return ResponseEntity.noContent().build();
	}
	
}
