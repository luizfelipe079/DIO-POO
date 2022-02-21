package br.com.dio.desafio.dominio;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Curso extends  Conteudo
{
    private int cargaHora;

    @Override
    public double calcularXp()
    {
        return XP_PADRAO * cargaHora;
    }

    @Override
    public String toString()
    {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHora=" + cargaHora +
                '}';
    }
}
