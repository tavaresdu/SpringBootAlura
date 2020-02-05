package br.com.tavaresdu.alura.forum.controller;

import br.com.tavaresdu.alura.forum.dto.TopicoDTO;
import br.com.tavaresdu.alura.forum.dto.TopicoFormDTO;
import br.com.tavaresdu.alura.forum.dto.TopicoQueryDTO;
import br.com.tavaresdu.alura.forum.dto.mapper.TopicoMapper;
import br.com.tavaresdu.alura.forum.model.Topico;
import br.com.tavaresdu.alura.forum.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/topico")
public class TopicoController {

    private TopicoService topicoService;
    private TopicoMapper topicoMapper;

    @Autowired
    public TopicoController(TopicoService topicoService, TopicoMapper topicoMapper) {
        this.topicoService = topicoService;
        this.topicoMapper = topicoMapper;
    }

    @GetMapping
    public List<TopicoDTO> listar(TopicoQueryDTO query) {
        return topicoMapper.beanListToDtoList(topicoService.listar(topicoMapper.queryDtoToBean(query)));
    }

    @PostMapping
    public ResponseEntity<TopicoDTO> cadastrar(@RequestBody TopicoFormDTO form,
                                               UriComponentsBuilder uriComponentsBuilder) {
        Topico topico = topicoService.cadastrar(topicoMapper.formDtoToBean(form));
        URI uri = uriComponentsBuilder.path("/topico/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(topicoMapper.beanToDto(topico));
    }
}
