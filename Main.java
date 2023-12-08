public class Main {
    public static void main(String[] args) {
        
        telefone telefoneAluno = new telefone();
        telefoneAluno.setTipo("Celular");
        telefoneAluno.setDdd("55");
        telefoneAluno.setNumero("123456789");

        Endereco enderecoAluno = new Endereco();
        enderecoAluno.setRua("Rua A");
        enderecoAluno.setCidade("Cidade X");
        enderecoAluno.setEstado("Estado Y");

        Aluno aluno = new Aluno();
        aluno.setNome("Joao");
        aluno.setCpf("123.456.789-01");
        aluno.setEmail("joao@gmail.com");
        aluno.addTelefone(telefoneAluno);
        aluno.setEndereco(enderecoAluno);

        Curso curso = new Curso();
        curso.setNome("Engenharia de Software");

        Professor professor = new Professor();
        professor.setNome("Doutor Silva");
        professor.setTitulacao("Doutorado");
        professor.setSalario(5000.00);
        professor.addCursos(curso);

        
        aluno.setCurso(curso);

        Disciplina disciplina = new Disciplina();
        disciplina.addAluno(aluno);
        disciplina.addCurso(curso);
        disciplina.addProfessor(professor);

        
        aluno.imprimir();
        curso.imprimirCurso();
        professor.imprimir();
        
        
      
    }
}
