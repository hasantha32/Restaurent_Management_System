package pub;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UpdateSup {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateSup window = new UpdateSup();
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
	public UpdateSup() {
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
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 55, 1234, 9);
		frame.getContentPane().add(separator);
		
		JLabel label = new JLabel("GRAND MANSION Restaurant");
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setBounds(424, 0, 392, 44);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Supplier supkj = new Supplier();
				Supplier.main(null);
				frame.setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(56, 98, 89, 44);
		frame.getContentPane().add(button);
		
		JLabel label_1 = new JLabel("ID");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(347, 193, 41, 24);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Name");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_2.setBounds(347, 280, 65, 24);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Company");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(347, 362, 84, 24);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Brand Name");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(347, 443, 126, 24);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Phone Number");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(347, 524, 136, 24);
		frame.getContentPane().add(label_5);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(543, 186, 250, 44);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(543, 273, 250, 44);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(543, 355, 250, 44);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(543, 436, 250, 44);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(543, 517, 250, 44);
		frame.getContentPane().add(textField_4);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals("") ||textField_4.getText().equals("") ||textField.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill the form");
				}else {
				
			    
			    try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

                    String query = "Update pub_supplier set Name='"+textField_1.getText()+"',Company='"+textField_2.getText()+"',Brand='"+textField_3.getText()+"',Phone='"+textField_4.getText()+"'where Supplier_ID='"+textField.getText()+"'";

                    Statement sta = connection.createStatement();
                    JOptionPane.showMessageDialog(null, "Data Updated");
                    int x = sta.executeUpdate(query);
                   
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
				}
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdate.setBounds(888, 615, 104, 52);
		frame.getContentPane().add(btnUpdate);
		
		JButton button_1 = new JButton("Delete");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					String query="Delete from pub_supplier where Supplier_ID='"+textField.getText()+"'";
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
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBounds(1031, 615, 104, 52);
		frame.getContentPane().add(button_1);
	}
}
