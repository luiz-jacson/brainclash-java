package brainclash.api.repository;

import brainclash.api.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {
    Categoria findByNomeIgnoreCase(String nome);
}
