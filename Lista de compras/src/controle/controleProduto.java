package controle;

import modelo.*;

public class controleProduto {
	private Produto[] p;
	private int quantidadeProduto;
	
	public controleProduto(controleLocal d) {
		p = d.getProduto();
		quantidadeProduto = d.getquantidadeProduto();
	}
	public String[] getnomeProduto() {
		String[] s = new String[quantidadeProduto];
		for(int i = 0; i < quantidadeProduto; i++) {
			s[i] = p[i].getproduto();
		}
		return s;
	}
	
	public int getQtd() {
		return quantidadeProduto;
	}
	
	public void setQtd(int qtd) {
		this.quantidadeProduto = qtd;
	}
	
	public String getnomeProduto(int i) {		
		return p[i].getnomeProduto();
	}
	
	public String getpreçoProduto(int i) {
		String valor = String.valueOf(p[i].getpreçoProduto());
		return valor;
	}
	
}
