package br.com.dio.desafio.dominio;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Mentoria
{
    private String titulo;
    private String descricao;
    private LocalDate data;
}
