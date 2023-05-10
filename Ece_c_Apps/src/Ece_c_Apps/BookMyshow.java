package Ece_c_Apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookMyshow {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookMyshow window = new BookMyshow();
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
	public BookMyshow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1072, 647);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BookMyshow");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(379, 31, 274, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblName.setBounds(50, 126, 274, 55);
		frame.getContentPane().add(lblName);
		
		JLabel lblMovies = new JLabel("Movies");
		lblMovies.setForeground(Color.WHITE);
		lblMovies.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblMovies.setBounds(50, 220, 274, 55);
		frame.getContentPane().add(lblMovies);
		
		JLabel lblTickets = new JLabel("Tickets");
		lblTickets.setForeground(Color.WHITE);
		lblTickets.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTickets.setBounds(50, 323, 274, 55);
		frame.getContentPane().add(lblTickets);
		
		t1 = new JTextField();
		t1.setBounds(243, 126, 274, 43);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "RRR", "SaveTheTigers", "Pshpa"}));
		c1.setFont(new Font("Tahoma", Font.BOLD, 25));
		c1.setBounds(252, 220, 265, 44);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5"}));
		c2.setFont(new Font("Tahoma", Font.BOLD, 25));
		c2.setBounds(252, 323, 265, 44);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=t1.getText();
				String movie=(String) c1.getSelectedItem();
				String t=(String) c2.getSelectedItem();
				int tickets=Integer.parseInt(t);
				int bill=0;
				Frnd_calc c=new Frnd_calc();
				String n3=c.n1;
				JOptionPane.showMessageDialog(btnNewButton, "Invalid" + n1); 
				/*if(movie.equals("RRR"))
				{
					bill=400*tickets;
					JOptionPane.showMessageDialog(btnNewButton, 
						"Hello "+n+" \n Selected Movie"+movie+
						"\n Tickets:"+t+"\n total bill:"+bill);
				}
				else if(movie.equals("SaveTheTigers"))
				{
					bill=120*tickets;
					JOptionPane.showMessageDialog(btnNewButton, 
						"Hello "+n+" \n Selected Movie"+movie+
						"\n Tickets:"+t+"\n total bill:"+bill);
				}
				else if(movie.equals("Pushpa"))
				{
					bill=250*tickets;
					JOptionPane.showMessageDialog(btnNewButton, 
						"Hello "+n+" \n Selected Movie"+movie+
						"\n Tickets:"+t+"\n total bill:"+bill);
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid"); 
				}*/
				
			}
		});
		btnNewButton.setBounds(169, 450, 137, 60);
		frame.getContentPane().add(btnNewButton);
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}
}
