import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devHarri = new Dev();
        devHarri.setNome("Harrison");
        devHarri.inscreverBootcamp(bootCamp);
        println(devHarri.getConteudosInscritos());
        devHarri.progredir();
        devHarri.progredir();
        println("-----------------------------------");
        println(devHarri.getConteudosInscritos());
        println(devHarri.getConteudosConcluidos());
        println(devHarri.calcularTotalXp());
        println("-----------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootCamp);
        println(devJoao.getConteudosInscritos());
        println("-----------------------------------");

        devJoao.progredir();
        println(devJoao.getConteudosInscritos());
        println(devJoao.getConteudosConcluidos());
        println(devJoao.calcularTotalXp());




//        println(curso1);
//        println(mentoria);
    }

    public static void println(Object object) {
        System.out.println(object);
    }
}