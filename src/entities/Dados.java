package entities;

public class Dados{
	private Double a, b, c;

	public Dados(Double a, Double b, Double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Double calculoDelta(){
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public Double calculoX1(){
		return (-(b) + Math.sqrt(calculoDelta())) / (2 * a);
	}

	public Double calculoX2(){
		return (-(b) - Math.sqrt(calculoDelta())) / (2 * a);
	}
	
	public String toString(){
		return "DELTA = " + String.format("%.2f", calculoDelta()) + "\n" + "X' = " + String.format("%.2f", calculoX1()) + "\n" + "X'' = " + String.format("%.2f", calculoX2());
	}
}