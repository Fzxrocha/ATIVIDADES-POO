import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private String titulacao;
    private double salario;
    private final List<Curso> cursos = new ArrayList<>();

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void addCursos(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void imprimir() {
        System.out.println("Professor: " + getNome() + ", Titulação: " + getTitulacao() + ", Salário: " + getSalario());
    }
}
