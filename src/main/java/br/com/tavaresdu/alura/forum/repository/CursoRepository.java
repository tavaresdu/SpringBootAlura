package br.com.tavaresdu.alura.forum.repository;

import br.com.tavaresdu.alura.forum.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
