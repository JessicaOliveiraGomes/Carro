package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CarroDTO;
import com.example.demo.entities.Carro;
import com.example.demo.mappers.CarroMapper;
import com.example.demo.repositorie.CarroRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CarroService {
	
	private final CarroRepository carroRepository;
	private final CarroMapper carroMapper;
	
	public List<CarroDTO> getCarros() {
		
		return carroMapper.entidadesParaDTO(carroRepository.findAll());
	}
	
	public CarroDTO saveCarro(CarroDTO carro) {
		Carro entidade = carroMapper.dtoParaEntidade(carro);
		return carroMapper.entidadesParaDTO(carroRepository.save(entidade));
	}
	
	
	public CarroDTO updateCarro (CarroDTO carro) {
		Carro entidade = carroMapper.dtoParaEntidade(carro);
		return carroMapper.entidadesParaDTO(carroRepository.save(entidade));
	}
	
	public void deleteCarro (Long id) {
		carroRepository.deleteById(id);
	}

}
