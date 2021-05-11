package janith;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class addingstaff {

	private JFrame frame;
	private JTextField textFieldFName;
	private JTextField textFieldLName;
	private JTextField textFieldEmail;
	private JTextField textFieldAddress;
	private JTextField textFieldPhone;
	private JTextField textFieldTitle;
	private JTextField textFieldHours;
	private JTextField textFieldsalary;
	protected Connection connection;
	protected String Email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addingstaff window = new addingstaff();
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
	public addingstaff() {
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
		
		JLabel label = new JLabel("Staff Admin Panel");
		label.setForeground(SystemColor.controlDkShadow);
		label.setFont(new Font("Serif", Font.BOLD, 26));
		label.setBackground(SystemColor.controlDkShadow);
		label.setBounds(556, 23, 253, 35);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("Dashboard");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dashboard abc =new Dashboard();
				Dashboard.main(null);
				frame.setVisible(false);
			}
		});
		
		
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setFont(new Font("Serif", Font.BOLD, 14));
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(0, 92, 238, 43);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Add Employee");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addingstaff abc =new addingstaff();
				addingstaff.main(null);
				frame.setVisible(false);
			}
		});
		
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setFont(new Font("Serif", Font.BOLD, 14));
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(0, 137, 238, 43);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Manage Employee Profile");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manage abc =new Manage();
				Manage.main(null);
				frame.setVisible(false);
			}
		});
		
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setFont(new Font("Serif", Font.BOLD, 14));
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(0, 182, 238, 43);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("View Report");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewReport abc =new ViewReport();
				ViewReport.main(null);
				frame.setVisible(false);
			}
		});
		
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setFont(new Font("Serif", Font.BOLD, 14));
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(0, 227, 238, 43);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("Calculate Salary");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalaryCalculate abc =new SalaryCalculate();
				SalaryCalculate.main(null);
				frame.setVisible(false);
			}
		});
	
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setFont(new Font("Serif", Font.BOLD, 14));
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(0, 272, 238, 43);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("LogOut");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffLogin abc =new StaffLogin();
				StaffLogin.main(null);
				frame.setVisible(false);
			}
		});
		
		button_5.setFont(new Font("Serif", Font.BOLD, 12));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(1117, 34, 90, 23);
		frame.getContentPane().add(button_5);
		
		JLabel lblNewLabel = new JLabel("Employee Information");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel.setBounds(248, 92, 238, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter First Name :");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 14));
		lblNewLabel_1.setBounds(252, 152, 352, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldFName = new JTextField();
		textFieldFName.setBounds(437, 155, 361, 20);
		frame.getContentPane().add(textFieldFName);
		textFieldFName.setColumns(10);
		
		JLabel lblEnterLastName = new JLabel("Enter Last Name :");
		lblEnterLastName.setFont(new Font("Serif", Font.BOLD, 14));
		lblEnterLastName.setBounds(252, 188, 131, 23);
		frame.getContentPane().add(lblEnterLastName);
		
		textFieldLName = new JTextField();
		textFieldLName.setColumns(10);
		textFieldLName.setBounds(437, 191, 361, 20);
		frame.getContentPane().add(textFieldLName);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Serif", Font.BOLD, 14));
		lblAddress.setBounds(252, 222, 111, 23);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Serif", Font.BOLD, 14));
		lblPhoneNumber.setBounds(252, 256, 131, 23);
		frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Serif", Font.BOLD, 14));
		lblEmail.setBounds(252, 290, 111, 23);
		frame.getContentPane().add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(437, 293, 361, 20);
		frame.getContentPane().add(textFieldEmail);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(437, 222, 361, 20);
		frame.getContentPane().add(textFieldAddress);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(437, 259, 361, 20);
		frame.getContentPane().add(textFieldPhone);
		
		JLabel lblJobInformation = new JLabel("Job Information");
		lblJobInformation.setFont(new Font("Serif", Font.BOLD, 20));
		lblJobInformation.setBounds(252, 339, 238, 27);
		frame.getContentPane().add(lblJobInformation);
		
		JLabel lblJobTitle = new JLabel("Job Title :");
		lblJobTitle.setFont(new Font("Serif", Font.BOLD, 14));
		lblJobTitle.setBounds(252, 388, 131, 23);
		frame.getContentPane().add(lblJobTitle);
		
		JLabel lblHoursToWork = new JLabel("Hours To Work :");
		lblHoursToWork.setFont(new Font("Serif", Font.BOLD, 14));
		lblHoursToWork.setBounds(252, 426, 111, 14);
		frame.getContentPane().add(lblHoursToWork);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary :");
		lblBasicSalary.setFont(new Font("Serif", Font.BOLD, 14));
		lblBasicSalary.setBounds(252, 454, 111, 23);
		frame.getContentPane().add(lblBasicSalary);
		
		textFieldTitle = new JTextField();
		textFieldTitle.setColumns(10);
		textFieldTitle.setBounds(437, 391, 361, 20);
		frame.getContentPane().add(textFieldTitle);
		
		textFieldHours = new JTextField();
		textFieldHours.setColumns(10);
		textFieldHours.setBounds(437, 425, 361, 20);
		frame.getContentPane().add(textFieldHours);
		
		textFieldsalary = new JTextField();
		textFieldsalary.setColumns(10);
		textFieldsalary.setBounds(437, 457, 361, 20);
		frame.getContentPane().add(textFieldsalary);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				  String firstname = textFieldFName.getText();
	                String lastname = textFieldLName.getText();
	                String address = textFieldAddress.getText();
	                String phone = textFieldPhone.getText();
	                String email = textFieldEmail.getText();
	                String title = textFieldTitle.getText();
	                String hours = textFieldHours.getText();
	                String salary = textFieldsalary.getText();
	               

	                String msg = "" + firstname;
	                msg += " \n";
	                

	                if (textFieldEmail.getText().matches("^[A-Za-z0-9_.]+[@][A-Za-z.]+$") && (textFieldPhone.getText().matches("^\\d{10}$")))
					{
	                
	                if(textFieldFName.getText().equals("")||textFieldLName.getText().equals("")|| textFieldAddress.getText().equals("")||textFieldPhone.getText().equals("")||textFieldEmail.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null, "Please fill the form");
					}else {
	                try {
	                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

	                    String query = "INSERT INTO staff values(0,'" + firstname + "','" + lastname + "','" + address + "','" +
	                        phone + "','" + email + "','" + title + "','"+ hours +"','"+ salary +"')";

	                    Statement sta = connection.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                        JOptionPane.showMessageDialog(btnSubmit, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnSubmit,
	                            "Welcome, " + msg + "Your account is sucessfully created");
	                    }
	                    connection.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                }
					
					}
					}
	                else {
						JOptionPane.showMessageDialog(btnSubmit, "You have enterd email or contact number wrong!");
					    
					}
					}
	        });
		
		btnSubmit.setForeground(new Color(0, 0, 255));
		btnSubmit.setFont(new Font("Serif", Font.BOLD, 12));
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setBounds(736, 612, 73, 23);
		frame.getContentPane().add(btnSubmit);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLUE);
		separator.setBounds(0, 79, 1330, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLUE);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(240, 79, 2, 697);
		frame.getContentPane().add(separator_1);
	}
}

