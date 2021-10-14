package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class basicCalculator {

	private JFrame frame;
	private JTextField answer_Field;
	String answer = "";
	String firstanswer;
	String secondanswer;
	boolean sum = false;
	boolean subtract = false;
	boolean divide = false;
	boolean multiply = false;
	boolean modulus = false;
	boolean functionEnabled = false;
	boolean extendedequals = false;
	int amountplus = 0;
	String answer_Symbol = "";
	String extendedText = "";
	private JLabel extendanswer_lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					basicCalculator window = new basicCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public basicCalculator() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 385, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton equals_Btn = new JButton("=");
		equals_Btn.setForeground(new Color(255, 255, 255));
		equals_Btn.setBackground(new Color(70, 130, 180));
		equals_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sum == true){					
					secondanswer = answer;
					answer = Float.toString(Float.parseFloat(firstanswer) + Float.parseFloat(secondanswer));
					answer_Field.setText(answer);
					sum = false;
				}else if (subtract == true) {
					secondanswer = answer;
					answer = Float.toString(Float.parseFloat(firstanswer) - Float.parseFloat(secondanswer));
					answer_Field.setText(answer);
					subtract = false;
				}else if (multiply == true) {
					secondanswer = answer;
					answer = Float.toString(Float.parseFloat(firstanswer) * Float.parseFloat(secondanswer));
					answer_Field.setText(answer);
					multiply = false;
				}else if (divide == true) {
					secondanswer = answer;
					answer = Float.toString(Float.parseFloat(firstanswer) / Float.parseFloat(secondanswer));
					answer_Field.setText(answer);
					divide = false;
				}else if (modulus == true){
					secondanswer = answer;
					answer = Float.toString(Float.parseFloat(firstanswer) % Float.parseFloat(secondanswer));
					answer_Field.setText(answer);
				}
				
				extendedText += " = ";
				extendanswer_lbl.setText(extendedText);
				extendedequals = true;
			}
		});
		equals_Btn.setBounds(290, 450, 70, 50);
		frame.getContentPane().add(equals_Btn);
		
		JButton plus_Btn = new JButton("+");
		plus_Btn.setBackground(Color.LIGHT_GRAY);
		plus_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer_Symbol += answer + " + ";
				extendedText += " + ";
				//if (extendedequals == true) {extendedText = answer + " + "; extendedequals = false;}
				//else { extendedText += " + ";}
				extendanswer_lbl.setText(extendedText);

			   
				firstanswer = answer;
				answer = "";
				//answer_Field.setText("");
				if ((sum == true)&&(amountplus > 0))
				{
				secondanswer = answer_Field.getText();
				System.out.println(secondanswer);
				
				answer += Integer.toString(Integer.parseInt(firstanswer) + Integer.parseInt(secondanswer));
				answer_Field.setText(answer);
				//answer = "";
				sum = false;
				}
				//sum = false;
				if (amountplus ==0)
				{
					sum = true;
					amountplus++;
				}
				

				
			}
		});
		plus_Btn.setBounds(290, 400, 70, 50);
		frame.getContentPane().add(plus_Btn);
		
		JButton minus_Btn = new JButton("-");
		minus_Btn.setBackground(Color.LIGHT_GRAY);
		minus_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 sum= false;subtract=false;multiply=false;divide=false;
				firstanswer = answer;
				answer = "";
				extendedText += " - ";
				extendanswer_lbl.setText(extendedText);
				subtract = true;
			}
		});
		minus_Btn.setBounds(290, 350, 70, 60);
		frame.getContentPane().add(minus_Btn);
		
		JButton multiply_Btn = new JButton("x");
		multiply_Btn.setBackground(Color.LIGHT_GRAY);
		multiply_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum= false;subtract=false;multiply=false;divide=false;
				firstanswer = answer;
				answer = "";
				extendedText += " x ";
				extendanswer_lbl.setText(extendedText);
				multiply = true;
			}
		});
		multiply_Btn.setBounds(290, 300, 70, 50);
		frame.getContentPane().add(multiply_Btn);
		
		JButton division_Btn = new JButton("\u00F7");
		division_Btn.setBackground(Color.LIGHT_GRAY);
		division_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum= false;subtract=false;multiply=false;divide=false;
				firstanswer = answer;
				answer = "";
				extendedText += " / ";
				extendanswer_lbl.setText(extendedText);
				divide = true;
				
			}
		});
		division_Btn.setBounds(290, 250, 70, 50);
		frame.getContentPane().add(division_Btn);
		
		JButton plusminus_Btn = new JButton("+ / -");
		plusminus_Btn.setBackground(Color.WHITE);
		plusminus_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(answer) > 0)
				{
					answer = "-" + answer;
				}else{
					answer = Integer.toString(Math.abs(Integer.parseInt(answer)));

				}
				answer_Field.setText(answer);
			}
		});
		plusminus_Btn.setBounds(220, 450, 70, 50);
		frame.getContentPane().add(plusminus_Btn);
		
		JButton three_Btn = new JButton("3");
		three_Btn.setBackground(Color.WHITE);
		three_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (functionEnabled == true) clearFunction();
				notANumber(answer);
				answer += "3";
				answer_Field.setText(answer);
				extendedText += "3";
				extendanswer_lbl.setText(extendedText);
			}
		});
		three_Btn.setBounds(220, 400, 70, 50);
		frame.getContentPane().add(three_Btn);
		
		JButton six_Btn = new JButton("6");
		six_Btn.setBackground(Color.WHITE);
		six_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (functionEnabled == true) clearFunction();
				notANumber(answer);
				answer += "6";
				answer_Field.setText(answer);
				extendedText += "6";
				extendanswer_lbl.setText(extendedText);
			}
		});
		six_Btn.setBounds(220, 350, 70, 50);
		frame.getContentPane().add(six_Btn);
		
		JButton nine_Btn = new JButton("9");
		nine_Btn.setBackground(Color.WHITE);
		nine_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (functionEnabled == true) clearFunction();
				notANumber(answer);
				answer += "9";
				answer_Field.setText(answer);
				extendedText += "9";
				extendanswer_lbl.setText(extendedText);
			}
		});
		nine_Btn.setBounds(220, 300, 70, 50);
		frame.getContentPane().add(nine_Btn);
		
		JButton decimal_Btn = new JButton(".");
		decimal_Btn.setBackground(Color.WHITE);
		decimal_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (functionEnabled == true) clearFunction();
				if (Double.parseDouble(answer) % 1 == 0){
					answer += ".";
					answer_Field.setText(answer);
				}
				extendedText += ".";
				extendanswer_lbl.setText(extendedText);
				
			}
		});
		decimal_Btn.setBounds(150, 450, 70, 50);
		frame.getContentPane().add(decimal_Btn);
		
		JButton two_Btn = new JButton("2");
		two_Btn.setBackground(Color.WHITE);
		two_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (functionEnabled == true) clearFunction();
				notANumber(answer);
				answer += "2";
				answer_Field.setText(answer);
				extendedText += "2";
				extendanswer_lbl.setText(extendedText);
			}
		});
		two_Btn.setBounds(150, 400, 70, 50);
		frame.getContentPane().add(two_Btn);
		
		JButton five_Btn = new JButton("5");
		five_Btn.setBackground(Color.WHITE);
		five_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (functionEnabled == true) clearFunction();
				notANumber(answer);
				answer += "5";
				answer_Field.setText(answer);
				extendedText += "5";
				extendanswer_lbl.setText(extendedText);
			}
		});
		five_Btn.setBounds(150, 350, 70, 50);
		frame.getContentPane().add(five_Btn);
		
		JButton eight_Btn = new JButton("8");
		eight_Btn.setBackground(Color.WHITE);
		eight_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (functionEnabled == true) clearFunction();
				notANumber(answer);
				answer += "8";
				answer_Field.setText(answer);
				extendedText += "8";
				extendanswer_lbl.setText(extendedText);
			}
		});
		eight_Btn.setBounds(150, 300, 70, 50);
		frame.getContentPane().add(eight_Btn);
		
		JButton zero_Btn = new JButton("0");
		zero_Btn.setBackground(Color.WHITE);
		zero_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (functionEnabled == true) clearFunction();
				notANumber(answer);
				answer += "0";
				answer_Field.setText(answer);
				extendedText += "0";
				extendanswer_lbl.setText(extendedText);
			}
		});
		zero_Btn.setBounds(80, 450, 70, 50);
		frame.getContentPane().add(zero_Btn);
		
		JButton one_Btn = new JButton("1");
		one_Btn.setBackground(Color.WHITE);
		one_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (functionEnabled == true) clearFunction();
				notANumber(answer);
				answer += "1";
				answer_Field.setText(answer);
				extendedText += "1";
				extendanswer_lbl.setText(extendedText);
			}
		});
		one_Btn.setBounds(80, 400, 70, 50);
		frame.getContentPane().add(one_Btn);
		
		JButton four_Btn = new JButton("4");
		four_Btn.setBackground(Color.WHITE);
		four_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (functionEnabled == true) clearFunction();
				notANumber(answer);
				answer += "4";
				answer_Field.setText(answer);
				extendedText += "4";
				extendanswer_lbl.setText(extendedText);
			}
		});
		four_Btn.setBounds(80, 350, 70, 50);
		frame.getContentPane().add(four_Btn);
		
		JButton seven_Btn = new JButton("7");
		seven_Btn.setBackground(Color.WHITE);
		seven_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (functionEnabled == true) clearFunction();
				notANumber(answer);
				answer += "7";
				answer_Field.setText(answer);
				extendedText += "7";
				extendanswer_lbl.setText(extendedText);
			}
		});
		seven_Btn.setBounds(80, 300, 70, 50);
		frame.getContentPane().add(seven_Btn);
		
		JButton modulus_Btn = new JButton("Mod");
		modulus_Btn.setBackground(Color.LIGHT_GRAY);
		modulus_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstanswer = answer;
				answer = "";
				modulus = true;
				functionEnabled = true;
				//answer =
				//answer_Field.setText(answer);
			}
		});
		modulus_Btn.setBounds(290, 200, 70, 50);
		frame.getContentPane().add(modulus_Btn);
		
		JButton bracket_L_Btn = new JButton("(");
		bracket_L_Btn.setBackground(Color.LIGHT_GRAY);
		bracket_L_Btn.setBounds(80, 250, 70, 50);
		frame.getContentPane().add(bracket_L_Btn);
		
		JButton bracket_R_Btn = new JButton(")");
		bracket_R_Btn.setBackground(Color.LIGHT_GRAY);
		bracket_R_Btn.setBounds(150, 250, 70, 50);
		frame.getContentPane().add(bracket_R_Btn);
		
		JButton factor_Btn = new JButton("n!");
		factor_Btn.setBackground(Color.LIGHT_GRAY);
		factor_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tmp = Integer.parseInt(answer);
				for (int i = 1; i < Integer.parseInt(answer); i++)
				{
					tmp *= i;
				}
				answer = Integer.toString(tmp);
				answer_Field.setText(answer);
				functionEnabled = true;
			}
		});
		factor_Btn.setBounds(220, 250, 70, 50);
		frame.getContentPane().add(factor_Btn);
		
		JButton sin_Btn = new JButton("sin");
		sin_Btn.setBackground(Color.LIGHT_GRAY);
		sin_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(answer);
				answer = Double.toString(Math.sin(Math.toRadians(Double.parseDouble(answer))));
				answer = Double.toString(trigcheck(Double.parseDouble(answer)));
				answer_Field.setText(answer);
				functionEnabled = true;
			}
		});
		sin_Btn.setBounds(80, 200, 70, 50);
		frame.getContentPane().add(sin_Btn);
		
		JButton cos_Btn = new JButton("cos");
		cos_Btn.setBackground(Color.LIGHT_GRAY);
		cos_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = Double.toString(Math.cos(Math.toRadians(Double.parseDouble(answer))));
				answer = Double.toString(trigcheck(Double.parseDouble(answer)));
				answer_Field.setText(answer);
				functionEnabled = true;
			}
		});
		cos_Btn.setBounds(150, 200, 70, 50);
		frame.getContentPane().add(cos_Btn);
		
		JButton tan_Btn = new JButton("tan");
		tan_Btn.setBackground(Color.LIGHT_GRAY);
		tan_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((Math.abs(Double.parseDouble(answer)) == 90)||(Math.abs(Double.parseDouble(answer)) == 270)) answer = "NaN";
				answer = Double.toString(Math.tan(Math.toRadians(Double.parseDouble(answer))));
				
				//answer = Double.toString(trigcheck(Double.parseDouble(answer)));
				
				answer_Field.setText(answer);
				functionEnabled = true;
			}
		});
		tan_Btn.setBounds(220, 200, 70, 50);
		frame.getContentPane().add(tan_Btn);
		
		JButton oneOver_Btn = new JButton("1 / x");
		oneOver_Btn.setBackground(Color.LIGHT_GRAY);
		oneOver_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = Double.toString(1 / Double.parseDouble(answer));
				answer_Field.setText(answer);
				functionEnabled = true;
			}
		});
		oneOver_Btn.setBounds(80, 150, 70, 50);
		frame.getContentPane().add(oneOver_Btn);
		
		JButton xsquare_Btn = new JButton("x\u00B2");
		xsquare_Btn.setBackground(Color.LIGHT_GRAY);
		xsquare_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = Double.toString(Double.parseDouble(answer) * (Double.parseDouble(answer)));
				answer_Field.setText(answer);
				functionEnabled = true;
			}
		});
		xsquare_Btn.setBounds(150, 150, 70, 50);
		frame.getContentPane().add(xsquare_Btn);
		
		JButton squareroot_Btn = new JButton("\u221Ax");
		squareroot_Btn.setBackground(Color.LIGHT_GRAY);
		squareroot_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = Double.toString(Math.sqrt(Double.parseDouble(answer)));
				answer_Field.setText(answer);
				functionEnabled = true;
				
			}
		});
		squareroot_Btn.setBounds(220, 150, 70, 50);
		frame.getContentPane().add(squareroot_Btn);
		
		JButton clear_Btn = new JButton("C");
		clear_Btn.setBackground(Color.LIGHT_GRAY);
		clear_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = "0";
				answer_Field.setText(answer);
				functionEnabled = true;
				
				extendedText = "";
				extendanswer_lbl.setText(extendedText);
			}
		});
		clear_Btn.setBounds(290, 150, 70, 50);
		frame.getContentPane().add(clear_Btn);
		
		JButton ln_Btn = new JButton("ln");
		ln_Btn.setBackground(Color.LIGHT_GRAY);
		ln_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = Double.toString(Math.log1p(Double.parseDouble(answer)));
				answer_Field.setText(answer);
				functionEnabled = true;
			}
		});
		ln_Btn.setBounds(10, 450, 70, 50);
		frame.getContentPane().add(ln_Btn);
		
		JButton second_Btn = new JButton("2nd");
		second_Btn.setBackground(Color.LIGHT_GRAY);
		second_Btn.setBounds(10, 150, 70, 50);
		frame.getContentPane().add(second_Btn);
		
		JButton log_Btn = new JButton("log");
		log_Btn.setBackground(Color.LIGHT_GRAY);
		log_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = Double.toString(Math.log10(Double.parseDouble(answer)));
				answer_Field.setText(answer);
				functionEnabled = true;
			}
		});
		log_Btn.setBounds(10, 400, 70, 50);
		frame.getContentPane().add(log_Btn);
		
		JButton tentox_Btn = new JButton("10\u207F");
		tentox_Btn.setBackground(Color.LIGHT_GRAY);
		tentox_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = Double.toString(Math.pow(10,Double.parseDouble(answer)));
				answer_Field.setText(answer);
				functionEnabled = true;
			}
		});
		tentox_Btn.setBounds(10, 350, 70, 50);
		frame.getContentPane().add(tentox_Btn);
		
		JButton xtoy_Btn = new JButton("x\u207F");
		xtoy_Btn.setBackground(Color.LIGHT_GRAY);
		xtoy_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				functionEnabled = true;
			}
		});
		xtoy_Btn.setBounds(10, 300, 70, 50);
		frame.getContentPane().add(xtoy_Btn);
		
		JButton btnx_2 = new JButton("\u00B2\u221Ax");
		btnx_2.setBackground(Color.LIGHT_GRAY);
		btnx_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				functionEnabled = true;
			}
		});
		btnx_2.setBounds(10, 250, 70, 50);
		frame.getContentPane().add(btnx_2);
		
		JButton exp_Btn = new JButton("exp");
		exp_Btn.setBackground(Color.LIGHT_GRAY);
		exp_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				functionEnabled = true;
			}
		});
		exp_Btn.setBounds(10, 200, 70, 50);
		frame.getContentPane().add(exp_Btn);
		
		answer_Field = new JTextField();
		answer_Field.setEditable(false);
		answer_Field.setText("0");
		answer_Field.setForeground(Color.WHITE);
		answer_Field.setBackground(new Color(192, 192, 192));
		answer_Field.setFont(new Font("DialogInput", Font.PLAIN, 24));
		answer_Field.setHorizontalAlignment(SwingConstants.RIGHT);
		answer_Field.setBounds(10, 41, 350, 62);
		frame.getContentPane().add(answer_Field);
		answer_Field.setColumns(10);
		
		extendanswer_lbl = new JLabel("");
		extendanswer_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		extendanswer_lbl.setBackground(Color.WHITE);
		extendanswer_lbl.setForeground(new Color(255, 255, 255));
		extendanswer_lbl.setEnabled(false);
		extendanswer_lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		extendanswer_lbl.setBounds(21, 114, 339, 14);
		frame.getContentPane().add(extendanswer_lbl);
	}
	
	public Double trigcheck(double a)
	{
		if ((a < 0.01)&&(a > -0.01))
		{
			return 0.0;
		}
		return a;
	
	}
	public void notANumber(String a)
	{
		if (a == "NaN")
			answer = "";answer_Field.setText("");
		
	}
	public void clearFunction()
	{
		answer = "";
		answer_Field.setText("");
		functionEnabled = false;
	}
	
}
