package questao25;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaQ25 extends JFrame{
	private JButton calcularButton;
	private JLabel calcDtEPeriodo,kLabel, mLabel,comprimentoLabel,anguloLabel;
	private JTextField kField, mField,comprimentoFiled,anguloFild;
	
	public TelaQ25(){
		setSize(250,200);
		setResizable(false);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		calcDtEPeriodo = new JLabel("*Calcular Distância Total e Periodo*");
		kLabel = new JLabel("Constante Elástica:");
		kField = new JTextField(10);
		mLabel = new JLabel("Massa do Bloco:");
		mField = new JTextField(11);
		comprimentoLabel = new JLabel("Comprimento:");
		comprimentoFiled = new JTextField(12);
		anguloLabel = new JLabel("Ângulo:");
		anguloFild = new JTextField(15);
		calcularButton = new JButton("Calcular");
		
		add(calcDtEPeriodo);
		add(kLabel);
		add(kField);
		add(mLabel);
		add(mField);
		add(comprimentoLabel);
		add(comprimentoFiled);
		add(anguloLabel);
		add(anguloFild);
		add(calcularButton);
		
		setVisible(true);	
	}

	public JButton getCalcularButton() {
		return calcularButton;
	}

	public void setCalcularButton(JButton calcularButton) {
		this.calcularButton = calcularButton;
	}

	public JLabel getCalcDtEPeriodo() {
		return calcDtEPeriodo;
	}

	public void setCalcDtEPeriodo(JLabel calcDtEPeriodo) {
		this.calcDtEPeriodo = calcDtEPeriodo;
	}

	public JLabel getkLabel() {
		return kLabel;
	}

	public void setkLabel(JLabel kLabel) {
		this.kLabel = kLabel;
	}

	public JLabel getmLabel() {
		return mLabel;
	}

	public void setmLabel(JLabel mLabel) {
		this.mLabel = mLabel;
	}

	public JLabel getComprimentoLabel() {
		return comprimentoLabel;
	}

	public void setComprimentoLabel(JLabel comprimentoLabel) {
		this.comprimentoLabel = comprimentoLabel;
	}

	public JLabel getAnguloLabel() {
		return anguloLabel;
	}

	public void setAnguloLabel(JLabel anguloLabel) {
		this.anguloLabel = anguloLabel;
	}

	public JTextField getkField() {
		return kField;
	}

	public void setkField(JTextField kField) {
		this.kField = kField;
	}

	public JTextField getmField() {
		return mField;
	}

	public void setmField(JTextField mField) {
		this.mField = mField;
	}

	public JTextField getComprimentoFiled() {
		return comprimentoFiled;
	}

	public void setComprimentoFiled(JTextField comprimentoFiled) {
		this.comprimentoFiled = comprimentoFiled;
	}

	public JTextField getAnguloFild() {
		return anguloFild;
	}

	public void setAnguloFild(JTextField anguloFild) {
		this.anguloFild = anguloFild;
	}
	
	
}
