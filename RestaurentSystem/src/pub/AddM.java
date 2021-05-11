package pub;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class AddM {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddM window = new AddM();
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
	public AddM() {
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
		label.setBounds(465, 11, 392, 44);
		frame.getContentPane().add(label);
		
		JEditorPane dtrpnId = new JEditorPane();
		dtrpnId.setEditable(false);
		dtrpnId.setFont(new Font("Tahoma", Font.BOLD, 18));
		dtrpnId.setText("Quantity");
		dtrpnId.setBounds(282, 315, 89, 28);
		frame.getContentPane().add(dtrpnId);
		
		JEditorPane dtrpnName = new JEditorPane();
		dtrpnName.setEditable(false);
		dtrpnName.setFont(new Font("Tahoma", Font.BOLD, 18));
		dtrpnName.setText("NAME");
		dtrpnName.setBounds(282, 229, 63, 33);
		frame.getContentPane().add(dtrpnName);
		
		JEditorPane dtrpnPrice = new JEditorPane();
		dtrpnPrice.setEditable(false);
		dtrpnPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		dtrpnPrice.setText("PRICE");
		dtrpnPrice.setBounds(282, 407, 74, 33);
		frame.getContentPane().add(dtrpnPrice);
		
		JEditorPane dtrpnAvailability = new JEditorPane();
		dtrpnAvailability.setEditable(false);
		dtrpnAvailability.setFont(new Font("Tahoma", Font.BOLD, 18));
		dtrpnAvailability.setText("TYPE");
		dtrpnAvailability.setBounds(282, 500, 142, 33);
		
		 frame.getContentPane().add(dtrpnAvailability);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 79, 1234, 9);
		frame.getContentPane().add(separator);
		
		JButton button_1 = new JButton("BACK");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inventry inven = new Inventry ();
				Inventry.main(null);
				frame.setVisible(false);
				
				
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(34, 126, 89, 44);
		frame.getContentPane().add(button_1);
		
		JButton btnAdd = new JButton("ADD");
		
		
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdd.setBounds(993, 617, 108, 52);
		frame.getContentPane().add(btnAdd);
		
		String country[]={"Whisky","Beer"};  
		JComboBox comboBox = new JComboBox(country);
		comboBox.setToolTipText("");
		//comboBox.setToolTipText("");
		comboBox.setEditable(true);
		comboBox.setBounds(561, 513, 233, 20);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(561, 315, 262, 37);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(561, 229,262,33);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(561, 407, 262, 37);
		frame.getContentPane().add(textField_2);
		
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				String Quantity = textField.getText();
                String Name = textField_1.getText();
                String Price = textField_2.getText();
                String Type = comboBox.getSelectedItem().toString();
             
              

                String msg = "" + Name;
                msg += " \n";
			
                System.out.println(Type+"-"+Name);
                
                
                if(textField.getText().equals("")||textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill the form");
				}else {

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

                    String query = "INSERT INTO pubinventory(ItemName,UPrice,Type,Quantity) values('" + Name + "','" + Price + "','" + Type + "','"+Quantity+"')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnAdd, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnAdd,
                            "Welcome, " + msg + "Item Added Successfully");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
				}
			}
                
		
			
			
		});
		
		
		
		    
		
		
		
		
	}
}
