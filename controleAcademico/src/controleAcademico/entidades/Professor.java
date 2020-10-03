package controleAcademico.entidades;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

	private List<Turma> turmas;

	public Professor(String cpf, String nome, String telefone, String email) {
		super(cpf, nome, telefone, email);
		this.turmas = new ArrayList<>();
	}

	public void adicionarTurma(Turma turma) {
		turmas.add(turma);

	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

}
