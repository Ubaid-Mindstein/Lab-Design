package com.labdesign;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.JDatePanel;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.UtilDateModel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;

import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField.AbstractFormatter;

public class Page1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JLabel lblContactDetails;
	private JTextField textField;
	private JLabel lblNewLabel_6;
	private JTextField textField_5;
	private JLabel lblNewLabel_7;
	private JTextField textField_6;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblRegisterationDetails;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel lblNewLabel_12;
	private JTextField textField_11;
	private JLabel lblNewLabel_13;
	private JTextField textField_12;
	private JLabel lblRegisterationDetails_1;
	private JLabel lblNewLabel_14;
	private JTextField textField_13;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JTextField textField_15;
	private JLabel lblNewLabel_17;
	private JTextField textField_14;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JTextField textField_16;
	private JLabel lblFinancialYearDate;
	private JLabel lblNewLabel_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page1 frame = new Page1();
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
	public Page1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Basic Details");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(113, 89, 413, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address Line 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 168, 90, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address Line 2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 195, 90, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 195, 375, 20);
		contentPane.add(textField_1);
		
		lblNewLabel_3 = new JLabel("City");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 232, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 231, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_4 = new JLabel("State");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(209, 232, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(246, 231, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Pin");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(342, 232, 26, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(363, 231, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblContactDetails = new JLabel("Contact Details");
		lblContactDetails.setOpaque(true);
		lblContactDetails.setForeground(Color.WHITE);
		lblContactDetails.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblContactDetails.setBackground(Color.BLUE);
		lblContactDetails.setBounds(113, 262, 413, 33);
		contentPane.add(lblContactDetails);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(113, 168, 375, 20);
		contentPane.add(textField);
		
		lblNewLabel_6 = new JLabel("Phone");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 307, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(113, 306, 123, 20);
		contentPane.add(textField_5);
		
		lblNewLabel_7 = new JLabel("Mobile");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(246, 307, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(321, 306, 123, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Email");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(10, 338, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Website");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(246, 338, 63, 14);
		contentPane.add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setBounds(113, 337, 123, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(321, 337, 123, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		lblRegisterationDetails = new JLabel("Registeration Details");
		lblRegisterationDetails.setOpaque(true);
		lblRegisterationDetails.setForeground(Color.WHITE);
		lblRegisterationDetails.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblRegisterationDetails.setBackground(Color.BLUE);
		lblRegisterationDetails.setBounds(113, 369, 413, 33);
		contentPane.add(lblRegisterationDetails);
		
		lblNewLabel_10 = new JLabel("VAT");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(10, 414, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("GST");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(246, 413, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		textField_9 = new JTextField();
		textField_9.setBounds(113, 408, 123, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(321, 408, 123, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		lblNewLabel_12 = new JLabel("PAN");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(10, 444, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		textField_11 = new JTextField();
		textField_11.setBounds(113, 438, 123, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		lblNewLabel_13 = new JLabel("CST");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(246, 438, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(321, 439, 123, 20);
		contentPane.add(textField_12);
		
		lblRegisterationDetails_1 = new JLabel("Registeration Details");
		lblRegisterationDetails_1.setOpaque(true);
		lblRegisterationDetails_1.setForeground(Color.WHITE);
		lblRegisterationDetails_1.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblRegisterationDetails_1.setBackground(Color.BLUE);
		lblRegisterationDetails_1.setBounds(113, 476, 413, 33);
		contentPane.add(lblRegisterationDetails_1);
		
		lblNewLabel_14 = new JLabel("DL NO 01");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(10, 526, 60, 14);
		contentPane.add(lblNewLabel_14);
		
		textField_13 = new JTextField();
		textField_13.setBounds(113, 520, 123, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		lblNewLabel_15 = new JLabel("DL NO 02");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(246, 521, 60, 14);
		contentPane.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("Deals In");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_16.setBounds(10, 551, 60, 14);
		contentPane.add(lblNewLabel_16);
		
		textField_15 = new JTextField();
		textField_15.setBounds(113, 550, 375, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\Administrator\\Documents\\logo_create_company.PNG"));
		lblNewLabel_17.setBounds(10, 11, 129, 75);
		contentPane.add(lblNewLabel_17);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(321, 520, 140, 20);
		contentPane.add(textField_14);
		
		lblNewLabel_18 = new JLabel("Create a new company");
		lblNewLabel_18.setForeground(new Color(0, 0, 128));
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_18.setBounds(160, 14, 289, 64);
		contentPane.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("Company Name");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_19.setBounds(10, 141, 99, 14);
		contentPane.add(lblNewLabel_19);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(113, 133, 375, 20);
		contentPane.add(textField_16);
		
		lblFinancialYearDate = new JLabel("Financial Year Date Range");
		lblFinancialYearDate.setOpaque(true);
		lblFinancialYearDate.setForeground(Color.WHITE);
		lblFinancialYearDate.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblFinancialYearDate.setBackground(Color.BLUE);
		lblFinancialYearDate.setBounds(561, 89, 413, 33);
		contentPane.add(lblFinancialYearDate);
		
		lblNewLabel_20 = new JLabel("Financial Year Start Date");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_20.setBounds(561, 143, 158, 14);
		contentPane.add(lblNewLabel_20);

		//Date component 
		/*UtilDateModel model = new org.jdatepicker.UtilDateModel();
		Properties properties = new Properties();
		properties.put("text.today", "Today");
		properties.put("text.month", "Month");
		properties.put("text.year", "Year");
		
		JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setBounds(575,143,100,100);
		contentPane.add(datePicker);*/
		
	}
	
	
	/*class DateLabelFormatter extends AbstractFormatter{

		private String datePattern = "yyyy-MM-dd";
		private SimpleDateFormat dateFormatter =  new SimpleDateFormat(datePattern);
		
		@Override
		public Object stringToValue(String text) throws ParseException {
			// TODO Auto-generated method stub
			
			return dateFormatter.parseObject(text);
		}

		@Override
		public String valueToString(Object value) throws ParseException {
			// TODO Auto-generated method stub
			if(value != null) {
				Calendar calender = (Calendar)value;
				return dateFormatter.format(calender.getTime());
			}
			
			
			return "";
		}
		
	}*/
	
}
