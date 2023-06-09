import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.Instant;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrisção curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrisção curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devBarbara = new Dev();
        devBarbara.setNome("Barbara");
        devBarbara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Barbara" + devBarbara.getConteudosInscritos());
        devBarbara.progredir();
        devBarbara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Barbara" + devBarbara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Barbara" + devBarbara.getConteudosConcluidos());
        System.out.println("XP:" + devBarbara.calcularTotalX());


        System.out.println("----------");

        Dev devJonh = new Dev();
        devJonh.setNome("Jonh");
        devJonh.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos John" + devJonh.getConteudosInscritos());
        devJonh.progredir();
        devJonh.progredir();
        devJonh.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos John" + devJonh.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos John" + devJonh.getConteudosConcluidos());
        System.out.println("XP:" + devJonh.calcularTotalX());
    }


}
