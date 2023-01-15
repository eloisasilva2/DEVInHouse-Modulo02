package com.clamed.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class GrupoInput {
    private Long id;

    private String nome;

    private String descricao;
}
