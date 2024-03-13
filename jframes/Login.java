package jframes;
import classes.Doctor;
import classes.doctorsTree;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.parser.DTD;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import jframes.helloWindow;
import javax.swing.JPasswordField;

public class Login extends JFrame {
	
	
	
	
	
	
	
	
	

	private JPanel contentPane;
	 JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 866, 509);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wolcome to Hospital management system");
		lblNewLabel.setBounds(5, 5, 842, 43);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 32));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(176, 131, 551, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblusername = new JLabel("User name");
		lblusername.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblusername.setBounds(10, 131, 141, 28);
		contentPane.add(lblusername);
		
		JLabel lblpassword = new JLabel("password");
		lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblpassword.setBounds(10, 215, 141, 28);
		contentPane.add(lblpassword);
		
		passwordField = new  JPasswordField();
		passwordField .setColumns(10);
		passwordField .setBounds(176, 215, 551, 28);
		contentPane.add(passwordField );
		//doctorsTree dt = new doctorsTree();
	/*	Doctor d1 = new Doctor("123123", "malek", "09876", "eyes", 789," malek", "admin", 8);
		Doctor d2 = new Doctor("123123", "kjhkjh", "09876", "eyes", 789," malek", "admin", 8);
		Doctor d3 = new Doctor("123123", "dfg", "09876", "eyes", 789," malek", "admin", 8);
		Doctor d4 = new Doctor("123123", "poik", "09876", "eyes", 789," malek", "admin", 8);
		Doctor d5 = new Doctor("123123", "alkjh", "09876", "eyes", 789," malek", "admin", 8);
		Doctor d6 = new Doctor("123123", "uiui", "09876", "eyes", 789," malek", "admin", 8);
		dt.insert(d1);
		dt.insert(d2);
		dt.insert(d3);
		dt.insert(d4);
		dt.insert(d5);
		dt.insert(d6);
		System.out.println("done");
		*/
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBounds(176, 347, 155, 38);
		contentPane.add(btnNewButton);
		
//		passwordField = new JPasswordField();
//		passwordField.setBounds(361, 272, 31, 19);
//		contentPane.add(passwordField);
//		String i = String.valueOf(passwordField);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String password =  mainclass.mainclass.dt.searcByNameGetPassword(textField.getText());
				
					if(password.equals(		String.valueOf(passwordField.getPassword()) ) ) {
						
						
						doctorsframe df = new doctorsframe();
						df.setVisible(true);
						
						
						
					}
					else {
						JOptionPane.showMessageDialog(null, "wrong password or user name!",
					               " ", JOptionPane.ERROR_MESSAGE);
						
					}
					
					
					
					
					
				
				
				
			}
		});
		
		
		
		
	}
}
