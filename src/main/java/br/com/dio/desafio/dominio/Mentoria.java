package br.com.dio.desafio.dominio;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Mentoria extends Conteudo
{
    private LocalDate data;

    @Override
    public double calcularXp()
    {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString()
    {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

}
