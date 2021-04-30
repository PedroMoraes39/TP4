package View;
/** O usuario vai inserir o nome, quantidade e valor dos produto**/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

public class telaProduto implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelQtd = new JLabel("Quantidade: ");
	private JTextField valorQtd;
	private JLabel labelPreço = new JLabel("Preço: ");
	private JTextField valorPreço;
	private String[] novoDado = new String[9];
	private static controleLocal dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, controleProduto d, 
			telaLocal p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Nome";
		if (op == 2) s = "Tipo";
		if (op == 3) s = "Detalhe do Produto";
		if (op == 4) s = "Detalhe do tipo";

		janela = new JFrame(s);

		//Preenche dados com dados do aluno clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getMercado()[pos].getNome(), 200);
			valorpreço = new JTextField(dados.getMercado()[pos].getPreço(),200);
			valorQtd = new JTextField(200);
		} else if (op == 4) { //Preenche dados com dados do professor clicado 
			valorNome = new JTextField(dados.getFeira()[pos].getNome(), 200);
			valorQtd = new JTextField(String.valueOf(
					dados.getFeira()[pos].getValorHoraAula()),200);
			valorPreço = new JTextField(200);
		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorPreço = new JTextField(200);
			valorQtd = new JTextField(200);

		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelPreço.setBounds(30, 50, 150, 25);
		valorPreço.setBounds(180, 50, 180, 25);
		labelQtd.setBounds(30, 50, 180, 25);
		valorQtd.setBounds(180, 50, 180, 25);		

		//Coloca os campos relacionados a endereco se aluno
		if (op == 1 || op == 3 ) {
			this.janela.add(labelPreço);
			this.janela.add(valorPreço);

		}

		//Coloca campos relacionados a valor hora/aula se professor
		if (op == 2 || op == 4) {

			this.janela.add(labelQtd);
			this.janela.add(valorQtd);
		}


		this.janela.add(labelNome);
		this.janela.add(valorNome);
;

		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

	}




}