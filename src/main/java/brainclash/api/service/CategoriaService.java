package brainclash.api.service;

import brainclash.api.entities.Categoria;
import brainclash.api.repository.CategoriaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> getAll(){
        try{
            return categoriaRepository.findAll().stream().toList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
