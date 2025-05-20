package br.com.cotiinformatica.repositories;


import java.util.List;
import java.util.UUID;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import br.com.cotiinformatica.entities.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {


	/*
	 * Método para consultar todas as categorias
	 * e retorna-las em ordem alfabética (nome)
	 * JPQL -> Sintaxe / linguagem utilizada para escrever as consultas
	 * que serão feitas no banco de dados pelo Spring Data JPA
	 */
	@Query("""
			SELECT c FROM Categoria c
			ORDER BY c.nome ASC
			""")
	List<Categoria> findAll();
}

