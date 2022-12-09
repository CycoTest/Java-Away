package quiz3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ButtonMaker {
	private Button[] btn = new Button[17];
	private char[] operator = { 43, 45, 42, 47 }; // +, -, *, /
	private char[] equal = {61}; // =
	private char[] number;
	private char[] exectra = { 46, 67, 66 }; // ., c, backspace
	
	private void ButtonMaking() {
		this.btn = new Button[18];
		numberSymbol();
		for (int i=0; i<number.length; i++) {
			btn[i] = new Button(String.valueOf(number[i]));
		}

		for (int i=10; i<operator.length+10; i++) {
			btn[i] = new Button(Character.toString(operator[i-10]));
		}
		
		btn[14] = new Button(Character.toString(equal[0]));

		for (int i=15; i<exectra.length+15; i++) {
			btn[i] = new Button(String.valueOf(exectra[i-15]));
		}
	}
	
	private char[] numberSymbol() {
		this.number = new char[10];
		for (int i=0; i<number.length; i++) {
			number[i] = (char) (48+i);
		}
		return number;
	}
	
	public int getNumber() {
		numberSymbol();
		return number.length;
	}
	
	public int getExectra() {
		return exectra.length;
	}
	
	public Button[] getButtonMaking() {
		ButtonMaking();
		return btn;
	}
}

class Operator {
	private double result = 0;
	private Label disp = new Label("0.", Label.RIGHT);
	private Button[] btn;
	
	public void eachOffer() {
		ButtonMaker operator = new ButtonMaker();
		btn = operator.getButtonMaking();
		
		double value = Double.parseDouble(disp.getText());
		
		for (int i=0;;) {
			if (btn[i].toString() == "+") {
				result = result + value;
				break;
			} else if (btn[i].toString() == "-") {
				result = result - value;
				break;
			} else if (btn[i].toString() == "*") {
				result = result * value;
				break;
			} else if (btn[i].toString() == "/") {
				result = result / value;
				break;
			}
		}
		
		

		double val = result - (int) result;
		if (val > 0) {
			disp.setText(String.valueOf(result));
		} else {
			disp.setText(String.valueOf((int) result) + ".");
		}

	}
}

class Cal_Function extends WindowAdapter implements ActionListener{
	private Frame frame;
	private Panel outsidePanel;
	private Panel insidePanel1;
	private Panel insidePanel2;
	private Button[] btn;
	private Font font;
	private TextField text;
	
	public Cal_Function() {
		frame = new Frame("Basic Calculator");
		outsidePanel = new Panel();
		insidePanel1 = new Panel();
		insidePanel2 = new Panel();
		btn = new Button[17];
		font = new Font(null, Font.BOLD, 30);
		text = new TextField();
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void startFrame() {
		frame.addWindowListener(this);
		frame.setResizable(true);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		
		frame.add(outsidePanel, BorderLayout.CENTER);
		outsidePanel.setLayout(new GridLayout(2, 1));
		outsidePanel.add(insidePanel1);
		outsidePanel.add(insidePanel2);
		
		
		insidePanel1.setLayout(new GridLayout(1, 1));
		insidePanel1.setSize(500, 100);
		insidePanel1.add(text);
		
		insidePanel2.setLayout(new GridLayout(4, 5));
		insidePanel2.setSize(500, 400);
		ButtonMaker btnDiffer = new ButtonMaker();
		this.btn = btnDiffer.getButtonMaking();
		for (int i=0; i<btn.length; i++ ) {
			btn[i].setFont(font);
			insidePanel2.add(btn[i]);
		}
		
		for (int i=0; i<btnDiffer.getNumber(); i++) {
			btn[i].setBackground(Color.lightGray);
		}
		

		
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String screenPrint = e.getActionCommand();
		System.out.println();
		
		if (Character.isDigit(screenPrint.charAt(0))) {
			String numberPosition = text.getText() + screenPrint;
			text.setText(numberPosition);
		}
	}
}

public class Calculator {
	public static void main(String[] args) {
		Cal_Function four = new Cal_Function();
		
		four.startFrame();
	}
}
