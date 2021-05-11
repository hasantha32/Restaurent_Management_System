package janith;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Update {

	private JFrame frame;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update window = new Update();
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
	public Update() {
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(423, 120, 735, 453);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel label_1 = new JLabel("Emp ID");
		label_1.setFont(new Font("Serif", Font.BOLD, 14));
		label_1.setBounds(10, 193, 89, 19);
		frame.getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 190, 232, 22);
		frame.getContentPane().add(textField_2);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Serif", Font.BOLD, 14));
		lblFirstName.setBounds(10, 226, 89, 19);
		frame.getContentPane().add(lblFirstName);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(124, 223, 232, 22);
		frame.getContentPane().add(textField_3);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Serif", Font.BOLD, 14));
		lblLastName.setBounds(10, 258, 89, 19);
		frame.getContentPane().add(lblLastName);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(124, 255, 232, 22);
		frame.getContentPane().add(textField_4);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Serif", Font.BOLD, 14));
		lblAddress.setBounds(10, 292, 89, 19);
		frame.getContentPane().add(lblAddress);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(124, 289, 232, 22);
		frame.getContentPane().add(textField_5);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Serif", Font.BOLD, 14));
		lblPhone.setBounds(10, 325, 89, 19);
		frame.getContentPane().add(lblPhone);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(124, 322, 232, 22);
		frame.getContentPane().add(textField_6);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Serif", Font.BOLD, 14));
		lblEmail.setBounds(10, 358, 89, 19);
		frame.getContentPane().add(lblEmail);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(124, 355, 232, 22);
		frame.getContentPane().add(textField_7);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Serif", Font.BOLD, 14));
		lblTitle.setBounds(10, 392, 89, 19);
		frame.getContentPane().add(lblTitle);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(124, 389, 232, 22);
		frame.getContentPane().add(textField_8);
		
		JLabel lblOt = new JLabel("Hours");
		lblOt.setFont(new Font("Serif", Font.BOLD, 14));
		lblOt.setBounds(10, 428, 89, 19);
		frame.getContentPane().add(lblOt);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(124, 425, 232, 22);
		frame.getContentPane().add(textField_9);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Serif", Font.BOLD, 14));
		lblSalary.setBounds(10, 461, 89, 19);
		frame.getContentPane().add(lblSalary);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(124, 458, 232, 22);
		frame.getContentPane().add(textField_10);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					
					String query="Update staff set firstname='"+textField_3.getText()+"',lastname='"+textField_4.getText()+"',address='"+textField_5.getText()+"',phone='"+textField_6.getText()+"',email='"+textField_7.getText()+"',title='"+textField_8.getText()+"',hours='"+textField_9.getText()+"',salary='"+textField_10.getText()+"' where eid='"+textField_2.getText()+"' ";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton.setBounds(267, 520, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Load Employee Details");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					
					String query="select * from staff ";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Serif", Font.BOLD, 14));
		button.setBackground(SystemColor.controlDkShadow);
		button.setBounds(725, 593, 253, 27);
		frame.getContentPane().add(button);
		
		JButton btnNewButton_1 = new JButton("<<<Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manage abc =new Manage();
				Manage.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton_1.setBounds(34, 595, 103, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
				String query="Delete from staff where eid='"+textField_2.getText()+"'";
				PreparedStatement pst=connection.prepareStatement(query);
				pst.execute();
				
				JOptionPane.showMessageDialog(null, "Data Deleted");
				pst.close();
				
				}
				catch(Exception e) {
					e.printStackTrace();
					
				}
			}
		});
		btnDelete.setFont(new Font("Serif", Font.BOLD, 14));
		btnDelete.setBackground(UIManager.getColor("Button.darkShadow"));
		btnDelete.setBounds(107, 520, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JLabel lblUpdateAndRomove = new JLabel("Update And Romove Details");
		lblUpdateAndRomove.setFont(new Font("Serif", Font.BOLD, 18));
		lblUpdateAndRomove.setBounds(10, 121, 238, 27);
		frame.getContentPane().add(lblUpdateAndRomove);
		
		JLabel label = new JLabel("Staff Admin Panel");
		label.setForeground(SystemColor.controlDkShadow);
		label.setFont(new Font("Serif", Font.BOLD, 26));
		label.setBackground(SystemColor.controlDkShadow);
		label.setBounds(489, 24, 253, 35);
		frame.getContentPane().add(label);
	}
}
