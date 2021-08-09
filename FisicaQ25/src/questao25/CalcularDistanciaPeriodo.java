package questao25;

import javax.swing.JOptionPane;

public class CalcularDistanciaPeriodo {
	private double k;
	private double m;
	private double o;
	private double comprimento;
	private double g = 9.8;
	
	public CalcularDistanciaPeriodo(double k, double m, double o, double comprimento) {
		this.k = k;
		this.m = m;
		this.o = o;
		this.comprimento = comprimento;
		
		calcular();
	}

	public void calcular(){
		double x,dt,px; //Atributos dt
		double t, calc;//Atributos p
		
		/* Calcular Distancia Total*/
		px = m * Math.sin(o);		
		x = px/ k;
		dt = comprimento + x;	
		//System.out.println(x);
		
		/* Calcular Periodo*/
		calc = (m/g)/k;
		t = 2 * Math.PI * Math.sqrt(calc);
		
		/*Resultados*/
		JOptionPane.showMessageDialog(null, "**************** Resultados ****************\n" 
											+ "Distância Total: " + dt + " m\n" 
											+ "Periodo: " + t + " s");
	}

	public void setK(double k) {
		this.k = k;
	}

	public void setM(double m) {
		this.m = m;
	}

	public void setO(double o) {
		this.o = o;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	
	
}
