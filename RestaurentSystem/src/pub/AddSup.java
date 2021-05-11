package pub;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;



import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddSup {

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
					AddSup window = new AddSup();
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
	public AddSup() {
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
		label.setBounds(428, 0, 392, 44);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Supplier itm = new Supplier();
				Supplier.main(null);
				frame.setVisible(false);
				
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(62, 87, 84, 44);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(325, 228, 41, 24);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(525, 225, 250, 36);
		frame.getContentPane().add(textField);
		
		JButton btnAdd = new JButton("ADD");
	
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				String ID = textField.getText();
                String Name = textField_1.getText();
                String Company = textField_2.getText();
                String Brand = textField_3.getText();
                String Phone = textField_4.getText();
              

                String msg = "" + ID;
                msg += " \n";
			
                
                if(textField.getText().equals("")||textField_1.getText().equals("")|| textField_2.getText().equals("")||textField_3.getText().equals("")||textField_4.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill the form");
					
					
				}else {
					
					
                
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

                    String query = "INSERT INTO pub_supplier values('" + ID + "','" + Name + "','" + Company + "','" + Brand + "','" + Phone + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnAdd, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnAdd,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
				}
                
			}
		});
			
                
			
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdd.setBounds(987, 587, 108, 52);
		frame.getContentPane().add(btnAdd);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(325, 305, 65, 24);
		frame.getContentPane().add(lblName);
		
		JLabel lblCompany = new JLabel("Company");
		lblCompany.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCompany.setBounds(325, 369, 84, 24);
		frame.getContentPane().add(lblCompany);
		
		JLabel lblBrandName = new JLabel("Brand Name");
		lblBrandName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBrandName.setBounds(325, 442, 126, 24);
		frame.getContentPane().add(lblBrandName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhoneNumber.setBounds(325, 515, 136, 24);
		frame.getContentPane().add(lblPhoneNumber);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(525, 302, 250, 36);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(525, 366, 250, 36);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(525, 439, 250, 36);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(525, 512, 250, 36);
		frame.getContentPane().add(textField_4);
			
			}
}
