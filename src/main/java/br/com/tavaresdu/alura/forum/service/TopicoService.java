package br.com.tavaresdu.alura.forum.service;

import br.com.tavaresdu.alura.forum.model.Topico;
import br.com.tavaresdu.alura.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    private TopicoRepository topicoRepository;

    @Autowired
    public TopicoService(TopicoRepository topicoRepository) {
        this.topicoRepository = topicoRepository;
    }

    public List<Topico> listar(Topico topico) {
        topico.setDataCriacao(null);
        topico.setStatus(null);
        return topicoRepository.findAll(Example.of(topico));
    }

    public Topico cadastrar(Topico topico) {
        return topicoRepository.save(topico);
    }
}
