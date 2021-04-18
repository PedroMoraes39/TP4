package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class telaProduto {

	private JFrame frmProduto;
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
					telaProduto window = new telaProduto();
					window.frmProduto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telaProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProduto = new JFrame();
		frmProduto.setTitle("Produto");
		frmProduto.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmProduto.setBounds(100, 100, 450, 300);
		frmProduto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProduto.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insira o nome do produto :");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(29, 11, 255, 50);
		frmProduto.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(53, 72, 316, 32);
		frmProduto.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Quantidade :");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(28, 125, 89, 14);
		frmProduto.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor :");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(29, 155, 89, 32);
		frmProduto.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 115, 89, 24);
		frmProduto.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(88, 160, 86, 25);
		frmProduto.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}