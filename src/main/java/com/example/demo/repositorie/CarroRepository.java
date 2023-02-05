package com.example.demo.repositorie;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Carro;


@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}
