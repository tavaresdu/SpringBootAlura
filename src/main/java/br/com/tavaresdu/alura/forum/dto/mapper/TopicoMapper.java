package br.com.tavaresdu.alura.forum.dto.mapper;

import br.com.tavaresdu.alura.forum.dto.TopicoDTO;
import br.com.tavaresdu.alura.forum.dto.TopicoFormDTO;
import br.com.tavaresdu.alura.forum.dto.TopicoQueryDTO;
import br.com.tavaresdu.alura.forum.model.Topico;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TopicoMapper {
    TopicoDTO beanToDto(Topico bean);
    List<TopicoDTO> beanListToDtoList(List<Topico> beanList);
    Topico formDtoToBean(TopicoFormDTO formDTO);
    Topico queryDtoToBean(TopicoQueryDTO queryDTO);
}
