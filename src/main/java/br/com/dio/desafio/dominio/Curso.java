package br.com.dio.desafio.dominio;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Curso
{
    private String titulo;
    private String descricao;
    private int cargaHora;
}
