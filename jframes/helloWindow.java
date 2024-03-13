package jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Doctor;
import classes.doctorsTree;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class helloWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					helloWindow frame = new helloWindow();
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
	public helloWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 517);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 878, 69);
		contentPane.add(lblNewLabel);
		
		JButton btnAppointment = new JButton("New appointment ");
		btnAppointment.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		btnAppointment.setBounds(32, 227, 262, 103);
		contentPane.add(btnAppointment);
		btnAppointment.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				newAppointment napp = new newAppointment();
				napp.setVisible(true);
				
			}
		});
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Please click your choice");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 105, 858, 56);
		contentPane.add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login as doctor");
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		btnLogin.setBounds(584, 228, 267, 100);
		contentPane.add(btnLogin);
		
		JButton btnLoginAsPatient = new JButton("Login as patient");
		btnLoginAsPatient.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		btnLoginAsPatient.setBounds(304, 227, 270, 103);
		contentPane.add(btnLoginAsPatient);
		
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				
			}
		});
		
		
		btnLoginAsPatient.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				patientLogin plogin = new patientLogin();
				plogin .setVisible(true);
				
			}
		});
		
		
	}
}
