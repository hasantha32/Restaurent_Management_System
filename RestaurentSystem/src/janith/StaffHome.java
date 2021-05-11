package janith;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

import Customer.MainPage;
import Kitchen_Management.LOGIN;
import inventory_man.login;
import pub.exp;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffHome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffHome window = new StaffHome();
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
	public StaffHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(350, 150,1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnInventory = new JButton("Inventory Management");
		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login abc =new login();
				login.main(null);
				frame.setVisible(false);
			}
		});
		btnInventory.setForeground(Color.WHITE);
		btnInventory.setFont(new Font("Serif", Font.BOLD, 40));
		btnInventory.setBounds(292, 182, 695, 65);
		frame.getContentPane().add(btnInventory);
		
		JButton btnKitchen = new JButton("Kitchen Management");
		btnKitchen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN abc =new LOGIN();
				LOGIN.main(null);
				frame.setVisible(false);
			}
		});
		btnKitchen.setForeground(Color.WHITE);
		btnKitchen.setFont(new Font("Serif", Font.BOLD, 40));
		btnKitchen.setBounds(292, 260, 695, 70);
		frame.getContentPane().add(btnKitchen);
		
		JButton btnCashierManagement = new JButton("Cashier Management");
		btnCashierManagement.setForeground(Color.WHITE);
		btnCashierManagement.setFont(new Font("Serif", Font.BOLD, 40));
		btnCashierManagement.setBounds(292, 420, 695, 65);
		frame.getContentPane().add(btnCashierManagement);
		
		JButton btnStaffManagement = new JButton("Staff Management");
		btnStaffManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffLogin abc =new StaffLogin();
				StaffLogin.main(null);
				frame.setVisible(false);
			}
		});
		btnStaffManagement.setForeground(Color.WHITE);
		btnStaffManagement.setFont(new Font("Serif", Font.BOLD, 40));
		btnStaffManagement.setBounds(292, 342, 695, 65);
		frame.getContentPane().add(btnStaffManagement);
		
		JButton btnNewButton_1 = new JButton("<<<Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage abc =new MainPage();
				MainPage.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton_1.setBounds(30, 653, 107, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("WELCOME TO GRAND MENTION RESTAURENT");
		jLabel1.setForeground(Color.YELLOW);
		jLabel1.setFont(new Font("Sylfaen", Font.BOLD, 40));
		jLabel1.setBackground(Color.WHITE);
		jLabel1.setBounds(160, 73, 955, 48);
		frame.getContentPane().add(jLabel1);
	}

}
