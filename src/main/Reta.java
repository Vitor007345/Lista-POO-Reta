package main;

public class Reta {
	private double m;
	private double b;
	private Ponto2D[] pontos;
	
	private int numPontos;
	
	//constructors
	public Reta() {
		this(0, 0);
	}
	
	public Reta(double m, double b) {
		this.setM(m);
		this.setB(b);
		this.pontos = new Ponto2D[7];
		this.numPontos = 0;
	}
	

	//setters
	void setM(double m) {
		this.m = m;
	}
	void setB(double b) {
		this.b = b;
	}
	
	//getters
	
	double getM() { return this.m;}
	double getB() { return this.b;}
	double getNumPontos() { return this.numPontos;}
	
	//methods
	
	public boolean pontoEstaNaReta(Ponto2D ponto) {
		return (this.m * ponto.getX() + this.b) == ponto.getY();
	}
	
	public Ponto2D calcularPonto(double x) {
		double y = (this.m * x) + this.b;
		return new Ponto2D(x, y);
	}
	
	public boolean adicionarPonto(Ponto2D ponto) {
		if(this.pontoEstaNaReta(ponto) && this.numPontos < 7) {
			this.pontos[this.numPontos] = ponto;
			this.numPontos++;
			return true;
		}
		return false;
	}
	
	
	/*
	public boolean removerPonto(Ponto2D ponto) {
		if(this.pontoEstaNaReta(ponto) && )
		return false;
	}
	*/
	
	
	
	
}
