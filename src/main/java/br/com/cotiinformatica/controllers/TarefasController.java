package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/v1/tarefas")
public class TarefasController {
	@Operation(summary = "Cadastro de Tarefas", description = "Cria uma nova tarefa no banco de dados")
	@PostMapping
	public void post() {
		// TODO cadastrar tarefa
	}
	@Operation(summary = "Edição de Tarefa", description = "Atualiza uma tarefa no banco de dados")
	@PutMapping
	public void put() {
		// TODO atualizar tarefa
	}
	@Operation(summary = "Deleta Tarefa", description = "Deleta uma tarefa no banco de dados")
	@DeleteMapping
	public void delete() {
		// TODO deletar tarefa
	}
	@Operation(summary = "Retorna Tarefa", description = "Retorna todas as tarefas do banco de dados")
	@GetMapping
	public void get() {
		// TODO listar tarefas
	}
}
