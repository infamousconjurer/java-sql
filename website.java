package ddd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class website {

	private JFrame frame;
	private JTextField mobileTf;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPasswordField pswdTf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					website window = new website();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public website() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 300, 549, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBounds(199, 62, 201, 48);
		lblNewLabel.setForeground(SystemColor.windowText);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 24));
		frame.getContentPane().add(lblNewLabel);

		mobileTf = new JTextField();
		mobileTf.setBounds(117, 204, 295, 55);
		frame.getContentPane().add(mobileTf);
		mobileTf.setColumns(10);

		lblNewLabel_1 = new JLabel("Mobile No:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(117, 169, 124, 25);
		frame.getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(117, 292, 124, 25);
		frame.getContentPane().add(lblNewLabel_2);

		pswdTf = new JPasswordField();
		pswdTf.setColumns(10);
		pswdTf.setBounds(117, 327, 295, 55);
		frame.getContentPane().add(pswdTf);

		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String mobile = mobileTf.getText().toString();
				String pswd = pswdTf.getText().toString();

				UsersModel user = dbhelper.login(mobile, pswd);

				if (user != null) {
					JOptionPane.showMessageDialog(null, "Welcome "+ user.getName(), "Login success",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Invalid username/password", "Login Failure",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		loginBtn.setBounds(156, 427, 169, 42);
		frame.getContentPane().add(loginBtn);

		JButton registerBtn = new JButton("Register");
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new signup();
				frame.setVisible(false);
			}
		});
		registerBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		registerBtn.setBounds(156, 502, 169, 42);
		frame.getContentPane().add(registerBtn);
	}
}
