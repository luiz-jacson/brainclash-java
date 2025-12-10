package brainclash.api.repository;

import brainclash.api.entities.Pergunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PerguntaRepository extends JpaRepository<Pergunta, UUID> {
}
