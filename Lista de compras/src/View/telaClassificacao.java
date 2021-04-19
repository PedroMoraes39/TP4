package View;

/** Nesta parte e feito a classificação do produto**/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;

public class telaClassificacao {

	private JFrame frmClassificaoDoProduto;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaClassificacao window = new telaClassificacao();
					window.frmClassificaoDoProduto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public telaClassificacao() {
		initialize();
	}

	private void initialize() {
		frmClassificaoDoProduto = new JFrame();
		frmClassificaoDoProduto.setTitle("Classifica\u00E7\u00E3o do produto");
		frmClassificaoDoProduto.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmClassificaoDoProduto.setBounds(100, 100, 450, 300);
		frmClassificaoDoProduto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClassificaoDoProduto.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha a classifica\u00E7\u00E3o do produto :");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 319, 49);
		frmClassificaoDoProduto.getContentPane().add(lblNewLabel);
		
/** botões de escolha para o usuario separar seus produtos**/	
		
		JList list = new JList();
		list.setBackground(Color.LIGHT_GRAY);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"1-Verduras", "2-Carnes", "3-Frutas", "4-Produtos de limpeza", "5-Utens\u00EDlios domesticos"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setToolTipText("");
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		list.setBounds(141, 70, 142, 109);
		frmClassificaoDoProduto.getContentPane().add(list);
	}

}
