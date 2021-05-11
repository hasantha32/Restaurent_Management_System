package logins;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class temp {
/*	
	public double calEachTotal(int q,double up){
		
		double eTotal = 0;
		eTotal = q * up;
		
		return eTotal;
	}
	
	private void showData(){
		
		String cashCombo1 = comboFood.getSelectedItem().toString();
		int cashCombo_1 = Integer.parseInt(cashCombo1);
		
try{
	
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/resturent","root","");

	DefaultTableModel x = new DefaultTableModel();  
	x.addColumn("ItemNo");
	x.addColumn("ItemName");
	x.addColumn("Ingredients");
	x.addColumn("unit_Price");
	x.addColumn("Quantity");
	x.addColumn("eachTotal");
	
	System.out.println("yyyyyyyyyyyyyy");
	
	try{
		String q = "SELECT * FROM food where name = '"+tid+"' ";
		Statement ss = conn.createStatement();
		ResultSet rs = ss.executeQuery(q);
		double tempUp = Double.parseDouble(rs.getString("unitPrice"));
		double eTot = calEachTotal(cashCombo_1,tempUp);
		while(rs.next()){
			x.addRow(new Object[]{
					rs.getString("fid"),
					rs.getString("name"),
					rs.getString("ingredients"),
					rs.getString("unitprice"),
					rs.getInt(cashCombo_1),
				//	rs.getDouble(eTot);
			});
			
			System.out.println("ffffffffffffffff");
		}
		
		ss.close();
		rs.close();
		conn.close();
		
	table.setModel(x);
		table.setAutoResizeMode(0);
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		

	}catch(Exception e){
		System.out.println(e);
	}

}catch(Exception e){
	System.out.println(e);
}
		
	}
	
	*/	
}

/*
 package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Cashier extends JFrame{

	private JPanel contentPane;
	private JTextField textCusUname;
	private JTextField textCusAddress;
	private JTextField textCusMobile;
	private JTextField textField_3;
	private JButton btnPrint;
	private JComboBox<String> comboFood;
	private JTextField textTotal;
	private JTextField textPayment;
	private JTextField textBalance;
	private JSpinner Quantity;
	private JTextField textValue;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cashier frame = new Cashier();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
	 	System.out.println(sdf.format(date));
	 
	}

//functions for always use	
	

	
//Methods of the buttons
	
	private void printError(){//handle print errors
	try{
		if(textCusUname.getText().equals("") || textCusAddress.getText().equals("") || textCusMobile.getText().equals("")){
			//btnPrint.setEnabled(false);
			System.out.println("Unfilled text fields");
		}else{
			//btnPrint.setEnabled(true);
		}
		
				
	}catch(Exception e){
		System.out.println(e);
	}
			

		
	}
	
	private void comboFood(){
		try{
			String food = "select * from food ";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/resturent","root","");
			Statement stmt = conn.createStatement();
			ResultSet rst = stmt.executeQuery(food);
			while(rst.next()){
				comboFood.addItem(rst.getString("name"));
			}
	
		}catch(Exception e){
			System.out.println(e);
		}
	}//end of method
	
	public Cashier() {
		addWindowListener(new WindowAdapter() {

		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1092, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCusUname = new JTextField();
		textCusUname.setFont(new Font("Tahoma", Font.BOLD, 12));
		textCusUname.setBounds(36, 113, 186, 20);
		contentPane.add(textCusUname);
		textCusUname.setColumns(10);
		
		textCusAddress = new JTextField();
		textCusAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		textCusAddress.setBounds(36, 162, 186, 20);
		contentPane.add(textCusAddress);
		textCusAddress.setColumns(10);
		
		textCusMobile = new JTextField();
		textCusMobile.setBounds(36, 215, 113, 20);
		contentPane.add(textCusMobile);
		textCusMobile.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_3.setBounds(36, 270, 113, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		comboFood = new JComboBox<String>();
		comboFood.setToolTipText("Add Products");
		comboFood.setBounds(289, 114, 186, 20);
		contentPane.add(comboFood);
		comboFood();
		
		btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
				
			try{
				
				}catch(NumberFormatException e){
					System.out.println("NO number inserted! or invalid number");
				}		
			
				String cName = textCusUname.getText();
				String cAddress = textCusAddress.getText();
				String Mobile = textCusMobile.getText();
				int cMobile = Integer.parseInt(Mobile);

				if(!textCusMobile.getText().equals("")){
					//cMobile =Integer.parseInt(Mobile);
				}
				
				printError();
				//String cname = textCusUname.getText();
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/resturent","root","");
					//Statement stmt = conn.createStatement();
					PreparedStatement pstmt = conn.prepareStatement("insert into customer (customerName, address, mobileNo) values('"+cName+"', '"+cAddress+"', '"+cMobile+"')  ");
					pstmt.executeUpdate();
					
					conn.close();
					
					textCusUname.setText(null);
					textCusAddress.setText(null);
					textCusMobile.setText(null);
					
					
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e);
				}
				finally{
					System.out.println( "Data insertion complete!");
				}
			
			}
		});
		

		
		
		btnPrint.setBounds(638, 22, 89, 23);
		contentPane.add(btnPrint);
	
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cashCombo1 = comboFood.getSelectedItem().toString();
				//int cashCombo_1 = Integer.parseInt(cashCombo1);
				System.out.println(cashCombo1);
				
				try{	
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/resturent","root","");
					
					Statement stmtC = conn.createStatement();
					ResultSet rst = stmtC.executeQuery("SELECT * from food  where name = '"+ cashCombo1 +"' ");
				
					DefaultTableModel x = (DefaultTableModel)table.getModel();
			
					x.setRowCount(0);
					
					while(rst.next())
					{
						Object o[] = {rst.getString("fid"),rst.getString("name")};
						x.addRow(o);
					}
					
				}catch(SQLException | ClassNotFoundException e){
					//Logger.getLogger(table.class.getName()).log(Level.SEVERE,null,));
					System.out.println(e);
				}

			}
		});
		btnLoad.setBounds(48, 370, 89, 23);
		contentPane.add(btnLoad);
		
		textTotal = new JTextField();
		textTotal.setBounds(782, 50, 268, 20);
		contentPane.add(textTotal);
		textTotal.setColumns(10);
		
		textPayment = new JTextField();
		textPayment.setBounds(851, 114, 159, 20);
		contentPane.add(textPayment);
		textPayment.setColumns(10);
		
		textBalance = new JTextField();
		textBalance.setBounds(851, 178, 159, 20);
		contentPane.add(textBalance);
		textBalance.setColumns(10);
		
		JPanel panelCash1 = new JPanel();
		panelCash1.setName("Sales");
		panelCash1.setToolTipText("Sales");
		panelCash1.setForeground(Color.CYAN);
		panelCash1.setBackground(Color.MAGENTA);
		panelCash1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelCash1.setBounds(10, 11, 618, 62);
		contentPane.add(panelCash1);
		panelCash1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(888, 26, 46, 14);
		contentPane.add(lblTotal);
		
		JLabel lblPayment = new JLabel("Payment");
		lblPayment.setBounds(888, 89, 63, 14);
		contentPane.add(lblPayment);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setBounds(888, 153, 46, 14);
		contentPane.add(lblBalance);
		
		JTextArea textBill = new JTextArea();
		textBill.setBounds(818, 295, 216, 304);
		contentPane.add(textBill);
		
		Quantity = new JSpinner();
		Quantity.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
			int quantity = Integer.parseInt(Quantity.getValue().toString());
				double price = Double.parseDouble(textValue.getText());
		//Make double output with precision		
				double total = Double.parseDouble(String.format("%.2f", quantity * price ));
		//validate the total text field>>		
			if(total > 0)
				textTotal.setText(String.valueOf(total)); //convert to string
			else
				textTotal.setText(null);
				
			}
		});
		Quantity.setBounds(621, 113, 89, 40);
		contentPane.add(Quantity);
		
		textValue = new JTextField();
		textValue.setBounds(505, 114, 86, 20);
		contentPane.add(textValue);
		textValue.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(225, 370, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(396, 370, 89, 23);
		contentPane.add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 447, 629, 139);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "ItemID", "ItemName"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		

		
	}
}
*/
