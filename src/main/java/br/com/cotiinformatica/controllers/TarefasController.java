package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.TarefaRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/tarefas")
@Tag(name = "Controle de tarefas", description = "Serviços para gerenciamento de dados de tarefas da agenda.")
public class TarefasController {

	@PostMapping
	@Operation(summary = "Cadastro de tarefas", description = "Cria uma nova tarefa no sistema.")
	public void post(@RequestBody @Valid TarefaRequestDto request) {
		// TODO Implementar o serviço para cadastro de tarefa
	}

	@PutMapping
	@Operation(summary = "Edição de tarefas", description = "Atualiza uma tarefa existente no sistema.")
	public void put() {
		// TODO Implementar o serviço para atualização de tarefa
	}

	@DeleteMapping
	@Operation(summary = "Exclusão de tarefas", description = "Apaga uma tarefa no sistema.")
	public void delete() {
		// TODO Implementar o serviço para exclusão de tarefa
	}

	@GetMapping
	@Operation(summary = "Consulta de tarefas", description = "Retorna as tarefas cadastradas no sistema..")
	public void get() {
		// TODO Implementar o serviço para consulta de tarefa
	}
}