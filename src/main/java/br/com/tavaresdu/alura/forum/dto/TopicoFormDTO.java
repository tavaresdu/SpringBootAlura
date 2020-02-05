package br.com.tavaresdu.alura.forum.dto;

import lombok.Data;

@Data
public class TopicoFormDTO {
    private String titulo;
    private String mensagem;
    private String cursoNome;
}
