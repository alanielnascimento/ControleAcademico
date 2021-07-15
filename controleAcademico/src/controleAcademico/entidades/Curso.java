package controleAcademico.entidades;

public class Curso {

	private String nomeCurso;

	public Curso(String nomeCurso) {
		super();
		this.nomeCurso = nomeCurso;
	}

	public String getNome() {
		return nomeCurso;
	}

	public void setNome(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

}
