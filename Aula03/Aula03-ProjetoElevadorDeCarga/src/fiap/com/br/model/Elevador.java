package fiap.com.br.model;

public class Elevador {
	private int id;
	private double cargaMaxima;
	private double cargaAtual;
	private boolean sinalAlerta;

	public Elevador(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
		this.cargaAtual = 0;
		this.sinalAlerta = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public double getCargaAtual() {
		return cargaAtual;
	}

	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}

	public boolean isSinalAlerta() {
		return sinalAlerta;
	}

	public void isSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}

	public double entrarNoelevador(double peso) {
		Calculadora calculadora = new Calculadora();
		return cargaAtual = calculadora.soma(cargaAtual, peso);
	}

	public double sairDoelevador(double peso) {
		Calculadora calculadora = new Calculadora();
		return cargaAtual = calculadora.subtracao(cargaAtual, peso);
	}

	public boolean avaliarpeso(double peso) {
		return sinalAlerta = cargaMaxima > cargaAtual + peso;
	}
}
