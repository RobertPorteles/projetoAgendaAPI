package br.com.cotiinformatica.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class TarefaRequestDto {

	@Size(min = 8, max = 100, message = "O título da tarefa deve ter entre 8 e 100 caracteres.")
	@NotEmpty(message = "O título da tarefa é obrigatório.")
	private String titulo;
	
	@Pattern(
		regexp = "^\\d{4}-\\d{2}-\\d{2}$", 	
		message = "A data da tarefa deve estar no formato AAAA-MM-DD."
	)
	@NotEmpty(message = "A data da tarefa é obrigatória.")
	private String data;
	
	@Pattern(
		regexp = "^\\d{2}:\\d{2}$",
		message = "A hora da tarefa deve estar no formato HH:MM."
	)
	@NotEmpty(message = "A hora da tarefa é obrigatória.")
	private String hora;
	
	@NotNull(message = "Informe se a tarefa está finalizada ou não.")
	private Boolean finalizado;
	
	@NotNull(message = "Informe a categoria da tarefa.")
	private UUID categoriaId;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Boolean getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}

	public UUID getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(UUID categoriaId) {
		this.categoriaId = categoriaId;
	}

}
