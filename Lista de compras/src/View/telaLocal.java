package View;
/** Local onde o usuario comprar seus produtos**/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;
import View.*;


public class telaLocal implements ActionListener {
	private static JFrame local = new JFrame("Lista de compras");
	private static JLabel titulo = new JLabel("Escolha um Local:");
	private static JButton mercado = new JButton("Mercado");
	private static JButton a�ougue = new JButton("A�ougue");
	private static JButton feira = new JButton("Feira");
	
	public telaLocal() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(105, 10, 190, 30);
		feira.setBounds(140, 100, 100, 30);
		a�ougue.setBounds(140, 150, 100, 30);
		mercado.setBounds(140, 50, 100, 30);
		
		local.setLayout(null);
		
		local.add(titulo);
		local.add(mercado);
		local.add(feira);
		local.add(a�ougue);
		
		local.setSize(400, 250);
		local.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		local.setVisible(true);
	}
	
	public static void main(String[] args) {
		telaLocal local = new telaLocal();
		
		mercado.addActionListener(local);
		a�ougue.addActionListener(local);
		feira.addActionListener(local);
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == mercado)
			new telaProduto();
		
		if(src == a�ougue)
			new telaProduto();
		
		if(src == feira)
			new telaProduto();
	}
}
