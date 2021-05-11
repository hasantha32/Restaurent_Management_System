package janith;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Dashboard {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
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
	public Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		
		panel.setBounds(0, 0, 325, 711);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Dashboard");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(255, 255, 255));
		
		btnNewButton.setBounds(10, 144, 305, 50);
		panel.add(btnNewButton);
		
		JButton btnAddStaff = new JButton("Add Staff");
		btnAddStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addingstaff abc =new addingstaff();
				addingstaff.main(null);
			}
		});
		btnAddStaff.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddStaff.setFont(new Font("Serif", Font.BOLD, 14));
		btnAddStaff.setForeground(new Color(255, 255, 255));
		
		btnAddStaff.setBounds(10, 194, 305, 50);
		panel.add(btnAddStaff);
		
		JButton btnManageEmployeeProfile = new JButton("Manage Employee Profile");
		btnManageEmployeeProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manage abc =new Manage();
				Manage.main(null);
			}
		});
		btnManageEmployeeProfile.setHorizontalAlignment(SwingConstants.LEFT);
		btnManageEmployeeProfile.setForeground(new Color(255, 255, 255));
		btnManageEmployeeProfile.setFont(new Font("Serif", Font.BOLD, 14));
		
		btnManageEmployeeProfile.setBounds(10, 243, 305, 50);
		panel.add(btnManageEmployeeProfile);
		
		JButton btnViewReport = new JButton("View Report");
		btnViewReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewReport abc =new ViewReport();
				ViewReport.main(null);
			}
		});
		btnViewReport.setHorizontalAlignment(SwingConstants.LEFT);
		btnViewReport.setForeground(new Color(255, 255, 255));
		btnViewReport.setFont(new Font("Serif", Font.BOLD, 14));
		
		btnViewReport.setBounds(10, 292, 305, 50);
		panel.add(btnViewReport);
		
		JButton btnCalculateSalary = new JButton("Calculate Salary");
		btnCalculateSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalaryCalculate abc =new SalaryCalculate();
				SalaryCalculate.main(null);
			}
		});
		btnCalculateSalary.setHorizontalAlignment(SwingConstants.LEFT);
		btnCalculateSalary.setForeground(new Color(255, 255, 255));
		btnCalculateSalary.setFont(new Font("Serif", Font.BOLD, 14));
		
		btnCalculateSalary.setBounds(10, 341, 305, 50);
		panel.add(btnCalculateSalary);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 87, 325, 15);
		panel.add(separator_2);
		
		JButton btnNewButton_1 = new JButton("Add Staff");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Serif", Font.BOLD, 22));
		//Image photo=new ImageIcon(this.getClass().getResource("/addstaff.png")).getImage();
		//btnNewButton_1.setIcon(new ImageIcon(photo));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addingstaff abc =new addingstaff();
				addingstaff.main(null);
			}
		});
		btnNewButton_1.setBounds(430, 140, 250, 200);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnManageEmployeeProfile_1 = new JButton("Manage Employee ");
		btnManageEmployeeProfile_1.setForeground(Color.WHITE);
		btnManageEmployeeProfile_1.setFont(new Font("Serif", Font.BOLD, 22));
		//Image photo2=new ImageIcon(this.getClass().getResource("/manage.png")).getImage();
		//button.setIcon(new ImageIcon(photo2));
		btnManageEmployeeProfile_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manage abc =new Manage();
				Manage.main(null);
			}
		});
		btnManageEmployeeProfile_1.setBounds(909, 140, 250, 200);
		frame.getContentPane().add(btnManageEmployeeProfile_1);
		
		JButton btnViewReport_1 = new JButton("View Report");
		btnViewReport_1.setForeground(Color.WHITE);
		btnViewReport_1.setFont(new Font("Serif", Font.BOLD, 22));
		btnViewReport_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewReport abc =new ViewReport();
				ViewReport.main(null);
			}
		});
		//Image photo3=new ImageIcon(this.getClass().getResource("/viewrepo.png")).getImage();
		//button_1.setIcon(new ImageIcon(photo3));
		btnViewReport_1.setBounds(430, 400, 250, 200);
		frame.getContentPane().add(btnViewReport_1);
		
		JButton btnCalculateSalary_1 = new JButton("Calculate Salary");
		btnCalculateSalary_1.setForeground(Color.WHITE);
		btnCalculateSalary_1.setFont(new Font("Serif", Font.BOLD, 22));
		btnCalculateSalary_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalaryCalculate abc =new SalaryCalculate();
				SalaryCalculate.main(null);
			}
		});
		//Image photo4=new ImageIcon(this.getClass().getResource("/calsal.png")).getImage();
		//button_2.setIcon(new ImageIcon(photo4));
		btnCalculateSalary_1.setBounds(909, 400, 250, 200);
		frame.getContentPane().add(btnCalculateSalary_1);
		
		JButton btnNewButton_2 = new JButton("LogOut");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffLogin abc =new StaffLogin();
				StaffLogin.main(null);
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		
		btnNewButton_2.setFont(new Font("Serif", Font.BOLD, 14));
		btnNewButton_2.setBounds(1079, 26, 145, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(326, 86, 21, 625);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 86, 1234, 15);
		frame.getContentPane().add(separator_1);
		frame.setBounds(350, 150, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
