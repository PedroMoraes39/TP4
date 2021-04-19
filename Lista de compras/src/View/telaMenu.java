package View;
/** Nesta parte sera iniciado o meno do programa **/
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class telaMenu {

        private JFrame frmListaDeCompras;

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        telaMenu window = new telaMenu();
                        window.frmListaDeCompras.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }


        public telaMenu() {
            initialize();
        }

private void initialize() {
            frmListaDeCompras = new JFrame();
            frmListaDeCompras.getContentPane().setBackground(Color.DARK_GRAY);
            frmListaDeCompras.setTitle("Lista De Compras");
            frmListaDeCompras.getContentPane().setForeground(Color.PINK);
            frmListaDeCompras.setBounds(100, 100, 450, 300);
            frmListaDeCompras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frmListaDeCompras.getContentPane().setLayout(null);
/** Botão para iniciar uma nova lista **/
JButton btnNewButton = new JButton("Criar Lista");
            btnNewButton.setToolTipText("Criar uma lista de compras nova");
            btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades\n");


                }
            });
            btnNewButton.setBounds(150, 88, 121, 35);
            frmListaDeCompras.getContentPane().add(btnNewButton);
/** Botão para iniciar listas ja criadas**/
            JButton btnNewButton_1 = new JButton("Listas criadas");
            btnNewButton_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Ainda Não existe listas criadas");
                }
            });
            btnNewButton_1.setToolTipText("Acessar uma lista de compras j\u00E1 criada");
            btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 13));
            btnNewButton_1.setBounds(150, 149, 121, 35);
            frmListaDeCompras.getContentPane().add(btnNewButton_1);

            JLabel lblNewLabel = new JLabel("Menu Principal");
            lblNewLabel.setForeground(Color.CYAN);
            lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
            lblNewLabel.setBounds(140, 26, 143, 35);
            frmListaDeCompras.getContentPane().add(lblNewLabel);
        }


        }
