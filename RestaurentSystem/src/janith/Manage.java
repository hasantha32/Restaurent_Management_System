package janith;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Manage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage window = new Manage();
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
	public Manage() {
		initialize();
	}
	Connection connection=null;

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
		label.setBounds(596, 25, 253, 35);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("Dashboard");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard abc =new Dashboard();
				Dashboard.main(null);
				frame.setVisible(false);
			}
		});
		
			
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setFont(new Font("Serif", Font.BOLD, 14));
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(0, 91, 238, 43);
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
		button_1.setBounds(0, 135, 238, 43);
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
		button_2.setBounds(0, 179, 238, 43);
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
		button_3.setBounds(0, 223, 238, 43);
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
		button_4.setBounds(0, 267, 238, 43);
		frame.getContentPane().add(button_4);
		
		JLabel lblEnterAttendenceDetails = new JLabel("Enter Attendence Details");
		lblEnterAttendenceDetails.setFont(new Font("Serif", Font.BOLD, 18));
		lblEnterAttendenceDetails.setBounds(248, 97, 238, 27);
		frame.getContentPane().add(lblEnterAttendenceDetails);
		
		JLabel lblEnterMonth = new JLabel("Enter Month :");
		lblEnterMonth.setFont(new Font("Serif", Font.BOLD, 12));
		lblEnterMonth.setBounds(248, 147, 111, 14);
		frame.getContentPane().add(lblEnterMonth);
		
		JLabel lblHoursToWorked = new JLabel("Hours To Worked :");
		lblHoursToWorked.setFont(new Font("Serif", Font.BOLD, 12));
		lblHoursToWorked.setBounds(248, 175, 111, 14);
		frame.getContentPane().add(lblHoursToWorked);
		
		JLabel label_3 = new JLabel("Enter First Name :");
		label_3.setFont(new Font("Serif", Font.BOLD, 12));
		label_3.setBounds(248, 204, 111, 14);
		frame.getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(352, 144, 294, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(352, 173, 294, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(352, 202, 294, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String month = textField.getText();
                String hours = textField_1.getText();
                String fname = textField_2.getText();
                
                String msg = "" + fname;
                msg += " \n";
                

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

                    String query = "INSERT INTO attendance values(0,'" + month + "','" + hours + "','" + fname + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton_1, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton_1,
                            "" + msg + "Your attendance is sucessfully added");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(576, 243, 70, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblEmployeeProfile = new JLabel("Employee Profile");
		lblEmployeeProfile.setFont(new Font("Serif", Font.BOLD, 18));
		lblEmployeeProfile.setBounds(246, 297, 238, 27);
		frame.getContentPane().add(lblEmployeeProfile);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				try {
					 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					 String selection=(String)comboBox.getSelectedItem();
					 
					 String query="select eid,firstname,address,title from staff where "+selection+"=? ";
						PreparedStatement pst=connection.prepareStatement(query);
						pst.setString(1,textField_3.getText());
						ResultSet rs=pst.executeQuery();
						
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
						/*while(rs.next()) {
							
						}*/
						
						pst.close();

				}
				
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(1035, 304, 150, 20);
		frame.getContentPane().add(textField_3);
		
		JButton button_8 = new JButton("LogOut");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffLogin abc =new StaffLogin();
				StaffLogin.main(null);
			}
		});
		button_8.setFont(new Font("Serif", Font.BOLD, 12));
		button_8.setBackground(SystemColor.controlDkShadow);
		button_8.setBounds(1092, 36, 85, 23);
		frame.getContentPane().add(button_8);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLUE);
		separator.setBounds(0, 85, 1324, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLUE);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(240, 85, 4, 686);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(Color.BLUE);
		separator_4.setBounds(241, 283, 1083, 9);
		frame.getContentPane().add(separator_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(264, 348, 802, 288);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(Color.BLACK);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_2 = new JButton("Load Employee Details");
		btnNewButton_2.addActionListener(new ActionListener() {
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
		btnNewButton_2.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_2.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton_2.setBounds(554, 657, 253, 43);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update abc =new Update();
				Update.main(null);
			}
		});
		btnNewButton_3.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_3.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton_3.setBounds(1076, 480, 125, 35);
		frame.getContentPane().add(btnNewButton_3);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"EmployeeID", "FirstName", "Address", "Title"}));
		comboBox.setBounds(860, 303, 150, 20);
		frame.getContentPane().add(comboBox);
	}
}
