package controleAcademico.entidades;

public class Aluno extends Pessoa {
	private String matricula;

	public Aluno(String cpf, String nome, String telefone, String email, String matricula) {
		super(cpf, nome, telefone, email);
		this.matricula = matricula;

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
