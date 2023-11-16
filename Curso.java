import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private final List<Professor> professores = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addProfessores(Professor professor) {
        professores.add(professor);
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void imprimirCurso() {
        System.out.println("Curso: " + getNome());
    }
}
