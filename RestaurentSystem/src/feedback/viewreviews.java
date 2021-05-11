package feedback;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import services.FeedbackService;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewreviews {

	private JFrame frame;
	private JTextField txtViewReviews;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewreviews window = new viewreviews();
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
	public viewreviews() {
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
		
		txtViewReviews = new JTextField();
		txtViewReviews.setEditable(false);
		txtViewReviews.setText("                                                                                 VIEW REVIEWS");
		txtViewReviews.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtViewReviews.setColumns(10);
		
		txtViewReviews.setBounds(0, 42, 1412, 82);
		frame.getContentPane().add(txtViewReviews);
		
		JTextArea txtrHowIsOur = new JTextArea();
		txtrHowIsOur.setForeground(Color.BLACK);
		txtrHowIsOur.setEditable(false);
		txtrHowIsOur.setText("How is our service...");
		txtrHowIsOur.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
		
		txtrHowIsOur.setBounds(103, 157, 238, 29);
		frame.getContentPane().add(txtrHowIsOur);
		
		JLabel sex = new JLabel("Excellent");
		sex.setBackground(new Color(0, 0, 0));
		sex.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sex.setBounds(388, 214, 110, 29);
		frame.getContentPane().add(sex);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(489, 224, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 182, 193));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(508, 214, 45, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel sex_1 = new JLabel("Excellent");
		sex_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sex_1.setBounds(388, 444, 110, 29);
		frame.getContentPane().add(sex_1);
		
		JLabel sex_2 = new JLabel("Excellent");
		sex_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sex_2.setBounds(929, 214, 110, 29);
		frame.getContentPane().add(sex_2);
		
		JLabel lblVeryGood = new JLabel("Very Good");
		lblVeryGood.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVeryGood.setBounds(388, 250, 110, 29);
		frame.getContentPane().add(lblVeryGood);
		
		JLabel lblVeryGood_1 = new JLabel("Very Good");
		lblVeryGood_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVeryGood_1.setBounds(388, 483, 110, 29);
		frame.getContentPane().add(lblVeryGood_1);
		
		JLabel lblVeryGood_2 = new JLabel("Very Good");
		lblVeryGood_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVeryGood_2.setBounds(929, 251, 110, 29);
		frame.getContentPane().add(lblVeryGood_2);
		
		JLabel lblGood = new JLabel("Good");
		lblGood.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGood.setBounds(388, 290, 110, 29);
		frame.getContentPane().add(lblGood);
		
		JLabel lblGood_1 = new JLabel("Good");
		lblGood_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGood_1.setBounds(388, 519, 110, 29);
		frame.getContentPane().add(lblGood_1);
		
		JLabel lblGood_1_1 = new JLabel("Good");
		lblGood_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGood_1_1.setBounds(929, 290, 110, 29);
		frame.getContentPane().add(lblGood_1_1);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAverage.setBounds(388, 329, 110, 29);
		frame.getContentPane().add(lblAverage);
		
		JLabel lblAverage_1 = new JLabel("Average");
		lblAverage_1.setForeground(new Color(0, 0, 0));
		lblAverage_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAverage_1.setBounds(388, 554, 110, 29);
		frame.getContentPane().add(lblAverage_1);
		
		JLabel lblAverage_2 = new JLabel("Average");
		lblAverage_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAverage_2.setBounds(929, 332, 110, 29);
		frame.getContentPane().add(lblAverage_2);
		
		JLabel lblPoor = new JLabel("Poor");
		lblPoor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPoor.setBounds(388, 372, 110, 29);
		frame.getContentPane().add(lblPoor);
		
		JLabel lblPoor_1 = new JLabel("Poor");
		lblPoor_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPoor_1.setBounds(388, 598, 110, 29);
		frame.getContentPane().add(lblPoor_1);
		
		JLabel lblPoor_2 = new JLabel("Poor");
		lblPoor_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPoor_2.setBounds(929, 372, 110, 29);
		frame.getContentPane().add(lblPoor_2);
		
		JTextArea txtrHowIsOur_1 = new JTextArea();
		txtrHowIsOur_1.setForeground(Color.BLACK);
		txtrHowIsOur_1.setEditable(false);
		txtrHowIsOur_1.setText("How is our experience...");
		txtrHowIsOur_1.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
		
		txtrHowIsOur_1.setBounds(103, 444, 269, 29);
		frame.getContentPane().add(txtrHowIsOur_1);
		
		JTextArea txtrHowIsOur_1_1 = new JTextArea();
		
		txtrHowIsOur_1_1.setEditable(false);
		txtrHowIsOur_1_1.setText("How is our food...");
		txtrHowIsOur_1_1.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
		
		txtrHowIsOur_1_1.setBounds(693, 157, 215, 29);
		frame.getContentPane().add(txtrHowIsOur_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setBounds(489, 260, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel sg = new JLabel("");
		sg.setBounds(489, 300, 45, 13);
		frame.getContentPane().add(sg);
		
		JLabel sa = new JLabel("");
		sa.setBounds(489, 339, 45, 13);
		frame.getContentPane().add(sa);
		
		JLabel sp = new JLabel("");
		sp.setBounds(489, 382, 45, 13);
		frame.getContentPane().add(sp);
		
		JLabel ee = new JLabel("");
		ee.setBounds(489, 453, 45, 13);
		frame.getContentPane().add(ee);
		
		JLabel ev = new JLabel("");
		ev.setBounds(489, 492, 45, 13);
		frame.getContentPane().add(ev);
		
		JLabel eg = new JLabel("");
		eg.setBounds(489, 528, 45, 13);
		frame.getContentPane().add(eg);
		
		JLabel eag = new JLabel("");
		eag.setBounds(489, 563, 45, 13);
		frame.getContentPane().add(eag);
		
		JLabel ep = new JLabel("");
		ep.setBounds(489, 607, 45, 13);
		frame.getContentPane().add(ep);
		
		JLabel fe = new JLabel("");
		fe.setBounds(1051, 223, 45, 13);
		frame.getContentPane().add(fe);
		
		JLabel fg = new JLabel("");
		fg.setBounds(1051, 259, 45, 13);
		frame.getContentPane().add(fg);
		
		JLabel sa_1 = new JLabel("");
		sa_1.setBounds(1051, 299, 45, 13);
		frame.getContentPane().add(sa_1);
		
		JLabel fa = new JLabel("");
		fa.setBounds(1051, 338, 45, 13);
		frame.getContentPane().add(fa);
		
		JLabel fp = new JLabel("");
		fp.setBounds(1051, 381, 45, 13);
		frame.getContentPane().add(fp);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Feedbacknreview abs = new Feedbacknreview();
				Feedbacknreview.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(189, 183, 107));
		btnNewButton.setBounds(1291, 145, 105, 32);
		frame.getContentPane().add(btnNewButton);
		
		
		FeedbackService service = new FeedbackService();
		lblNewLabel.setText(service.serviceCount().get(0).toString());
		lblNewLabel_2.setText(service.serviceCount().get(1).toString());
		sg.setText(service.serviceCount().get(2).toString());
		sa.setText(service.serviceCount().get(3).toString());
		sp.setText(service.serviceCount().get(4).toString());
		
		
		
		FeedbackService experience = new FeedbackService();
		ee.setText(experience.experienceCount().get(0).toString());
		ev.setText(experience.experienceCount().get(1).toString());
		eg.setText(experience.experienceCount().get(2).toString());
		eag.setText(experience.experienceCount().get(3).toString());
		 ep.setText(experience.experienceCount().get(4).toString());
		 
		 
		 FeedbackService food = new FeedbackService();
		 fe.setText(food.foodCount().get(0).toString());
		 fg.setText(food.foodCount().get(1).toString());
		 sa_1.setText(food.foodCount().get(2).toString());
		 fa.setText(food.foodCount().get(3).toString());
		 fp.setText(food.foodCount().get(4).toString());
		 
		 JButton btnNewButton_1 = new JButton("BACK");
		 btnNewButton_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		
		 		Feedbacknreview fnda = new Feedbacknreview();
		 		Feedbacknreview.main(null);
		 		frame.setVisible(false);
		 		
		 	}
		 });
		 btnNewButton_1.setBounds(1110, 161, 97, 25);
		 frame.getContentPane().add(btnNewButton_1);
	}
}
