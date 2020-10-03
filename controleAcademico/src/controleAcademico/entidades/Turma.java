package controleAcademico.entidades;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private int ano;
	private int semestre;
	private String disciplina;
	private Curso curso;
	private Professor professor;
	private List<Aluno> alunos;

	public Turma(int ano, int semestre, String disciplina, Curso curso, Professor professor) {
		super();
		this.ano = ano;
		this.semestre = semestre;
		this.disciplina = disciplina;
		this.curso = curso;
		this.professor = professor;
		this.alunos = new ArrayList<>();
	}

	public void matricular(Aluno aluno) {
		alunos.add(aluno);

	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
