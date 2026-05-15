import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso Java QA");
        curso1.setDescricao("Desenvolvimento Java para QA");
        curso1.setCargaHoraria(7);

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java para QA");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);
    }
}