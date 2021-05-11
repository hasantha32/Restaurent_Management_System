package pub;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class AdminP {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminP window = new AdminP();
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
	public AdminP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(350, 150, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("GRAND MANSION Restaurant");
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setBounds(426, 11, 392, 44);
		frame.getContentPane().add(label);
		
		JEditorPane dtrpnAdminPanel = new JEditorPane();
		dtrpnAdminPanel.setEditable(false);
		dtrpnAdminPanel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		dtrpnAdminPanel.setText("ADMIN PANEL");
		dtrpnAdminPanel.setBounds(529, 195, 171, 37);
		frame.getContentPane().add(dtrpnAdminPanel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 74, 1234, 9);
		frame.getContentPane().add(separator);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminL jfk =  new AdminL();
				AdminL.main(null);
				frame.setVisible(false);
				
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogout.setBounds(73, 115, 89, 44);
		frame.getContentPane().add(btnLogout);
		
		JButton btnNewButton_3 = new JButton("View Suppliers Details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Supplier qwe = new Supplier();
				Supplier.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(330, 402, 171, 50);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Inventry");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inventry invent = new Inventry ();
				Inventry.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(741, 401, 171, 50);
		frame.getContentPane().add(btnNewButton);
	}
}
