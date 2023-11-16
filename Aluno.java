public class Aluno extends Pessoa {
    private double notas;
    private Curso curso;

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public double getNotas() {
        return notas;
    }

    public void imprimir() {
        System.out.println("Aluno: " + getNome() + ", Notas: " + getNotas() + ", Curso: " + curso.getNome());
    }
}
