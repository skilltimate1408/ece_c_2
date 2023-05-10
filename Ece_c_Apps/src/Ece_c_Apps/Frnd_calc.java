package Ece_c_Apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Frnd_calc {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
    String n1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frnd_calc window = new Frnd_calc();
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
	public Frnd_calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 609, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Friendship % cal");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(144, 23, 303, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblYourName = new JLabel("Your Name");
		lblYourName.setForeground(Color.MAGENTA);
		lblYourName.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblYourName.setBounds(28, 113, 182, 43);
		frame.getContentPane().add(lblYourName);
		
		JLabel lblFriendName = new JLabel("Friend Name");
		lblFriendName.setForeground(Color.MAGENTA);
		lblFriendName.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFriendName.setBounds(28, 191, 201, 43);
		frame.getContentPane().add(lblFriendName);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.BOLD, 20));
		t1.setBounds(295, 116, 201, 36);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(295, 198, 201, 36);
		frame.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 n1=t1.getText();
				String n2=t2.getText();
				Random r=new Random();
				int p=r.nextInt(1,100);
			JOptionPane.showMessageDialog(btnNewButton, 
					"Hello "+n1+" &"+n2+
					"\n Your Friendship % :"+p);
			BookMyshow b=new BookMyshow();
			b.setVisible(true);
				
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(183, 307, 113, 43);
		frame.getContentPane().add(btnNewButton);
	}
}
