package br.com.dio.desafio.dominio;

import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Data
public class Dev
{
   private String nome;
   private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
   private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

   public void inscreverBootcamp(Bootcamp bootcamp)
   {
      this.conteudosIncritos.addAll(bootcamp.getConteudos());
      bootcamp.getDevsInscritos().add(this);
   }

   public void progredir()
   {
      Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
      if (conteudo.isPresent())
      {
         this.conteudosConcluidos.add(conteudo.get());
         this.conteudosIncritos.remove(conteudo.get());
      } else
      {
         System.err.println("Você não está matriculado em nenhum conteúdo!");
      }
   }

   public double calcularTotalXp()
   {
      return this.conteudosConcluidos
              .stream()
              .mapToDouble(conteudo -> conteudo.calcularXp())
              .sum();
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;
      Dev dev = (Dev) o;
      return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIncritos, dev.conteudosIncritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(nome, conteudosIncritos, conteudosConcluidos);
   }

}
