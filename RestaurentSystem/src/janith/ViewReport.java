package janith;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;

public class ViewReport {

	private JFrame frame;
	protected Connection connection;
	protected String Email;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewReport window = new ViewReport();
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
	public ViewReport() {
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
			public void actionPerformed(ActionEvent arg0) {
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
		button_5.setBounds(1238, 34, 82, 23);
		frame.getContentPane().add(button_5);
		
		JLabel lblNewLabel = new JLabel("Employee Information");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 20));
		lblNewLabel.setBounds(248, 92, 238, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLUE);
		separator.setBounds(0, 79, 1330, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLUE);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(240, 79, 2, 697);
		frame.getContentPane().add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(248, 137, 1029, 207);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(248, 402, 1029, 207);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblSalaryInformation = new JLabel("Salary Information");
		lblSalaryInformation.setFont(new Font("Serif", Font.BOLD, 20));
		lblSalaryInformation.setBounds(248, 364, 238, 27);
		frame.getContentPane().add(lblSalaryInformation);
		
		JButton btnNewButton = new JButton("Load Details");
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(700, 368, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Load Details");
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton_1.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					
					String query="select * from salary ";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(700, 620, 109, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print Report");
		btnNewButton_2.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton_2.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			           

				            try{
				            	
				                
				                MessageFormat header = new MessageFormat("Grand Mention");
				                MessageFormat footer = new MessageFormat("Page{0,number,integer}");
				                table.print(JTable.PrintMode.NORMAL, header, footer);
				            }catch(java.awt.print.PrinterException er){
				                System.err.format("Cannot print %s%n", er.getMessage());
				            }
				
			}
		});
		btnNewButton_2.setBounds(936, 370, 109, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Print Report");
		btnNewButton_3.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton_3.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try{
		                
		                MessageFormat header = new MessageFormat("Grand Mention");
		                MessageFormat footer = new MessageFormat("Page{0,number,integer}");
		                table_1.print(JTable.PrintMode.NORMAL, header, footer);
		            }catch(java.awt.print.PrinterException er){
		                System.err.format("Cannot print %s%n", er.getMessage());
		            }
			}
		});
		btnNewButton_3.setBounds(936, 620, 109, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
