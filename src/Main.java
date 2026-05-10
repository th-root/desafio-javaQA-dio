import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Curso Java QA");
        curso1.setDescricao("Desenvolvimento Java para QA");
        curso1.setCargaHoraria(7);

        System.out.println(curso1);

    }
}