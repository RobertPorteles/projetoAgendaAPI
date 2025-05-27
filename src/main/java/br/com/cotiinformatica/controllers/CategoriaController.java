package br.com.cotiinformatica.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.CategoriaResponseDto;
import br.com.cotiinformatica.repositories.CategoriaRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/categorias")
@Tag(name = "Controle de categorias", description = "Serviços para gerenciamento de dados de categorias")
public class CategoriaController {
	
	@Autowired CategoriaRepository categoriaRepository;
	
	@GetMapping
	@Operation(summary = "Consulta de categorias",
	description = "Retorna todas as categorias cadastradas no sistema")
	public List<CategoriaResponseDto> get() {
		var mapper = new ModelMapper();
		
		var categorias = categoriaRepository.findAll();
		
		return categorias
				.stream()
				.map(categoria -> mapper.map(categoria, CategoriaResponseDto.class))
				.collect(Collectors.toList());
				
	}
} 
