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
	private JLabel labelHoraAula = new JLabel("Valor Hora/Aula (R$): ");
	private JTextField valorHoraAula;
	private JLabel labelEnd = new JLabel("Endereco: ");
	private JTextField valorEnd;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelID = new JLabel("Numero da Identidade: ");
	private JTextField valorID;
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorDDD;
	private JTextField valorTelefone;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
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

		if (op == 1) s = "Cadastro de Aluno";
		if (op == 2) s = "Cadastro de Professor";
		if (op == 3) s = "Detalhe de Aluno";
		if (op == 4) s = "Detalhe de Professor";

		janela = new JFrame(s);

		//Preenche dados com dados do aluno clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getMercado()[pos].getNome(), 200);
			valorEnd = new JTextField(dados.getMercado()[pos].getEndereco(),200);
			valorHoraAula = new JTextField(200);
			valorCPF = new JTextField(String.valueOf(dados.getMercado()[pos].getCPF()), 200);
			valorID = new JTextField(String.valueOf(dados.getMercado()[pos].getNumID()), 200);
			valorDDD = new JTextField(String.valueOf(dados.getMercado()[pos].getNumTel().getDDD()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getMercado()[pos].getNumTel().getNumero()), 10);			

		} else if (op == 4) { //Preenche dados com dados do professor clicado 
			valorNome = new JTextField(dados.getFeira()[pos].getNome(), 200);
			valorHoraAula = new JTextField(String.valueOf(
					dados.getFeira()[pos].getValorHoraAula()),200);
			valorEnd = new JTextField(200);
			valorCPF = new JTextField(String.valueOf(dados.getFeira()[pos].getCPF()), 200);
			valorID = new JTextField(String.valueOf(dados.getFeira()[pos].getNumID()), 200);
			valorDDD = new JTextField(
					String.valueOf(dados.getFeira()[pos].getNumTel().getDDD()), 3);
			valorTelefone = new JTextField(
					String.valueOf(dados.getFeira()[pos].getNumTel().getNumero()), 10);

		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorEnd = new JTextField(200);
			valorHoraAula = new JTextField(200);
			valorCPF = new JTextField(200);
			valorID = new JTextField(200);
			valorDDD = new JTextField(3);
			valorTelefone = new JTextField(10);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEnd.setBounds(30, 50, 150, 25);
		valorEnd.setBounds(180, 50, 180, 25);
		labelHoraAula.setBounds(30, 50, 180, 25);
		valorHoraAula.setBounds(180, 50, 180, 25);		
		labelCPF.setBounds(30, 80, 150, 25);
		valorCPF.setBounds(180, 80, 180, 25);
		labelID.setBounds(30, 110, 150, 25);
		valorID.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 140, 150, 25);
		valorDDD.setBounds(180, 140, 28, 25);
		valorTelefone.setBounds(210, 140, 65, 25);

		//Coloca os campos relacionados a endereco se aluno
		if (op == 1 || op == 3 ) {
			this.janela.add(labelEnd);
			this.janela.add(valorEnd);

		}

		//Coloca campos relacionados a valor hora/aula se professor
		if (op == 2 || op == 4) {

			this.janela.add(labelHoraAula);
			this.janela.add(valorHoraAula);
		}

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelID);
		this.janela.add(valorID);
		this.janela.add(labelTelefone);
		this.janela.add(valorDDD);
		this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}




}