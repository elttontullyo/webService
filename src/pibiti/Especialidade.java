package pibiti;

public class Especialidade {
	
	private int id;
	private String especialidade;
	private String posicao;
	
	public Especialidade() {
		// TODO Auto-generated constructor stub
	}

	public Especialidade(int id, String especialidade, String posicao) {
		super();
		this.id = id;
		this.especialidade = especialidade;
		this.posicao = posicao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	

}
