package entities;

public class AulaNoventaENoveEmpregado {
	private Integer id;
	private String  nome;
	private Double  salario;
	
	public AulaNoventaENoveEmpregado(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void aumentoSalarial(double porcentagem) {
		this.salario += salario * porcentagem / 100.0;
	}
	
	public String toString() {
		return getId()
				+ ", "
				+ getNome()
				+ ", "
				+ String.format("%.2f", getSalario());
	}
	
}
