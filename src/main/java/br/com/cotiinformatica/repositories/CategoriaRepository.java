package br.com.cotiinformatica.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, UUID>{

}