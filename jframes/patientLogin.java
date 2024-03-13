package jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class patientLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					patientLogin frame = new patientLogin();
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
	public patientLogin() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 792, 430);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter your appointment ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblNewLabel.setBounds(63, 60, 378, 46);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("continue ");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		btnNewButton.setBounds(63, 213, 158, 46);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(73, 116, 368, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(mainclass.mainclass.appointmentList.SearchappointmentByIDBoolean(textField.getText())) {
					//
					patientsFrame pf = new patientsFrame();
					pf.setVisible(true);
					mainclass.mainclass.patientID=mainclass.mainclass.appointmentList.SearchappointmentByID(textField.getText()).getID();
					
//				if(mainclass.mainclass.appointmentList.SearchappointmentByID(textField.getText()).getID().equals(textField.getText())) {
//					setVisible(false);
//					patientsFrame pf = new patientsFrame();
//					pf.setVisible(true);
//					mainclass.mainclass.patientID=mainclass.mainclass.appointmentList.SearchappointmentByID(textField.getText()).getID();
//					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "not exist",
				               " ", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				
				
			}
		});
		
		
		
		
		
		
		
		
		
		
	}
}
