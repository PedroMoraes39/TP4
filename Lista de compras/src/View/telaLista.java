package View;

	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JTable;
	import java.awt.Color;
	import javax.swing.table.DefaultTableModel;
	import javax.swing.ListSelectionModel;
	import java.awt.Font;

	public class telaLista {

	    private JFrame frmListaDeCompras;
	    private JTable table;

	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    telaLista window = new telaLista();
	                    window.frmListaDeCompras.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }

	    public telaLista() {
	        initialize();
	    }

/** Lista do usuario **/
	    
	    private void initialize() {
	        frmListaDeCompras = new JFrame();
	        frmListaDeCompras.getContentPane().setBackground(Color.LIGHT_GRAY);
	        frmListaDeCompras.setTitle("Lista de Compras");
	        frmListaDeCompras.setBounds(100, 100, 450, 300);
	        frmListaDeCompras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frmListaDeCompras.getContentPane().setLayout(null);
	table = new JTable();
	        table.setFont(new Font("Arial", Font.PLAIN, 11));
	        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        table.setModel(new DefaultTableModel(
	            new Object[][] {
	                {"Produto", "Quantidade", "Valor"},
	                {null, null, null},
	                {null, null, null},
	                {null, null, null},
	                {null, null, null},
	                {null, null, null},
	                {null, null, null},
	                {null, null, null},
	                {null, null, null},
	                {null, null, null},
	                {null, null, null},
	                {null, null, null},
	                {null, null, null},
	                {null, null, null},
	                {null, null, null},
	            },
	            new String[] {
	                "New column", "New column", ""
	            }
	        ));
	        table.setForeground(Color.BLACK);
	        table.setBounds(10, 11, 414, 250);
	        frmListaDeCompras.getContentPane().add(table);
	    }
	}


