package jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import mainclass.*;

public class doctorsframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doctorsframe frame = new doctorsframe();
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
	public doctorsframe() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 887, 466);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel.setBounds(10, 66, 198, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblSurname = new JLabel("surname");
		lblSurname.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurname.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblSurname.setBounds(218, 66, 198, 38);
		contentPane.add(lblSurname);
		
		JLabel lblSpeciality = new JLabel("speciality");
		lblSpeciality.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpeciality.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblSpeciality.setBounds(426, 66, 198, 38);
		contentPane.add(lblSpeciality);
		
		JLabel lblDate = new JLabel("date");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblDate.setBounds(634, 66, 198, 38);
		contentPane.add(lblDate);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.setBounds(388, 388, 93, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(10, 126, 198, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(10, 174, 198, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_3.setBounds(10, 222, 198, 38);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblSurname_1 = new JLabel("");
		lblSurname_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurname_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblSurname_1.setBounds(218, 126, 198, 38);
		contentPane.add(lblSurname_1);
		
		JLabel lblSurname_2 = new JLabel("");
		lblSurname_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurname_2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblSurname_2.setBounds(218, 174, 198, 38);
		contentPane.add(lblSurname_2);
		
		JLabel lblSurname_3 = new JLabel("");
		lblSurname_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurname_3.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblSurname_3.setBounds(218, 222, 198, 38);
		contentPane.add(lblSurname_3);
		
		JLabel lblSpeciality_1 = new JLabel("");
		lblSpeciality_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpeciality_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblSpeciality_1.setBounds(426, 126, 198, 38);
		contentPane.add(lblSpeciality_1);
		
		JLabel lblSpeciality_2 = new JLabel("");
		lblSpeciality_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpeciality_2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblSpeciality_2.setBounds(426, 174, 198, 38);
		contentPane.add(lblSpeciality_2);
		
		JLabel lblSpeciality_3 = new JLabel("");
		lblSpeciality_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpeciality_3.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblSpeciality_3.setBounds(426, 222, 198, 38);
		contentPane.add(lblSpeciality_3);
		
		JLabel lblDate_1 = new JLabel("");
		lblDate_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblDate_1.setBounds(634, 126, 198, 38);
		contentPane.add(lblDate_1);
		
		JLabel lblDate_2 = new JLabel("");
		lblDate_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate_2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblDate_2.setBounds(634, 174, 198, 38);
		contentPane.add(lblDate_2);
		
		JLabel lblDate_3 = new JLabel("");
		lblDate_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate_3.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblDate_3.setBounds(634, 222, 198, 38);
		contentPane.add(lblDate_3);
		
		JLabel lblNewLabel_4 = new JLabel("medications");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(20, 270, 85, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Paracetamol");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_3_1.setBounds(75, 309, 133, 38);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Aspirin");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_3_1_1.setBounds(368, 309, 133, 38);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Ibuprofen");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_3_1_2.setBounds(634, 309, 133, 38);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblParacetamol = new JLabel("");
		lblParacetamol.setHorizontalAlignment(SwingConstants.CENTER);
		lblParacetamol.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblParacetamol.setBounds(218, 309, 44, 38);
		contentPane.add(lblParacetamol);
		
		JLabel lblAspirin = new JLabel("");
		lblAspirin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAspirin.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblAspirin.setBounds(486, 309, 44, 38);
		contentPane.add(lblAspirin);
		
		JLabel lblIBuprofen = new JLabel("");
		lblIBuprofen.setHorizontalAlignment(SwingConstants.CENTER);
		lblIBuprofen.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblIBuprofen.setBounds(765, 309, 44, 38);
		contentPane.add(lblIBuprofen);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			
					
				try {
					if (mainclass.appointmentList.get(0).getName() != null) {

						lblNewLabel_1.setText(mainclass.appointmentList.get(0).getName());

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {
					if (mainclass.appointmentList.get(1).getName() != null) {

						lblNewLabel_2.setText(mainclass.appointmentList.get(1).getName());

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {
					if (mainclass.appointmentList.get(2).getName() != null) {

						lblNewLabel_3.setText(mainclass.appointmentList.get(2).getName());

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {
					if (mainclass.appointmentList.get(0).getSurname() != null) {

						lblSurname_1.setText(mainclass.appointmentList.get(0).getSurname());

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {
					if (mainclass.appointmentList.get(1).getSurname() != null) {

						lblSurname_2.setText(mainclass.appointmentList.get(1).getSurname());

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {
					if (mainclass.appointmentList.get(2).getSurname() != null) {

						lblSurname_3.setText(mainclass.appointmentList.get(2).getSurname());

					}

				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {
					if (mainclass.appointmentList.get(2).getSurname() != null) {

						lblSurname_3.setText(mainclass.appointmentList.get(2).getSurname());

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {
					if (mainclass.appointmentList.get(2).getSurname() != null) {

						lblSurname_3.setText(mainclass.appointmentList.get(2).getSurname());

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {
					if (mainclass.appointmentList.get(0).getSpeciality() != null) {

						lblSpeciality_1.setText(mainclass.appointmentList.get(0).getSpeciality());

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {
					if (mainclass.appointmentList.get(1).getSpeciality() != null) {

						lblSpeciality_2.setText(mainclass.appointmentList.get(1).getSpeciality());

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {
					if (mainclass.appointmentList.get(2).getSpeciality() != null) {

						lblSpeciality_3.setText(mainclass.appointmentList.get(2).getSpeciality());

					}

				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {

					if (mainclass.appointmentList.get(0).getDate() != null) {

						lblDate_1.setText(mainclass.appointmentList.get(0).getDate());

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {
					if (mainclass.appointmentList.get(1).getDate() != null) {

						lblDate_2.setText(mainclass.appointmentList.get(1).getDate());

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

				try {
					if (mainclass.appointmentList.get(2).getDate() != null) {

						lblDate_3.setText(mainclass.appointmentList.get(2).getDate());

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				lblParacetamol.setText(mainclass.Medicationlist.get(0).getQuantity());
				lblAspirin.setText(mainclass.Medicationlist.get(1).getQuantity());
				lblIBuprofen.setText(mainclass.Medicationlist.get(2).getQuantity());

				
				

			}

		});

	}
}
