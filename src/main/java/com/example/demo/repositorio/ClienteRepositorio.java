package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.ClienteModel;

public interface ClienteRepositorio extends JpaRepository<ClienteModel, Long>{

}
