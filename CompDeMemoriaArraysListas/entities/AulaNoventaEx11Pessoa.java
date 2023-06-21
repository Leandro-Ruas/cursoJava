package entities;

public class AulaNoventaEx11Pessoa {
	private Character genero;
	private Double    altura;
	
	public AulaNoventaEx11Pessoa(Character genero, Double altura) {
		this.genero = genero;
		this.altura = altura;
	}

	public Character getGenero() {
		return genero;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
}
