package logins;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Login {

	private JFrame Login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.Login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login = new JFrame();
		Login.setBounds(100, 100, 450, 300);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login.getContentPane().setLayout(null);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login.dispose();
				AdministratorLogin adminL = new AdministratorLogin();
				adminL.setVisible(true);
			}
		});
		btnAdmin.setBounds(249, 46, 89, 23);
		Login.getContentPane().add(btnAdmin);
		
		JButton btnCashier = new JButton("Cashier");
		btnCashier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login.dispose();
				CashierLogin cashL = new CashierLogin();
				cashL.setVisible(true);
				
			}
		});
		btnCashier.setBounds(249, 117, 89, 23);
		Login.getContentPane().add(btnCashier);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setHorizontalAlignment(SwingConstants.LEADING);
		btnMainMenu.setBounds(249, 185, 89, 40);
		Login.getContentPane().add(btnMainMenu);
	}
}
