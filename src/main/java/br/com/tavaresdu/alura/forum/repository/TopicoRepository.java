package br.com.tavaresdu.alura.forum.repository;

import br.com.tavaresdu.alura.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
