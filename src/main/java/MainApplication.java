import dominio.BootCamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class MainApplication {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Eletronica", "Curso de eletronica básica", 56.0);
        Curso curso2 = new Curso("Eletrotecnica", "Curso de eletricidade básica", 56.0);
        Mentoria mentoria1 = new Mentoria("Mentoria de eletrica", "Mentoria para area de eletroeletronica",
                LocalDate.now());

        BootCamp bootcamp1 = new BootCamp();
        bootcamp1.setNome("Boot Camp Developer");
        bootcamp1.setDescricao("Instruções de eletricidade");
        bootcamp1.getConteudo().add(curso1);
        bootcamp1.getConteudo().add(curso2);
        bootcamp1.getConteudo().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Hmjussani");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Cursos inscritos: " + dev1.getConteudoInscrito());
        System.out.println("XP atual: " + dev1.calculaTotalXp());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Cursos inscritos: " + dev1.getConteudoInscrito());
        System.out.println("Cursos concluidos: " + dev1.getConteudoConcluido());


    }
}
