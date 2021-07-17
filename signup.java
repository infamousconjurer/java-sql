package ddd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class signup {

	private JFrame frame;
	private JTextField nameTf;
	private JTextField pswdTf;
	private JTextField emailTf;
	private JTextField addressTf;
	private JTextField phoneTf;
	private JButton loginBtn;
	private JButton btnLogin;


	/**
	 * Create the application.
	 */
	public signup() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 719, 776);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTERATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(274, 38, 182, 53);
		frame.getContentPane().add(lblNewLabel);
		
		nameTf = new JTextField();
		nameTf.setColumns(10);
		nameTf.setBounds(168, 123, 295, 55);
		frame.getContentPane().add(nameTf);
		
		JLabel nameJl = new JLabel("Name:");
		nameJl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nameJl.setBounds(168, 88, 124, 25);
		frame.getContentPane().add(nameJl);
		
		pswdTf = new JTextField();
		pswdTf.setColumns(10);
		pswdTf.setBounds(168, 223, 295, 55);
		frame.getContentPane().add(pswdTf);
		
		JLabel pswdJl = new JLabel("Password:");
		pswdJl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pswdJl.setBounds(168, 188, 124, 25);
		frame.getContentPane().add(pswdJl);
		
		emailTf = new JTextField();
		emailTf.setColumns(10);
		emailTf.setBounds(168, 326, 295, 55);
		frame.getContentPane().add(emailTf);
		
		JLabel emailJl = new JLabel("Email:");
		emailJl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		emailJl.setBounds(168, 291, 124, 25);
		frame.getContentPane().add(emailJl);
		
		addressTf = new JTextField();
		addressTf.setColumns(10);
		addressTf.setBounds(168, 430, 295, 55);
		frame.getContentPane().add(addressTf);
		
		JLabel addressJl = new JLabel("Address:");
		addressJl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addressJl.setBounds(168, 395, 124, 25);
		frame.getContentPane().add(addressJl);
		
		phoneTf = new JTextField();
		phoneTf.setColumns(10);
		phoneTf.setBounds(168, 535, 295, 55);
		frame.getContentPane().add(phoneTf);
		
		JLabel phoneJl = new JLabel("Phone:");
		phoneJl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		phoneJl.setBounds(168, 500, 124, 25);
		frame.getContentPane().add(phoneJl);
		
		loginBtn = new JButton("Signup");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameTf.getText().toString();
				String pswd = pswdTf.getText().toString();
				String email = emailTf.getText().toString();
				String address = addressTf.getText().toString();
				String phone = phoneTf.getText().toString();
				

				boolean user = dbhelper.signup(name, pswd,email,address,phone);
				if(user)
				{
					frame.setVisible(false);
					new website();
				}
			}
		});
		loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		loginBtn.setBounds(225, 619, 169, 42);
		frame.getContentPane().add(loginBtn);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new website();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(225, 687, 169, 42);
		frame.getContentPane().add(btnLogin);
	}
}
