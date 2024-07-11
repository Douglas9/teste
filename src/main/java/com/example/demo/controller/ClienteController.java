package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.ClienteModel;
import com.example.demo.repositorio.ClienteRepositorio;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteRepositorio repositorio;
	
	@GetMapping("/listar")
	public List<ClienteModel> listarCliente() {
		return repositorio.findAll();
	}
	
	@PostMapping("/cadastrar")
	public ClienteModel cadastrarCliente(@RequestBody ClienteModel cliente) {		
		return repositorio.save(cliente);
	}
	
	
}
