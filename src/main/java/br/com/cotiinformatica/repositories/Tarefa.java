package br.com.cotiinformatica.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Tarefa extends JpaRepository<Tarefa, UUID>{

}
