package questao25;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ControlarTelaQ25 {
	
	TelaQ25 telaQ25;

	public ControlarTelaQ25(TelaQ25 telaQ25) {
		this.telaQ25 = telaQ25;
		controlar();
	}
	
	public void controlar(){
		telaQ25.getCalcularButton().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					CalcularDistanciaPeriodo calc = new CalcularDistanciaPeriodo(Double.parseDouble(telaQ25.getkField().getText()),
							Double.parseDouble(telaQ25.getmField().getText()), Double.parseDouble(telaQ25.getAnguloFild().getText()), 
							Double.parseDouble(telaQ25.getComprimentoFiled().getText()));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "ERRO");
				}
				telaQ25.getkField().setText(null);
				telaQ25.getmField().setText(null);
				telaQ25.getAnguloFild().setText(null);
				telaQ25.getComprimentoFiled().setText(null);
				
			}
		});
	}
	
	

}
