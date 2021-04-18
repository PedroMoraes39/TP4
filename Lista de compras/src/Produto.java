package lista_de_compras;
public abstract class Produto {
	private Produto nomeProduto;
	private int quantidadeProduto;
	private float preçoProduto;
	
	public Produto(Produto n, int q, float p) {
		nomeProduto = n;
		quantidadeProduto = q;
		preçoProduto = p;
		
		
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
	public float getPreçoProduto() {
		return preçoProduto;
	}
	public void setPreçoProduto(float preçoProduto) {
		this.preçoProduto = preçoProduto;
	}
	
	

}
