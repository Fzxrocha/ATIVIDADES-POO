import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private final  List<Aluno> alunos = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();
    private final List<Professor> professores = new ArrayList<>();

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }
}
