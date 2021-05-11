package pub;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UpdateM {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateM window = new UpdateM();
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
	public UpdateM() {
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
		
		JLabel label = new JLabel("GRAND MANSION Restaurant");
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setBounds(429, 11, 392, 44);
		frame.getContentPane().add(label);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setText("ID");
		editorPane.setFont(new Font("Tahoma", Font.BOLD, 18));
		editorPane.setBounds(354, 198, 63, 28);
		frame.getContentPane().add(editorPane);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setEditable(false);
		editorPane_2.setText("NAME");
		editorPane_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		editorPane_2.setBounds(354, 273, 63, 33);
		frame.getContentPane().add(editorPane_2);
		
		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setEditable(false);
		editorPane_4.setText("PRICE");
		editorPane_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		editorPane_4.setBounds(354, 348, 74, 33);
		frame.getContentPane().add(editorPane_4);
		
		JEditorPane dtrpnType = new JEditorPane();
		dtrpnType.setEditable(false);
		dtrpnType.setText("TYPE");
		dtrpnType.setFont(new Font("Tahoma", Font.BOLD, 18));
		dtrpnType.setBounds(354, 488, 89, 33);
		frame.getContentPane().add(dtrpnType);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 66, 1234, 9);
		frame.getContentPane().add(separator);
		
		JButton btnUpdate_1 = new JButton("UPDATE");
		btnUpdate_1.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				
				String Type1 = comboBox.getSelectedItem().toString();
				
				
				
				
				
				if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals("") ||textField_3.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill the form");
				}else {
				
				
				try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

                    String query = "Update pubinventory set ItemName='"+textField_1.getText()+"',UPrice='"+textField_2.getText()+"',Type='"+comboBox.getSelectedItem()+"',Quantity='"+textField_3.getText()+"'where ItemID='"+textField.getText()+"'";

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
		btnUpdate_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdate_1.setBounds(831, 617, 108, 52);
		frame.getContentPane().add(btnUpdate_1);
		
		JButton button = new JButton("BACK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inventry inbh = new Inventry ();
				Inventry.main(null);
				frame.setVisible(false);
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(74, 114, 89, 44);
		frame.getContentPane().add(button);
		
		String country[]={"Whisky","Beer"};
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(472, 198, 318, 37);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(472, 273, 318, 37);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(472, 417, 318, 37);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(472, 348, 318, 37);
		frame.getContentPane().add(textField_3);
		
		JEditorPane dtrpnQuantity = new JEditorPane();
		dtrpnQuantity.setText("Quantity");
		dtrpnQuantity.setFont(new Font("Tahoma", Font.BOLD, 18));
		dtrpnQuantity.setEditable(false);
		dtrpnQuantity.setBounds(354, 417, 89, 33);
		frame.getContentPane().add(dtrpnQuantity);
		
	    comboBox = new JComboBox();
	    comboBox.addItem("Whisky");
	    comboBox.addItem("Beer");
		comboBox.setBounds(472, 488, 318, 33);
		frame.getContentPane().add(comboBox);
		
		JButton button_1 = new JButton("Delete");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					String query="Delete from pubinventory where ItemID='"+textField.getText()+"'";
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
		button_1.setBounds(988, 617, 108, 52);
		frame.getContentPane().add(button_1);
	}
}
