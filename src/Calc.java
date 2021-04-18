import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class Calc implements ActionListener{
	JFrame jf;
	JLabel displayLabel;
	JButton oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn,sevenBtn, eightBtn, nineBtn, zeroBtn;
	JButton divBtn, mulBtn, subBtn, addBtn, equalBtn, clrBtn, dotBtn;
	static int operatorSwitch = 0;
	static float a=0, b=0, result=0;
	
	public Calc() {
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(400, 600);
		jf.setVisible(true);
		jf.setLocation(1100, 120);
		jf.getContentPane().setBackground(Color.DARK_GRAY);
		
		displayLabel = new JLabel(); 
		displayLabel.setBounds(30, 50, 330, 50);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		
		jf.add(displayLabel);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		
		oneBtn = new JButton("1");
		twoBtn = new JButton("2");
		threeBtn = new JButton("3");
		fourBtn = new JButton("4");
		fiveBtn = new JButton("5");
		sixBtn = new JButton("6");
		sevenBtn = new JButton("7");
		eightBtn = new JButton("8");
		nineBtn = new JButton("9");
		zeroBtn = new JButton("0");
		dotBtn = new JButton(".");
		divBtn = new JButton("/");
		mulBtn = new JButton("x");
		subBtn = new JButton("-");
		addBtn = new JButton("+");
		equalBtn = new JButton("=");
		clrBtn = new JButton("Clear");
		
		
		sevenBtn.setBounds(30, 120, 70, 70);
		sevenBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(sevenBtn);
		sevenBtn.addActionListener(this);
		
		eightBtn.setBounds(120, 120, 70, 70);
		eightBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(eightBtn);
		eightBtn.addActionListener(this);

		nineBtn.setBounds(210, 120, 70, 70);
		nineBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(nineBtn);
		nineBtn.addActionListener(this);
		
		divBtn.setBounds(300, 120, 70, 70);
		divBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(divBtn);
		divBtn.addActionListener(this);
		
		fourBtn.setBounds(30, 220, 70, 70);
		fourBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(fourBtn);
		fourBtn.addActionListener(this);
		
		fiveBtn.setBounds(120, 220, 70, 70);
		fiveBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(fiveBtn);
		fiveBtn.addActionListener(this);
		
		sixBtn.setBounds(210, 220, 70, 70);
		sixBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(sixBtn);
		sixBtn.addActionListener(this);
		
		mulBtn.setBounds(300, 220, 70, 70);
		mulBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(mulBtn);
		mulBtn.addActionListener(this);
		
		oneBtn.setBounds(30, 320, 70, 70);
		oneBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(oneBtn);
		oneBtn.addActionListener(this);
		
		twoBtn.setBounds(120, 320, 70, 70);
		twoBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(twoBtn);
		twoBtn.addActionListener(this);
		
		threeBtn.setBounds(210, 320, 70, 70);
		threeBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(threeBtn);
		threeBtn.addActionListener(this);
		
		subBtn.setBounds(300, 320, 70, 70);
		subBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(subBtn);
		subBtn.addActionListener(this);
		
		dotBtn.setBounds(30, 420, 70, 70);
		dotBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(dotBtn);
		dotBtn.addActionListener(this);
		
		zeroBtn.setBounds(120, 420, 70, 70);
		zeroBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(zeroBtn);
		zeroBtn.addActionListener(this);
		
		equalBtn.setBounds(210, 420, 70, 70);
		equalBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(equalBtn);
		equalBtn.addActionListener(this);
		
		addBtn.setBounds(300, 420, 70, 70);
		addBtn.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(addBtn);
		addBtn.addActionListener(this);
		
		clrBtn.setBounds(30, 500, 340, 40);
		clrBtn.setFont(new Font("Arial", Font.BOLD, 20));
		jf.add(clrBtn);
		clrBtn.addActionListener(this);
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == oneBtn) {
			displayLabel.setText(displayLabel.getText() + "1");
		}
		
		if(e.getSource() == twoBtn) {
			displayLabel.setText(displayLabel.getText() + "2");
		}
		
		if(e.getSource() == threeBtn) {
			displayLabel.setText(displayLabel.getText() + "3");
		}
		
		if(e.getSource() == fourBtn) {
			displayLabel.setText(displayLabel.getText() + "4");
		}
		
		if(e.getSource() == fiveBtn) {
			displayLabel.setText(displayLabel.getText() + "5");
		}
		
		if(e.getSource() == sixBtn) {
			displayLabel.setText(displayLabel.getText() + "6");
		}
		
		if(e.getSource() == sevenBtn) {
			displayLabel.setText(displayLabel.getText() + "7");
		}
		
		if(e.getSource() == eightBtn) {
			displayLabel.setText(displayLabel.getText() + "8");
		}
		
		if(e.getSource() == nineBtn) {
			displayLabel.setText(displayLabel.getText() + "9");
		}
		
		if(e.getSource() == zeroBtn) {
			displayLabel.setText(displayLabel.getText() + "0");
		}
		
		if(e.getSource() == dotBtn) {
			displayLabel.setText(displayLabel.getText() + ".");
		}
		
		if(e.getSource() == addBtn) {
			a = Float.parseFloat(displayLabel.getText());
			operatorSwitch = 1;
			displayLabel.setText("");
		}
		
		if(e.getSource() == subBtn) {
			a = Float.parseFloat(displayLabel.getText());
			operatorSwitch = 2;
			displayLabel.setText("");
		}
		
		if(e.getSource() == mulBtn) {
			a = Float.parseFloat(displayLabel.getText());
			operatorSwitch = 3;
			displayLabel.setText("");
		}
		
		if(e.getSource() == divBtn) {
			a = Float.parseFloat(displayLabel.getText());
			operatorSwitch = 4;
			displayLabel.setText("");
		}
		
		if(e.getSource() == equalBtn) {
			b = Float.parseFloat(displayLabel.getText());
			switch(operatorSwitch) {
			case 1: result = a+b;
					break;
			case 2: result = a-b;
					break;
			case 3: result = a*b;
					break;
			case 4: result = a/b;
					break;
					
			default: result = 0;
			}
			displayLabel.setText(""+result);
			
		}
		
		if(e.getSource() == clrBtn) {
			displayLabel.setText("");
			}
		
	}
	
	public static void main(String[] args) {
		new Calc();
	}
}