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
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;

public class SalaryCalculate {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldSalary;
	protected Connection connection;
	protected String Email;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalaryCalculate window = new SalaryCalculate();
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
	public SalaryCalculate() {
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
			public void actionPerformed(ActionEvent e) {
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
		button_5.setBounds(1119, 34, 82, 23);
		frame.getContentPane().add(button_5);
		
		JLabel lblNewLabel = new JLabel("Employee Monthly Salary Calculation");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel.setBounds(248, 92, 387, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name :");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 14));
		lblNewLabel_1.setBounds(252, 152, 169, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(437, 155, 361, 20);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblEnterLastName = new JLabel("Salary :");
		lblEnterLastName.setFont(new Font("Serif", Font.BOLD, 14));
		lblEnterLastName.setBounds(254, 224, 131, 23);
		frame.getContentPane().add(lblEnterLastName);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(437, 227, 361, 20);
		frame.getContentPane().add(textFieldSalary);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLUE);
		separator.setBounds(0, 79, 1330, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLUE);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(240, 79, 2, 697);
		frame.getContentPane().add(separator_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(252, 273, 682, 296);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxETF = new JCheckBox("ETF");
		chckbxETF.setBounds(19, 23, 97, 23);
		panel.add(chckbxETF);
		
		JCheckBox chckbxEPF = new JCheckBox("EPF");
		chckbxEPF.setBounds(19, 83, 97, 23);
		panel.add(chckbxEPF);
		
		JLabel lblNewLabel_2 = new JLabel("ETF Amount");
		lblNewLabel_2.setBounds(151, 27, 79, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("EPF Amount");
		lblNewLabel_3.setBounds(151, 87, 79, 14);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(240, 24, 304, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(240, 84, 304, 20);
		panel.add(textField_1);
		
		JLabel lblGrossSalary = new JLabel("Gross Salary :");
		lblGrossSalary.setFont(new Font("Serif", Font.BOLD, 14));
		lblGrossSalary.setBounds(99, 137, 131, 23);
		panel.add(lblGrossSalary);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(198, 140, 257, 20);
		panel.add(textField_2);
		
		JLabel lblAllowance = new JLabel("Allowance :");
		lblAllowance.setFont(new Font("Serif", Font.BOLD, 14));
		lblAllowance.setBounds(19, 193, 169, 23);
		panel.add(lblAllowance);
		
		JLabel lblNewSalary = new JLabel("Net Salary :");
		lblNewSalary.setFont(new Font("Serif", Font.BOLD, 14));
		lblNewSalary.setBounds(19, 244, 144, 23);
		panel.add(lblNewSalary);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(168, 196, 219, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(168, 247, 219, 20);
		panel.add(textField_4);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			
			double empname,sal,etf,epf,etfamount,epfamount,gsal,allow,nsal;
			public void actionPerformed(ActionEvent arg0) {
				
				 sal= Double.parseDouble(textFieldSalary.getText());
				 
				 if(chckbxETF.isSelected()==true)
				 {
					 etfamount=sal*10/100;
				 }
				 
				 if(chckbxEPF.isSelected()==true)
				 {
					 epfamount=sal*5/100;
				 }
				 
				 textField.setText(String.valueOf(etfamount));
				 textField_1.setText(String.valueOf(epfamount));
				 
				 gsal=sal-(etfamount+epfamount);
				 textField_2.setText(String.valueOf(gsal));
				 
				 if(sal>50000) {
					 allow=2000;
				 }
				 
				 else if(sal>30000) {
					 allow=1000;
				 }
				 else {
					 allow=0;
				 }
				 textField_3.setText(String.valueOf(allow));
				 
				 nsal=gsal+allow;
				 textField_4.setText(String.valueOf(nsal));
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton.setBounds(516, 232, 97, 46);
		panel.add(btnNewButton);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(437, 193, 361, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel lblMonth = new JLabel("Month :");
		lblMonth.setFont(new Font("Serif", Font.BOLD, 14));
		lblMonth.setBounds(252, 190, 169, 23);
		frame.getContentPane().add(lblMonth);
		
		JButton btnNewButton_1 = new JButton("Add Records");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 String name = textFieldName.getText();
	                String month = textField_5.getText();
	                String salary = textFieldSalary.getText();
	                String etf = textField.getText();
	                String epf = textField_1.getText();
	                String gsal = textField_2.getText();
	                String allow =textField_3.getText();
	                String nsal = textField_4.getText();
	                

	                String msg = "" + name;
	                msg += " \n";
	                

	                try {
	                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

	                    String query = "INSERT INTO salary values(0,'" + name + "','" + month + "','" + salary + "','" +
	                        etf + "','" + epf + "','" + gsal + "','"+ allow +"','"+ nsal +"')";

	                    Statement sta = connection.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                        JOptionPane.showMessageDialog(btnNewButton_1, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnNewButton_1,
	                            " " + msg + "Your record is successfully added!!");
	                    }
	                    connection.close();
	                } catch (Exception exception) {
	                    exception.printStackTrace();
	                }
			}
		});
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton_1.setBounds(768, 597, 166, 43);
		frame.getContentPane().add(btnNewButton_1);
	}
}
