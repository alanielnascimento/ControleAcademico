package controleAcademico;

import java.util.ArrayList;
import java.util.List;

import controleAcademico.entidades.Aluno;
import controleAcademico.entidades.Curso;
import controleAcademico.entidades.Professor;
import controleAcademico.entidades.Turma;

public class ControleAcademico {

	private List<Aluno> alunos;
	private List<Professor> professores;
	private List<Curso> cursos;
	private List<Turma> turmas;

	public ControleAcademico() {
		super();
		this.alunos = new ArrayList<>();
		this.professores = new ArrayList<>();
		this.cursos = new ArrayList<>();
		this.turmas = new ArrayList<>();
	}

	public void cadastrarCurso(Curso curso) {
		cursos.add(curso);

	}

	public void cadastrarProfessor(Professor professor) {
		professores.add(professor);

	}

	public void cadastrarTurma(int ano, int semestre, String disciplina, String nomeCurso, String cpfProfessor) {
		// Procurar o curso pelo nome
		Curso curso = null;
		for (Curso c : cursos) {
			if (c.getNome().equals(nomeCurso)) {
				// achei o curso
				curso = c;
				break;
			}
		}
		// Procurar o professor pelo cpf
		Professor professor = null;
		for (Professor p : professores) {
			if (p.getCpf().equals(cpfProfessor)) {
				// achei o professor
				professor = p;
				break;
			}
		}
		// Criar Turma
		Turma t1 = new Turma(2020, 2, "Programação II", curso, professor);
		Turma t2 = new Turma(2020, 2, "Programação I", curso, professor);
		// Adicionar Turma na lista
		turmas.add(t1);
		turmas.add(t2);

	}

	public void matricularAluno(Aluno aluno, int ano, int semestre, String disciplina, String nomeCurso) {
		Turma turma = procurarTurma(ano, semestre, disciplina, nomeCurso);
		// Adicionar o aluno na turma
		turma.matricular(aluno);
		// Adicionar o aluno no controle academico
		if (!alunos.contains(aluno)) { // Só add se ele ainda não estiver na lista
			alunos.add(aluno);
		}

	}

	public List<Aluno> getTodosOsAlunos() {
		return alunos;

	}

	public List<Aluno> getTodosOsAlunosDaTurma(int ano, int semestre, String disciplina, String nomeCurso) {
		Turma turma = procurarTurma(ano, semestre, disciplina, nomeCurso);
		return turma.getAlunos();

	}

	public Professor getProfessorDaTurma(int ano, int semestre, String disciplina, String nomeCurso) {
		// Procurar a turma
		Turma turma = procurarTurma(ano, semestre, disciplina, nomeCurso);

		return turma.getProfessor();

	}

	private Turma procurarTurma(int ano, int semestre, String disciplina, String nomeCurso) {
		Turma turma = null;
		for (Turma tu : turmas) {
			if (tu.getAno() == ano && tu.getSemestre() == semestre && tu.getDisciplina() == disciplina
					&& tu.getCurso().getNome().equals(nomeCurso)) {
				turma = tu;
				break;
			}
		}
		return turma;
	}

	public static void main(String[] args) {
		ControleAcademico Faculdade = new ControleAcademico();

		Curso s1 = new Curso("Sistemas de Informação");
		Professor p1 = new Professor("20202", "Bruno Catão", "3333-3333", "brunocatao@professor.com");
		Professor p2 = new Professor("20201", "Jemão", "4444-3333", "jemao@professor.com");
		Aluno a1 = new Aluno("00000", "Jax", "0000-0001", "jax@aluno.com", "001");
		Aluno a2 = new Aluno("11111", "Mônica", "0000-0011", "monica@aluno.com", "002");
		Aluno a3 = new Aluno("22222", "Mário", "0000-0111", "mario@aluno.com", "003");
		Aluno a4 = new Aluno("33333", "Magali", "0000-1111", "magali@aluno.com", "004");
		Aluno a5 = new Aluno("44444", "João", "0000-0000", "joao@aluno.com", "005");
		Aluno a6 = new Aluno("55555", "Maria", "1111-1111", "maria@aluno.com", "006");

		Faculdade.cadastrarCurso(s1);

		Faculdade.cadastrarProfessor(p1);
		Faculdade.cadastrarProfessor(p2);

		Faculdade.cadastrarTurma(2020, 2, "Programação II", "Sistemas de Informação", "20202");

		Faculdade.matricularAluno(a1, 2020, 2, "Programação II", "Sistemas de Informação");
		Faculdade.matricularAluno(a2, 2020, 2, "Programação II", "Sistemas de Informação");
		Faculdade.matricularAluno(a3, 2020, 2, "Programação II", "Sistemas de Informação");
		Faculdade.matricularAluno(a4, 2020, 2, "Programação II", "Sistemas de Informação");
		Faculdade.matricularAluno(a5, 2020, 2, "Programação II", "Sistemas de Informação");
		Faculdade.matricularAluno(a6, 2020, 2, "Programação II", "Sistemas de Informação");

		for (Aluno a : Faculdade.getTodosOsAlunosDaTurma(2020, 2, "Programação II", "Sistemas de Informação")) {
			System.out.println(a.getNome());
		}

	}

}
