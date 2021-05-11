package admin;

import admin.Delete;

import java.awt.EventQueue;
import admin.UpdateMenu;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
public class AdminPanel {

	private JFrame frame;

	/**
	 * Lauch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel window = new AdminPanel();
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
	public AdminPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(350, 150, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Panel");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(602, 23, 148, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("New Admins");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddingAdmins newadmins=new AddingAdmins();
				AddingAdmins.main(null);
				frame.setVisible(false);
				
			}
		});
		btnNewButton_1.setBounds(474, 227, 190, 46);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete delete=new Delete();
				Delete.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_2.setBounds(725, 225, 184, 46);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Report");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print report=new print();
				print.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_3.setBounds(1000, 227, 190, 46);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnLOGOUTButton = new JButton("LOGOUT");
		btnLOGOUTButton.setForeground(Color.WHITE);
		btnLOGOUTButton.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		btnLOGOUTButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				int a =JOptionPane.showConfirmDialog(btnLOGOUTButton,"Are you sure");
				if(a==JOptionPane.YES_OPTION) {
				Login logout=new Login();
				Login.main(null);
				}else {
					
				}
				
			
			}
		});
		btnLOGOUTButton.setBounds(74, 58, 143, 46);
		frame.getContentPane().add(btnLOGOUTButton);
		
		JButton btnNewButton_5 = new JButton("Update Password");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UpdateMenu update=new UpdateMenu();
				UpdateMenu.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_5.setBounds(231, 227, 178, 46);
		frame.getContentPane().add(btnNewButton_5);
	}
}
