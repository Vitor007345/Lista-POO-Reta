package main;

public class Reta {
	private double m;
	private double b;
	private Ponto2D[] pontos;
	
	private int numPontos;
	private int pontosTam;
	
	//constructors
	public Reta() {
		this(0, 0);
	}
	
	public Reta(double m, double b) {
		this(m, b, 7);
	}
	
	public Reta(double m, double b, int pontosTam) {
		this.setM(m);
		this.setB(b);
		this.pontos = new Ponto2D[pontosTam];
		this.pontosTam = pontosTam;
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
		if(this.pontoEstaNaReta(ponto) && this.numPontos < this.pontosTam) {
			this.pontos[this.numPontos] = ponto;
			this.numPontos++;
			return true;
		}
		return false;
	}
	
	
	private void shiftPonto(int pos) {
		for(int i = pos; i < this.numPontos - 1; i++) {
			this.pontos[i] = this.pontos[i + 1];
		}
		this.pontos[this.numPontos - 1] = null;
		this.numPontos--;
		
	}
	
	
	public boolean removerPonto(Ponto2D ponto) {
		if(this.pontoEstaNaReta(ponto)) {
			boolean achou = false;
			int i = 0;
			while(!achou && i < this.numPontos) {
				if(this.pontos[i].getId() == ponto.getId()) {
					achou = true;
					this.shiftPonto(i);
				}
				i++;
			}
			return achou;
		}
		return false;
	}
	
	public String stringfyPontos() {
		String pontosStr = "";
		for(Ponto2D ponto : this.pontos) {
			pontosStr += ponto.toString() + " ";
		}
		return pontosStr;
	}
	
	
	
	
}
