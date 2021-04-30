package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class telaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Lista de compras");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton Nlista = new JButton("Nova Lista");
	private static JButton Clista = new JButton("Listas Criadas");
	
	public telaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		Clista.setBounds(140, 100, 100, 30);
		Nlista.setBounds(140, 50, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(Nlista);
		janela.add(Clista);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		telaMenu menu = new telaMenu();
		
		Nlista.addActionListener(menu);
		Clista.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == Nlista)
			new telaLocal();
			
	}
}
