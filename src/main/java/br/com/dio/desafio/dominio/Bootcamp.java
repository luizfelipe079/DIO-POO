package br.com.dio.desafio.dominio;

import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Data
public class Bootcamp
{
    private String nome;
    private String descricao;
    private final LocalDate dataIni = LocalDate.now();
    private final LocalDate dataFinal = dataIni.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataIni, bootcamp.dataIni) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nome, descricao, dataIni, dataFinal, devsInscritos, conteudos);
    }

}
