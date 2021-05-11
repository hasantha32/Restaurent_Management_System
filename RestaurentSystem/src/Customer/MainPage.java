package Customer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import janith.CustomerHome;
import janith.StaffHome;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.awt.Color;
import java.awt.Font;

public class MainPage extends javax.swing.JFrame {

	private JFrame frmRestaurentManagementSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.frmRestaurentManagementSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRestaurentManagementSystem = new JFrame();
		frmRestaurentManagementSystem.setTitle("Restaurent Management System");
		frmRestaurentManagementSystem.setResizable(false);
		frmRestaurentManagementSystem.getContentPane().setBackground(Color.BLACK);
		frmRestaurentManagementSystem.setBounds(350, 150, 1250, 750);
		frmRestaurentManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRestaurentManagementSystem.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("CUSTOMER");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CustomerHome abc =new CustomerHome();
				CustomerHome.main(null);
				frmRestaurentManagementSystem.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 33));
		btnNewButton.setBounds(290, 314, 684, 71);
		frmRestaurentManagementSystem.getContentPane().add(btnNewButton);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("WELCOME TO GRAND MENTION RESTAURENT");
		jLabel1.setForeground(Color.YELLOW);
		jLabel1.setFont(new Font("Sylfaen", Font.BOLD, 40));
		jLabel1.setBackground(Color.WHITE);
		jLabel1.setBounds(149, 133, 955, 48);
		frmRestaurentManagementSystem.getContentPane().add(jLabel1);
		
		JButton btnStaff = new JButton("STAFF");
		btnStaff.setForeground(Color.WHITE);
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffHome abc =new StaffHome();
				StaffHome.main(null);
				frmRestaurentManagementSystem.setVisible(false);
			}
		});
		btnStaff.setFont(new Font("Sylfaen", Font.BOLD, 33));
		btnStaff.setBounds(290, 409, 684, 71);
		frmRestaurentManagementSystem.getContentPane().add(btnStaff);
		
		
    	
	     try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	               
	                  UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	}
}
