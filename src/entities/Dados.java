package entities;

import exceptions.DomainException;

public class Dados{
	private Double a, b, c;
	private Double delta;

	public Dados(Double a, Double b, Double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Double calculoDelta(){
		delta = Math.pow(b, 2) - 4 * a * c;
		if (delta <= 0) {
			throw new DomainException ("Não existe raiz real para Delta");
		} else {
			return delta;
		}
	}
	
	public Double calculoX1(){
		return (-(b) + Math.sqrt(calculoDelta())) / (2 * a);
	}

	public Double calculoX2(){
		return (-(b) - Math.sqrt(calculoDelta())) / (2 * a);
	}
}