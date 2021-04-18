package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaLocal {

	private JFrame frmLocal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaLocal window = new telaLocal();
					window.frmLocal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telaLocal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLocal = new JFrame();
		frmLocal.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmLocal.setTitle("Local");
		frmLocal.setBounds(100, 100, 450, 300);
		frmLocal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLocal.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha o local dos produtos :");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(10, 34, 314, 41);
		frmLocal.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Mercado");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(173, 112, 125, 32);
		frmLocal.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("A\u00E7ougue");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(172, 150, 125, 41);
		frmLocal.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Feira");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2.setBounds(173, 197, 124, 41);
		frmLocal.getContentPane().add(btnNewButton_2);
	}
}
