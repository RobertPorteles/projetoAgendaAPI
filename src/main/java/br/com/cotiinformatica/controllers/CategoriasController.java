package br.com.cotiinformatica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.entities.Categoria;
import br.com.cotiinformatica.repositories.CategoriaRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/categorias")
@Tag(name = "Categoria", description = "Controlador de categorias")
public class CategoriasController {
	
	@Autowired CategoriaRepository categoriaRepository;
	
	@Operation(summary = "Retorna categoria", description = "Retorna todas as categorias")
	@GetMapping
	public List<Categoria> get() {
		return categoriaRepository.findAll();
	}
}
