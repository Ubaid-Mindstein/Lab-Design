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
import javax.swing.JList;

import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField.AbstractFormatter;
import java.awt.SystemColor;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Page1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Address2;
	private JLabel Label_City;
	private JTextField textField_City;
	private JLabel Label_State;
	private JTextField textField_State;
	private JLabel Label_Pin;
	private JTextField textField_Pin;
	private JLabel lblContactDetails;
	private JTextField textField_Address1;
	private JLabel Label_Phone;
	private JTextField textField_Phone;
	private JLabel Label_Mobile;
	private JTextField textField_Mobile;
	private JLabel Label_Email;
	private JLabel Label_Website;
	private JTextField textField_Email;
	private JTextField textField_Website;
	private JLabel lblRegisterationDetails;
	private JLabel Label_VAT;
	private JLabel Label_GST;
	private JTextField textField_VAT;
	private JTextField textField_GST;
	private JLabel Label_PAN;
	private JTextField textField_PAN;
	private JLabel Label_CST;
	private JTextField textField_CST;
	private JLabel lblRegisterationDetails_1;
	private JLabel Label_DL_01;
	private JTextField textField_DL_01;
	private JLabel Label_DL_02;
	private JLabel Label_DealsIn;
	private JTextField textField_Deals_In;
	private JLabel lblNewLabel_17;
	private JTextField textField_DL_02;
	private JLabel lblNewLabel_18;
	private JLabel Label_CompanyName;
	private JTextField textField_CompanyName;
	private JLabel lblFinancialYearDate;
	private JLabel lblNewLabel_20;
	private JTextField textField_Username;
	private JTextField textField_Password;

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
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Basic Details");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(113, 124, 413, 33);
		contentPane.add(lblNewLabel);
		
		JLabel LabelAddress1 = new JLabel("Address Line 1");
		LabelAddress1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelAddress1.setBounds(10, 226, 90, 16);
		contentPane.add(LabelAddress1);
		
		JLabel LabelAddress2 = new JLabel("Address Line 2");
		LabelAddress2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LabelAddress2.setBounds(10, 253, 90, 16);
		contentPane.add(LabelAddress2);
		
		textField_Address2 = new JTextField();
		textField_Address2.setColumns(10);
		textField_Address2.setBounds(113, 248, 375, 20);
		contentPane.add(textField_Address2);
		
		Label_City = new JLabel("City");
		Label_City.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_City.setBounds(10, 280, 46, 14);
		contentPane.add(Label_City);
		
		textField_City = new JTextField();
		textField_City.setBounds(113, 279, 86, 20);
		contentPane.add(textField_City);
		textField_City.setColumns(10);
		
		Label_State = new JLabel("State");
		Label_State.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_State.setBounds(209, 280, 37, 14);
		contentPane.add(Label_State);
		
		textField_State = new JTextField();
		textField_State.setBounds(246, 279, 86, 20);
		contentPane.add(textField_State);
		textField_State.setColumns(10);
		
		Label_Pin = new JLabel("Pin");
		Label_Pin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_Pin.setBounds(342, 280, 26, 14);
		contentPane.add(Label_Pin);
		
		textField_Pin = new JTextField();
		textField_Pin.setBounds(368, 279, 120, 20);
		contentPane.add(textField_Pin);
		textField_Pin.setColumns(10);
		
		lblContactDetails = new JLabel("Contact Details");
		lblContactDetails.setOpaque(true);
		lblContactDetails.setForeground(Color.WHITE);
		lblContactDetails.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblContactDetails.setBackground(SystemColor.textHighlight);
		lblContactDetails.setBounds(113, 310, 413, 33);
		contentPane.add(lblContactDetails);
		
		textField_Address1 = new JTextField();
		textField_Address1.setColumns(10);
		textField_Address1.setBounds(113, 217, 375, 20);
		contentPane.add(textField_Address1);
		
		Label_Phone = new JLabel("Phone");
		Label_Phone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_Phone.setBounds(10, 355, 46, 14);
		contentPane.add(Label_Phone);
		
		textField_Phone = new JTextField();
		textField_Phone.setColumns(10);
		textField_Phone.setBounds(113, 354, 123, 20);
		contentPane.add(textField_Phone);
		
		Label_Mobile = new JLabel("Mobile");
		Label_Mobile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_Mobile.setBounds(301, 354, 46, 14);
		contentPane.add(Label_Mobile);
		
		textField_Mobile = new JTextField();
		textField_Mobile.setBounds(368, 354, 123, 20);
		contentPane.add(textField_Mobile);
		textField_Mobile.setColumns(10);
		
		Label_Email = new JLabel("Email");
		Label_Email.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_Email.setBounds(10, 385, 46, 14);
		contentPane.add(Label_Email);
		
		Label_Website = new JLabel("Website");
		Label_Website.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_Website.setBounds(301, 385, 63, 14);
		contentPane.add(Label_Website);
		
		textField_Email = new JTextField();
		textField_Email.setBounds(113, 384, 123, 20);
		contentPane.add(textField_Email);
		textField_Email.setColumns(10);
		
		textField_Website = new JTextField();
		textField_Website.setBounds(368, 384, 123, 20);
		contentPane.add(textField_Website);
		textField_Website.setColumns(10);
		
		lblRegisterationDetails = new JLabel("Registeration Details");
		lblRegisterationDetails.setOpaque(true);
		lblRegisterationDetails.setForeground(Color.WHITE);
		lblRegisterationDetails.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblRegisterationDetails.setBackground(SystemColor.textHighlight);
		lblRegisterationDetails.setBounds(113, 415, 413, 33);
		contentPane.add(lblRegisterationDetails);
		
		Label_VAT = new JLabel("VAT");
		Label_VAT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_VAT.setBounds(10, 466, 46, 14);
		contentPane.add(Label_VAT);
		
		Label_GST = new JLabel("GST");
		Label_GST.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_GST.setBounds(263, 471, 46, 14);
		contentPane.add(Label_GST);
		
		textField_VAT = new JTextField();
		textField_VAT.setBounds(113, 465, 123, 20);
		contentPane.add(textField_VAT);
		textField_VAT.setColumns(10);
		
		textField_GST = new JTextField();
		textField_GST.setBounds(321, 465, 123, 20);
		contentPane.add(textField_GST);
		textField_GST.setColumns(10);
		
		Label_PAN = new JLabel("PAN");
		Label_PAN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_PAN.setBounds(10, 496, 46, 14);
		contentPane.add(Label_PAN);
		
		textField_PAN = new JTextField();
		textField_PAN.setBounds(113, 495, 123, 20);
		contentPane.add(textField_PAN);
		textField_PAN.setColumns(10);
		
		Label_CST = new JLabel("CST");
		Label_CST.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_CST.setBounds(263, 496, 46, 14);
		contentPane.add(Label_CST);
		
		textField_CST = new JTextField();
		textField_CST.setColumns(10);
		textField_CST.setBounds(321, 495, 123, 20);
		contentPane.add(textField_CST);
		
		lblRegisterationDetails_1 = new JLabel("Registeration Details");
		lblRegisterationDetails_1.setOpaque(true);
		lblRegisterationDetails_1.setForeground(Color.WHITE);
		lblRegisterationDetails_1.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblRegisterationDetails_1.setBackground(SystemColor.textHighlight);
		lblRegisterationDetails_1.setBounds(113, 530, 413, 33);
		contentPane.add(lblRegisterationDetails_1);
		
		Label_DL_01 = new JLabel("DL NO 01");
		Label_DL_01.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_DL_01.setBounds(10, 580, 60, 14);
		contentPane.add(Label_DL_01);
		
		textField_DL_01 = new JTextField();
		textField_DL_01.setBounds(113, 574, 123, 20);
		contentPane.add(textField_DL_01);
		textField_DL_01.setColumns(10);
		
		Label_DL_02 = new JLabel("DL NO 02");
		Label_DL_02.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_DL_02.setBounds(249, 575, 60, 14);
		contentPane.add(Label_DL_02);
		
		Label_DealsIn = new JLabel("Deals In");
		Label_DealsIn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_DealsIn.setBounds(10, 605, 60, 14);
		contentPane.add(Label_DealsIn);
		
		textField_Deals_In = new JTextField();
		textField_Deals_In.setBounds(113, 604, 375, 20);
		contentPane.add(textField_Deals_In);
		textField_Deals_In.setColumns(10);
		
		lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\Lab Design\\image_assets\\icon.png"));
		lblNewLabel_17.setBounds(10, 11, 129, 75);
		contentPane.add(lblNewLabel_17);
		
		textField_DL_02 = new JTextField();
		textField_DL_02.setColumns(10);
		textField_DL_02.setBounds(320, 574, 129, 20);
		contentPane.add(textField_DL_02);
		
		lblNewLabel_18 = new JLabel("Insert Company Details");
		lblNewLabel_18.setForeground(new Color(0, 0, 128));
		lblNewLabel_18.setFont(new Font("Sylfaen", Font.BOLD, 32));
		lblNewLabel_18.setBounds(342, 14, 350, 64);
		contentPane.add(lblNewLabel_18);
		
		Label_CompanyName = new JLabel("Company Name");
		Label_CompanyName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_CompanyName.setBounds(10, 187, 99, 14);
		contentPane.add(Label_CompanyName);
		
		textField_CompanyName = new JTextField();
		textField_CompanyName.setColumns(10);
		textField_CompanyName.setBounds(113, 186, 375, 20);
		contentPane.add(textField_CompanyName);
		
		lblFinancialYearDate = new JLabel("Financial Year Date Range");
		lblFinancialYearDate.setOpaque(true);
		lblFinancialYearDate.setForeground(Color.WHITE);
		lblFinancialYearDate.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblFinancialYearDate.setBackground(SystemColor.textHighlight);
		lblFinancialYearDate.setBounds(561, 124, 413, 33);
		contentPane.add(lblFinancialYearDate);
		
		JLabel Label_FinStart = new JLabel("Financial Year Start Date");
		Label_FinStart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_FinStart.setBounds(561, 189, 164, 14);
		contentPane.add(Label_FinStart);
		
		JDateChooser dateChooser_YearStartDate = new JDateChooser();
		dateChooser_YearStartDate.setBounds(745, 187, 145, 20);
		contentPane.add(dateChooser_YearStartDate);
		
		JLabel Label_FinEnd = new JLabel("Financial Year Close Date");
		Label_FinEnd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_FinEnd.setBounds(561, 220, 164, 14);
		contentPane.add(Label_FinEnd);
		
		JDateChooser dateChooser_YearEndDate = new JDateChooser();
		dateChooser_YearEndDate.setBounds(745, 222, 145, 20);
		contentPane.add(dateChooser_YearEndDate);
		
		JLabel lblDatabase = new JLabel("Database");
		lblDatabase.setOpaque(true);
		lblDatabase.setForeground(Color.WHITE);
		lblDatabase.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblDatabase.setBackground(SystemColor.textHighlight);
		lblDatabase.setBounds(561, 310, 413, 33);
		contentPane.add(lblDatabase);
		
		JButton button_ConfigureDatabase = new JButton("Configure Database");
		button_ConfigureDatabase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_ConfigureDatabase.setBounds(561, 353, 223, 23);
		contentPane.add(button_ConfigureDatabase);
		
		JLabel lblReplicateExistingCompany = new JLabel("Replicate Existing Company Data");
		lblReplicateExistingCompany.setOpaque(true);
		lblReplicateExistingCompany.setForeground(Color.WHITE);
		lblReplicateExistingCompany.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblReplicateExistingCompany.setBackground(SystemColor.textHighlight);
		lblReplicateExistingCompany.setBounds(561, 415, 413, 33);
		contentPane.add(lblReplicateExistingCompany);
		
		JCheckBox checkbox_GetExistingCompanyData = new JCheckBox("Get data from existing company");
		checkbox_GetExistingCompanyData.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkbox_GetExistingCompanyData.setBounds(561, 464, 223, 23);
		contentPane.add(checkbox_GetExistingCompanyData);
		
		JLabel lblCorrespondingUser = new JLabel("Corresponding User");
		lblCorrespondingUser.setOpaque(true);
		lblCorrespondingUser.setForeground(Color.WHITE);
		lblCorrespondingUser.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 16));
		lblCorrespondingUser.setBackground(SystemColor.textHighlight);
		lblCorrespondingUser.setBounds(561, 530, 413, 33);
		contentPane.add(lblCorrespondingUser);
		
		JLabel Label_Username = new JLabel("Username");
		Label_Username.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_Username.setBounds(561, 582, 76, 14);
		contentPane.add(Label_Username);
		
		textField_Username = new JTextField();
		textField_Username.setBounds(647, 579, 137, 20);
		contentPane.add(textField_Username);
		textField_Username.setColumns(10);
		
		JLabel Label_Password = new JLabel("Password");
		Label_Password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Label_Password.setBounds(561, 607, 76, 14);
		contentPane.add(Label_Password);
		
		textField_Password = new JTextField();
		textField_Password.setColumns(10);
		textField_Password.setBounds(647, 604, 137, 20);
		contentPane.add(textField_Password);
			

		
	}
}
