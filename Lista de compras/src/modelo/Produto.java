package modelo;

public abstract class Produto {
	private Produto nomeProduto;
	private int quantidadeProduto;
	private float pre�oProduto;
	
	public Produto(Produto n, int q, float p) {
		nomeProduto = n;
		quantidadeProduto = q;
		pre�oProduto = p;
		
		
	}
	
	
	public Produto getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(Produto nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public float getPre�odoProduto() {
		return pre�oProduto;
	}
	public void setPre�odoProduto(float pre�oProduto) {
		this.pre�oProduto = pre�oProduto;
	}
	
	
}
