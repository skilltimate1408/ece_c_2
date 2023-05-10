package Ece_c_Apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Reg2 {

	private JFrame frame;
	private JTextField t1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reg2 window = new Reg2();
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
	public Reg2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 764, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(163, 21, 270, 62);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(10, 93, 270, 62);
		frame.getContentPane().add(lblName);
		
		JLabel lblRoll = new JLabel("Roll");
		lblRoll.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRoll.setBounds(10, 157, 270, 62);
		frame.getContentPane().add(lblRoll);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGender.setBounds(10, 229, 140, 62);
		frame.getContentPane().add(lblGender);
		
		JLabel lblProgramming = new JLabel("Programming");
		lblProgramming.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProgramming.setBounds(10, 317, 270, 62);
		frame.getContentPane().add(lblProgramming);
		
		t1 = new JTextField();
		t1.setBounds(148, 99, 197, 39);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(148, 183, 197, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Female");
		r1.setFont(new Font("Tahoma", Font.BOLD, 20));
		r1.setBounds(183, 243, 109, 24);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Male");
		r2.setFont(new Font("Tahoma", Font.BOLD, 20));
		r2.setBounds(329, 243, 109, 24);
		frame.getContentPane().add(r2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
        bg.add(r2);
        
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Java", "Pyhton", "GO", "C", "C#"}));
		comboBox.setBounds(201, 317, 165, 46);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(148, 411, 119, 32);
		frame.getContentPane().add(btnNewButton);
	}
}
