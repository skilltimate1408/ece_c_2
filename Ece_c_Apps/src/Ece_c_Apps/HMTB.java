package Ece_c_Apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HMTB {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HMTB window = new HMTB();
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
	public HMTB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(212, 10, 210, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblName.setBounds(10, 75, 210, 37);
		frame.getContentPane().add(lblName);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblFrom.setBounds(10, 136, 210, 37);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTo.setBounds(10, 188, 210, 37);
		frame.getContentPane().add(lblTo);
		
		JLabel lblTickets = new JLabel("Tickets");
		lblTickets.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTickets.setBounds(10, 235, 210, 37);
		frame.getContentPane().add(lblTickets);
		
		t1 = new JTextField();
		t1.setBounds(182, 72, 177, 37);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "JNTUH", "KPHB", "MYP"}));
		c1.setBounds(182, 142, 177, 29);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "JNTUH", "MYP", "KPHB"}));
		c2.setBounds(182, 194, 177, 29);
		frame.getContentPane().add(c2);
		
		JComboBox t2 = new JComboBox();
		t2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		t2.setBounds(182, 249, 124, 21);
		frame.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String fs=(String) c1.getSelectedItem();
				String ts=(String) c2.getSelectedItem();
				String t=(String) t2.getSelectedItem();
				int ticket=Integer.parseInt(t);
				int bill=0;
				if(fs=="JNTUH" && ts=="JNTUH")
				{
					JOptionPane.showMessageDialog(btnNewButton,
							"Invalid");
				}
				else if(fs=="JNTUH" && ts=="KPHB")
				{
					bill=ticket*30;
					JOptionPane.showMessageDialog(btnNewButton, 
							"Hello "+name+"\n From: "+fs+
							   "\n To: "+ts+"\n Tickets: "+t+
							   "\n Your bill :"+bill);
				}
				else if(fs=="JNTUH" && ts=="MYP")
				{
					bill=ticket*20;
					JOptionPane.showMessageDialog(btnNewButton, 
							"Hello "+name+"\n From: "+fs+
							   "\n To: "+ts+"\n Tickets: "+t+
							   "\n Your bill :"+bill);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(127, 305, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}

}
