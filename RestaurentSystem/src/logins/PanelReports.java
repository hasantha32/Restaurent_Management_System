package logins;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class PanelReports extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public PanelReports() {
		setBounds(0,0,800,550);
		setLayout(null);
		
		JDateChooser dateChooser1 = new JDateChooser();
		dateChooser1.setBounds(39, 30, 136, 30);
		add(dateChooser1);
		
		JButton button = new JButton("LOAD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Date date = dateChooser1.getDate();
				String strDate = DateFormat.getDateInstance().format(date);
				System.out.println(strDate);
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurent_management","root","");
					Statement searchR = conn.createStatement();
				//test code	String sql = "INSERT INTO billinventory VALUES('5','3','3001','Hasch', '"+strDate+"')"; 
					String sql = "SELECT * FROM billinventory where billedDate='"+strDate+"'  ";
					searchR.execute(sql);
					
					
					
					
					
					
					
					
					conn.close();
				}catch(Exception insert){
					System.out.println(insert);
				}
				
			
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button.setBounds(206, 30, 81, 30);
		add(button);
		
		JLabel label = new JLabel("Print Bill For Official Use :");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setBounds(515, 30, 165, 37);
		add(label);
		
		JButton button_1 = new JButton("PRINT");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_1.setBounds(709, 27, 81, 30);
		add(button_1);
		
		JLabel lblMaxSoldItems = new JLabel("MAX SOLD ITEMS :");
		lblMaxSoldItems.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMaxSoldItems.setBounds(35, 145, 159, 30);
		add(lblMaxSoldItems);
		
		JLabel lblNewLabel_2 = new JLabel("QUANTITY :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(39, 217, 107, 30);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TOTAL SALES :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(35, 282, 140, 18);
		add(lblNewLabel_3);
		
		JLabel lblTotalSales = new JLabel("TOTAL SALES :");
		lblTotalSales.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTotalSales.setBounds(447, 283, 129, 17);
		add(lblTotalSales);
		
		JLabel lblQuantity = new JLabel("QUANTITY  :");
		lblQuantity.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblQuantity.setBounds(460, 218, 116, 29);
		add(lblQuantity);
		
		JLabel lblNewLabel = new JLabel("MIN SOLD ITEMS :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(447, 149, 165, 22);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.GREEN);
		textField.setBounds(204, 146, 165, 30);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.PINK);
		textField_1.setBounds(622, 146, 168, 25);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.ORANGE);
		textField_2.setBounds(206, 219, 81, 29);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(Color.ORANGE);
		textField_3.setBounds(206, 280, 81, 30);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.CYAN);
		textField_4.setBounds(622, 215, 86, 32);
		add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(Color.CYAN);
		textField_5.setBounds(622, 280, 86, 30);
		add(textField_5);
		
		JLabel label_1 = new JLabel("Enter Date :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_1.setBounds(44, 11, 113, 14);
		add(label_1);
		setVisible(true);
	}
}
