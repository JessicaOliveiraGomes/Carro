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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CarroDTO;
import com.example.demo.services.CarroService;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/carros")
@AllArgsConstructor
public class CarroController {
	
	private final CarroService carroService;
	
	@ApiOperation(value = "Retorna uma lista de Carros")
	@GetMapping
	public ResponseEntity<List<CarroDTO>> buscarCarros() {
		return ResponseEntity.ok(carroService.getCarros());
	}	
	
	@GetMapping ("/{id}")
	public ResponseEntity<CarroDTO> buscarCarrosporId(@PathVariable Long id) {
		return ResponseEntity.ok(carroService.carroById(id));
	}
	
	@ApiOperation(value = "Salva um novo cadastro de Carro")
	@PostMapping
	public ResponseEntity<CarroDTO> saveCarro(@RequestBody CarroDTO carro) {
		return ResponseEntity.ok(carroService.saveCarro(carro));
	}
	
	@ApiOperation(value = "Atualiza a lista de Carros")
	@PutMapping
	public ResponseEntity<CarroDTO> updateCarro(@RequestBody CarroDTO carro) {
		return ResponseEntity.ok(carroService.updateCarro(carro));
	}
	
	@ApiOperation(value = "Deleta Carro por id")
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		carroService.deleteCarro(id);
		return ResponseEntity.noContent().build();
	}
	
}
