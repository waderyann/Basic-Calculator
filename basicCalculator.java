package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class basicCalculator {

	private JFrame frame;
	private JTextField answer_Field;
	String answer = "";
	String firstanswer;
	String secondanswer;
	boolean sum = false;
	String answer_Symbol = "";
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
		frame.setBounds(100, 100, 393, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton equals_Btn = new JButton("=");
		equals_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sum == true)
				{
					secondanswer = answer;
					
					answer = Integer.toString(Integer.parseInt(firstanswer) + Integer.parseInt(secondanswer));
					answer_Field.setText(answer);
					
				}
			}
		});
		equals_Btn.setBounds(301, 458, 60, 40);
		frame.getContentPane().add(equals_Btn);
		
		JButton plus_Btn = new JButton("+");
		plus_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer_Symbol = answer + " + ";
				extendanswer_lbl.setText(answer_Symbol);
			   
				firstanswer = answer;
				answer = "";
				//answer_Field.setText("");
				sum = true;
				
				
				
			}
		});
		plus_Btn.setBounds(301, 407, 60, 40);
		frame.getContentPane().add(plus_Btn);
		
		JButton minus_Btn = new JButton("-");
		minus_Btn.setBounds(301, 356, 60, 40);
		frame.getContentPane().add(minus_Btn);
		
		JButton multiply_Btn = new JButton("x");
		multiply_Btn.setBounds(301, 305, 60, 40);
		frame.getContentPane().add(multiply_Btn);
		
		JButton division_Btn = new JButton("\u00F7");
		division_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		division_Btn.setBounds(301, 254, 60, 40);
		frame.getContentPane().add(division_Btn);
		
		JButton plusminus_Btn = new JButton("+ / -");
		plusminus_Btn.setBounds(231, 458, 60, 40);
		frame.getContentPane().add(plusminus_Btn);
		
		JButton three_Btn = new JButton("3");
		three_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer += "3";
				answer_Field.setText(answer);
				extendanswer_lbl.setText(answer);
			}
		});
		three_Btn.setBounds(231, 409, 60, 40);
		frame.getContentPane().add(three_Btn);
		
		JButton six_Btn = new JButton("6");
		six_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer += "6";
				answer_Field.setText(answer);
				extendanswer_lbl.setText(answer);
			}
		});
		six_Btn.setBounds(231, 358, 60, 40);
		frame.getContentPane().add(six_Btn);
		
		JButton nine_Btn = new JButton("9");
		nine_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer += "9";
				answer_Field.setText(answer);
				extendanswer_lbl.setText(answer);
			}
		});
		nine_Btn.setBounds(231, 305, 60, 40);
		frame.getContentPane().add(nine_Btn);
		
		JButton decimal_Btn = new JButton(".");
		decimal_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				/*for (int i = 0; i < answer.length(); i++)
				{
					if ((answer.valueOf(i) == "i")) answer += ".";
				}*/
				answer += ".";
				answer_Field.setText(answer);
			}
		});
		decimal_Btn.setBounds(161, 458, 60, 40);
		frame.getContentPane().add(decimal_Btn);
		
		JButton two_Btn = new JButton("2");
		two_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				answer += "2";
				answer_Field.setText(answer);
				extendanswer_lbl.setText(answer);
			}
		});
		two_Btn.setBounds(161, 409, 60, 40);
		frame.getContentPane().add(two_Btn);
		
		JButton five_Btn = new JButton("5");
		five_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer += "5";
				answer_Field.setText(answer);
				extendanswer_lbl.setText(answer);
			}
		});
		five_Btn.setBounds(161, 358, 60, 40);
		frame.getContentPane().add(five_Btn);
		
		JButton eight_Btn = new JButton("8");
		eight_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer += "8";
				answer_Field.setText(answer);
				extendanswer_lbl.setText(answer);
			}
		});
		eight_Btn.setBounds(161, 306, 60, 40);
		frame.getContentPane().add(eight_Btn);
		
		JButton zero_Btn = new JButton("0");
		zero_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer += "0";
				answer_Field.setText(answer);
				extendanswer_lbl.setText(answer);
			}
		});
		zero_Btn.setBounds(91, 458, 60, 40);
		frame.getContentPane().add(zero_Btn);
		
		JButton one_Btn = new JButton("1");
		one_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer += "1";
				answer_Field.setText(answer);
				extendanswer_lbl.setText(answer);
			}
		});
		one_Btn.setBounds(91, 409, 60, 40);
		frame.getContentPane().add(one_Btn);
		
		JButton four_Btn = new JButton("4");
		four_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer += "4";
				answer_Field.setText(answer);
				extendanswer_lbl.setText(answer);
			}
		});
		four_Btn.setBounds(91, 358, 60, 40);
		frame.getContentPane().add(four_Btn);
		
		JButton seven_Btn = new JButton("7");
		seven_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer += "7";
				answer_Field.setText(answer);
				extendanswer_lbl.setText(answer);
			}
		});
		seven_Btn.setBounds(91, 306, 60, 40);
		frame.getContentPane().add(seven_Btn);
		
		JButton modulus_Btn = new JButton("Mod");
		modulus_Btn.setBounds(301, 203, 60, 40);
		frame.getContentPane().add(modulus_Btn);
		
		JButton bracket_L_Btn = new JButton("(");
		bracket_L_Btn.setBounds(91, 254, 60, 40);
		frame.getContentPane().add(bracket_L_Btn);
		
		JButton bracket_R_Btn = new JButton(")");
		bracket_R_Btn.setBounds(161, 254, 60, 40);
		frame.getContentPane().add(bracket_R_Btn);
		
		JButton factor_Btn = new JButton("n!");
		factor_Btn.setBounds(231, 254, 60, 40);
		frame.getContentPane().add(factor_Btn);
		
		JButton sin_Btn = new JButton("sin");
		sin_Btn.setBounds(91, 203, 60, 40);
		frame.getContentPane().add(sin_Btn);
		
		JButton cos_Btn = new JButton("cos");
		cos_Btn.setBounds(161, 203, 60, 40);
		frame.getContentPane().add(cos_Btn);
		
		JButton tan_Btn = new JButton("tan");
		tan_Btn.setBounds(231, 203, 60, 40);
		frame.getContentPane().add(tan_Btn);
		
		JButton oneOver_Btn = new JButton("1 / x");
		oneOver_Btn.setBounds(91, 152, 60, 40);
		frame.getContentPane().add(oneOver_Btn);
		
		JButton xsquare_Btn = new JButton("x\u00B2");
		xsquare_Btn.setBounds(161, 152, 60, 40);
		frame.getContentPane().add(xsquare_Btn);
		
		JButton squareroot_Btn = new JButton("\u221Ax");
		squareroot_Btn.setBounds(231, 152, 60, 40);
		frame.getContentPane().add(squareroot_Btn);
		
		JButton clear_Btn = new JButton("C");
		clear_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = "";
				answer_Field.setText(answer);
				extendanswer_lbl.setText("");
			}
		});
		clear_Btn.setBounds(301, 152, 60, 40);
		frame.getContentPane().add(clear_Btn);
		
		JButton ln_Btn = new JButton("ln");
		ln_Btn.setBounds(21, 458, 60, 40);
		frame.getContentPane().add(ln_Btn);
		
		JButton second_Btn = new JButton("2nd");
		second_Btn.setBounds(21, 152, 60, 40);
		frame.getContentPane().add(second_Btn);
		
		JButton log_Btn = new JButton("log");
		log_Btn.setBounds(21, 409, 60, 40);
		frame.getContentPane().add(log_Btn);
		
		JButton tentox_Btn = new JButton("10^x");
		tentox_Btn.setBounds(21, 358, 60, 40);
		frame.getContentPane().add(tentox_Btn);
		
		JButton xtoy_Btn = new JButton("x^y");
		xtoy_Btn.setBounds(21, 306, 60, 40);
		frame.getContentPane().add(xtoy_Btn);
		
		JButton btnx_2 = new JButton("\u00B2\u221Ax");
		btnx_2.setBounds(21, 254, 60, 40);
		frame.getContentPane().add(btnx_2);
		
		JButton exp_Btn = new JButton("exp");
		exp_Btn.setBounds(21, 203, 60, 40);
		frame.getContentPane().add(exp_Btn);
		
		answer_Field = new JTextField();
		answer_Field.setHorizontalAlignment(SwingConstants.RIGHT);
		answer_Field.setBounds(21, 41, 340, 62);
		frame.getContentPane().add(answer_Field);
		answer_Field.setColumns(10);
		
		extendanswer_lbl = new JLabel("");
		extendanswer_lbl.setEnabled(false);
		extendanswer_lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		extendanswer_lbl.setBounds(21, 114, 340, 14);
		frame.getContentPane().add(extendanswer_lbl);
	}
}
